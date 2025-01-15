def myMethod(String input) {
  if (input == null) { 
    return "Null input"
  }
  return input.toUpperCase()
}

println myMethod(null)
println myMethod("hello")

//This code may seem correct at first glance, but it hides a subtle issue related to Groovy's handling of null values.  The problem lies in the way Groovy treats method calls on null objects.

//In this example, the toUpperCase() method is called on the input string. If input is null, a NullPointerException will not be thrown immediately. Instead, Groovy will try to invoke toUpperCase() on null which results in a NullPointerException.

//This behavior is not immediately obvious to developers who are familiar with more strict languages, where a null check would prevent such a situation altogether.