```groovy
def someMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println someMethod(5, 2) // Correctly prints 5
println someMethod(2, 5) // Correctly prints 5
println someMethod(null, 5) // Throws NullPointerException
```