# Day 5: Control Flow
## Looping
### for loop
```java
for( init; expression; increment) {
       //block of statements
   }
```
### with break statement
```java
for( init; expression; increment) {
          //block of statements
          if (condition){
          break;
          }
   }
```
### [Debugging in Intellij IDE](www.jetbrains.com/help/idea/debugging-code.html)
- Opening debugger with `F5`
- Breakpoints
  - Toggle line breakpoint: `ctrl+F8`
  - Edit breakpoint properties: `ctrl+shift+F8`

### while  loop
```java
while(expression){
       //block of statements
   }
*****************************
while(true){
    if(expression){
        break;
    }
    System.out.println();
   }
```
### do while loop
```java
do{
       // block of statements
   } while(expression);
```
### Local Variables
- A local variable is called local because it is available for use by the code block in which it was declared.
- It is also available to code blocks that are contained by a declaring block.
```java
{
    int firstVariable = 5;
    int secondVariable = 4;

    if(firstVariable > 0){
       System.out.println(secondVariable);
       }
    }
```
### Scope
- Scope describes the accessibility of a variable.
- "In scope" means the variable can be used by an executing block or any nested blocks.
- "Out of scope" means the variable is no longer available and cannot be used.
- Local variables are always in the scope in the block they are declared.
- Local variables are always out of scope for outer blocks or the containing blocks they are declared in. 
- The switch statement is different from the if-then-else statement block. Here, variable scope is declared in between the case and it follow the hierarchy of cases.
```java
public static void aMethod(boolean aBoolean){
      if(aBoolean){
          int myCounter = 10;    // myCounter is local to this if block
          }
          System.out.println(myCounter);    // myCounter is out of scope here; compiler error;
  }
```
**switch statement**
```java
public static void aMethod(in value){
      switch (value){
         case 1:
             System.out.println(i);    // this is NOT OK; 'i' declared below;
             break;
         case 2:
             int i = 10;
             System.out.println(i);    // this is OK;
             break;

         default:
             i = value;    //this is OK
             System.out.println(i);    //this is OK
             break;
      }
      System.out.println(i);    //Error; 'i' is out of scope; outside the switch;
  }
```
### Scope Best Practices:
* To declare and initialize variables in the same place, if possible.
* And to declare variables in the narrowest scope possible.

