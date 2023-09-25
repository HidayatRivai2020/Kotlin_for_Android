# Device Compatibility

## Multi Language Support
- English is default language, but can be localized
- Implement an android app that localize for all the regions to reach most of the user

## Different Pixel Densities
- Android devices come different screen size and pixel size
- images might appear at the wrong size if pixel variation density is not considered
- Avoid using pixels to define distances or size
  - different screens have different pixel densities
  - same number of pixels may correspond to different physical size on different devices
- Use DPI to support different pixel densities

### DPI
- Provide multiple version of each bitmap in app to provide good graphical qualities on devices
- One for each density bucket at a corresponding resolution
- If not used, android will scale the bitmap and blur the image
- Resolution
  - MDPI
  - HDPI
  - XHDPI
  - XXHDPI
  - XXXHDPI

## Different Screen Size
- Android devices come different in all shape and size
- Create a responsive layout to support variation screen size
- Screen Size
  - Small
  - Normal
  - Large
  - Extra large
- 