# OOP
- One of the method to designing and implementing software
- Used to Increase the flexibility and maintainability
- Simplifies software development and maintenance by providing some concepts
  - `Class` : group of similar entities
  - `Object` : Instance of the class 
  - `access modifiers` : visibility modifiers, setting the access level to classes or class members

## Naming Convention
- case sensitive
- Class Name : UpperCase letter and noun
- Function Name : camelCase and verb
- Object Name : camelCase

## Class
- Using keyword `class`
- the blueprint of an object
- group of similar entities
- Class does not consume any memory
- `method` : (optional) functions inside class, the action that can be used by object
- `properties` : (optional) variable as member of the class that can be used as data of object

## Object
- `var newObject = ClassName()`
  - `newObject` = Object name
  - `ClassName` = Class Name
- Instance of the class
- Object contains an address and takes up some space in memory
- Characteristics of object
  - `State` : represent the data of an object
  - `Behavior` : represent the action of the object
  - `Identity` : used internally in JVM in order to identify each object uniquely
- `newObject.propertyName` = use the property in object
- `newObject.methodName` = call the method in object

## Access Modifier
- `private` : visible only inside the classes
- `potected` : visible inside the classes and subclasses
- `internale` : visible in the same module
- `public` : (default) visible from everywhere

## Constructor
- the first method of function to be called when creating an object from any class
- the default of constructor is empty constructor

### Primary Constructor
- Part of the class header
- Created after class name with optional parameters
- Using `constructor` keyword
- The `constructor` keyword can be omitted if it does not have notation or visibility modifier
- Can't contain any code
- Initialization code can be placed in `init { /* iniatialization code here */ }`

### Secondary Constructor
- Similar with the constructor from java
- Allow initialization of variables and some logic to the class
- Using `constructor` keyword
- Can create multiple constructor with different parameters

## Encapsulation
- Using `private` so updating the `properties` value will be limited
- getter : use `get` to get `properties`
- setter : use `set` to set `properties`
- if `set` private, then object only can get te value
- getter can only use the same modifier with properties

## Inheritance
- Used when there is relationship between objects
- All classes can inherit variables and methods from another class
- Classes are `final` by default, so need to add `open` keyword when create a new class
- subclass can't inherit properties and method from `final` class
- subclass can inherit `public` and `protected` properties and method from superclass
- If superclass has primary constructor, subclass need to implement primary constructor

### Function Overriding 
- Create a function with the same name, parameter, and return type from subclass with superclass
- the superclass method must use `open` keyword
- the subclass method must use `override` keyword
- `super` : keyword to use the member from super class

## Abstract Class
- Object can't be created from abstract class
- Using keyword `abstract`
- `abstract` can be used in method and property
- abstract method does not have body
- abstract property does not have value
- Can be implemented by another class
- Class that implement abstract class should override the member from `abstract`

## Interface
- Custom types provided by Kotlin
- Using keyword `interface`
- Can not be instantiated directly
- Interface define properties and methods that the concrete types must follow and implement
- `val` properties in interface can be `override` into `var` 
- Interfaces are also `abstract`
- Class can implement multiple interfaces
- 