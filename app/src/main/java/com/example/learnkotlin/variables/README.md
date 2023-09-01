# Variables
- Container that hold value
- Reserve space in memory
- Assigned a data type

## Naming Convention
- case sensitive
- must start with a letter or underscores
- use camelCase for variable names
- can contain letters (a-zA-z), digits (0-9), and underscores
- can't start with a number
- can't be reserved words
- don't use words that have special meanings or already defined
- use UPPERCASE for constant variable names

## Var
- Mutable variable
- `var variableName = variableValue`: declare var with value
- `var variableName:variableType? = null` : declare var without specific value
- The value of var can be assigned multiple times

## Val
- Immutable variable
- `val variableName = variableValue` : declare val with value
- The value and type of val can't be changed

## Data-Type
- Defines the value that variable can store
- Data-Type : 
  - Boolean
  - Character
    - Char
  - Numbers
    - Integer
      - Byte
      - Short
      - Int
      - Long
    - Floating Point
      - Float
      - Double
  - String
  - Array

### Boolean
- Variable that can store `true` or `false` value
- Using keyword `boolean`

### Char
- variable that only store one single character
- Using keyword `char`
- Default size : 2 Bytes (16 bit)

### Byte
- Size : 1 Byte (8 Bit)
- range [-128, 127]
- default value 0

### Short
- Size : 2 Bytes (16 Bit)
- range [-32768, 32767]
- default value 0

### Integer
- Size : 4 Bytes (32 Bit)
- range [-32768, 32767]
- default value 0

### Long
- Size : 8 Bytes (64 Bit)
- range [-2<sup>63</sup>, 2<sup>63</sup>-1 ]
- default value 0L

### Float
- Size : 4 Bytes (32 Bit)
- range 32-bit Floating Point
- default value 0.0f

### Double
- Size : 8 Bytes (64 Bit)
- range 64-bit Floating Point
- default value 0.0d

### String
- Sequence of Chars
- Default Value : Text
- Using double quotes in the value
- Each Char in string can be accessed by `[index]`
- Index start from 0
- use `+` to concat two string
- use `$` to show the value of variable inside string
- use `${ code here }` to show operation, method return, object property inside string

#### String Method
- `equals(Object another)` : compare string with another, return true if matches.
- `isEmpty()` : returns true if string has 0 length.
- `length()` : return the length of a string
- `lowecase()` : returns string in lowercase
- `plus("...")` : concat the string and another
- `trim()` : remove spaces at beginning and end of words
- `uppercase()` : return string in uppercase

### Array
- Object that hold multiple data of same type together
- `arrayOf(elements)` : create array from the `elements`
- Each element of array can be accessed by `[index]`
- index start from 0

#### Array Properties
- `indices` : each index of array
- `size` : the length of array

#### Array Method
- `get(index)` : return the value of array at index
- `plus(element)` : add element into array
- `set(index, newValue)` : set the value of array at index with the new value

## Type Conversion
- Change data-type into another data-type
- `toByte()` : convert data-type into Byte
- `toShort()` : convert data-type into Short
- `toInt()` : convert data-type into Integer
- `toLong()` : convert data-type into Long
- `toFloat()` : convert data-type into Float
- `toDouble()` : convert data-type into Double
- `toString()` : convert data-type into String
- `toBoolean()` : convert data-type into Boolean
- `toChar()` : convert data-type into Char

## Console Input
- Use the data from user input in console and assign it into variable
- `readline()`