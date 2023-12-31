# Button
- `button` : Can be clicked or pressed by the user to perform an action
- `checkBox` : type of two state button either unchecked or checked
- `radio button` : select one option from a group
- `radio group` : group of radio button
- `toggle group` : button to change a setting between 2 states

## All Button Properties
- `background` : background color
- `backgroundTint` : background tint color
- `id` : unique id
- `layout_height` : height of button
- `layout_width` : width of button
- `visibility` : visibility

### All button except radioGroup
- `text` : text that will be displayed to user
- `textColor` : text color
- `textSize` : text size

## All Button Method
- `isVisible` : visibility
- `setBackgorundColor(color: int)` : set the value of property `background`
- `setOnClickListener{}` : execute block of commands when textView clicked
- `setTextColor(color: int)` : set the value of property `textColor`

## Button Palette Values
- background | backgroundTint | textColor
  - `Color.*` : int value of color in color class
  - int
- id : String
- layout_height | layout_width
    - `match_parent` : match the height with the parent height
    - `wrap_content` : set the height of layout as it original height
    - `dp` : device independent pixel
- text : string
- textSize
  - `dp`
  - `sp`
- visibility
  - `visible` : show the value in the correct position
  - `sp` : in the correct position but not showing the value
  - `gone` : not in the correct position and not showing the value
