# Lifecycle
- The phase from application opened until the end point
- Lifecycle
    - Application Lifecycle
    - Activity Lifecycle
    - Fragment Lifecycle

## Application Lifecycle
- `Activity Launched`
- `onCreate()` : when application opened (activity launched)
- `onStart()` : after activity created (`onCreate`) or restarted (`onRestart`)
- `onResume()` : after activity started (`onStart`)
- `Activity Running`
- `onPause()` : when activity running and another activity comes into the foreground
- back to `onResume()` : user returns to activity after activity paused (`onPause`)
- back to `onCreate()` : after the `App process killed` and user navigates to the activity
- `onStop()` : after activity paused (`onPause`) and the activity is no longer visible
- `App proccess killed` : if Apps with higher priority need memory after activity paused (`onPause`) or stopped (`onStop`)
- back to `onRestart` : if user navigates the activity after activity paused (`onPause`)
- `onDestroy` : after activity stopped (`onStop`) and the activity is finished or being destroyed by system
- `Activity Shutdown`

## Fragment
- User Interface that works in activity
- Dynamic User Interface

### Fragment LifeCycle
- Fragment Start
  - `onAttach()`
  - `onCreate()`
  - `onCreateView()`
  - `onViewCreated()`
  - `onStart()`
  - `onResume()`
- Fragment is Running
  - `onPause()`
  - `onStop()`
  - `onDestroyView()`
  - `onDestroy()`
  - `onDetach()`
- Fragment End
