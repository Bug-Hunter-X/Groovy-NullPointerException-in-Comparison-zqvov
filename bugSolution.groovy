```groovy
def someMethod(a, b) {
  // Solution 1: Using the Elvis operator
  def result = (a ?: 0) > (b ?: 0) ? a : b
  return result
  
  // Solution 2: Using a conditional statement
  // if (a == null || b == null) {
  //   return 0 // Or handle nulls appropriately
  // } else if (a > b) {
  //   return a
  // } else {
  //   return b
  // }
}

println someMethod(5, 2) // Prints 5
println someMethod(2, 5) // Prints 5
println someMethod(null, 5) // Prints 5
println someMethod(5, null) // Prints 5
println someMethod(null, null) //Prints 0
```