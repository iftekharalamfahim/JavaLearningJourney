# Day 3: Expression, Condition, and Method  
## Topic Covered

- **Expression:** An expression computes to a single value. Expression are used frequently to built using values, variables, and operators.
```java
public class Expression {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);
        //the entire line above is valid statement and "kilometers = (100 * 1.609344)" is the expression.
    }
}
```
- **Statement:** Statements are stand-alone units of work.
- **Code blocks:** A code block is a set of zero, one, or more statements, usually grouped together in some way to achieve a single goal.
- **Whitespace:** Any extra spacing, horizontally or vertically, placed around Java.
- **Indentation (Code  Organization):** Java indentation refers to the practice of using spaces or tabs at the beginning of a line of code to visually represent its level within the code structure.
- If-then-else control statement.
- Method in Java.
- Structure of Method Parameters.
- Method Overloading.
- Method Signature.  

## Code Block (if-then-else control statement)  
- There is no limit to the number of conditions that can be tested.
- The else block must be last but is optional.
```java
if(condition){
    // code in the block will execute only if the condition is true
        // block can contain 1 or many statements
  }
********************************************************************
if (firstCondition){
    //code in block will execute only if firstCondition is true
        } else if(secondCondition){
    // Code in block will execute if firstCondition is false and secondCondition is true
        
        } else{
    // Code in block will execute if all conditions above are false
 }
```
## Method in Java
Method in Java helps to write code once and reuse it anywhere in the program.
- A method is a way of reducing code duplication.
- A method can be executed many times with potentially different results, by passing data to the method in the form of arguments.
- A method cannot be put inside another method.  

**Structure of a method:**
```java
public static void methodName(){
        // Method statements form the method body
    }
//to invoke or calling a method
    methodName();
```
**Structure of a method parameters:**
```java
public static void methodName(parameter1type p1, parameter2type p2, {more}){
        // Method statements form the method body
    }
```
### Parameter or Argument?
- Parameter is a definition as shown in the method declaration and the argument will be the value that's passed to the method when it is called. 
- To execute a method that defined with parameters, variables, values, or expressions needs to be passed that match the type, order and number of the parameters declared.  

**Structure of method with parameters and return type:**
```java
public static dataType methodName(parameter1type p1, parameter2type p2, {more}){
        //Method statements
        return value;
```
### Best Practice
- One common practice is to declare a default return value at the start of a method and have a single return statement.
- try to test the condition to their boundaries. it will help to get if there is any bug.
```java
public static boolean isTooSmall(int age){
        boolean result = false;
        if(age < 21){
            result = true;
        }
        return result;
    }
```
### Method Overloading
- Method overloading occurs when a class has multiple methods with the same name but declared with different parameters.  
- A unique method signature is the key for the java compiler to determine if a method is overloaded correctly.
### Method Signature
- A method signature consists of the name of the method, and the uniqueness of the declaration of its parameters.
- A signature is unique by method name, in combination with the number of parameters, their type and order they declared.
- A method's return type is not a part of the signature.
- A parameter name is also not part of the signature.
```java
public  static void doSomething (int parameterA){
         //method body;
 }
 public static void doSomething (float parametersA){
         //method body;
 }
```
