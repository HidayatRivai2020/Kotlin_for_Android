# Android User Interaction

## Toast Message
- Can be used to display information for the short period of time
- contains message to be displayed quickly and disappears after sometime

### Toast Property
- `LENGTH_LONG` : long duration time

### Toast Method
- `makeText(context: Context, text: String, duration: Int)` : create text for Toast
- `show()` : Show toast with text

## Snackbar Message
- Light-weight widget
- Used to show messages in bottom of application with swiping enabled

### Snackbar Property
- `LENGTH_LONG` : long duration time
- `LENGTH_INDEFINITE` : keep showing until close button pressed

### Snackbar Method
- `make(view: View, text: String, duration: Int)` : create text for Snackbar
- `show()` : Show toast with tex

## Dialog Message
- Small win dow that prompts the user to make a decision or additional information
- Does not fill the screen
- Normally used for modal events that require users to take an action before they can proceed

### Dialog Property
- `LENGTH_LONG` : long duration time
- `LENGTH_INDEFINITE` : keep showing until close button pressed

### Snackbar Method
- `make(view: View, text: String, duration: Int)` : create text for Snackbar
- `show()` : Show toast with text