# Day 1: JShell Basics
**JShell** also known as a *Read-Eval-Print-Loop* (REPL) interactive program which,
- Reads the command or code segment we type in.
- Evaluates and executes the code, and often allows shortcuts to be used.
- Prints out the results of the evaluation or execution, without making the developer write code to output the results.
- Loops right back for more input. 
- JShell runs in windows `cmd/terminal`.
- Checkout the [JShell Resources](https://docs.oracle.com/en/java/javase/24/jshell/introduction-jshell.html) for detailed guideline using JShell.

## Statement 
Statement is a complete command to be executed. It can include one or more expressions. 
```jshelllanguage
System.out.print("Hello Kafka!");

System.out.print("Hello World!"
    ...> );  //Use (shift+enter) to break to the next line in JShell
```
The second statement is also valid in JShell. Here are some example of errors that might occur in JShell:
```jshelllanguage
System.out.print("Hello World!
|  Error:
|  unclosed string literal
|  System.out.print("Hello World!
|                   ^
***********************************
System.out.print("Hello Kimi);
|  Error:
|  unclosed string literal
|  System.out.print("Hello Kimi);
|                   ^
***********************************
System.out.print('Hello Morse');
|  Error:
|  unclosed character literal
|  System.out.print('Hello Morse');
***********************************
system.out.print("Hala");
|  Error:
|  package system does not exist
|  system.out.print("Hala");
|  ^--------^
***********************************
System.out.print(mFirstNumber);
|  Error:
|  cannot find symbol
|    symbol:   variable mFirstNumber
|  System.out.print(mFirstNumber);
|                   ^----------^

/ex    // JShell exit command
/exit   // JShell exit command
```
The key combination `ctrl+c` on windows or `ctrl+d` on linux machine, should cancel the execution in the middle and get back to the JShell prompt.
## Keywords
- A keyword is any one of a number of reserved words, that have a predefined meaning in the Java language. 
- In Java syntax, all the code is case-sensitive, and this includes keywords.
- To learn more on Java keywords visit [Java Language Keywords](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

## Variables
Variables are a way to store information to a computer.  
Variables that are defined in a program, can be accessed by a name given them, and the computer figure out where they get stored, in the computer's **random access memory** (RAM).
## Data Type
Data types are for defining the variables. Some data types are can be keywords of Java.
```jshelllanguage
int myFirstNumber = 5;
```
## Declaration Statement
A declaration statement is used to define variables by indicating the data type, and the name, then optionally to set the variable to a specific value.
```jshelllanguage
myFirstNumber = 10;
myFirstNumber = 10000;
System.out.print(myFirstNumber);
| 10000
```
## Expressions
An expression is a coding construct, that evaluates to a single value.
- The expression is the code segment that is on the right side of the equals sign in an assignment or declaration statement. 
- This code can be a simple literal value, like the number 5, or it can be a complex mathematical equation using multiple literal values and mathematical operators.
```jshelllanguage
int myFirstNumber = (10 +5) + (2 * 10);
```
```jshelllanguage
/list   //list command for previous statements in JShell

   2 : System.out.print("Hala");
   3 : System.out.print("myFirstNumber")
   4 : System.out.print("myFirstNumber");
   6 : int myFirstNumber = 5;
   7 : System.out.print(myFirstNumber)
   8 : myFirstNumber = 10;
   9 : System.out.print(myFirstNumber);
  10 : myFirstNumber = 10000;
  11 : System.out.print(myFirstNumber);
  12 : myFirstNumber = (10 +5) + (2 * 10);
```
**Point to be reminded:**
- *<ins>Variable Declaration in JShell</ins>*: Due to integrative nature, JShell allows the redeclaration to occur without throwing an error. In normal Java programming, that would not be allowed, and would throw an error.
- Keywords need to be in lowercase.
- Variables will always be as declared, including Capitalization.
- Remember that case matters in Java code!
- The `/var` command in JShell can help to identify any misspellings. 
- In Java, commas cannot be put in a numeric literal. So alternative way to improve readability, to use underscore. 
- Developers will often use the word is, as a prefix for a boolean variable name.

```jshelllanguage
int myMaxIntTest = 2,147,483,647;  // not a valid syntax
int myMaxIntTest = 2_147_483_647;  // valid syntax
```
## Primitive Data Types
- Primitve data types are the most basic data types in Java.
- The eight primitive data types in Java in the table below.
- Remember that primitive data types are simply placeholders in memory for a value.  

|          Whole Number           |    Real Number    |
|:-------------------------------:|:-----------------:|
| byte<br/>short<br/>int<br/>long | float<br/>double  |
|      **Single Character**       | **Boolean Value** |
|              char               |      boolean      |


There's a defined minimum and maximum value, for each numeric data type.
```jshelllanguage
short myMinShortValue = Short.MIN_VALUE; 
int myMinIntValue = Integer.MIN_VALUE;
// cmd for getting the minimum value of a data type.

| myMinShortValue ==> -32768
| myMinIntValue ==> -2147483648

short myMinShortValue = Short.MIN_VALUE, myMaxValue = Short.MAX_VALUE;
// cmd for getting the maximum value of a data type.
    
| myMinShortValue ==> -32768
| myMaxValue ==> 32767

byte myMinByteValue = Byte.MIN_VALUE, 
myMaxByteValue = Byte.MAX_VALUE;
| myMinByteValue ==> -128
| myMaxByteValue ==> 127
```
### Integer
An integer is a whole number, meaning it doesn't contain a fractional element, or a decimal.  
<ins>Using the '+' sign in *System.out.print*</ins>: The plus sign +, used in `System.out.print` to print different data types as together as a single line of text.
```jshelllanguage
System.out.print("Integer Minimum Value = " + myMinIntValue);
```
Whatever follows the plus sign in `System.out.print` here, is converted to a String by Java, and concatenated to the String before it.

### Class
A class is a building block for Object-Oriented Programming, and allows to build custom data types.  
### Wrapper Class
Java uses the concept of wrapper class, for all of its eight primitive data types.  
A wrapper class provides simple operations, as well as some basic information about the primitive data type, which cannot be stored on the primitive itself.  
The primitive types, and their respective wrapper classes, are shown in the table below.

| Primitive | Wrapper Class | Width (in bits) |        MIN_VALUE        |            MAX_VALUE             |                    What's Noteworthy                    |
|:---------:|:-------------:|:---------------:|:-----------------------:|:--------------------------------:|:-------------------------------------------------------:|
|   byte    |     Byte      |        8        |          -128           |               127                |                 has the smallest range                  |
|   short   |     Short     |       16        |         -32768          |              32767               |                                                         |
|   char    |   Character   |       16        |                         |                                  |                                                         |
|    int    |    Integer    |       32        |       -2147483648       |            2147483647            |       Java's default data type for whole numbers        |
|   long    |     Long      |       64        |  -9223372036854775808   |       9223372036854775807        |                  has the longest range                  |
|   float   |     Float     |       32        | 1.4 x 10<sup>-45</sup>  |   3.4028235 x 10<sup>38</sup>    |                                                         |
|  double   |    Double     |       64        | 4.9 x 10<sup>-324</sup> | 1.79769313486 x 10<sup>313</sup> | Java's default data type for any decimal or real number |
|  boolean  |    Boolean    |        2        |                         |                                  |        allows two opposite values, ture or false        |  

*The Integer Wrapper Class*:
```jshelllanguage
int myMinIntValue = Integer.MIN_VALUE;
int myMaxIntValue = Integer.MAX_VALUE;

| Integer Value Range (-2147483648 to 2147482647)
```
### Overflow and Underflow
- If the value entered is larger than the maximum value of the primitive data type, it's something called **Overflow** situation.  
- Similarly, if the value entered is smaller than the minimum value of the data types, it's called an **Underflow**.  
- And for int these situations are also known as **integer wraparounds**.
- *Overflow and Error*: An integer wraparound event, either an overflow or underflow, can occur in Java when the expressions that are using not a simple literal value.
- The Java compiler doesn't attempt to evaluate the expression to determine its value, so it DOES NOT give an error.
```jshelllanguage
int willThisCompile = (Integer.MAX_VALUE +1);
int willThisCompile = (2147483647 + 1);
```
### Rules of declaring multiple variables in one statement
- Variables with different data types cannot be declared in a single statement.
- To declare multiple variables of the same data type in a single statement, the data type specification needed only once before any variable names.

### Casting in Java
Casting means to treat or convert a number, from one type to another. `(byte) (myMinByteValue) / 2;`

```jshelllanguage
//Some Errors
byte myNewByteValue = (myMInByteValue/2);
    |  Error:
    |  cannot find symbol
    |    symbol:   variable myMInByteValue
    |  byte myNewByteValue = (myMInByteValue/2);
// Java does not attempt to evaluate the value in a variable when it's used in a calculation.
    short myNewShortValue = (myMinShortValue / 2 );
    |  Error:
    |  incompatible types: possible lossy conversion from int to short
    |  short myNewShortValue = (myMinShortValue / 2 );
***********************************************************************
//Correction
byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
byte myNewByteValue = (byte) (myMinByteValue / 2 );
    |  myNewByteValue ==> -64
    
byte myNewByteValue = (-128 / 2);    // valid because calculation uses literal values
************************************************************************
// Error
    float myOtherFloatValue = 5.25;
    | Error:
    | incompatible types: possible lossy conversion from double to float
    | float myOtherFloatValue = 5.25;
************************************************************************
    float myOtherFloatValue = 5.25f;
    // Needs to define float with 'f' suffix, Cause Java's default decimal literal is double;
```


|   Assignment Type   |      Example Code       |
|:-------------------:|:-----------------------:|
| a literal character |    char myChar = 'D'    |
|   a Unicode value   | char myChar = '\u0044'; |
|  an integer value   |    char myChar = 68     |

### String vs StringBuilder
- The String class is immutable, but can be used much like a primitive data type.
- The StringBuilder class is mutable, meaning it can be changed, but does not share the String's special features, such as being able to assign it a assign it a String literal or use the plus operator on it.
- Both are classes, but the String class is in a special category in the Java language.
- The String is so intrinsic to the Java language, it can be used like a 9th primitive type.

## Operators, Operands and Expressions
** Operators **: Operators in Java are special symbols that perform specific operations on one, two, or three operands, and then return a result.
```jshelllanguage
long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
```

| Operator |   Numeric types   |        char        |    string     | boolean |
|:--------:|:-----------------:|:------------------:|:-------------:|:-------:|
|    +     |     Addition      |      Addition      | Concatenation |   n/a   |
|    -     |   Substraction    |    Substraction    |      n/a      |   n/a   |
|    *     |  Multiplication   |   Multiplication   |      n/a      |   n/a   |
|    /     |     Division      |      Division      |      n/a      |   n/a   |
|    %     | Remainder(Modulus | Remainder(Modulus) |      n/a      |   n/a   |

- Only one operator, the + operator, is supported by String, but it means concatenation, not addition.
- None of the operators are applicable to a boolean.
- Because the char is stored as a whole number literal, all the operations are applicable to a char.

**Operands**: An operand is a term used to describe any object that is manipulated by an operator. For example:  `int myVar = 15 + 12`. Here the plus (+) is the operator, and 15 and 12 are the operands.  
Variables used instead of literals can also be operands.  
```jshelllanguage
long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
```
In the line above, byteValue, shortValue and intValue are operands, as are the numeric literals.  
**Expression**: An expression is formed by combining variables, literals, method return values. They are a way of forming and combining those values to produce a result.  
For example: `int myVar = 15 + 12;` here, *15 + 12* is the expression, which returns value of *27*.

### Incrementing by One

|   Shorthand (or Abbreviating) Operator   | Code Sample |
|:----------------------------------------:|:-----------:|
|       Post-fix Increment Operator        | `result++`  |
| Compound Assignment Operator with + sign | `result+=1` |
### Decrementing by One

|   Shorthand (or Abbreviating) Operator   | Code Sample |
|:----------------------------------------:|:-----------:|
|       Post-fix Decrement Operator        |  result--;  |
| Compound Assignment Operator with - sign | result-=1;  |

### Compound Assignment Operator
The compound assignment operator `x-=y` is `x = (data type of x) (x-y)`.  
An implicit cast is done when using this operator, so no error occurs, but unexpected results may happen.
```jshelllanguage
result -= 5.5;
result = (int) (result - 5.5);
```

|        Shorthand Operator        | Code Sample |
|:--------------------------------:|:-----------:|
|   Post-fix Increment Operator    |  result++;  |
|   Post-fix Decrement Operator    |  result--;  |
|    Addition Compound Operator    | result+=5;  |
|  Substraction Compound Operator  | result-=5;  |
| Multiplication Compound Operator | result*=5;  |
|    Division Compound Operator    | result/=5;  |
