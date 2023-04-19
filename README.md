# PostfixCalculator
 ADS University Assignment1

 Requirements:

 The postfix expression calculator isimplementedusing a stack which is an abstract data structure. To implement the stack,use a generic linked listas the underlying data structure. In the linked list it is only necessary to implement the operations required for this assignment. 
 
 The program must provide an API with just one operation: int evaluateExpression( ArrayList<Token> tokenList)so no GUI is necessary. 
 
 As can be seen,evaluateExpressiontakes an ArrayListof Tokensas input. The Tokensare either numbers wrapped in an Operandclass or operators wrapped in an Operatorclass. Both classes are implementations of the Tokeninterface.
 
 When all Tokensin the list have been evaluated,getResultin the calculator will return the result of the calculation which is now top of the stack. 
 
 Finally,evaluateExpressionreturns the result as an integer.
 
 All public methods must be tested with unit tests. Remember to test that the right exceptions are thrown.
