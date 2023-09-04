# Operation
- `operators` : the sign that between to operand that will be performed
- `operands` : the value

## Arithmetic Operator
- `+` (addition) : adds together 2 values
- `-` (substraction) : Subtracts one value from another
- `*` (multiplication) : multiplies 2 values
- `/` (division) : divides one value from another
- `%` (modulus) : get the division remainder

## Assignment Operator
- `=`  : Simple Assignment operator
- `+=`  : Add the right operand to left operand, and assigns the value to the left operand
- `-=`  : Subtract the right operand to left operand, and assigns the value to the left operand
- `*=`  : Multiple the right operand to left operand, and assigns the value to the left operand
- `/=`  : Divide the right operand to left operand, and assigns the value to the left operand

## Unary Operator
- `+` : unary plus operator
  - `++variable` : plus the variable with 1 first, then get the value
  - `variable++` : get the value first, then plus the variable with 1
- `-` : unary minus operator
  - `--variable` : subtract the variable with 1 first, then get the value
  - `variable--` : get the value first, then subtract the variable with 1
- `!` : logical complement operator

## Relational Operator
- compare left operand with the right operand
- return true of the relation is correct, otherwise return false
- `==` : equal to
- `!=` : not equal to
- `>` : greater than
- `>=` : greater than or equal to
- `<` : less than
- `<=` : less than or equal to

## Conditional Operator
- `&&` : return true if 2 booleans are true, otherwise return else
- `||` : return true if at least one boolean is true, otherwise return false

## Operator Precedent
- Kotlin interprets the symbols in order to perform
- The order can be changed with parentheses
- `unary` --> 1st (Highest)
- `multiplicative` --> 2nd
- `additive` --> 3rd
- `relational` --> 4th
- `Equality` --> 5th
- `Conditional And` --> 6th
- `Conditional OR` --> 7th
- `Assignment` --> Lowest

## Range To & In Operator
- Used to identification of numbers or characters in specified range
- `var1.rangeTo(other)` : using method `rangeTo` to `var1`
- `a..z` using two points between 2 variables
- `loop (newVar in range)` : to get the value in ranges as `newVar` in `loop`
- `char in charRange` : return true if `char` in `charRange`