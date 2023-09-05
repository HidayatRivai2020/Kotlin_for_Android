# Widget
- `ImageView` : UI element to display image

## All Text Properties
- `background` : background color
- `id` : unique id
- `isVisible` : visibility
- `layout_height` : height of text view
- `layout_width` : width of text view
- `text` : text that will be displayed to user
- `textColor` : text color
- `textSize` : text size

## All Text Method
- `setBackgorundColor(color: int)` : set the value of property `background`
- `setOnClickListener{}` : execute block of commands when textView clicked
- `setTextColor(color: int)` : set the value of property `textColor`

## Text Palette Values
- background | textColor
    - `Color.*` : int value of color in color class
    - int
- id : String
- isVisible : Boolean
- layout_height | layout_width
    - `match_parent` : match the height with the parent height
    - `wrap_content` : set the height of layout as it original height
    - `dp` : device independent pixel
- text : string
- textSize
    - `dp`
    - `sp`