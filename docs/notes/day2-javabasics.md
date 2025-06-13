# Java Basics
## Topic Covered:
- Basic Information
- If-then Statements.
- Assignment `=` & Equality `==` Operator
- Logical AND `&&` operator
Not Equal `!=`,  Equal greater than`>=`, Equal less than `<=` Operator
- Logical OR `||` operator
- NOT Operator `!`, aka Logical Complement operator
- Ternary Operator ` ? : `
- Operator Precedence and Operator Challenge  
***
```java
public class FirstClass{
    public static void main(String[] args) {
        System.out.print("Hello World");
    }
}
```
- `Public` is called access modifier
- `class` keyword is to define a class
- `static` is a keyword needed to find this special 'main' method, to run the code.
- `void` is another keyword that indicate the method won't return any information.
- `()` needs for method declaration.
- `code block` is where we put the code, it is also called method body.
- `method` is a collection of statements, one or more, that perform an operation.
- `println` add an extra line after the statement.  

**Conditional Logic**: Conditional logic uses specific statements that allows to check a condition, and execute certain code based on whether the condition(expression) is true or false.  
### If-then Statement
```java
if(expression){
    // one or more statements
        }
```
### The Logical AND and The Logical OR operator  
- `&&` is the logical AND operates on *boolean* operands - Checking if a given condition is true or false.
- `&` is a bitwise operator that works at the bit level.
- `||` is the logical OR which operates on *boolean* operands.
- `|` is a bitwise operator - works at the bit level.  

### Ternary Operator
Ternary operator is a shortcut to (*if-then-else*) assigning one of two values to a variable.
### Java Operator Precedence  
For Java operator precedence checkout [Java Operator Precedence Table](https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html).