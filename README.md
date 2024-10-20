# 30 days of Kotlin

## Setup
[Setup Intellij for Kotlin development](https://www.jetbrains.com/help/idea/get-started-with-kotlin.html)

## Sections:

[Variables and Data Types](#variables-and-data-types) 

[Collections](#collections):

- [List](#list)

- [Set](#set)

- [Map](#map)

[Control Structures](#control-structures):

- [If Statement](#1-if-statement)

- [When Expression](#2-when-expression-similar-to-switch-in-other-languages)

- [Ranges](#3-ranges-)

- [For loop](#4-for-loop)

- [While loop](#5-while-loop)

- [do-while loop](#6-do-while-loop)

[Functions](#functions):

- [Named arguments](#named-arguments)

- [Default parameter values](#default-parameter-values)

- [Functions without return](#functions-without-return-)

- [Single-expression functions](#single-expression-functions-)

- [Early returns in functions](#early-returns-in-functions)

- [Lambda expressions](#lambda-expressions):

  - [Pass to another function](#pass-to-another-function)

  - [Function types](#functions-without-return-)

  - [Return from a function](#return-from-a-function)
  
  - [Invoke separately](#invoke-separately)

  - [Trailing lambdas](#trailing-lambdas)

[Classes](#classes):
- [Properties](#properties)
- [Create instance](#create-instance)
- [Access properties](#access-properties)
- [Member functions](#member-functions)
- [Data classes](#data-classes)

[Null safety](#null-safety):
- [Nullable types](#nullable-types)
- [Check for null values](#check-for-null-values)
- [Use safe calls](#use-safe-calls)

[Idioms](#idioms):

- [Create DTOs (POJOs/POCOs)](#create-dtos-pojospocos)
- [Default values for function parameters](#default-values-for-function-parameters)
- [Filter a list](#filter-a-list)
- [Check the presence of an element in a collection](#check-the-presence-of-an-element-in-a-collection)
- [String interpolation](#string-interpolation)
- [Read standard input safely](#read-standard-input-safely)
- [Instance checks](#instance-checks)
- [Read-only list](#read-only-list)
- [Read-only map](#read-only-map)
- [Access a map entry](#access-a-map-entry)
- [Traverse a map or a list of pairs](#traverse-a-map-or-a-list-of-pairs)
- [Iterate over a range](#iterate-over-a-range)
- [Lazy property](#lazy-property)
- [Extension functions](#extension-functions-)
- [Create a singleton](#create-a-singleton)
- [Use inline value classes for type-safe values](#use-inline-value-classes-for-type-safe-values)
- [Instantiate an abstract class](#instantiate-an-abstract-class)
- [If-not-null shorthand](#if-not-null-shorthand)
- [If-not-null-else shorthand](#if-not-null-else-shorthand)
- [Execute a statement if null](#execute-a-statement-if-null)
- [Get first item of a possibly empty collection](#get-first-item-of-a-possibly-empty-collection)
- [Execute if not null ](#execute-if-not-null-)
- [Map nullable value if not null](#map-nullable-value-if-not-null)
- [Return on when statement](#return-on-when-statement)
- [try-catch expression](#try-catch-expression)
- [if expression](#if-expression)
- [Builder-style usage of methods that return Unit](#builder-style-usage-of-methods-that-return-unit)
- [Single-expression functions](#single-expression-functions)
- [Call multiple methods on an object instance (with)](#call-multiple-methods-on-an-object-instance-with)
- [Configure properties of an object (apply)](#configure-properties-of-an-object-apply)
- [Java 7's try-with-resources](#java-7s-try-with-resources)
- [Generic function that requires the generic type information](#generic-function-that-requires-the-generic-type-information)
- [Swap two variables](#swap-two-variables)
- [Mark code as incomplete (TODO)](#mark-code-as-incomplete-todo)
## Variables and Data Types

In Kotlin, variables are declared using two keywords:
- val for immutable variables (values that can't be changed).
- var for mutable variables (values that can be changed).
  Example:

```kotlin
val name: String = "John"  // immutable variable
var age: Int = 25          // mutable variable
```

```kotlin
// Variable declared without initialization
// Triggers an error
val d: Int 

```

You can also let Kotlin infer the type:

```kotlin
val country = "USA"        // Kotlin infers that 'country' is of type String
var temperature = 30       // 'temperature' is of type Int
```

```kotlin
var customers= 10

// Some customers leave the queue

customers = 8

customers = customers + 3 // Example of addition: 11
customers += 7            // Example of addition: 18
customers -= 3            // Example of subtraction: 15
customers *= 2            // Example of multiplication: 30
customers /= 3            // Example of division: 10
```

In total, Kotlin has the following basic types:

| Category | Basic types | Example code                                             |
|----------|----------|----------------------------------------------------------|
| Integers | `Byte`, `Short`, `Int`, `Long` | val year: Int = 2020                                     |
| Unsigned Integers | `UByte`, `UShort`, `UInt`, `ULong` | val score: UInt = 100u                                   |
| Floating-point numbers| `Float`, `Double` | val currentTemp: Float= 24.5f, val price: Double = 19.99 |
| Booleans | `Boolean` | val isEnabled: Boolean = true                            |
| Characters | `Char` | val seperator: Char = ','   |
| Strings | `String` | val message: String = "Hello, world!"|

For more information on basic types and their properties, see [Basic types](https://kotlinlang.org/docs/basic-types.html)


## Collections

When programming, it's useful to be able to group data for later processing.
Kotlin provides collections for exactly this purpose.

Kotlin has the following collections for grouping items:

| Collection type | Description |
|----------|----------|
| Lists | Ordered collections of items|
|Sets| Unique unordered collections of items |
| Map | Sets of key-value pairs where keys are unique and map to only one value |

Each collection type can be mutable or read only.

#### List

Lists store items in the order that they are added, and allow for duplicate items.

To create a read-only ([List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/)), use the [listOf()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/list-of.html) function.

To create a mutable list ([MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list.html)), use the [mutableListOf()](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/mutable-list-of.html) function.

When creating lists, Kotlin can infer the type of items stored. To declare the type explicitly, add the type within angled brackets `<>` after the list declaration:

```kotlin
// Read only list
val readOnlyShapes = listOf("triangle","square","circle")
println(readOnlyShapes) // [triangle, square, circle]

// Mutable list with explicit type declaration
val shapes: MutableList<String> = mutableListOf("triangle","square", "circle")
println(shapes) // [triangle, square, circle]

```

>✨ To prevent unwanted modifications, you can create a read-only view of mutable list by assigning it to a `List`:
> 
>   ```kotlin
>   val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
>   val shapesLocked: List<String> = shapes
>   ```
> 
This is also called **casting**

Lists are ordered so to access an item in a list, use the indexed access operator `[]`:

```kotlin
val readOnlyShapes= listOf("triangle", "square", "circle")
println("The first item in the list is: ${readOnlyShapes[0]}") // The first item in the list is: triangle
```
To get the first or last item in a list, use [.first()]() and [.last()]() functions respectively:

```kotlin
val readOnlyShapes= listOf("triangle", "square", "circle")
println("The first item in the list is: ${readOnlyShapes.first()}") // The first item in the list is: triangle
```

To get the number of items in a list, use the [.count()]() function:

```kotlin
val readOnlyShapes= listOf("triangle", "square", "circle")
println("The list has ${readOnlyShapes.count()} items") // The list has 3 items
```

To check that an item is in a list, use the [in]() operator:

```kotlin
val readOnlyShapes= listOf("triangle", "square", "circle")
println("circle" in readOnlyShapes) // true
```

To add or remove items from a mutable list, use [.add()]() and [.remove()]() functions respectively:


```kotlin
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
// Add "pentagon" to the list
shapes.add("pentagon")
println(shapes) // [triangle, square, circle, pentagon]

// Remove the first "pentagon" in the list
shapes.remove("pentagon")
println(shapes) // [triangle, square, circle]
```

#### Set

Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.

To create a read-only set ([Set]()), use [setOf()]() function.

To create a mutable set ([MutableSet]()), use the [mutableSetOf()]() function.

When creating sets, Kotlin can infer the type of items stored. To declare the type explicitly, add the type within angled brackets `<>` after the set declaration:


```kotlin
// Read-only set
val readOnlyFruit= setOf("apple", "banana", "cherry", "cherry")
// Mutable set
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
println(readOnlyFruit) // [apple, banana, cherry]
```

You can see in the previous example that because sets only contain unique elements, the duplicate "cherry" item is dropped.


>✨ To prevent unwanted modifications, you can create a read-only view of a mutable set by assigning it to a `Set`:
>   ```kotlin
>   val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
>   val fruitLocked: Set<String> = fruit
>   ```

As sets are unordered, you can't access an item at a particular index.

To get the number of items in a set, use [.count()]() function:

```kotlin
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
println("This set has ${readOnlyFruit.count()} items") // This set has 3 items
```

To check that an item is in a set, use the [in]() operator:

```kotlin
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
println("banana" in readOnlyFruit) // true
```

To add or remove items from a mutable set, use [.add()]() and [.remove()]() functions respectively:

```kotlin
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
fruit.add("dragonfruit") // Add "dragonfruit" to the set
println(fruit) // [apple, banana, cherry, dragonfruit]

fruit.remove("dragonfruit") // Remove "dragonfruit" from the set
println(fruit) // [apple, banana, cherry]

```
#### Map

Maps store items as key-value pairs. You access the value by referencing the key. You can imagine a map like a food menu. You can find the print (value), by finding the food (key) you to eat. Maps are useful if you want to look up a value without using a numbered index, like in a list.

- Every key in map must be unique so that Kotlin can understand which value you want to get.

- You can have duplicate values in a map.

To create a read-only map ([Map]()), use the [mapOf()]() function.

To create a mutable map ([MutableMap]()), use the [mutableOf()]() function.

When creating maps, Kotlin can infer the type of items stored. To declare the type explicitly, add the types of the keys and values within angled brackets `<>` after the map declaration. For example: `MutableMap<String,Int>`. The keys have type `String` and the values have type `Int`.

The easiest way to create maps is to use [to]() between each key and its related value:

```kotlin
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu) // {apple=100, kiwi= 190, orange= 100}
```

>✨ To prevent unwanted modifications, you can create a read-only view of a mutable map by assigning it to a `Map`:
>
>   ```kotlin
>   val juiceMenu: MutableMap<String,Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
>   val juiceMenuLocked: Map<String,Int> = juiceMenu 
>    ```

To access a value in a map, use the indexed access operator `[]` with its key:

```kotlin
// Read-only map
val readOnlyJuiceMenu= mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}") // The value of apple juice is 100

println("The value of cherry juice is: ${readOnlyJuiceMenu["cherry"]}") // The value of cherry juice is null
```

You can also use the indexed access operator `[]` to add items to a mutable map:

```kotlin
val juiceMenu: MutableMap<String,Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
juiceMenu["coconut"] = 150 // Add key "coconut" with value 150 to the map
println(juiceMenu) // {apple=100, kiwi=190, orange=100}
```

To remove items from a mutable map, use the [.remove()]() function:

```kotlin
val juiceMenu: MutableMap<String,Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
juiceMenu.remove("orange") // Remove key "orange" from the map
println(juiceMenu) // {apple=100, kiwi=190}
```

To get the number of items in a map, use the [.count()]() function:

```kotlin
// Read-only map
val readOnlyJuiceMenu= mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

```
To check if a specific key is already included in a map, use the [.containsKey()]() function:

```kotlin
val readOnlyJuiceMenu= mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu.containsKey("kiwi")) // true
```

To obtain a collection of the keys or values of a map, use the [keys]() and [values]() properties respectively:

```kotlin
val readOnlyJuiceMenu= mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu.keys) // [apple, kiwi, orange]
println(readOnlyJuiceMenu.values) // [100, 190, 100]
```
For more information on what you can do with collections, see [Collections]()

## Control Structures

Kotlin has familiar control structures like `if`, `when`, `for` and `while`.

#### 1. If Statement:

The `if` statement works just like in many languages, but in Kotlin, it can also be an expression (it returns a value).

```kotlin
val max = if (a > b) a else b
```

#### 2. When Expression (similar to switch in other languages):

```kotlin
val day = 3
val dayName = when (day){
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    4 -> "Thursday"
    5 -> "Friday"
    6 -> "Saturday"
    7 -> "Sunday"
    else -> "Unknown"
}
val obj = "Hello"

```
`when` can also be used without a subject

This example uses a `when` expression **without** a subject to check a chain of Boolean expressions:

```kotlin
fun main() {
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"
    val trafficLightAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else->"Malfunction"
    }
    println(trafficLightAction) // Stop
}
```
However, you can have the same code but with `trafficLightState` as the subject:

```kotlin
fun main() {
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"
    val trafficLightAction = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else->"Malfunction"
    }
    println(trafficLightAction) // Stop
}
```

#### 3. Ranges  

The most common way to create a range in Kotlin is to use the `..` operator. For example, 1..4 is equivalent to 1, 2, 3 ,4.

To declare a range that doesn't include the end value, use the `..<` operator. For example, 1..<4 is equivalent to 1, 2, 3.

To declare a range in reverse order, use `downTo`. For example, `4 downTo 1` is equivalent to 4, 3, 2, 1.

To declare a range that increments in a step that isn't 1, use `step` and your desired increment value. For example, `1..5 step 2` is equivalent to 1, 3, 5.

You can also do the same with `Char` ranges:

- `'a'..'b'` is equivalent to 'a', 'b', 'c', 'd'
- `'z' downTo 's'` is equivalent to 'z', 'y', 'v', 't'



#### 4. `for` loop

`for` loops are typically used to iterate over ranges, arrays, or collections.

Base Syntax:

```kotlin
for (item in collection){
    // Do something with item
}
```

Example: Iterating over a Range

```kotlin
for (i in 1..5){
    println(i) // Output: 1 2 3 4 5
}
```

- 1..5 is range from 1 to 5 (inclusive).
- You can also use `until` if you don't want to include the last value:

```kotlin
for (i in 1 until 5){
    println(i)
}
```

Example: Iterating over an Array

```kotlin
val numbers = arrayOf(1,2,3,4,5)
for (i in numbers){
    println(i)
}
```

Example: Iterating with an index

If you need both the index and the value:

```kotlin
val items = listOf("apple","banana","kiwi")
for ((index,value) in items.withIndex()){
    println("Item at $index is $value")
}
```
#### 5. `while` loop

The `while` loop repeatedly executes a block of code as long as the condition is true.

Basic Syntax:

```kotlin
while(condition){
    // Code to execute
}
```

Example: Basic `while` loop

```kotlin
var i = 5
while (i>0){
    println(i)
    i--
}
```
#### 6. `do-while` loop

The `do-while` loop is similar to `while`, but it guarantees that the block of code will execute at least once, even if the condition is initially false.

Basic Syntax: 

```kotlin
do {
    // Code to execute
} while(condition)
```

Example: `do-while` loop

```kotlin
var i = 5
do{
    println(i)
    i--
} while(i>0)
```


## Functions

You can declare our own functions in Kotlin using the `fun` keyword.

```kotlin
fun hello() {
    return println("Hello, world!")
}

fun main() {
    hello() // Hello, world!
}

```

In Kotlin:

- Function parameters are written within parentheses `()`.
- Each parameter must have a type, and multiple parameters must be separated by commas `,`.
- The return type is written after the function's parentheses(), separated by a colon `:`.
- The body of a function is written within curly braces `{}`.
- The `return` keyword is used to exit or return something from a function.

>✨ If a function doesn't return anything useful, the return type and return keyword can be ommited. 

In the following example:

- `x` and `y` are function parameters.
- `x` and `y` have type `Int`.
- The function's return type is `Int`.
- The function returns a sum of `x` and `y` when called.

```kotlin
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    println(sum(1,2)) // 3
}
```
>✨ We recommend in our coding conventions that you name functions starting with a lowercase letter and use camel case with no underscores.

#### Named arguments

For concise code, when calling your function, you don't have to include parameter names. However, including parameter names does make your code easier to read. This is called using **named parameters**. If you do include parameter names, then you can write the parameters in any order.


>✨ In the following example, string templates (`$`) are used to access the parameter values, convert them to `String` type, and then concatenate them into a string for priting.


```kotlin
fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun main() {
    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "hello")
}
```

#### Default parameter values

You can define default values for your function parameters. Any parameter with a default value can be omitted when calling your function. To declare a default value, use the assignment operator = after the type:

```kotlin
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    // Function called with both parameters
    printMessageWithPrefix("Hello","Log") // [Log] Hello
    
    // Function called only with message
    printMessageWithPrefix("Hello") // [Info] Hello
  
    printMessageWithPrefix(prefix = "Log", message = "Hello") // [Log] Hello
}
```
>✨ You can skip specific parameters with default values, rather than omitting them all. However, after the first skipped parameter, you must name all subsequent parameters.

#### Functions without return 

If your function doesn't return a useful value then its return type is `Unit`. `Unit` is a type with only one value - `Unit`. You don't have to declare that `Unit` is returned explicitly in your function body. This mean that you don't have to use `return` keyword or declare a return type:

```kotlin
fun printMessage(message: String){
    println(message)
    // return `Unit` or `return` is optional
}

fun main() {
    printMessage("Hello") // Hello
}
```

#### Single-expression functions 

To make your code more concise, you can use single-expression functions. For example, the `sum()` function can be shortened:

```kotlin
fun sum(x: Int, y: Int): Int {
  return x+y
}

fun main(){
    println(sum(1,2)) // 3
}
```

You can remove the curly braces `{}` and declare the function body using the assignment operator `=`. When you use the assignment operator `=`, Kotlin uses type inference, so you can also omit the return type. The `sum()` function then becomes one line:

```kotlin
fun sum(x: Int, y: Int) = x + y 

fun main() {
    println(sum(1,2)) // 3 
}
```

However, if you want your code to be quickly understood by other developers, it's a good idea to explicitly define the return type even when using the assignment operator `=`.

>✨ If you use `{}` curly braces to declare your function body, you must declare the return type unless it's the `Unit` type.

#### Early returns in functions


To stop the code in your function from being processed further than a certain point, use `return` keyword. This example uses `if` to return from a function early if the conditional expression is found to be true:

```kotlin
// A list of usernames
val registeredUsernames= mutableListOf("john_doe", "jane_smith")

// A list of registered emails
val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String{
   
    // Early return if the username is already taken
    if (username in registeredUsernames){
        return "Username already taken. Please choose a different username."
    }
  
    // Early return if the email is already registered
    if (email in registeredEmails){
        return "Email already taken. Please choose a different email."
    }
  
    // Proceed with registration if the username and email are not taken
  
    registeredUsernames.add(username)
    registeredEmails.add(email)
  return "User registered successfully: $username"
}

fun main(){
    
    println(registerUser(username = "john_doe", email = "newjohn@example.com")) // Username already taken. Please choose a different username.
    println(registerUser("new_user","newuser@example.com")) // User registered successfully: new_user
}
```

#### Lambda expressions

Kotlin allows you to write even more concise code for functions by using lambda expressions.

For example, the following `uppercaseString()` function:

```kotlin
fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun main() {
    println(uppercaseString("hello")) // HELLO
}
```
Can also be written as a lambda expression:

```kotlin
fun main() {
    val upperCaseString = {
        text:String -> text.uppercase()
    }
  println(upperCaseString("hello"))
}
```

Lambda expressions can be hard to understand at first glance so let's break it down. Lambda expressions are written within curly braces `{}`.

Within the lambda expression, you write:

- The parameters followed by an `->`.
- The function body after the `->`.

In the previous example:

- `text` is a function parameter.
- `text` has type `String`.
- The function returns the result of the `.uppercase()` function called on `text`.
- The entire lambda expression is assigned to the `upperCaseString` variable with the assignment operator `==`.
- The lambda expression is called by using the variable `upperCaseString` like a function and the string `"hello"` as a parameter.
- The `println()` function prints the result.

>✨ If you declare a lambda without parameters, then there's no need to use `->`. For example:
>   ```kotlin
>   {println("Log message")}
>   ```

Lambda expressions can be used in a number of ways. You can: 

- Pass a lambda expression as a parameter to another function
- Return a lambda expression from a function
- Invoke a lambda expression on its own

##### **Pass to another function**

A great example of when it's useful to pass a lambda expression to a function, is using the `.filter()` function on collections:

```kotlin
val numbers = listOf(1, -2, 3, -4, 5, -6)

val positives = numbers.filter{ x-> x > 0}

val isNegative = {x:Int -> x < 0}
val negatives = numbers.filter(isNegative)

println(positives) // [1, 3, 5]
println(negatives) // [-2, -4, -6]
```

The .filter() function accepts a lambda expression as a predicate:

- `{ x -> x > 0 }` takes each element of the list and returns only those that are positive.

- `{ x -> x < 0 }` takes each element of the list and returns only those that are negative.

This example demonstrates two ways of passing a lambda expression to a function:

- For positive numbers, the example adds the lambda expression directly in the .filter() function.

- For negative numbers, the example assigns the lambda expression to the isNegative variable. Then the isNegative variable is used as a function parameter in the .filter() function. In this case, you have to specify the type of function parameters (x) in the lambda expression.

>✨If a lambda expression is the only function parameter, you can drop the function parentheses ():
>   ```kotlin
>   val positives = numbers.filter { x -> x > 0 }
>   ```
> This is an example of a trailing lambda, which is discussed in more detail at the end of this chapter.

Another good example, is using the `.map()` function to transform items in a collection:

```kotlin
val numbers = listOf(1, -2, 3, -4, 5, -6)
val doubled = numbers.map { x -> x * 2 }

val isTripled = { x: Int -> x * 3 }
val tripled = numbers.map(isTripled)

println(doubled)
// [2, -4, 6, -8, 10, -12]
println(tripled)
// [3, -6, 9, -12, 15, -18]
```
The `.map()` function accepts a lambda expression as a transform function:

- `{ x -> x * 2 }` takes each element of the list and returns that element multiplied by 2.

- `{ x -> x * 3 }` takes each element of the list and returns that element multiplied by 3.

##### **Function types**

Before you can return a lambda expression from a function, you first need to understand **function types**.

You have already learned about basic types but functions themselves also have a type. Kotlin's type inference can infer a function's type from the parameter type. But there may be times when you need to explicitly specify the function type. The compiler needs the function type so that it knows what is and isn't allowed for that function.

The syntax for a function type has:

- Each parameter's type written within parentheses `()` and separated by commas `,`.
- The return type written after `->`.

For example: `(String) -> String` or `(Int, Int) -> Int`.

This is what a lambda expression looks like if a function type for `upperCaseString()` is defined:

```kotlin
val upperCaseString: (String) -> String = { text -> text.uppercase()}

fun main() {
    println(upperCaseString("hello")) // HELLO
}
```
if your lambda expression has no parameter then the parentheses `()` are left empty. For example: `() -> Unit`

>✨You must declare parameter and return types either in the lambda expression or as a function type. Otherwise, the compiler won't be able to know what type your lambda expression is.
>For example, the following won't work:
>   ```kotlin
>   val upperCaseString = { str -> str.uppercase() }
>   ```

##### **Return from a function**

Lambda expressions can be returned from a function. So that the compiler understands what type the lambda expression returned is, you must declare a function type.

In the following example, the `toSeconds()` function has function type `(Int) -> Int` because it always returns a lambda expression that takes a parameter of type `Int` and returns an `Int` value.

This example uses a `when` expression to determine which lambda expression is returned when `toSeconds()` is called:

```kotlin
fun toSeconds(time:String): (Int)-> Int = when (time){
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun main() {
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec= toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs") // Total time is 1680 secs
}
```

##### **Invoke separately**

Lambda expressions can be invoked on their own by adding parentheses `()` after curly braces `{}` and including any parameters within the parentheses:

```kotlin
println({text:String -> text.uppercase()}("hello")) // Hello
```

##### **Trailing lambdas**

As you have already seen, if a lambda expression is the only function parameter, you can drop the function parentheses `()`. If a lambda expression is passed as the last parameter of a function, then the expression can be written outside the function parentheses `()`. In both cases, this syntax is called a **trailing lambda**.

For example, the [.fold()]() function accepts an initial value and an operation:
 
```kotlin
// The initial value is zero. 
// The operation sums the initial value with every item in the list cumulatively.
println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

// Alternatively, in the form of a trailing lambda
println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6
```
## Classes

To declare a class, use the `class` keyword:

```kotlin
class Customer
```

#### Properties

Characteristics of a class's object can be declared in properties. You can declare properties for a class:

- Within parentheses `()` after the class name.

```kotlin
class Contact(val id: Int, var email: String)
```
- Within the class body defined by curly braces `{}`.

```kotlin
class Contact(val id: Int, var email: String){
    val category: String = ""
}
```
We recommend that you declare properties as read-only (val) unless they need to be changed after an instance of the class is created.

You can declare properties without val or var within parentheses but these properties are not accessible after an instance has been created.
>✨
>- The content contained within parentheses `()` is called the **class header**.
>- You can use a trailing comma when declaring class properties.

Just like with function parameters, class properties can have default values:

```kotlin
class Contact(val id: Int, var email: String = "example@gmail.com")
```

#### Create instance

To create an object from a class, you can declare a class instance using a constructor.

By default, Kotlin automatically creates a constructor with the parameters declared in the class header.

For example:

```kotlin
class Contact(val id: Int, var email: String = "example@gmail.com")

fun main() {
    val contact= Contact(1, "mary@gmail.com")
}
```

In the example: 

- `Contact` is a class.
- `contact` is an instance of the `Contact` class.
- `id` and `email` are properties.
- `id` and `email` are used with the default constructor to create `contact`.

Kotlin classes can have many constructors, including ones that you define yourself.

#### Access properties

To access a property of an instance, write the name of the property after the instance name appended with a period `.`:

```kotlin
class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1,"mary@gmail.com")
  
    // Prints the value of the property: email
    println(contact.email) // mary@gmail.com
  
  
    // Updates the values of the property: email
    contact.email = "jane@gmail.com"
  
    println(contact.email) // jane@gmail.com
  
}
```

>✨ To concatenate the value of a property as part of a string, you can use string templates (`$`). For example:
>   ```kotlin
>       println("Their email address is: ${contact.email}")    
>   ```

#### Member functions

In addition to declaring properties as part of an object's characteristics, you can also define an object's behavior with member functions.

In Kotlin, member functions must be declared within the class body. To call a member function on an instacne, write the function name after the instance name append with a period `.`. For example:

```kotlin
class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    
    // Calls member function printId()
    contact.printId() // 1
}
```

#### Data classes

Kotlin has data classes which are particularly useful for storing data. Data classes have the same functionality as classes, but they come automatically with additional member functions. These member functions allow you to easily print the instance to readable output, compare instances of as class, copy instances, and more. As these functions are automatically available, you don't have to spend time writing the same boilerplate code for each of your classes.

To declare a data class, use the keyword `data`:

```kotlin
data class User (val name: String, val id: Int)
```

The most useful predefined member functions of data classes are: 

| Function     | Description|
|--------------|----------|
| `toString()` | Prints a readble string of the class instance and its properties.|
| `equals()` or `==`| Compares instances of a class|
| `copy()`| Create a class instance by copying another, potentially with some different properties.|

For example: 
```kotlin
val user = User("Alex", 1)
val secondUser = User("Alex", 1)
val thirdUser = User("Max", 2)

// Compares user to second user
println("user == secondUser: ${user == secondUser}") 
// user == secondUser: true

// Compares user to third user
println("user == thirdUser: ${user == thirdUser}")   
// user == thirdUser: false
```

## Null safety

In Kotlin, it's possible to have a `null` value. Kotlin use `null` values when something is missing or not yet set. You've already seen an example of Kotlin returning a null value in the Collections chapter when you tried to access a key-value pair with a key that does not exist in the map. Although it's useful to use `null` values in this way, you might run into problems if your code isn't prepared to handle them.

To help prevent issues with `null` values in your programs, Kotlin has null safety in place. Null safety detects potential problems with `null` values at compile time, rather than at run time.

Null safety is combination of features that allow you to:

- Explicitly declare when `null` values are allowed in your program.

- Check for `null` values.

- Use safe calls to properties or functions that may contain `null` values.

- Declare actions to take if `null` values are detected.

#### Nullable types

Kotlin supports nullable types which allows the possibility for the declared type to have `null` values. By default, a type is **not** allowed to accept `null` values. Nullable types are declared by explicitly adding `?` after the type declaration.

For example:

```kotlin
fun main() {
    // neverNull has String type
    var neverNull: String = "This can't be null"
  
    // Throws a compiler error
    neverNull = null
    
    // nullable has nullable String yupe
    var nullable: String? = "You can keep a null here" 
  
    // This is OK
    nullable = null 
  
    // By default, null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"
  
    // Throws a compiler error 
    inferredNonNull = null 
  
    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length;
    }
  
    println(strLength(neverNull)) // 18
    println(strLength(nullable)) // Throws a compiler error
  
}
```

#### Check for null values

You can check for the presence of `null` values within conditional expressions. In the following example, the `describeString()` function has an `if` statement that check whether `maybeString` is **not** `null` and if its `length` is greater than zero:

```kotlin
fun describeString(maybeString: String?): String{
    if (maybeString != null && maybeString.length > 0){
        return "Length of string ${maybeString.length}"
    }else {
        return "Empty or null string"
    }
}

fun main() {
    val nullString: String? = null 
    println(describeString(nullString)) // Empty or null string
}
```

#### Use safe calls

To safely access properties of an object that might contain a `null` value, use the safe call operator `?.`. The safe call operator returns `null` if either the object or one of its accessed properties is `null`. This is useful if you want to avoid the presence of `null` values triggering errors in your code. 

In the following example, the `lengthString()` function uses a safe call to return either the length of the string or `null`:

```kotlin
fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    val nullString: String? = null 
    println(lengthString(nullString)) // null
}
```

>✨ Safe calls can be chained so that if any property of an object contains a `null` value, then `null` is returned without an error being thrown. For example:
>    ```kotlin
> person.company?.address?.country
>    ```


To safe call operator can also be used to safely call an extension or member function. In this case, a null check is performed before the function is called. If the check detects a `null` value, then the call is skipped and `null` is returned.

In the following example, `nullString` is `null` so the invocation of `.uppercase()` is skipped and `null` is returned:

```kotlin
fun main() {
    val nullString: String? = null 
    println(nullString?.uppercase()) // null
}
```

#### Use Elvis operator

You can provide a default value to return if a `null` value is detected by using the **Elvis operator** `?:`.

Write on the left-hand side of the Elvis operator what should be checked for a `null` value. 
Write on the right-hand side of the Elvis operator what should be returned if a `null` value is detected.

In the following example, `nullString` is `null` so the safe call to access the `length` property returns a `null` value. As a result, the Elvis operator returns `0`.

```kotlin
fun main() {
    val nullString: String? = null 
    println(nullString?.length ?: 0) //0
}
```

## Idioms

A collection of random and frequently used idioms in Kotlin.

#### Create DTOs (POJOs/POCOs)

```kotlin
data class Customer( val name: String, val email: String)
```

provides a `Customer` class with the following functionality:

- getters(and setters in case of `var` s) for all properties
- `equals()`
- `hashCode()`
- `toString()`
- `copy()`
- `component1()`, `component2()`,..., for all properties

#### Default values for function parameters

```kotlin
fun foo(a: Int =0, b: String = ""){}
```

#### Filter a list

```kotlin
val positives = list.filter {x: Int -> x > 0}
```
Or alternatively, even shoter:

```kotlin
val positives = list.filter {it > 0}
```

#### Check the presence of an element in a collection

```kotlin
if ("john@example.com" in emailList){}
```

#### String interpolation

```kotlin
println("Name $name")
```

#### Read standard input safely

```kotlin
// Reads a string and returns null if the input can't be converted into an integer. For example: Hi there!
val wrongInt = readln().toIntOrNull()
println(wrongInt)
// null

// Reads a string that can be converted into an integer and returns an integer. For example: 13
val correctInt = readln().toIntOrNull()
println(correctInt)
// 13
```

#### Instance checks

```kotlin
when(x) {
    is Foo -> ...
    is Bar -> ...
    else -> ...
}
```

#### Read-only list

```kotlin
val list = listOf("a", "b", "c")
```

#### Read-only map


```kotlin
val map = mapOf("a" to 1, "b" to 2, "c" to 3)
```


#### Access a map entry

```kotlin
println(map["key"])

map["key"]= value
```

#### Traverse a map or a list of pairs

```kotlin
for ((k,v) in map) {
    println("$k -> $v")
}
```

#### Iterate over a range

```kotlin
for (i in 1..100) {} // closed-ended range: includes 100
for (i in 1..<100){} // open-ended range: does not include 100
for (i in 1..100 step 2) // 2, 4, 6, ... 100
for (i in 100 downTo 1) // 100, 99, ... 1
(1..10).forEach {}
```

#### Lazy property


```kotlin
val p: String by lazy {
    // The value is computed only on first access
    // compute the string
}
```

#### Extension functions 


```kotlin
fun String.spaceToCamelCase() {}

"Convert this to camelcase".spaceToCamelCase()
```

#### Create a singleton


```kotlin
object Resource {
    val name: String = "Name"
}
```

#### Use inline value classes for type-safe values

```kotlin
@JvmInline
value class EmployeeId(private val id: String)

@JvmInline
value class CustomerId(private val id: String)
```

If you accidentally mix up `EmployeeId` and `CustomerId`, a compilation error is triggered.

>✨ The `@JvmInline` annotation is only needed for JVM backends.

#### Instantiate an abstract class

```kotlin
abstract class MyAbstractClass {
  abstract fun doSomething()
  abstract fun sleep()
}

fun main() {
  val myObject = object : MyAbstractClass() {
    override fun doSomething() {
      TODO("Not yet implemented")
    }

    override fun sleep() {
      TODO("Not yet implemented")
    }
  }
  myObject.doSomething()
}
```

#### If-not-null shorthand

```kotlin
val files = File("Test").listFiles()

println(files?.size) // size is printed if files is not null
```


#### If-not-null-else shorthand

```kotlin
val files = File("Test").listFiles()

// For simple fallback values:
println(files?.size ?: "empty") // if files is null, this prints "empty"

// To calculate a more complicated fallback value in a code block, use `run`

val filesSize: Double = files?.size ?: run {
    val someSize = getSomeSize()
    someSize * 2  
}

println(filesSize)

```

#### Execute a statement if null

```kotlin

val values = ...
val email = values["email"] ?: throw IllegalStateException("Email is missing!")
```

#### Get first item of a possibly empty collection

```kotlin
val emails= ...
val mainEmail = emails.firstOrNull() ?: ""
```

#### Execute if not null 

```kotlin
val value: String? =null 

value?.let{
    /// execute this block if not null
}
```

#### Map nullable value if not null

```kotlin
val value = ...

val mapped = value?.let{
    transformValut(it)
} ?: defaultValue
```
#### Return on when statement

```kotlin
fun transform(color: String): Int {
    return when(color){
        "red" -> 0
        "green" -> 1
        "yellow" -> 2
        else -> throw IllegalStateException("Invalid color param value")
    }
}
```

#### try-catch expression

```kotlin
import java.lang.ArithmeticException

fun test() {
    val result = try {
        count()
    } catch (e: ArithmeticException){
        throw IllegalStateException(e)
    }
  // Working with result
}
```

#### if expression

```kotlin
val result: String = if (x == 1){
    "one"
} else if (x == 2) {
    "two"
} else {
    "other"
}
```

#### Builder-style usage of methods that return Unit

```kotlin
fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}
```

#### Single-expression functions

```kotlin
fun theAnswer() = 42
```
This is equivalent to

```kotlin
fun theAnswer(): Int {
    return 42
}
```

This can be effectively combined with other idioms, leading to shorter code. For example, with the `when` expression:

```kotlin
fun transform(color: String): Int = when (color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value")
}
```

#### Call multiple methods on an object instance (with)

```kotlin
class Turtle {
    fun penDown()
    fun penUp()
    fun turn(degrees: Double)
    fun forward(pixels: Double)
}

val myTurtle = Turtle()
with(myTurtle) { //draw a 100 pix square
    penDown()
    for (i in 1..4) {
        forward(100.0)
        turn(90.0)
    }
    penUp()
}
```

#### Configure properties of an object (apply)

```kotlin
val myRectangle = Rectangle().apply {
    length = 4
    breadth = 5
    color = 0xFAFAFA
}
```
This is useful for configuring properties that aren't present in the object constructor.

#### Java 7's try-with-resources


```kotlin
val stream = Files.newInputStream(Paths.get("/some/file.txt"))
stream.buffered().reader().use { reader ->
    println(reader.readText())
}
```

#### Generic function that requires the generic type information

```kotlin
//  public final class Gson {
//     ...
//     public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
//     ...

inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)
```
#### Swap two variables

```kotlin
var a = 1
var b = 2
a = b.also { b = a }
```
#### Mark code as incomplete (TODO)

Kotlin's standard library has a `TODO()` function that will always throw a `NotImplementedError`. Its return type is `Nothing` so it can be used regardless of expected type. There's also an overload that accepts a reason parameter:

```kotlin
fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")
```

IntelliJ IDEA's kotlin plugin understands the semantics of TODO() and automatically adds a code pointer in the TODO tool window.