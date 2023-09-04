# Kotlin_for_Android
- Using Kotling language for android development

## Preparation
- JDK
- Android Studio
- Android Device Manager
- Enable the virtualization
- GenyMotion Emulator (Android Virtual Device Alternative)

## File Structure
- `gradle` : advanced build toolkit, to automate and manage the build process while letting you define flexible, custom build configurations
- `manifest` : defines the structure and metadata of our application, its components, and its requirements
- `activity` : single screen in android app
- `res` : resource


## Gradle
- Building system that automates the build of android application development
- Make it easier to testing, building, debugging, and releasing
- Make it easier to add new libraries to a project
  - `project\build.gradle` : Top level build
  - `project\app\build.gradle` : The page about the application and its features

### Project\app\build.gradle
- `android/` : internal android system
- `dependencies` : libraries that will be implemented in application
- `android/compileSdk` : determines which API level features can be used
- `android/defaultConfig/` : default configuration for android
- `android/defaultConfig/applicationId` : unique value for ID in google play
- `android/defaultConfig/minimumSdk` : minimum API level that can works in application
- `android/defaultConfig/targetSdk` : application level will works well in this API level
- `android/defaultConfig/versionCode` : the code for version when publish into google play
- `android/defaultConfig/versionName` : the version name of application that will be different each update
- `plugins/` : plugins that will be used in application

## Manifest
- XML page
- Defines the structure and metadata of our application, its components, and its requirements
- Can access the basic information of application from this file
- Can access the basic permission for the application in this file
- `\<xmlTag prefix:attribute=value>\<anotherTag>\</anotherTag>\</xmlTag>` : with body
- `\<xmlTag prefix:attribute=value>\<anotherTag/>` : without body

### Project\app\src\main\AndroidManifest.xml
- `manifest` : manifest root
- `manifest/application` : the application
  - `icon` : android icon
  - `label` : application name that will be seen on the phone
  - `roundIcon` : android icon with round shaped
- `manifest/application/activity` : single screen in the application
  - `name` : activity name
  - `screenOrientieation` : defines vertical or horizontal screen in application
- `manifest/application/activity/intent-filter` : single screen in the application
- `manifest/application/activity/intent-filter/action` : single screen in the application
- `manifest/application/activity/intent-filter/category` : single screen in the application
- `manifest/uses-permission` : permission to use device features in application
  - `name` : permission name

## Res
- `drawable` : folder of pictures
- `layout` : folder of the templates for activity
- `mimpap-*` : folders to save pictures with different pixel
- `values` : the xml for resource values
- `values\colors` : resource for the colors value in light theme
- `values\strings` : resource for the strings value in light theme
- `values\themes` : resource for the themes value in light theme
- `values-night\colors` : resource for the colors value in light theme
- `values-night\strings` : resource for the strings value in light theme
- `values-night\themes` : resource for the themes value in light theme

## List Of Content
- Hello World
- Comments
- Variables
  - Naming Convention
  - Var
  - Val
  - Data-Type
    - Boolean
    - Character
    - Byte
    - Short
    - Int
    - Long
    - Float
    - Double
    - String
      - String Method
    - Array
      - Array Method
      - Array Properties
  - Type Conversion
  - Console Input
- Collection
  - List
  - ArrayList
    - ArrayList Properties
    - ArrayList Method
  - Set
  - Map
- Operations
  - Arithmetic Operator
  - Assignment Operator
  - Unary Operator
  - Relational Operator
  - Conditional Operator
  - Operator Precedent
  - Range To & In
- Control Flow
  - If Else
    - Ladder
    - Nested
  - When
- Loops