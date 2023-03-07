## Singleton
- A Singleton class has only on instance, accessible globally through a single point (via a method/field)
- Main Problem this pattern solves is to ensure that only a single instance of this class exists
- Any stat you add in your singleton becomes part of "global state" of your application

## Two Options for Implementing a Singleton
- Early Initialization -Eager Singleton
- - create singleton as soon as class is loaded

- Lazy initialization -Lazy Singleton
- - Singleton is created when it is first required 
  - we do a double check locking so that the second thread waiting on the synchronized block
  - does not recreate the instance
  - likewise we declare our instance as volatile (volatile forces value read/write from main memory instead of cache)
