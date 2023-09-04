# Control FLow
- `if` : execute block of command inside if when the condition is true, otherwise execute block of command inside else
  - `if (condition) { }` --> without else
  - `if (condition) { } else { }` --> if else
  - `if (condition) { } else if (condition) { } else { }` --> if ladder statement
  - `if (condition) { if (condition) { } else { } } else { if (condition) { } else { } }` --> if nested statement
  - ladder and nested if can be combined
- `when` : execute one statement from multiple condition 
  - `when (expr) { value1 -> /* code here */ else /* code here */ }`

## If
- check the boolean condition
- execute the block commands inside `if` the condition is `true`

### if else 
- execute the block commands inside `if` when the condition is `true`
- execute the block commands inside `else` when the condition is `true`

## if ladder statement
- the format
  - `if`
  - `else if`
  - `else`
- check `if` condition first
- when `if` condition is true, execute the `if` block of command 
- when `if` condition is false, check another `else if` condition
- when `else if` condition is true, execute the block of command
- when `else if` condition is false, check into next `else if` and repeat
- when there is no condition true, execute the `else` block of command


## if nested statement
- the format
    - `if`
      - if
      - else
    - `elses`
      - if
      - `else`
- check `if` condition first
- when `if` condition is true, execute the `if` block of command
- when `if` condition is false, check another `else if` condition
- when `else if` condition is true, execute the block of command
- when `else if` condition is false, check into next `else if` and repeat
- when there is no condition true, execute the `else` block of command

## when
- compare the expression with the value
- if there is an equals expression and value, execute the statement.
- if there is no equals value, execute the `else` statement
