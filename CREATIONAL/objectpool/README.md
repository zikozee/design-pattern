# Object pool
## usages -> Jdbc connection, Thread pool

- in our system, if **cost of creating an instance** of a class is high and we need **a large number of objects** 
  - of this class for a **short duration**, then we can use an object pool

- we either pre-create object of the class or collect unused instances in an in memory cache.
  - when code need an object of this class we provide it from this cache.

- one of the most complicated patterns to implement efficiently  
  - as we have to deal with multi-thread issue



## Implementation
- A thread-safe caching of objects should be done in pool
- Methods to acquire and release objects should be provided & pool should reset cached objects before giving them out

- The reusable object must provide methods to reset its state upon "release" by code
- We have to decide whether to create new pooled objects when pool is empty or wait until an object becomes available
  - Choice is influenced by whether objects is tied to fixed number of external resources 


## Considerations
- Resetting object state should NOT be costly operation otherwise you end up losing your performance savings
- Pre-caching object: meaning creating objects in advance can be helpful as it won't slow down the code using these 
  - objects. However, it may add-up to start time & memory consumption
- Object pools's synchronization should consider the reset time needed & avoid resetting in synchronized context if
  - possible
- pooling objects is only beneficial if they involve costly initialization because of say initialization of external
  - resource like a connection or thread. Don't pool objects just to save memory, unless you are running into 
  - out of memory errors


## EXAMPLES
- java.uitl.concurrent.ThreadPoolExecutor 
  - even though we can use it directly, you'll often use it via ExecutorService interface using methods like
  - newCachedThreadPool()
