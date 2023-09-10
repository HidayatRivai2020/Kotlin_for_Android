# Text
- `EditText` : UI element that allow user to enter or modify the text
- `TextView` : UI element that displays text to the user

## All Text Properties
- `background` : background color
- `id` : unique id
- `layout_height` : height of text view
- `layout_width` : width of text view
- `text` : text that will be displayed to user
- `textColor` : text color
- `textSize` : text size
- `visibility` : visibility


## All Text Method
- `isVisible` : return the visibility
- `setBackgorundColor(color: int)` : set the value of property `background`
- `setOnClickListener{}` : execute block of commands when textView clicked
- `setTextColor(color: int)` : set the value of property `textColor`

## Text Palette Values
- background | textColor
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