# Service
- Application component that can perform long running operations in the background
- Do not provide a user interface
- Another application component can start a service

## Service Type
- `foreground service` : user can see the process
- `background service` : user can't see the process
- `bound service` : dependent with component that call itself (client server relationship)

## Service Class
- `Service Class`
  - Standard service class
  - service class takes on the whole task all by itself
  - has a feature that uses the main thread of the application
  - use standard service class for small service
- `Job Intent Service Class`
  - subclass of the service class
  - does not use the application main thread
  - it creates another work thread and uses its own thread
  - used in long term background processes
- 