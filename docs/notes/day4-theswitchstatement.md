# Day 4: The Switch Statement
- Switch is good if we are testing  the same variables and to test different values for the variables.
- It is important to put `break` in the statements, otherwise it will "fall through the switch statement."
```java
switch(value){
      case x:
          // code for value == x
          break;
      case y:
          //  code  for value == y
          break;
      default:
          // code  for value  not equal to x or y
  }
```
- Valid Switch Value Types:
  * `byte, short, int , char`
  * `Byte, Short, Integer, Character`
  * `String`
  * `enum`
  * Cannot use `long , float, double`, or `boolean` or their wrappers  

## Enhanced Switch Statement
- Replaced `:` with `->` also applied in `Lambda Expression`, it's more correct to use `->` in switch.
- `break` is not needed in enhanced switch.  

```java
public static String getQuarter(String month){
          // enhanced switch expression
          return switch (month) {
              case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
              case "APRIL", "MAY", "JUNE" -> "2nd";
              case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
              case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
              //            default -> "bad";
              default -> {
                  String badResponse = month + " is bad";
                  yield badResponse;
              }
          };
```
- If a code block is used inside an enhanced switch statement, the `return` keywords get replaced by the `yield` keyword.  

### The Use of yield:
* If the statement is being used as a switch expression returning a value, `yield` is used. 
* If case label uses a code block, with opening and closing curly braces.
  eg: `{ yield "1st"; }`
