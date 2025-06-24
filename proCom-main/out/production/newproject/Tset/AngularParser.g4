parser grammar AngularParser;

options {
  tokenVocab=AngularLexer;
}


program
    : sourceElements? EOF
    ;

sourceElements
    : statement+
    ;

statement
    : block
    | variableStatement
    | importStatement
    | exportStatement
    | functionDeclaration
    | expressionStatement
    | ifStatement
    | SemiColon
    | iterationStatement
    | continueStatement
    | breakStatement
    | returnStatement
    | labelledStatement   //deleted
    | switchStatement  //deleted
    ;

// Extending Hooks for TypeScript Support
hooks
    : (UseState | UseRef) LessThan TypeIdentifier MoreThan '(' (assignable | literal)? ')'
    ;



block
    : '{' statementList? '}'
    ;

statementList
    : statement+
    ;

importStatement
    : Import importFromBlock
    ;

importFromBlock
    : importDefault? (importNamespace | importModuleItems) importFrom eos?
    | StringLiteral eos?
    ;

importModuleItems
    : '{' (importAliasName ',')* (importAliasName ','?)? '}'
    ;

importAliasName
    : moduleExportName (As Identifier)?
    ;

moduleExportName
    : identifierName
    | StringLiteral
    ;

// yield and await are permitted as BindingIdentifier in the grammar

importDefault
    : aliasName ','
    ;

importNamespace
    : ('*' | identifierName) (  As identifierName)?
    ;

importFrom
    : From StringLiteral
    ;

aliasName
    : identifierName (As identifierName)?
    ;

exportStatement
    : Export Default? (exportFromBlock | declaration) eos?
    | Export Default singleExpression eos?
    ;

exportFromBlock
    : importNamespace importFrom eos?     #ImportNameS
    | exportModuleItems importFrom? eos?  #ExportModule
    ;

exportModuleItems
    : '{' (exportAliasName ',')* (exportAliasName ','?)? '}'
    ;

exportAliasName
    : moduleExportName (As moduleExportName)?
    ;


    // Supporting TypeScript Declarations
    declaration
        : variableStatement
        | functionDeclaration
        | typeAlias
        | interfaceDeclaration
        ;

    // TypeScript Type Alias
    typeAlias
        : Type identifier TypeAnnotation eos?
        ;

    // TypeScript Interface
    interfaceDeclaration
        : Interface identifier '{' interfaceBody '}'
        ;

    interfaceBody
        : (interfacePropertyDeclaration eos?)*
        ;

    interfacePropertyDeclaration
        : identifier TypeAnnotation (Assign singleExpression)?
        ;


variableStatement
    : variableDeclarationList eos?
    ;

variableDeclarationList
    : varModifier variableDeclaration (',' variableDeclaration)*
    ;

variableDeclaration
    : assignable (Assign singleExpression)? // ECMAScript 6: Array & Object Matching
    ;


expressionStatement
    : expressionSequence eos?
    ;

ifStatement
    : If '(' expressionSequence ')' statement (Else statement)?
    ;

iterationStatement
    : Do statement While '(' expressionSequence ')' eos?                                                                    # DoStatement
    | While '(' expressionSequence ')' statement                                                                            # WhileStatement
    | For '(' (expressionSequence | variableDeclarationList)? ';' expressionSequence? ';' expressionSequence? ')' statement # ForStatement
    | For '(' (singleExpression | variableDeclarationList) In expressionSequence ')' statement                              # ForInStatement
    | For '(' (singleExpression | variableDeclarationList) Of expressionSequence ')' statement                       # ForOfStatement
    ;

varModifier // let, const - ECMAScript 6
    : Var
    | Let
    | Const
    ;

continueStatement
    : Continue (identifier)? eos?
    ;

breakStatement
    : Break (identifier)? eos?
    ;

