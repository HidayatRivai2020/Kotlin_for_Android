# Containers
- `Spinner` : Can be clicked or pressed by the user to perform an action
- `RecyclerView` : Advance version of ListView with improved performance and other benefits

## All Button Properties
- `background` : background color
- `backgroundTint` : background tint color
- `id` : unique id
- `layout_height` : height of button
- `layout_width` : width of button
- `min_height` : minimal height of object
- `visibility` : visibility

## All Button Method
- `isVisible` : visibility
- `setBackgorundColor(color: int)` : set the value of property `background`
- `onItemSelectedListener{}` : execute block of commands when textView clicked

## Containers Palette Values
- background | backgroundTint
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

## How To Set The Value of Spinner
- Create an Array of values in `String.xml`
- Implement `OnItemSelectedListener` from `AdapterClass`
- Find by id the `spinner`
- Set Spinner `OnItemSelectedListener` with `this`
- Create `ArrayAdapter` from `resource`
- set the `spinner adapter` with the new `adapter`

## ArrayAdapter Method
- `createFromResource(context, textArrayResId, TextViewResId)` : create new array adapter from resource
- `setDropDownViewResource(resourceId)` : create the view for dropdown from resource
