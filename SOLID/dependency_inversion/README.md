# Dependency Inversion

- instead of tightly coupling dependencies to Objects to methods,
- we could delegate it to the parameter
- so its passed as a parameter thereby delegating responsibility of passing in the dependency to the caller
- this way we can provide different implementations of the parameterized/injected denpendency