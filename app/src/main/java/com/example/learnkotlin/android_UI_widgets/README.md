# Widget
- `ImageView` : UI element to display image
- `WebView` : UI element to display content from the web

## All Text Properties
- `background` : background image
- `contentDescription` : Description of image
- `id` : unique id
- `layout_height` : height of text view
- `layout_width` : width of text view
- `visibility` : visibility

## All Text Method
- `isVisible` : visibility
- `setBackgorundResource(color: int)` : set the value of property `background`
- `setOnClickListener{}` : execute block of commands when textView clicked

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