returnStatement
    : Return  (expressionSequence)? eos?
    | Return '(' htmlElements ')' eos?
    ;
    htmlElements
        : htmlElement+
        ;
        // HTML Integration
        htmlElement
            : LessThan htmlTagStartName htmlAttribute* MoreThan htmlContent
            | LessThan Divide htmlTagClosingName MoreThan
            | LessThan htmlTagName htmlAttribute* htmlContent Divide MoreThan
            | LessThan htmlTagName htmlAttribute* Divide MoreThan
            | LessThan htmlTagName htmlAttribute* MoreThan
            | LessThan '!' htmlTagStartName htmlAttribute* MoreThan
            ;
        angularExpression
            : DoubleOpenBrace expressionSequence DoubleCloseBrace // دعم تعبيرات Angular
            ;

        htmlContent
            : (angularExpression | identifier+)? ((htmlElement | objectExpressionSequence) (angularExpression | identifier+)?)* // دعم التعبيرات داخل المحتوى
            ;


        objectExpressionSequence
            : '{' expressionSequence '}'
            ;



        htmlTagStartName
            : htmlTagName
            ;

        htmlTagClosingName
            : htmlTagName
            ;

        htmlTagName
            : TagName
            | keyword
            | Identifier
            ;

        htmlAttribute
            : htmlAttributeName (Assign htmlAttributeValue)?
            | '*' identifierName (Assign htmlAttributeValue)? // دعم السمات مثل *ngIf
            ;


        htmlAttributeName
            : TagName
            | '[' TagName ']' // دعم للأقواس المربعة
            | Identifier ('-' Identifier)*
            ;

        htmlAttributeValue
            : AttributeValue
            | StringLiteral
            | objectExpressionSequence
            ;


        switchStatement
            : Switch '(' expressionSequence ')' caseBlock
            ;

        caseBlock
            : '{' caseClauses? (defaultClause caseClauses?)? '}'
            ;

        caseClauses
            : caseClause+
            ;

        caseClause
            : Case expressionSequence ':' statementList?
            ;

        defaultClause
            : Default ':' statementList?
            ;

        labelledStatement
            : identifier ':' statement
            ;

        functionDeclaration
            : Function_ '*'? identifier '(' formalParameterList? ')' functionBody
            ;

        formalParameterList
            : formalParameterArg (',' formalParameterArg)*
            ;

        formalParameterArg
            : assignable (Assign singleExpression)? // ECMAScript 6: Initialization
            ;

        functionBody
            : '{' sourceElements? '}'
            ;


        arrayLiteral
            : ('[' elementList ']')
            ;

        elementList
            : ','* arrayElement? (','+ arrayElement)* ','* // Yes, everything is optional
            ;

        arrayElement
            : Ellipsis? singleExpression
            ;

        propertyAssignment
            : propertyName ':' singleExpression
            | '[' singleExpression ']' ':' singleExpression
            | '*'? propertyName '(' formalParameterList? ')' functionBody
            | Ellipsis? singleExpression
            ;

        propertyName
            : identifierName
            | StringLiteral
            | DecimalLiteral
            | '[' singleExpression ']'
            ;

        arguments
            : '(' (argument (',' argument)* ','?)? ')'
            ;

        argument
            : Ellipsis? (singleExpression | identifier)
            ;
            expressionSequence
                    : singleExpression (',' singleExpression)* ('as' TypeIdentifier)?
                    ;
                  singleExpression
                      : anonymousFunction
                      | singleExpression DotQuistion singleExpression
                      | singleExpression DotQuistion? '[' expressionSequence ']'
                      | singleExpression Quistion? '.' HashTag? identifierName
                      | singleExpression Quistion Colon singleExpression
                      | singleExpression Colon singleExpression
                      // Split to try new Date() first, then new Date.
                      | New identifier arguments
                      | identifier OpenParen singleExpression  CloseParen
                      | identifier OpenParen identifier  singleExpression  CloseParen
                      | New singleExpression arguments
                      | New singleExpression
                      | singleExpression arguments
                      | New '.' identifier
                      | singleExpression Doubleplus
                      | singleExpression  DoubleMinus
                      | Void singleExpression
                      | Typeof singleExpression
                      | Doubleplus singleExpression
                      | DoubleMinus singleExpression
                      | '+' singleExpression
                      | '-' singleExpression
                      | '~' singleExpression
                      | '!' singleExpression

                      | singleExpression MoreThan
                      | <assoc = right> singleExpression Empty singleExpression
                      | singleExpression ('*' | Divide | '%') singleExpression
                      | singleExpression ('+' | '-') singleExpression
                      | singleExpression DoubleQuistion singleExpression
                      | singleExpression (LessThan | MoreThan | '<=' | '>=') singleExpression
                      | singleExpression In singleExpression
                      | singleExpression ('==' | '!=' | '===' | '!==') singleExpression
                      | singleExpression '&' singleExpression

                      | singleExpression '^' singleExpression
                      | singleExpression '|' singleExpression
                      | singleExpression '&&' singleExpression
                      | singleExpression '||' singleExpression
                      | singleExpression Quistion singleExpression ':' singleExpression
                      | <assoc = right> singleExpression Assign singleExpression
                      | <assoc = right> singleExpression assignmentOperator singleExpression
                      | Import '(' singleExpression ')'
                      | This
                      | identifier
                      | A identifier
                      | literal

                      | arrayLiteral
                      | objectLiteral
                      | htmlElements
                      | '(' expressionSequence ')'


                      | hooks
                      | useEff
                      | createElement
                      ;

                  createElement:  CreateElement '(' htmlTagName ',' objectLiteral ',' (createElement ','  |singleExpression )* ')';

                  useEff: UseEffect '(' (functionDeclaration | anonymousFunction )  ','  arrayLiteral ')';


                  assignable
                      : identifier
                      | arrayLiteral
                      | objectLiteral
                      ;

                  objectLiteral
                      : '{' (propertyAssignment (',' propertyAssignment)* ','?)? '}'
                      ;

                  anonymousFunction
                      : Function_ '*'? '(' formalParameterList? ')' functionBody
                      | arrowFunctionParameters '=>' arrowFunctionBody
                      ;

                  arrowFunctionParameters
                      : identifier
                      | '(' formalParameterList? ')'
                      ;

                  arrowFunctionBody
                      : singleExpression
                      | functionBody
                      ;

                  assignmentOperator
                      : '*='
                      | '/='
                      | '%='
                      | '+='
                      | '-='
                      | AndAssign
                      | ChupooAssign
                      | DAssign
                      | Assign
                      ;
                      literal
                          : NullLiteral
                          | BooleanLiteral
                          | StringLiteral
                          | DecimalLiteral
                          |  StringLiteral singleExpression  StringLiteral

                          ;

                      identifierName
                          : identifier
                          | reservedWord
                          ;

                      identifier
                          : Identifier
                          | As
                          | From
                          | Of
                          ;
                          reservedWord
                                        : keyword
                                        | map
                                        | UseState
                                        | UseRef
                                        | UseEffect
                                        | CreateElement
                                        | NullLiteral
                                        | BooleanLiteral
                                        ;

                                        map : Map '(' (functionDeclaration | anonymousFunction )  ')' ;

                                    keyword
                                        : Break
                                        | Do
                                        | Typeof
                                        | Case
                                        | Else
                                        | New
                                        | Var
                                        | Return
                                        | Void
                                        | Continue
                                        | For
                                        | Switch
                                        | While
                                        | Function_
                                        | This
                                        | Default
                                        | If
                                        | In
                                        | Const
                                        | Export
                                        | Import
                                        | Let
                                        | From
                                        | As
                                        | Of
                                        ;
                                    eos
                                        : SemiColon
                                        | EOF
                                        ;
