# Day 6: The Class, The Object, Static & Instance Fields and Methods
## A Class
* a custom data type.
* a special code block that contains methods.
## An Object
* An Object is called an instance of a particular class.
* You create an object by instantiating a class
* You can create many objects using a single class. Each may have unique attributes or values.
* Objects and instance are interchangeable terms.
* The most common way to create an object is to use the 'new' keyword.
* The new keywords creates an instance of a class.
```java
 String s = "Hello";    // String is a class

String s = new String("Hello");
```
* Class can be created with static and without static
  ### Static Field
   * Requires `static` keyword 
   * Value stored in special memory location and only in one place
   * Value is accessed by `<ClassName.filedname>`
  ### Instance Field
   *  Don't require `static` keyword
   * Memory of the value is not allocated until the object is created.
   * Value accessed by `<ObjectVariable.filedname>`
  ### Static Method
   * Requires `static` keyword
   * Method accessed by `<ClassName.methodName>`
  ### Instance Method
   * Omits `static` keyword
   * Method accessed by `<ObjectVariable.methodName>`
  ### Wrapper Method
To change the type of value from string to integer or double:
   *  `Integer -> parseInt(String)`
   * `Double -> parseDouble(String)`
 
### Reading Data from Console
   * `System.in`
   * `System.console()`
   * `Console Line Argument`
   * `Scanner`