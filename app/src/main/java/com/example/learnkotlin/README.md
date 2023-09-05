# Activity
- Every activity has life cycle
- Until the app closed, some threads and functions will be called
- `onCreate` will be executed first
- `setContentView(layoutRes: int)` will create the view from layoutRes xml

## keyword
- `lateinit` : create variable without initialize it

## Annotation
- `uppressLint(vararg value: String)` : Indicates that Lint should ignore the specified warnings for the annotated element.

## Class
- `Activity Class`
  - `AppCompatActivity`
  - `MainActivity`
- `Widget Class`
  - `Button`
  - `TextView`

## Method
- `findViewById(id: int)` : get the view object by its id
- `getText(id: int)` : get the string value from resource by id
- `onCreate(savedInstanceState: Bundle?)` : the first function in activity lifecycles that run while creation
- `setContentView(layoutRes: int)` create the view from layout resource xml
