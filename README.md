# 30 days of Kotlin
[Documents](https://kotlinlang.org/docs/home.html)
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
- [Constructors](#constructors)
- [Secondary constructors](#secondary-constructors)
- [Create instance](#create-instance)
- [Properties](#properties):
  - [Getters and setters](#getters-and-setters)
  - [Compile-time constants](#compile-time-constants)
  - [Late-initialized properties and variables](#late-initialized-properties-and-variables)
- [Access properties](#access-properties)
- [Member functions](#member-functions)
- [Data classes](#data-classes):
  - [Properties declared in the class body](#properties-declared-in-the-class-body)
  - [Copying](#copying)
  - [Data classes and destructuring declarations](#data-classes-and-destructuring-declarations)
  - [Standard data classes](#standard-data-classes)
- [Abstract class](#abstract-class)
- [Inheritance](#inheritance)
- [Interface](#interfaces):
  - [Implementing interfaces](#implementing-interfaces)
  - [Properties in interfaces](#properties-in-interfaces)
  - [Interfaces Inheritance](#interfaces-inheritance)
  - [Resolving overriding conflicts](#resolving-overriding-conflicts)
- [Sealed classes and interfaces](#sealed-classes-and-interfaces):
  - [Declare a sealed class or interface](#declare-a-sealed-class-or-interface)
  - [Inheritance](#inheritance-1)
  - [Use sealed classes with when expression](#use-sealed-classes-with-when-expression)
  - [Use case scenarios](#use-case-scenarios)
- [Nested and inner classes](#nested-and-inner-classes-):
  - [Inner classes](#inner-classes)
  - [Anonymous inner classes](#anonymous-inner-classes)
- [Enum classes](#enum-classes):
  - [Anonymous classes](#anonymous-classes)
  - [Implementing interfaces in enum classes](#implementing-interfaces-in-enum-classes)
  - [Working with enum constants](#working-with-enum-constants)
- [Inline value classes](#inline-value-classes):
  - [Members](#members)
  - [Inheritance](#inheritance-2)
  - [Representation](#representation)
  - [Inline classes vs type aliases](#inline-classes-vs-type-aliases)
  - [Inline classes and delegation](#inline-classes-and-delegation)
- [Object declarations and expressions](#object-declaration-and-expressions):
  - [Object declarations](#object-declarations)
  - [Object expressions](#object-expressions)
  - [Behavior difference between object declarations and expressions](#behavior-difference-between-object-declarations-and-expressions)
- [Overriding methods](#overriding-methods)
- [Overriding properties](#overriding-properties)
- [Derived class initialization order](#derived-class-initialization-order)
- [Calling the superclass implementation](#calling-the-superclass-implementation)
- [Overriding rules](#overriding-rules)
- [Functional (SAM) interfaces](#functional-sam-interfaces):
  - [SAM conversions](#sam-conversions)
  - [Migration from an interface with constructor function to a functional interface](#migration-from-an-interface-with-constructor-function-to-a-functional-interface)
  - [Functional interfaces vs. type aliases](#functional-interfaces-vs-type-aliases)

[Visibility modifiers](#visibility-modifiers):
  - [Packages](#packages)
  - [Class members](#class-member):
    - [Constructor](#constructors-1)
    - [Local declarations](#local-declarations)
  - [Modules](#modules)
  
[Null safety](#null-safety):
- [Nullable types](#nullable-types)
- [Check for null values](#check-for-null-values)
- [Use safe calls](#use-safe-calls)

[Extensions](#extensions):
- [Extension functions](#extension-functions-)
- [Extensions are resolved statically](#extensions-are-resolved-statically)
- [Nullable receiver](#nullable-receiver)
- [Extension properties](#extension-properties)
- [Companion object extensions](#companion-object-extensions)
- [Scope of extensions](#scope-of-extensions)
- [Declaring extensions as members](#declaring-extensions-as-members)

[Delegation](#delegation):
- [Overriding a member of an interface implemented by delegation](#Overriding a member of an interface implemented by delegation)

[Delegated properties](#delegated-properties-1):
- [Standard delegates](#standard-delegates)
  - [Lazy properties](#lazy-properties)
  - [Observable properties](#observable-properties)
- [Delegating to another property](#delegating-to-another-property)
- [Storing properties in a map](#storing-properties-in-a-map)
- [Local delegated properties](#local-delegated-properties)
- [Property delegate requirements](#property-delegate-requirements)
- [Translation rules for delegated properties](#translation-rules-for-delegated-properties)
  - [Optimized cases for delegated properties](#optimized-cases-for-delegated-properties)
  - [Translation rules when delegating to another property](#translation-rules-when-delegating-to-another-property)
- [Providing a delegate](#providing-a-delegate)

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

[Package and imports](#packages-and-imports):
- [Default imports](#default-imports-)
- [Imports](#imports)
- [Visibility of top-level declarations](#visibility-of-top-level-declarations)

[Generics: in, out, where](#generics-in-out-where):
- [Variance](#variance):
  - [Variance and wildcards in Java](#variance-and-wildcards-in-java)
  - [Declaration-site variance](#declaration-side-variance)
- [Type projections](#type-projections):
  - [Use-site variance: type projections](#use-site-variance-type-projections)
  - [Star-projections](#star-projections)
- [Generic functions](#generic-functions)
- [Generic constraints](#generic-constrains):
  - [Upper bounds](#upper-bounds)
- [Definitely non-nullable types](#definitely-non-nullable-types)
- [Type erasure](#type-erasure):
  - [Generics type checks and casts](#generics-type-checks-and-casts)
  - [Unchecked casts](#unchecked-casts)
  - [Underscore operator for type arguments](#underscore-operator-for-type-arguments)

[Kotlin for Android](#kotlin-for-android)


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

###### **Pass to another function**

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

###### **Function types**

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

###### **Return from a function**

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

###### **Invoke separately**

Lambda expressions can be invoked on their own by adding parentheses `()` after curly braces `{}` and including any parameters within the parentheses:

```kotlin
println({text:String -> text.uppercase()}("hello")) // Hello
```

###### **Trailing lambdas**

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

Classes can contain:

- Constructors and initializer blocks
- Functions
- Properties
- Nested and inner classes
- Object declarations

To declare a class, use the `class` keyword:

```kotlin
class Customer
```

>✨ Kotlin does not have a `new` keyword.

#### Constructors

A class in Kotlin has a **primary constructor** and possibly one or more **secondary constructors**. The primary constructor is declared in the class header, and it goes after the class name and optional type parameters.

```kotlin
class Person constructor(firstName: String)
```
If the primary constructor does not have any annotations or visibility modifiers; the `constructor` keyword can be omitted:

```kotlin
class Person(firstName: String)
```
The primary constructor initializes a class instance and its properties in the class header. The class header can't contain any runnable code. If you want to run some code during object creation, use **initializer blocks** inside the class body. Initializer blocks are declared with `init` keyword followed by curly braces. Write any code that you want to run within the curly braces.

During the initialization of an instance, the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers:

```kotlin
class InitOrDemo(name: String){
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints $name")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
  init {
      println("Second initializer block that prints ${name.length}")
  }
  
  // First property: hello
  
  // First initializer block that prints hello
  
  // Second property: 5
  
  // Second initializer block that prints 5
}
```
Primary constructor parameters can be used in the initializer blocks. They can also be used in property initializers declared in the class body:

```kotlin
class Customer(name: String){
    val customerKey = name.uppercase()
}
```

Kotlin has a concise syntax for declaring properties and initializing them from the primary constructor:

```kotlin
class Person(val firstName: String, val lastName: String, var age: Int)
```

Such declarations can also include default values of the class properties:

```kotlin
class Person(val firstName:String, val lastName: String, var isEmployed: Boolean = true)
```

You can use a trailing comma when you declare class properties:

```kotlin
class Person(
    val firstName: String,
    val lasName: String,
    var isEmployed: Boolean,
) {}
```

Much like regular properties, properties declared in the primary constructor can be mutable (`var`) or read-only (`val`)

If the constructor has annotations or visibility modifiers, the `constructor` keyword is required and the modifiers go before it

```kotlin
class Customer public @Inject constructor(name: String)
```
Learn more about [visibility modifiers]()

#### Secondary constructors

A class can also declare **secondary constructors**, which are prefixed with `constructor`:

```kotlin
class Person(val pets: MutableList<Pet> = mutableListOf())

class Pet {
    constructor(owner: Person){
        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}
```

If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor, either directly or indirectly through another secondary constructor(s). Delegation to another constructor of the same class is done using the `this` keyword:

```kotlin
class Person(val name: String) {
    val children: MutableList<Person> = mutableListOf()
    constructor(name: String, parent: Person): this(name) {
        parent.children.add(this)
    }
}
```

Code in initializer blocks effectively becomes part of the primary constructor. Delegation to the primary constructor happens at the moment of access to the first statement of a secondary constructor, so the code in all initializer blocks and property initializers is executed before the body of the secondary constructor.

Even if the class has no primary constructor, the delegation still happens implicitly, and the initializer blocks are still executed:

```kotlin
class Constructors {
    init {
        println("Init block")
    }
  
    constructor(i: Int) {
        println("Constructor $i")
    }
}

// Init block
// Constructor 1

``` 

If a non-abstract class does not declare any constructors (primary or secondary), it will have a generated primary constructor with no arguments. The visibility of the constructor will be publc.

If you don't want your class to have a public constructor, declare an empty primary constructor with non-default visibility:

```kotlin
class DontCreateMe private constructor() {}
```

>✨ On the JVM, if all of the primary constructor parameters have default values, the compiler will generate an additional parameterless constructor will use the default values. This makes it easier to use Kotlin with libraries such as Jackson or JPA that create class instances through parameterless constructors.
>   ```kotlin
>   class Customer(val customerName: String = "")
>   ```

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

###### **Getters and setters**

The full syntax for declaring a property is as follows: 
```kotlin
var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]
```

The initializer, getter and setter are optional. The property type is optional if it can be inferred from the initializer or the getter's return type, as shown below:
```kotlin
var initialized = 1 // has type Int, default getter and setter

// var allByDefault // ERROR: explicit initializer required, default getter and setter implied
```
The full syntax of a read-only property declaration differs from a mutable one in two ways: it starts with `val` instead of `var` and does not allow a setter

```kotlin
val simple: Int? // has type Int, default getter, must be initialized in constructor
val inferredType = 1 // has type Int and a default getter
```

You can define custom accessors for a property. If you define a custom getter, it will be called every time you access the property (this way you can implement a computed property). Here's an example of a customer getter:

```kotlin
class Rectangle(val width: Int, val height: Int) {
  val area: Int get() = this.width * this.height // property type is optional since it can be inferred from the getter's return type.
}

/// Width=3, Height=4, area=12
```

You can omit the property type if it can be inferred from the getter:

```kotlin
val area get() = this.width * this.height
```

If you define a custom setter, it will be called every time you assign a value to the property, except its initialization. A custom setter looks like this:

```kotlin
var stringRepresentation: String 
  get() = this.toString()
  set(value) {
      setDataFromString(value) // Parses the string and assigns values to other properties
  }
```

By convention, the name of the setter parameter is `value`, but you can choose a different name if you prefer.

If you need to annotate an accessor or change its visibility, but you do not want to change the default implementation, you can define the accessor without defining its body:

```kotlin
var setterVisibility: String= "abc"
    private set // the setter is private and has the default implementation


var setterWithAnnotation: Any? = null 
    @Inject set // annotate the setter with Inject
```

 _Backing fields_

In Kotlin, a field is only used as a property to hold its value in memory. Fields cannot be declared directly. However, when a property needs a backing field, Kotlin provides it automatically. This backing field can be referenced in the accessors using the `field` identifier:

```kotlin
var counter = 0 // the initializer assigns the backing field directly
  set(value) {
      if(value >= 0){
          field = value
        // counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
      }
  }
```

The `field` identifier can only be used in the accessors of the property.

A backing field will be generated for a property if it uses the default implementation of at least one of the accessors, or if a custom accessor references it through the `field` identifier.

For example, there would be no backing field in the following case:

```kotlin
val isEmpty: Boolean
  get() = this.size == 0
```

_Backing properties_

If you want to do something that does not fit into this **implicit backing field** scheme, you can always fall back to having a **backing property**:

```kotlin
private var _table: Map<String,Int>? = null
public val table: Map<String,Int>
  get() {
      if(_table == null) {
          _table = HashMap() // Type parameters are inferred
      }
      return _table ?: throw AssertionError("Set to null by another thread")
  }
```
>✨ On the JVM: Access to private properties with default getters and setters if optimized to avoid function call overhead.
###### **Compile-time constants**

If the value of a read-only property is known at compile time, mark it as a **compile time constant** using the `const` modifier. Such a property needs to fulfill the following requirements:

- It must be a top-level property, or a member of an `object` declaration or a **companion object**.
- It must be initialized with a value of type `String` or a primitive type.
- It cannot be a custom getter.

The compiler will inline usages of the constant, replacing the reference to the constant with its actual value. However, the field will not be removed and therefore can be interacted with using `reflection`.

Such properties can also be used in annotations: 

```kotlin
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
@Deprecated(SUBSYSTEM_DEPRECATED) fun foo(){}
```
###### **Late-initialized properties and variables**

Normally, properties declared as having a non-nullable type must be initialized in the constructor. However, it's often the case that doing so is not convenient. For example, properties can be initialized through dependency injection, or in the setup method of a unit test. In these cases, you cannot supply a non-nullable initializer in the constructor, but you still want to avoid null checks when referencing the property inside the body of a class.

To handle suc cases, you can mark the property with the `lateinit` modifier:

```kotlin
public class MyTest {
    lateinit var  subject: TestSubject
    
    @SetUp fun setup() {
        subject = TestSubject()
    }
    @Test fun test() {
        subject.method() // dereference directly
    }
}
```

This modifier can be used on `var` properties declared inside the body of a class (not in the primary constructor, and only when the property does not have a custom getter or setter), as well as for top-level properties and local variables. The type of the property or variable must be non-nullable, and it must not be a primitive type.

Accessing a `lateinit` property before it has been initialized throws a special exception that clearly identifies the property being accessed and the fact that it hasn't been initialized.

_Checking whether a `lateinit var` is initialized_

To check whether a `lateinit var` has already been initialized, use `.isInitialized` on the reference to that property:

```kotlin
if(foo::bar.isInitialized){
    println(foo.bar)
}
```

This check is only available for properties that are lexically accessible when declared in the same type, in one of the outer types, or at top level in the same file.

###### **Overriding properties**

See [Overriding properties](#overriding-properties-1)

###### **Delegated properties**

The most common kind of property simply reads from (and maybe writes to) a backing field, but custom getters and setters allow you to use properties so one can implement any sort of behavior of a property. Somewhere in between the simplicity ò the first kind and variety of the second, there are common patterns for what properties can do. A few examples: lazy values, reading from a map by a given key, accessing a database, notifying a listener on access.

Such common behaviors can be implemented as libraries using delegated properties.


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
The compiler automatically derives the following members from all properties declared in the primary constructor.

To ensure consistency and meaningful behavior of the generated code, data classes have to fulfill the following requirements:
- The primary constructor must have at least one parameter.
- All primary constructor parameters must be marked as `val` or `var`.
- Data classes cannot be abstract, open, sealed, or inner.

Additionally, the generation of data class members follows these rules with regard to the members' inheritance:

- If there are explicit implementations of `equals()`, `hashCode()`, or `toString()` in the data class body or `final` implementations in a superclass, then these functions are not generated, and the existing implementations are used.
- If a supertype has `componentN()` functions that are `open` and return compatible types, the corresponding functions are generated for the data class and override those of the supertype. If the functions of the supertype cannot be overridden due to incompatible signatures or due to their being final, an error is reported.
- Providing explicit implementations for the `component()` and `copy()` functions is not allowed.

Data classes may extend other classes (see Sealed classes for examples).

>✨ On the JVM, if the generated class needs to have a parameterless constructor, default values for the properties have to be specified (see Constructors):
>
>   ```kotlin
>   data class User(val name: String = "", val age: Int = 0)
>   ```

###### **Properties declared in the class body**

The compiler only uses the properties defined inside the primary constructor for the automatically generated functions. To exclude a property from the generated implementations, declare it inside the class body:

```kotlin
data class Person(val name: String) {
    var age: Int = 0
}
```
In the example below, only the `name` property is used by default inside the `toString()`, `equals()`, `hashCode()`, and `copy()` implementations, and there is only one component function, `component1(). The `age` property is declared inside the class body and is excluded. Therefore, two `Person` objects with the same `name` but different `age` values are considered equal since `equals()` only evaluates properties from the primary constructor:

```kotlin
data class Person(val name: String) {
  var age: Int = 0
}

val person1 = Person("John")
val person2 = Person("John")
person1.age = 10
person2.age = 20

println("person1 == person2: ${person1 == person2}") // true

println("person1 with age ${person1.age}: ${person1}")
// person1 with age 10: Person(name=John)

println("person2 with age ${person2.age}: ${person2}")
// person2 with age 20: Person(name=John)

```
###### **Copying**

Use the `copy()` function to copy an object, allowing you to alter **some** of its properties while keeping the rest unchanged. The implementation of this function for the `User` class above would be as follows:

```kotlin
data class User(val name: String = "", val age: Int = 0){
}

fun main() {
    val jack= User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
}
```
###### **Data classes and destructuring declarations**

Component functions generated for data classes make it possible to use them in destructuring declarations:

```kotlin
val jane = User("Jane",35)
val (name,age) = jane

println("$name, $age years of age")  // Jane, 35 years of age
```

######  **Standard data classes**

The standard library provides the `Pair` and `Triple` classes. In most cases, though, named data classes are a better design choice because they make the code easier to read by providing meaningful names for the properties.
#### Abstract class

A class may be declared `abstract`, along with some or all of its members. An abstract member does not have an implementation in its class. You don't need to annotate abstract classes functions with `open`:

```kotlin
abstract class Polygon {
  open abstract fun draw()
}

class Rectangle : Polygon() {
  override fun draw() {
    // draw the rectangle
  }
}
```

You can override a non-abstract `open` member with an abstract one. 

```kotlin
open abstract class Polygon {
    open fun draw(){}
}

abstract class WildShape: Polygon() {
    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygon
    abstract override fun draw()
}
```

#### Inheritance

All classes in Kotlin have a common superclass, `Any`, which is default superclass for a class with no supertypes declared:

```kotlin
class Example // Implicitly inherits from Any
```

`Any` has three methods: `equals()`, `hashCode()`, and `toString()`. Thus, these methods are defined for all Kotlin classes.

By default, Kotlin classes are final - they can't be inherited. To make a class inheritable, mark it with the `open` keyword:

```kotlin
open class Base // Class is open for inheritance
```

To declare an explicit supertype, place the type after a colon in the class header:

```kotlin
open class Base(p: Int)

class Derived(p: Int): Base(p)
```


If the derived class has a primary constructor, the base class can ( and must) be initialized in that primary constructor according to its parameters.

If the derived class has no primary constructor, then each secondary constructor has to initialize the base type using the `super` keyword or it has to delegate to another constructor which does. Please note that in this case different secondary constructors can call different constructors of the base type:
 
```kotlin
class MyView: View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx,attrs) 
}
```

#### Interfaces

Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations. What makes them different from abstract classes is that interfaces cannot store state. They can have properties, but these need to be abstract or provide accessor implementations.

An interface is defined using the keyword `interface`:

```kotlin
interface MyInterface {
    fun bar()
    fun foo() {
        // optional body
    }
}
```
###### **Implementing interfaces**

A class or object can implement one or more interfaces:

```kotlin
class Child: MyInterface {
    override fun bar() {
        //body
    }
}
```

###### **Properties in interfaces**

You can declare properties in interfaces. A property declared in an interface can either be abstract or provide implementations for accessors. Properties declared in interfaces can't have backing fields, and therefore accessors declared in interfaces can't reference them:

```kotlin
interface MyInterface {
    val prop: Int // abstract
    
    val propertyWithImplementation: String 
      get() = "foo"
    fun foo() {
        println(prop)
    }
}

class Child: MyInterface {
    override val prop: Int = 29
}
```

###### **Interfaces Inheritance**

An interface can derive from other interfaces, meaning it can both provide implementations for their members and declare new functions and properties. Quite naturally, classes implementing such an interface are only required to define the missing implementations:

```kotlin
interface Named {
    val name: String
}

interface  Person: Named {
    val firstName: String 
    val lastName: String 
    override val name: String
      get() = "$firstName $lastName"
}

data class Employee(
    // Implementing 'name' is not required
    override val firstName: String,
    override val lastName: String, 
    val position: Position,
): Person
```

###### **Resolving overriding conflicts**

When you declare many types in your supertype list, you may inherit more than one implementation of the same method:

```kotlin
interface A {
    fun foo() {
        println("A")
    }
    fun bar()
}

interface B {
    fun foo() {
        println("B")
    }
    fun bar() {
        println("bar")
    }
}

class C: A {
    override fun bar() {
        println("bar")
    }
}

class D: A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
    override fun bar(){
        super<B>.bar()
    }
}

```

Interfaces **A** and **B** both declare functions **foo()** and **bar()**. Both of them implement **foo()**, but only **B** implement **bar()** (**bar()** is not marked as abstract in **A**, because this is the default for interfaces if the function has nobody). Now, if you derive a concrete class **C** from **A**, you have to override **bar()** and provide an implementation.

However, if you derive **D** from **A** and **B**, you need to implement all the methods that you have inherited from multiple interfaces, and you need to specify how exactly **D** should implement them. This rule applies both to methods for which you've inherited a single implementation (**bar()**) and to those for which you've inherited multiple implementations (**foo()**).

#### Sealed classes and interfaces

**Sealed** classes and interfaces provide controlled inheritance of your class hierarchies. All direct subclasses of a sealed class are known at of compile time. No other subclasses may appear outside the module and package within which the sealed class is defined. The same logic applies to sealed interfaces and their implementations: once a module with a sealed interface is compiled, no new implementations can be created.

>✨ Direct subclasses are classes that immediately inherit from their superclass.
>   Indirect subclasses are classes that inherit from more than one level down from their superclass.

When you combine sealed classes and interfaces with the `when` expression, you can cover the behavior of all possible subclasses and ensure that no new subclasses are created to affect your code adversely.


Sealed classes are best used for scenarios when:
- Limited class inheritance is desired: You have a predefined, finite set of subclasses that extend a class, all of which are known at compile time.
- Type-safe design is required: Safety and pattern matching are crucial in your project. Particularly for state management or handling complex conditional logic. For example, check out [Use sealed classes with when expressions]().
- Working with closed APIs: You want to robust and maintainable public APIs for libraries that ensure that third-party clients use the APIs as intended.

For more detailed practical applications, see [Use case scenarios]().

>✨ Java 15 introduced a similar concept, where sealed class use the `sealed` keyword along with the `permits` clause to define restricted hierarchies.

###### **Declare a sealed class or interface**

To declare a sealed class or interface, use the `sealed` modifier:

```kotlin
// Create a sealed interface
sealed interface Error

// Create a sealed class that implements sealed interface Error
sealed class IOError(): Error 

// Define subclasses that extend sealed class IOError
class FileReadError(val file: File): IOError()
class DatabaseError(val source: DataSource): IOError()

// Create a singleton object implementing the `Error` sealed interface
object  RuntimeError: Error
```
This example could represent a library's API that contains error classes to let library users handle errors that it can throw. If the hierarchy of such error classes includes interfaces or abstract classes visible in the public API, then nothing prevents other developers from implementing or extending them in the client code. Since the library doesn't know about errors declared outside of it, it can't treat them consistently with its own classes. However, with a `sealed` hierarchy of error classes, library authors can be sure that they know all the possible error types and that other error types cannot appear later.

**Constructors**

A sealed class itself is always an abstract class, and as a result, cannot be instantiated directly. However, it may contain or inherit constructors. These constructors aren't for creating instances of the sealed class itself but for its subclasses. Consider the following example with a sealed class called `Error` and its several subclasses, which we instantiate:

```kotlin
sealed class Error(val message: String) {
    class NetworkError: Error("Network failure")
    class DatabaseError: Error("Database cannot be reached")
    class UnknownError: Error("An unknown error has occurred")
}

fun main() {
    val errors = listOf(Error.NetworkError(),Error.DatabaseError(),Error.UnknownError())
    errors.forEach { println(it.message) }
}

/// Network failure 
/// Database cannot be reached 
/// An unknown error has occurred
```
You can use enum classes within our sealed classes to use enum constants to represent states and provide additional detail. Each enum constant exists only as a `single` instance, while subclasses of sealed class may have `multiple` instances. IN the example, the `sealed class Error` along with its several subclasses, employs an `enum` to denote error severity. Each subclass constructor initializes the `severity` and can alter its state:

```kotlin
enum class ErrorSeverity {MINOR, MAJOR, CRITICAL}

sealed class Error (val severity: ErrorSeverity) {
    class FileReadError(val file: File): Error(ErrorSeverity.MAJOR)
    class DatabaseError(val source: DataSource): Error(ErrorSeverity.CRITICAL)
    object RuntimeError: Error(ErrorSeverity.CRITICAL)
    // Additional error types can be added here
}
```

Constructors of sealed classes can have one of two visibilities: `protected` (by default) or `private`:

```kotlin
sealed class IOError {
    // A sealed class constructor has protected visibility by default. It's visible inside this class and its subclasses.
    constructor()
  
    // Private constructor, visible inside this class only.
    // Using a private constructor in a sealed class allows for even stricter control over instantiation, enabling specific initialization procedures within the class.
    private constructor(description: String): this()
  
    // This will raise an error because public and internal constructors are not allowed in sealed classes
    // public constructor(code: Int): this()
}   
```

###### **Inheritance**

Direct subclasses of sealed class and interfaces must be declared in the same package. They may be top-level or nested inside any number of other named classes, named interfaces, or named objects. Subclasses can have any visibility as long as they are compatible with normal inheritance rules in Kotlin.

Subclasses of sealed classes must have a properly qualified name. They cannot be local or anonymous objects

>✨ `enum` class can't extend a sealed class, or any other class. However, they can implement sealed interfaces:
>   ```kotlin
>   sealed interface Error
>   
>   // Enum class extending the sealed interface Error
>   enum class ErrorType : Error {
>       FILE_ERROR, DATABASE_ERROR
>   }
>   ```

These restrictions don't apply to indirect subclasses. If a direct subclass of a sealed class in not marked as sealed, it can be extended in any way that its modifiers allow:

```kotlin
// Sealed interface `Error` has implementations only in the same package and module.
sealed interface Error

// Sealed class `IOError` extends `Error` and is extendable only with the same package
sealed class IOError() : Error

// Open class `CustomerError` extends `Error` and can be extended anywhere it's visible
open class CustomerError() : Error
```
**Inheritance in multiplatform projects**

There is one more inheritance restriction in multiplatform projects: direct subclasses of sealed classes must reside in the same source set. It applies to sealed classes without the expected and actual modifiers.

If a sealed class is declared as `expect` in common source set and have `actual` implementations in platform source set, both `expect` and `actual` versions can have subclasses in their source sets. Moreover, if you use a hierarchical structure, you can create subclasses in any source set between the `expect` and `actual` declarations.

[Learn more about the hierarchical structure of multiplatform projects.]()


###### **Use sealed classes with when expression**

The key benefit of using sealed classes comes into play when you use them in a `when` expression. The `when` expression, used with a sealed class, allows use Kotlin compiler to check exhaustively that all possible cases are covered. In such cases, you don't need to add an `else` clause:

```kotlin
enum class ErrorSeverity { MINOR, MAJOR, CRITICAL }

sealed class Error(val severity: ErrorSeverity) {
  class FileReadError(val file: File) : Error(ErrorSeverity.MAJOR)
  class DatabaseError(val source: DataSource) : Error(ErrorSeverity.CRITICAL)
  object RuntimeError : Error(ErrorSeverity.CRITICAL)
  // Additional error types can be added here
}

// Function to log errors
fun log(e: Error) = when (e) {
  is Error.FileReadError -> println("Error while reading file ${e.file}")
  is Error.DatabaseError -> println("Error while reading from database ${e.source}")
  is Error.RuntimeError -> println("Runtime error")
  else -> {} // No `else` clause is required because all the cases are covered.
}
```
>✨ In multiplatform project, if you have a sealed class with a `when` expression as an expected declaration in your common code, you still need an `else` branch. This is because subclasses of `actual` platform implementations may extend sealed classes that aren't known in the common code.

###### **Use case scenarios**

Let's explore some practical scenarios where sealed classes and interfaces can be particularly useful.

**State management in UI applications**

You can use sealed classes to represent different UI states an application. This approach allows for structured and safe handling of UI changes. This example demonstrates how to manage various UI states:

```kotlin
sealed class UIState {
    data object Loading : UIState()
    data class Success(val data: String): UIState()
    data class Error(val exception: Exception): UIState()
}

fun updateUI(state: UIState) {
    when(state) {
        is UIState.Loading -> showLoadingIndicator()
        is UIState.Success -> showData(state.data)
        is UIState.Error -> showError(state.exception)
        else -> {}
    }
}
```

**Payment method handling**

In practical business applications, handling various payment methods efficiently is a common requirement. You can use sealed classes with `when` expressions to implement such business logic. By representing different payment methods as subclasses of a sealed class, it establishes a clear and manageable structure for processing transactions.

```kotlin
sealed class Payment {
    data class CreditCard(val number: String, val expiryDate: String): Payment()
    data class PayPal(val email: String): Payment()
    data object Cash: Payment()
}

fun processPayment(payment: Payment){
    when(payment) {
        is Payment.CreditCard -> processCreditCardPayment(payment.number,payment.expiryDate)
        is Payment.PayPal -> procressPayPalPayment(payment.email)
        is Payment.Cash -> processCardPayment()
        else -> {}
    }
}
```
`Payment` is a sealed class that represents different payment methods in an e-commerce system: `CreditCard`, `PayPal`, and `Cash`. Each subclass can have its specific properties, like `number` and `expiryDate` for `CreditCard`, and `email` for `PayPal`.

The `processPayment()` function demonstrates how to handle different payment methods. This approach ensures that all possible payment types are considered, and the system remains flexible for new payment methods to be added in the future.

**API request-response handling**

You can use sealed classes and sealed interfaces to implement a user authentication system that handles API requests and responses. The user authentication system has login and logout functionalities. The `ApiRequest` sealed interface defines specific request types: `LoginRequest` for login, and `LogoutRequest` for logout operations. The sealed class, `ApiResponse`, encapsulates different response scenarios: `UserSuccess` with user data, `UserNotFound` for absent users, and `Error` for any failures. The `handleRequest` function processes these requests in a type-safe manner using a `when` expression, while `getUserById` simulates user retrieval:

```kotlin
// Import necessary modules
import io.ktor.server.application.*
import io.ktor.server.resources.*

import kotlinx.serialization.*

// Define the sealed interface for API requests using Ktor resources
@Resource("api")
sealed interface ApiRequest

@Serializable
@Resource("login")
data class LoginRequest(val username: String, val password: String) : ApiRequest


@Serializable
@Resource("logout")
object LogoutRequest : ApiRequest

// Define the ApiResponse sealed class with detailed response types
sealed class ApiResponse {
    data class UserSuccess(val user: UserData) : ApiResponse()
    data object UserNotFound : ApiResponse()
    data class Error(val message: String) : ApiResponse()
}

// User data class to be used in the success response
data class UserData(val userId: String, val name: String, val email: String)

// Function to validate user credentials (for demonstration purposes)
fun isValidUser(username: String, password: String): Boolean {
    // Some validation logic (this is just a placeholder)
    return username == "validUser" && password == "validPass"
}

// Function to handle API requests with detailed responses
fun handleRequest(request: ApiRequest): ApiResponse {
    return when (request) {
        is LoginRequest -> {
            if (isValidUser(request.username, request.password)) {
                ApiResponse.UserSuccess(UserData("userId", "userName", "userEmail"))
            } else {
                ApiResponse.Error("Invalid username or password")
            }
        }
        is LogoutRequest -> {
            // Assuming logout operation always succeeds for this example
            ApiResponse.UserSuccess(UserData("userId", "userName", "userEmail")) // For demonstration
        }
    }
}

// Function to simulate a getUserById call
fun getUserById(userId: String): ApiResponse {
    return if (userId == "validUserId") {
        ApiResponse.UserSuccess(UserData("validUserId", "John Doe", "john@example.com"))
    } else {
        ApiResponse.UserNotFound
    }
    // Error handling would also result in an Error response.
}

// Main function to demonstrate the usage
fun main() {
    val loginResponse = handleRequest(LoginRequest("user", "pass"))
    println(loginResponse)

    val logoutResponse = handleRequest(LogoutRequest)
    println(logoutResponse)

    val userResponse = getUserById("validUserId")
    println(userResponse)

    val userNotFoundResponse = getUserById("invalidId")
    println(userNotFoundResponse)
}
```

#### Nested and inner classes 

Classes can be nested in other classes:

```kotlin
class Outer {
    private  val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}

val demo = Outer.Nested().foo() // 2
```
You can also use interfaces with nesting. All combinations of classes and interfaces are possible: You can nest interfaces in classes, classes in interfaces, and interfaces in interfaces.

```kotlin
interface OuterInterface {
    class InnerClass
    interface  InnerInterface
}

class OuterClass {
    class InnerClass
    interface InnerInterface
}
```

###### **Inner classes**

A nested class marked as `inner` can access the members of its outer class. Inner classes carry a reference to an object of an outer class:

```kotlin
class Outer {
    private val bar: Int = 1
    inner class Inner{
        fun foo() = bar
    }
}

val demo = Outer().Inner().foo() // 1
```


###### **Anonymous inner classes**

Anonymous inner class instances are created using an object expression:

```kotlin
window.addMouseListener(object : MouseAdapter() {

  override fun mouseClicked(e: MouseEvent) { ... }

  override fun mouseEntered(e: MouseEvent) { ... }
})
```
>✨ On the JVM, if the object is an instance of a functional Java interface (that means a Java interface with a single abstract method), you can create it using a lambda expression prefixed with the type of the interface:
>    ```kotlin
>       val listener= ActionListener { println("clicked") }
>    ```

#### Enum classes

The most basic use case for enum classes is the implementation of type-safe enums:

```kotlin
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
```

Each enum constant is an object. Enum constants are separated by commons.

Since each enum is an instance of the enum class, it can be initialized as: 

```kotlin
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
}
```

###### **Anonymous classes**

Enum constants can declare their own anonymous classes with their corresponding methods, as well as with overriding base methods.

```kotlin
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };
    abstract fun signal(): ProtocolState
}
```

If the enum class defines any members, separate the constant definitions from the member definitions with a semicolon.

###### **Implementing interfaces in enum classes**

An enum class can implement an interface (but it cannot derive from a class), providing either a common implementation of interface members for all entries, or separate implementations for each entry with its anonymous class. This is done by adding the interfaces you want to implement to the enum class declaration as follows:

```kotlin
import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES{
        override fun apply(t: Int, u: Int): Int = t * U
    };
  override fun applyAsInt(t: Int, u: Int) = apply(t,u)

}
```

All enum classes implement the Comparable interface by default. Constant in the enum class are defined in the natural order. For more information, see Ordering.

###### **Working with enum constants**

Enum classes in Kotlin have synthetic properties and methods for listing the defined enum constants and getting an enum constant by its name. The signatures of these methods are as follows (assuming the name of the enum class is `EnumClass`):

```kotlin
EnumClass.valueOf(value: String): EnumClass
EnumClass.entries: EnumEntries<EnumClass> // specialized List<EnumClass>
```
Below is an example of them in action:

```kotlin
enum class RGB { RED, GREEN, BLUE}

fun main() {
    for (color in RGB.entries) print(color.toString())
    println("The first color is: ${RGB.valueOf("RED")}") 
}
```
The `valueOf()` method throws an `IllegalArgumentException` if the specified name does not match any of the enum constants defined in the class.

Prior to the introduction of `entires` in Kotlin 1.9.0, the `value()` function was used to retrieve an array of enum constants.

Every enum constant also has properties: `name` and `ordinal`, for obtaining its name and position (starting from 0) in the num class declaration:

```kotlin
println(RGB.RED.name)    // prints RED
println(RGB.RED.ordinal) // prints 0
```

You can access the constants in an enum class in a generic way using the `enumValues<T>` and `enumValueOf<T>()` functions. In Kotlin 2.0.0, the `enumEntries<T>()` function is introduced as a replacement for the `enumValues<T>()` function. The `enumEntries<T>()` function returns a list of all enum entries for the given enum type `T`.

The `enumValues<T>()` function is still supported, but we recommend that you use the `enumEntries<T>()` function instead because it has less performance impact. Every time you call `enumValues<T>()` a new array is created, whereas you call `enumEntries<T>()` the same list is returned each time, which is far more efficient.

For example:

```kotlin
import kotlin.enums.enumEntries

enum class RGB { RED, GREEN, BLUE }

inline fun <reified T: Enum<T>> printAllValues() {
    println(enumEntries<T>().joinToString { it.name })
}

printAllValues<RGB>()
```

#### Inline value classes

Sometimes it's useful to wrap a value in a class to create a more domain-specific type. However, it introduces runtime overhead due to additional heap allocations. Moreover, if the wrapped type is primitive, the performance hit is significant, because primitive types are usually heavily optimized by the runtime, while their wrappers don't get any special treatment.

To solve such issues, Kotlin introduces a special kind of class called an **inline class**. Inline classes are a subset of value-based classes. They don't have an identity and can only old values.

To declare an inline class, use the `value` modifier before the name of the class:

```kotlin
value class Password(private val s: String)
```

To declare an inline class for the JVM backend, use the `value` modifier along with the `@JvmInline annotation before the class declaration:

```kotlin
// For JVM backeds

@JvmInline
value class Password(private val s: String)
```

An inline class must have a single property initialized in the primary constructor. At runtime, instances of the inline class will be represented using this single property (see details about runtime representation bellow):

```kotlin
@JvmInline
value class Password(private val s: String)

// No actual instantiation of class `Password` happens
// At runtime `securePassword` contains just `String`
val securePassword= Password("Don't try this in production")

```
This is the main feature of inline classes, which inspired the name **inline**: data of the class is inlined in its usages (similar to how content of inline functions is inlined to call sites).


###### **Members**

Inline classes support some functionality of regular classes. In particular, they are allowed to declare properties and functions, have an `init` block and `secondary constructors`:

```kotlin
@JvmInline
value class Person(private val fullName: String) {
  init {
    require(fullName.isNotEmpty()) {
      "Full name shouldn't be empty"
    }
  }

  constructor(firstName: String, lastName: String) : this("$firstName $fullName") {
    require(lastName.isNotBlank()) {
      "Last name shouldn't be empty"
    }
  }

  val length: Int
    get() = fullName.length

  fun greet() {
    println("Hello, $fullName")
  }
}

fun main() {
    val name1 = Person("Kotlin", "Mascot")
    val name2 = Person("Kodee")
    name1.greet() // the `greet()` function is called as a static method
    println(name2.length) // property getter is called as a static method
}
/// Hello, Kotlin Mascot
/// 5
```
Inline class properties cannot have backing fields. They can only have simple computable properties (no `lateinit`/ delegated properties).

###### **Inheritance**

Inline classes are allowed to inherit from interfaces:

```kotlin
interface Printable{
    fun prettyPrint(): String 
}

@JvmInline 
value class Name(val s: String): Printable {
    override fun prettyPrint(): String = "Let's $s!"
}

fun main() {
    val name = Name("Kotlin")
    println(name.prettyPrint()) // Still called as a static method
}
```
It's forbidden for inline classes to participate in a class hierarchy. This means that inline classes cannot extend other classes and are always `final`.

###### **Representation**

In generated code, the Kotlin compiler keeps a **wrapper** for each inline class. Inline class instances can be represented at runtime either as wrappers or as the underlying type. This is similar to how `Int` can be represented either as primitive `int` or as the wrapper Integer.

The Kotlin compiler will prefer using underlying types instead of wrappers to produce the most performant and optimized code. However, sometimes it is necessary to keep wrapper around. As a rule of thumb, inline classes are boxed whenever they are used as another type.

```kotlin
interface I

@JvmInline
value class Foo(val i: Int) : I

fun asInline(f: Foo){}
fun <T> asGeneric(x: T) {}
fun asInterface(i: T){}
fun asNullable(i: Foo?){}

fun <T> id(x: T): T = x

fun main() {
    val f = Foo(42)
    asInline(f) // unboxed: used as Foo itself
    asGeneric(f) // boxed: used as generic type T
    asInterface(f) // boxed: used as type I
    asNullable(f) // boxed: used as Foo?, which is different from Foo
    
    // below, `f` first is boxed (while being passed to `id`) and then unboxed (when returned from `id`)
    // In the end, `c` contains unboxed representation (just `42`), as `f`
    val c = id(f)
}
```
Because inline classes may be represented both as the underlying value and as a wrapper, referential equality is pointless for them and is therefore prohibited.

Inline classes can also have a generic type parameter as the underlying type. In this case, the compiler maps it to `Any?` or, generally, to the upper bound of the type parameter.

```kotlin
@JvmInline
value class UserId<T>(val value: T)

fun compute(s: UserId<String>){} // compiler generates fun compute-<hashcode>(s: Any?)
```

**Mangling**

Since inline classes are compiled to their underlying type, it may lead to various obscure errors, for example unexpected platform signature clashes:

```kotlin
@JvmInline
value class Unit(val x: Int)

// Represented as 'public final void compute(int x)' on the JVM
fun compute(x: Int){}

// Also represented as 'public final void compute(int x)' on the JVM!
fun compute(x: UInt){}

```
To mitigate such issues, functions using inline classes are mangled by adding some stable hashcode to the function name. Therefore, `fun compute(x:UInt)` will be represented as `public final void compute-<hashcode>(int x)`, which solves the clash problem.

**Calling from Java code**

You can call functions that accept inline classes from Java code. To do so, you should manually disable mangling: add the `@JvmName` annotation before the function declaration:

```kotlin
@JvmInline
value class Unit(val x: Int)

fun compute(x: Int){}

@JvmName("computeUInt")
fun compute(x: UInt){}
```

###### **Inline classes vs type aliases**

At first sight, inline classes seem very similar to type aliases. Indeed, both seem to introduce a new type and both will be represented as the underlying type at runtime.

However, the crucial difference is that type aliases are **assignment-compatible** with their underlying type(and with other type aliases with the same underlying type), while inline clases are not.

In other words, inline classes introduce a truly **new** type, contrary to type aliases which only introduce an alternative name (alias) for an existing type:


```kotlin
typealias NameTypeAlias = String 

@JvmInline 
value class NameInlineClass(val s: String)

fun acceptString(s: String){}
fun acceptNameTypeAlias(n: NameTypeAlias){}
fun acceptNameInlineClass(p: NameInlineClass){}

fun main() {
    val nameAlias : NameTypeAlias = ""
    val nameInlineClass: NameInlineClass = NameInlineClass("")
    val string: String = ""
  
    acceptString(nameAlias) // OK: pass alias instead of underlying type
    aceeptString(nameInlineClass) // Not OK: can't pas inline class instead of underlying type
  
    // And vice versa
    acceptNameTypeAlias(string) // OK: pass underlying type instead of alias
    acceptNameInlineClass(string) // Not OK: can't pass underlying type instead of inline class
}

```

###### **Inline classes and delegation**

Implementation by delegation to inlined value of inlined class is allowed with interfaces:

```kotlin
interface MyInterface {
  fun bar()
  fun foo() = "foo"
}

@JvmInline
value class MyInterfaceWrapper(val myInterface: MyInterface) : MyInterface by myInterface

fun main() {
  val my = MyInterfaceWrapper(object : MyInterface {
      override fun bar() {
          T
      }
  })
  println(my.foo()) // foo  
}


```

#### Object declaration and expressions

In Kotlin, objects allow you to define a class and create an instance of it in a single step. This is useful when you need either a reusable singleton instance or a one-time object. To handle these scenarios, Kotlin provides two key approaches: **object declarations** for creating singletons and **object expressions** for creating anonymous, one-time objects

>✨ A singleton ensures that a class has only one instance and provides a global point of access to it.

Object declarations and object expression are best used for scenarios when:

- **Using singletons for shared resources**: You need to ensure that only one instance of a class exists throughout the application. For example, managing a database connection pool.
- **Creating factory methods**: You need a convenient way to create instances efficiently. Companion objects allow you to define class-level functions and properties tied to a class, simplifying the creation and management of these instances.
- **Modifying existing class behavior temporarily**: You want to modify the behavior of an existing class without the need to create new subclass. For example, adding temporary functionality to an object for a specific operation.
- **Type-safe design is required**: You require one-time implementations of interfaces or abstract classes using object expressions. This can be useful for scenarios like a button click handler.

###### **Object declarations**

You can create single instances of objects in Kotlin using object declarations, which always have a name following the `object` keyword. This allows you to define a class and create an instance of it in a single step, which is useful for implementing singletons:

```kotlin
// Declare a singleton object to manage data providers
object DataProviderManager{
    private val providers = mutableListOf<DataProvider>()
    
    // Register a new data provider
    fun registerDataProvider(provider: DataProvider) {
        providers.add(provider)
    }
  
    // Retrieves all registered data providers
  
    val allDataProvider: Collection<DataProvider>
      get() = providers
  
}
```

>✨ The initialization of an object declaration is thread-safe and done on first access.

To refer to the object, use its name directly:

```kotlin
DataProviderManager.registerDataProvider(exampleProvider)
```

Object declarations can also have subtypes, similar to how anonymous objects can inherit from existing classes or implement interfaces:

```kotlin
object DefaultListener : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) { ... }

    override fun mouseEntered(e: MouseEvent) { ... }
}
```

Like variable declarations, object declarations are not expressions, so they cannot be used on the right-hand side of an assignment statement:

```kotlin
// Syntax error: An object declaration cannot bind a name.

val myObject= object MySingleton {
    val name = "Singleton"
}
```

Object declarations cannot be local, which means they cannot be nested directly inside a function. However, they can be nested within another object declarations or non-inner classes.


**Data objects**

When printing a plain object declaration in Kotlin, the string representation contains both its name and the hash of the `object`:

```kotlin
object MyObject 

fun main() {
    println(MyObject)
    // MyObject@hashcode
}
```

However, by making an object declaration with the `data` modifier, you can instruct the compiler to return actual name of the object when calling `toString()`, the same way it works for data classes:

```kotlin
data object MyObject {
    val value: Int = 3
}

fun main() {
    println(MyObject)
    // MyObject
}
```

Additionally, the compiler generates several functions for your `data` object`:

- `toString()` returns the name of the data object.
- `equals()`/`hashCode()` enables equality checks and hash-based collections.

>✨ You cannot provide a custom `equals()` and `hashCode()` implementation for a `data object`.

The `equals()` function for a `data object`  ensures that all objects that have the type of your `data oject` are considered equal. In most cases, you will only have a single instance of your `data object` at runtime, since a `data object` declares a singleton. However, in the edge case where another object of the same type is generated at runtime (for example, by using platform reflection with java.lang.reflect or a JVM serialization library that uses this API under the hood), this ensures that the objects are treated as being equal.
>✨ Make sure that you only compare `data objects` structurally (using the == operator) and never by reference (using the === operator). This helps you to avoid pitfalls when more than one instance of a data object exist at runtime.

```kotlin
import java.lang.reflect.Constructor

data object MySingleton

fun main() {
    val evilTwin = createInstanceViaReflection()

    println(MySingleton)
    // MySingleton

    println(evilTwin)
    // MySingleton

    // Even when a library forcefully creates a second instance of MySingleton,
    // its equals() function returns true:
    println(MySingleton == evilTwin)
    // true

    // Don't compare data objects using ===
    println(MySingleton === evilTwin)
    // false
}

fun createInstanceViaReflection(): MySingleton {
    // Kotlin reflection does not permit the instantiation of data objects.
    // This creates a new MySingleton instance "by force" (using Java platform reflection)
    // Don't do this yourself!
    return (MySingleton.javaClass.declaredConstructors[0].apply { isAccessible = true } as Constructor<MySingleton>).newInstance()
}
```
The generated `hashCode()` function has a behavior that is consistent with the `equals()` function, so that all runtime instances of a `data object` have the same hash code.

*Differences between data object and object classes*

While `data object` and `data class` declarations are often used together and have some similarities, there are some functions that are not generated for `data object`:
- No `copy()` function. Because a `data object` is intended to be used as singleton, no `copy()` function is generated. Singletons restrict the instantiation of a class to a single instance, which would be violated by allowing copies of the instance to be created.
- No `componentN()` function. Unlike a `data class`, a `data object` does not have any data properties. Since attempting to destructure such an object without data properties wouldn't make sense, no `componentN()` functions are generated.

*Use data objects with sealed hierarchies*

Data object declarations are particularly useful for sealed hierarchies like sealed classes or sealed interfaces. They allow you to maintain symmetry with any data classes you may have defined alongside the object.

In this example, declaring `EndOfFile` as `data object` instead of a plain `object` means that it will get the `toString()` function without the need to override it manually:


```kotlin
sealed interface ReadResult

data class Number(val number:Int): ReadResult
data class Text(val text: String): ReadResult 
data object EndOfFile: ReadResult
fun main() {
  println(Number(7))
  // Number(number=7)
  println(EndOfFile)
  // EndOfFile
}
```

**Companion objects**

Companion objects allow you to define class-level functions and properties. This makes it easy to create factory methods, hold constants, and access shared utilities.

An object declaration inside a class can be marked with `companion` keyword:

```kotlin
class MyClass {
    
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}
```
Members of the `companion object` can be called simply by using the class name as the qualifier:

```kotlin
class User(val name: String) {
    // Defines a companion object that acts as a factory for creating User instances
    companion object Factory {
        fun create(name: String): User = User(name)
    }
}

fun main(){
    // Calls the companion object's factory method using the class name as the qualifier. 
    // Creates a new User instance
    val userInstance = User.create("John Doe")
    println(userInstance.name)
    // John Doe
}
```
The name of the `companion object` can be omitted, in which case the name `Companion` is used:

```kotlin
class User(val name: String) {
    // Defines a companion object without a name
    companion object { }
}

// Accesses the companion object
val companionUser = User.Companion
```


Class members can access `private` members of their corresponding `companion object`:

```kotlin
class User(val name: String) {
    companion object {
        private val defaultGreeting = "Hello"
    }

    fun sayHi() {
        println(defaultGreeting)
    }
}
User("Nick").sayHi()
// Hello
```
When a class name is used by itself, it acts as a reference to the companion object of the class, regardless of whether the companion object is named or not:

```kotlin
class User1 {
    // Defines a named companion object
    companion object Named {
        fun show(): String = "User1's Named Companion Object"
    }
}

// References the companion object of User1 using the class name
val reference1 = User1

class User2 {
    // Defines an unnamed companion object
    companion object {
        fun show(): String = "User2's Companion Object"
    }
}

// References the companion object of User2 using the class name
val reference2 = User2
```
Although members of companion objects in Kotlin look like static members from other languages, they are actually instance members of the companion object, meaning they belong to the object itself. This allows companion objects to implement interfaces:

```kotlin
interface Factory<T> {
    fun create(name: String): T
}

class User(val name: String) {
    // Defines a companion object that implements the Factory interface
    companion object : Factory<User> {
        override fun create(name: String): User = User(name)
    }
}

fun main() {
    // Uses the companion object as a Factory
    val userFactory: Factory<User> = User
    val newUser = userFactory.create("Example User")
    println(newUser.name)
    // Example User
}
```
However, on the JVM, you can have members of companion objects generated as real static methods and fields if you use the @JvmStatic annotation. See the Java interoperability section for more detail.


###### **Object expressions**

Object expressions declare a class and create an instance of that class, but without naming either of them. These classes are useful for one-time use. They can be created from scratch, inherit from existing classes, or implement interfaces. Instances of these classes are called anonymous objects because they are defined by an expression, not a name.

**Create anonymous objects from scratch**

Object expressions start with `object` keyword.

If the object does not extend any classes or implement interfaces, you can define an object's members directly inside curly braces after the `object` keyword:

```kotlin
val helloWorld = object {
    val hello = "Hello"
    val world = "World"
    // Object expressions extend the Any class, which already has a toString() function,
    // so it must be overridden
    override fun toString() = "$hello $world"
}

print(helloWorld)
// Hello World
```

**Inherit anonymous objects from supertypes**

To create an anonymous object that inherits from some type (or types), specify this type after `object` and a colon `:`. Then implement or override the members of this class as if you were inheriting from it:

```kotlin
window.addMouseListener(object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) { /*...*/ }

    override fun mouseEntered(e: MouseEvent) { /*...*/ }
})
```

If a supertype has a constructor, pass the appropriate constructor parameters to it. Multiple supertypes can be specified, separated by commas, after the colon:

```kotlin
// Creates an open class BankAccount with a balance property
open class BankAccount(initialBalance: Int) {
    open val balance: Int = initialBalance
}

// Defines an interface Transaction with an execute() function
interface Transaction {
    fun execute()
}

// A function to perform a special transaction on a BankAccount
fun specialTransaction(account: BankAccount) {
    // Creates an anonymous object that inherits from the BankAccount class and implements the Transaction interface
    // The balance of the provided account is passed to the BankAccount superclass constructor
    val temporaryAccount = object : BankAccount(account.balance), Transaction {

        override val balance = account.balance + 500  // Temporary bonus

        // Implements the execute() function from the Transaction interface
        override fun execute() {
            println("Executing special transaction. New balance is $balance.")
        }
    }
    // Executes the transaction
    temporaryAccount.execute()
}
```

**Use anonymous objects as return and value types**

When you return anonymous object from a local or `private` function or property (but not an inline function), all the members of that anonymous object are accessible through that function or property:

```kotlin
class UserPreferences {
    private fun getPreferences() = object {
        val theme: String = "Dark"
        val fontSize: Int = 14
    }

    fun printPreferences() {
        val preferences = getPreferences()
        println("Theme: ${preferences.theme}, Font Size: ${preferences.fontSize}")
    }
}
```

This allows you to return an anonymous object with specific properties, offering a simple way to encapsulate data or behavior without creating a separate class.

If a function or property that returns an anonymous object is `public` or `private`, its actual type is:

- `Any` if the anonymous object doesn't have a declared supertype.
- The declared supertype of the anonymous object, if there is exactly one such type.
- The explicitly declared type if there is more than one declared supertype.

In all these cases, members added in the anonymous object are not accessible. Overridden members are accessible if they are declared in the actual type of the function or property. For example:

```kotlin
interface Notification {
    // Declares notifyUser() in the Notification interface
    fun notifyUser()
}

interface DetailedNotification

class NotificationManager {
    // The return type is Any. The message property is not accessible.
    // When the return type is Any, only members of the Any class are accessible.
    fun getNotification() = object {
        val message: String = "General notification"
    }

    // The return type is Notification because the anonymous object implements only one interface
    // The notifyUser() function is accessible because it is part of the Notification interface
    // The message property is not accessible because it is not declared in the Notification interface
    fun getEmailNotification() = object : Notification {
        override fun notifyUser() {
            println("Sending email notification")
        }
        val message: String = "You've got mail!"
    }

    // The return type is DetailedNotification. The notifyUser() function and the message property are not accessible
    // Only members declared in the DetailedNotification interface are accessible
    fun getDetailedNotification(): DetailedNotification = object : Notification, DetailedNotification {
        override fun notifyUser() {
            println("Sending detailed notification")
        }
        val message: String = "Detailed message content"
    }
}
```

**Access variables from anonymous objects**

Code within the body of object expressions can access variables from the enclosing scope:

```kotlin
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    // MouseAdapter provides default implementations for mouse event functions
    // Simulates MouseAdapter handling mouse events
    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }

        override fun mouseEntered(e: MouseEvent) {
            enterCount++
        }
    })
    // The clickCount and enterCount variables are accessible within the object expression
}
```

###### **Behavior difference between object declarations and expressions**

There are differences in the initialization behavior between object declarations and object expressions:

- Object expressions are executed (and initialized) `immediately`, where they are used.
- Object declarations are initialized `lazily`, when accessed for the first time.
- A companion object is initialized when the corresponding class is loaded (resolved) that matches the semantics of a Java static initializer.

#### Overriding methods

Kotlin requires explicit modifiers for overridable members and overrides: 

```kotlin
open class Shape {
    
    open fun draw() {}
    fun fill(){}
}

class Circle(): Shape() {
    
    override fun draw(){
        
    }
}
```

The `override` modifier is required for `Circle.draw()`. If it's missing, the compiler will complain. If there's no `open` modifier on a function, like `Shape.fill()` , declaring a method with same signature in a subclass is not allowed, either with `override` or without it. The `open` modifier has no effect when added to members of a final class - a class without an `open` modifier.

A member marked `override` is itself open, so it may be overridden in subclasses. If you want to prohibit re-overriding, use `final`: 

```kotlin
open class  Rectangle(): Shape() {  
    final override fun draw(){}
}
```
#### Overriding properties

The overriding mechanism works on properties in the same way that it does on methods. Properties declared on a superclass that are then redeclared on a derived class must be prefaced with `override`, and must have a compatible type. Each declared property can be overridden by a property with an initializer or by a property with a `get` method.: 

```kotlin
open class Shape {
    open val vertexCount: Int = 0
}
class Rectangle(): Shape() {
    override val vertexCount: Int = 4
}
```
You can also override a `val` property with a `var` property, but not vice versa. This is allowed because a `val` property essentially declares a `get` method, and overriding it as a `var` additionally declares a `set` method in the derived class.

Note that you can use the `override` keyword as part of the property declaration in a primary constructor:

```kotlin
interface Shape {
    val vertexCount: Int
}

class Rectangle (override val vertexCount: Int = 4): Shape  // Always has 4 vertex

class Polygon : Shape {
    override val vertexCount: Int = 4 // Can be set to any number later
}
```

#### Derived class initialization order

During the construction of a new instance of a derived class, the base class initialization is done as the first step (preceded only by evaluation of the arguments for the base class constructor), which means that it happens before the initialization logic of the derived class is run.

```kotlin
open class Base (val name: String) {
    
    init {
        println("Initializing a bass class")
    }
  
    open val size: Int = name.length.also { 
        println("Initializing size in the base class: $it")
    }
}

class Derived ( name: String, val lastName: String,): Base( name.replaceFirstChar { it.uppercase() }.also { 
    println("Argument for the base class: $it")}){
        
    init {
        println("Initializing a derived class")
    }
  
    override val size: Int = (super.size + lastName.length).also { 
        println("Initializing size the derived class: $it")
    }
}

///  Constructing the derived class("hello", "world")
///  Argument for the base class: Hello
///  Initializing a base class
///  Initializing size in the base class: 5
///  Initializing a derived class
///  Initializing size in the derived class: 10
```
This means that when the bass class constructor is executed, the properties declared or overridden in the derived class have not yet been initialized. Using any of those properties in the base class initialization logic (either directly or indirectly through another overridden `open` member implementation) may lead to incorrect behavior or a runtime failure. When designing a base class, you should therefore avoid using `open` members in ths constructors, property initializers, or `init` blocks.

#### Calling the superclass implementation

Code in a derived class can call its superclass functions and property accessor implementations using the `super` keyword:

```kotlin
open class Rectangle {
    open fun draw() {
        println("Drawing a rectangle")
    }
  val borderColor: String get() = "black"
}

class FilledRectangle: Rectangle() {
    override fun draw() {
        super.draw()
        println("Drawing the rectangle")
    }
    val fillColor: String get()= super.borderColor
}
```

Inside an inner class, accessing the superclass of the outer class is done using the `super` keyword qualified with the outer class name: `super@Outher`: 

```kotlin
class FilledRectangle: Rectangle() {
    override fun draw() {
        val filler= Filler()
        filler.drawAndFill()
    }
    
  inner class Filler {
      fun fill(){
          println("Filling")
      }
    fun drawAndFill() {
        super@FilledRectangle.draw() // Calls Rectangle's implementation of draw()
        fill()
        println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}")
    }
  }
}

/// Drawing a rectangle
/// Filling
/// Drawn a filled rectangle with color black
```

#### Overriding rules

In Kotlin, implementation inheritance regulated by the following rule: If a class inherits multiple implementations of the same member from its immediate superclasses, it must override this member and provide its own implementation (perhaps, using one of the inherited ones).

To denote the supertype from which the inherited implementation is taken, use `super` qualified by the supertype name in angle braces, such as `super<Base>`:

```kotlin
open class Rectangle {
    open fun draw() {}
}

interface Polygon {
    fun draw() {}
}

class Square : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden.
    override fun draw() {
        super<Rectangle>.draw() // Call to Rectangle.draw()
        super<Polygon>.draw() // Call to Polygon.draw()
    }
}



```
It's fine to inherit from both `Rectangle` and `Polygon`, but both of them have their implementations of `draw()`, so you need to override `draw()` in `Square` and provide a separate implementation  for it to eliminate the ambiguity.

#### Functional (SAM) interfaces

An interface with only one abstract member function is called a **functional interface**, or a **Single Abstract Method (SAM) interface**. The functional interface can have several non-abstract member functions but only one abstract member function.

To declare a functional interface in Kotlin, use the `fun` modifier.

```kotlin
fun interface KRunnable {
    fun invoke()
}
```

###### **SAM conversions**

For functional interfaces, you can use SAM conversions that help make your code more concise and readable by using lambda expressions.

Instead of creating a class that implements a functional interface manually, you can use a lambda expression. With a SAM conversion, Kotlin can convert any lambda expression whose signature matches the signature of interface's single method into the code, which dynamically instantiates the interface implemention.

For example, consider the following Kotlin functional interface:

```kotlin
fun interface IntPredicate{
    fun accept(i: Int): Boolen
}
```

If you don't use a SAM conversions, you will need to write code like this:

```kotlin
fun interface IntPredicate{
  fun accept(i: Int): Boolen
}
// Creating an instance of a class
val isEven = object : IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}
```
By leveraging Kotlin's SAM conversion, you can write the following equivalent code instead:

```kotlin
fun interface IntPredicate{
  fun accept(i: Int): Boolen
}

// Creating an instance of a class
val isEven = IntPredicate { it % 2 == 0}

fun main() {
    println("Is 7 even? - ${isEven.accept(7)}")
}

/// Is 7 even? - false
```

###### **Migration from an interface with constructor function to a functional interface**

Starting from 1.6.20, Kotlin supports callable references to functional interface constructors, which adds a source-compatible way to migrate from an interface with a constructor function to a functional interface. Consider the following code:

```kotlin
interface Printer {
    fun print()
}

fun Printer(block: () -> Unit): Printer = object : Printer { 
    override fun print() = block() 
}

```
With callable references to functional interface constructors enabled, this code can be replaced with just a functional interface declaration:

```kotlin
fun interface Printer {
    fun print()
}
```
Its constructor will be created implicitly, and any code using the `::Printer` function reference will compile. For example:

```kotlin
documentsStorage.addPrinter(::Printer)
```

Preserve the binary compatibility by marking the legacy function `Printer` with the `@Deprecated` annotation with `DeprecationLevel.HIDDEN`:

```kotlin
@Deprecated(message = "Your message about the deprecation", level = DeprecationLevel.HIDDEN)
fun Printer (...) {...}
```
###### **Functional interfaces vs. type aliases**

You can also simply rewrite the above using a type alias for a functional type:

```kotlin
typealias IntPredicate = (i: Int) -> Boolean

val isEven: IntPredicate = {it % 2 == 0}

fun main() {
    println("Is 7 even? - ${isEven.invoke(7)}")
}
```
However, functional interfaces and type aliases serve different purposes. Type aliases are just names for existing types - they don't create a new type, while functional interfaces do. You can provide extensions that are specific to a particular functional interface to be inapplicable for plain functions or their type aliases.

Type aliases can have only one member, while functional interfaces can have multiple non-abstract member functions and one abstract member function. Functional interfaces can also implement and extend other interfaces.

Functional interfaces are more flexible and provide more capabilities than type aliases, but they can be more costly both syntactically and at runtime because they can require conversions to a specific interface. When you choose which one to use in your code, consider your needs:

- If your API needs to accept a function(any function) with some specific parameters and return types - use a simple functional type or define a type alias to give a shorter name to the corresponding functional type. 
- If your API accepts a more complex entity than a function - for example, it has non-trivial contracts and/or operations on it that cannot be expressed in a functional type's signature - declare a separate functional interface for it. 

## Visibility modifiers

Classes, objects, interfaces, constructors, and functions, as well as properties and their setters, can have **visibility modifiers**. Getters always have the same visibility as their properties.

There are four visibility modifiers in Kotlin: `private`, `protected`, `internal`, and `public`.
The default visibility is `public`.

We will learn how the modifiers apply to different types of declaring scopes.

#### Packages

Functions, properties, classes, objects, and interfaces can be declared at the "top-level" directly inside a package:

```kotlin
// file name: example.kt
package foo

fun baz() {}
class Bar
```
- If you don't use a visibility modifier, `public` is used by default, which means that your declarations will be visible everywhere.
- If you mark a declaration as `private`, it will only be visible inside the file that contains the declaration.
- If you mark it as `internal`, it will be visible everywhere in the same module.
- The `protected` modifier is not available for top-level declarations.

>✨ To use a visible top-level declaration from another package, you should import it.

Examples:

```kotlin
// file name: example.kt
package foo

private fun foo() {} // visible inside example.kt

public var bar: Int = 5 // property is visible everywhere
    private set         // setter is visible only in example.kt

internal val baz: Int = 6 // Visible inside the same module.
```

#### Class member

For members declared inside a class:

- `private` means that the members is visible inside this class only(including all its members).
- `protected` means that the member has the same visibility as one marked as `private`, but that is also visible in subclasses.
- `internal` means that any client inside this module who sees the declaring class sees its `internal` members.
- `public` means that any client who sees the declaring class sees its `public` members.

>✨ In Kotlin, an outer class does not see private members of its inner classes.

If you override a `protected` or an `internal` member and do not specify the visibility explicitly, the overriding member will also have the same visibility as the original.

Examples:

```kotlin
open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4 // public by default
  
    protected class Nested { 
        public val e: Int = 5
    }
}

class Subclass: Outer() {
    // `a` is not visible
    // `b`, `c` and `d` are visible
    // `Nested` and `e` are visible
    override  val b = 5 // `b` is protected
    override val c = 7 // `c` is internal
}

class Unrelated (o: Outer) {
    // o.a, o.b are not visible
    // o.c, o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}
```

###### **Constructors**

Use the following syntax to specify the visibility of the primary constructor of a class:

>✨ You need to and an explicit `constructor` keyword.

```kotlin
class C private constructor(a: Int)
```
Here the constructor is `private`. By default, all constructors are `public`, which effectively amounts to them being visible everywhere the class is visible(This means that a constructor of an `internal` class is only visible within the same module).

For sealed classes, constructors are `protected` by default.

###### **Local declarations**

Local variables, functions, and classes cannot have visibility modifiers.

#### Modules

The `internal` visibility modifier means that the member is visible within the same module. More specifically, a module is a set of Kotlin files compiled together, for example:

- An IntelliJ IDEA module.
- A Maven project.
- A Gradle source set (with the exception that the `test` source set can access the internal declarations of `main`).
- A set of files compiled with one invocation of the `<kotlinc>` Ant task.




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
    
    // nullable has nullable String type
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


## Extensions

Kotlin provides the ability to extend a class or an interface with new functionality without have to inherit from the class or use design patterns such as **Decorator**. This is done via a special declarations called **extensions**.

For example, you can write new functions for a class or an interface from a third-party library that you can't modify. Such functions can be called in usual way, as if they were methods of the original class. This mechanism is called an **extension function**. There are also **extension properties** that let you define new properties for existing classes.

#### Extension functions

To declare an extension function, prefix its name with a **receiver type**, which refers to the type being extended. The following adds a `swap` function to `MutableList<Int>`:

```kotlin
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]  // `this` corresponds to the list
    this[index1] = this[index2]
    this[index2]= tmp
}
```
The `this` keyword inside an extension function corresponds to the receiver object(the one that is passed before the dot). Now, you can call such a function on any `MutableList<Int>`:

```kotlin
val list = mutableListOf(1,2,3)
list.swap(0,2) 
```

This function makes sense for any MutableList<T>, and you can make it generic:

```kotlin
fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]  // `this` corresponds to the list
    this[index1] = this[index2]
    this[index2]= tmp
}
```
You need to declare the generic type parameter before the function name to make it available in the receiver type expression. For more information about generics, see [generic functions]()

#### Extensions are resolved statically

Extensions do not actually modify the classes they extend. By defining an extension, you are not inserting new members into a class, only making new functions callable with the dot-notation on variables of the this type.

Extension functions are dispatched **statically**. So which extension function is called is already known at compile time based on the receiver type. For example:

```kotlin
open class Shape
class Rectangle(): Shape()

fun Shape.getName() = "Shape"
fun Rectangle.getName() = "Rectangle"

fun printClassName(s: Shape) {
    println(s.getName())
}

printClassName(Rectangle())

/// Shape
```
This example prints **Shape**, because the extension function called depends only on the declared type of the parameter `s`, which is the `Shape` class.

If a class has a member function, and an extension function is defined which has the same receiver type, the same name, and is applicable to give arguments, the **member always wins**. For example:

```kotlin
class Example {
    fun printFunctionType() {
        println("Class method")
    }
}

fun Example.printFunctionType() {
    println("Extension function")
}

Example().printFunctionType()

/// Class method
```
However, it's perfectly OK for extension functions to overload member functions that have same name but a different signature:

```kotlin
class Example {
    fun printFunctionType() {
        println("Class method")
    }
}

fun Example.printFunctionType(i: Int){
    println("Extension function: #$i")
}

Example().printFunctionType(1)

/// Extension function: #1
```

#### Nullable receiver

Note that extensions can be defined with a nullable receiver type. These extensions can be called on an object variable even if its value is null. If the receiver type is `null`, then `this` is also `null`. So when defining an extension with a nullable receiver type, we recommend performing a `this == null` check inside the function body to avoid compiler errors.

You can call `toString()` in Kotlin without checking for `null`, as the check already happens inside the extension function:

```kotlin
fun Any?.toString(): String {
    if (this == null) return "null"
  // After the null check, `this` is autocast to a non-nullable type, so the toString below resolves to the member function of the Any class
  return toString()
}
```

#### Extension properties

Kotlin supports extension properties much like it supports functions:

```kotlin
val <T> List<T>.lastIndex: Int 
  get() = size -1
```

>✨ Since extensions do not actually insert members into classes, there's no efficient way for an extension property to have a backing field. This is why initializers are not allowed for extension properties. Their behavior can only be defined by explicitly providing getters/setters.

Example:

```kotlin
val House.number = 1 // Error: Initializers are not allowed for extension properties.
```

#### Companion object extensions

If a class has a companion object defined, you can also define extension functions and properties for the companion object. Just like regular members of the companion object, they can be called using only the class name as the qualifier:

```kotlin
class MyClass {
    companion object {} // will be called "Companion"
}

fun MyClass.Companion.printCompanion() {
    println("companion")
}

fun main() {
    MyClass.printCompanion()
}

/// companion
```

#### Scope of extensions

In most cases, you define extensions on the top level, directly under packages:

```kotlin
package org.example.declarations

fun List<String>.getLongestString() {}
```

To use an extension outside its declaring package, import it at the call site:

```kotlin
package org.example.usage

import org.example.declarations.getLongestString

fun main() {
    val list = listOf("Red", "Green", "Blue")
    list.getLongestString()
}
```

See [imports]() for more information.

#### Declaring extensions as members

You can declare extension for one class inside another class. Inside such an extension, there are multiple implicit receivers - objects whose members can be accessed without a qualifier. An instance of a class in which the extension is declared is called a **dispatch receiver**, and an instance of the receiver type of the extension method is called an **extension receiver**.

```kotlin
class Host(val hostname: String) {
    fun printHostName() {
        print(hostname)
    }
}

class Connection(val host: Host, val port: Int) {
    fun printPort() {
        print(port)
    }
  
    fun Host.printConnectionString() {
        printHostName() // calls Host.printHostName()
        print(":")
        printPort() // calls Connection.printPort()
    }
  
    fun connect() {
        /*...*/
        host.printConnectionString() // calls the extension function
    }
}

fun main() {
    Connection(Host("kotlin"),443).connect()
    // Host("kotlin").printConnectionString() // error, the extension function is unavailable outside Connection
}

/// kotlin:443
```
In the event of a name conflict the members of a dispatch receiver and an extension receiver, the extension receiver takes precedence. To prefer to the member of the dispatch receiver, you can use the qualified `this` syntax.

```kotlin
class Connection {
    fun Host.getConnectString() {
        toString() // calls Host.toString()
        this@Connection.toString() // calls Connection.toString()
    }
}
```
Extension declared as members can be declared as `open` and overridden in subclasses. This means that the dispatch of such functions is virtual with regard to the dispatch receiver type, but static with regard to the extension receiver type.

```kotlin
open class Base

class Derived : Base() {}

open class BaseCaller {
    open fun Base.printFunctionInfo() {
        println("Base extension function in BaseCaller")
    }
  
    open fun Derived.printFunctionInfo() {
        println("Derived extension function in BaseCaller")
    }
  
    fun call(b: Base) {
        b.printFunctionInfo()
    }
}

class DerivedCaller: BaseCaller() {
    override fun Base.printFunctionInfo() {
        println("Base extension function in DerivedCaller")
     }

    override fun Derived.printFunctionInfo() {
        println("Derived extension function in DerivedCaller")
     }
}

fun main() {
    BaseCaller().call(Base()) // Base extension function in BaseCaller
    DerivedCaller().call(Base()) // Base extension function in DerivedCaller - dispatch receiver is resolved virtually
    DerivedCaller().call(Derived()) // Base extension function in DerivedCaller - extension receiver is resolved statically
}
```

#### Note on visibility

Extensions utilize the same visibility modifiers as regular functions declared in same scope would. For example:

- An extension declared at the top level of a file has access to the other `private` top-level declarations in the same file.
- If an extension is declared outside its receiver type, it cannot access the receiver's `private` or `protected` members.

## Delegation

The Delegation pattern has proven to be a good alternative to implementation inheritance, and Kotlin support it natively requiring zero boilerplate code.

A class `Derived` can implement an interface `Base` by delegating all of its public members to specified object:

```kotlin
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b

fun main() {
    val base = BaseImpl(10)
    Derived(base).print()
}
```
The by-clause in the supertype list for `Derived` indicates that `b` will be stored internally in objects of `Derived` and the compiler will generate all the methods of `Base` that forward to `b`.

#### Overriding a member of an interface implemented by delegation

Overrides work as you expect: the compiler will use your override implementations instead of those in the delegate object. If you want to add `override fun printMessage() { print("abc") }` to `Derived`, the program would print `abc` instead of `10` when `printMessage` is called:

```kotlin
interface Base {
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl(val x: Int) : Base {
    override fun printMessage() { print(x) }
    override fun printMessageLine() { println(x) }
}

class Derived(b: Base) : Base by b {
    override fun printMessage() { print("abc") }
}

fun main() {
    val base = BaseImpl(10)
    Derived(base).printMessage()
    Derived(base).printMessageLine()
}
```

Note, however, that members overridden in this way do not get called from the members of the delegate object, which can only access its own implementations of the interface members:

```kotlin
interface Base {
    val message: String
    fun print()
}

class BaseImpl(x: Int) : Base {
    override val message = "BaseImpl: x = $x"
    override fun print() { println(message) }
}

class Derived(b: Base) : Base by b {
    // This property is not accessed from b's implementation of `print`
    override val message = "Message of Derived"
}

fun main() {
    val b = BaseImpl(10)
    val derived = Derived(b)
    derived.print()
    println(derived.message)
}

/// BaseImpl: x = 10
/// Message of Derived
```

## Delegated properties

With some common kinds of properties, even though you can implement them manually every time you need them, it is more helpful to implement them once, add them to a library, and reuse them later. For example:
- `Lazy` properties: the value is computed only on first access.
- `Observable` properties: listeners are notified about changes to this property.
- Storing properties in a `map` instead of a separate field for each property.

To cover these (and other) cases, Kotlin supports delegated properties:

```kotlin
class Example {
    var p: String by Delegate()
}
```

The syntax is: `val/var <property name>: <Type> by <expression>`. The expression after `by` is a **delegate**, because the `get()` (and `set()`) that correspond to the property will be delegated to its `getValue()` and `setValue()` methods. Property delegates don't have to implement an interface, but they have to provide a `getValue()` function (and `setValue()` for `var`s).

For example:

```kotlin
import kotlin.reflect.KProperty

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}
```
When you read from `p`, which delegates to an instance of **Delegate**, the `getValue()` function from **Delegate** is called. Its first parameter is the object you read `p` from, and the second parameter holds a description of `p` itself (for example, you can take its name).

```kotlin
val e = Example()
println(e.p)

//  Example@33a17727, thank you for delegating 'p' to me!
```
Similarly, when you assign to `p`, the `setValue()` function is called. The first two parameters are the same, and the third holds the value being assigned:

```kotlin
e.p = "NEW"

// NEW has been assigned to 'p' in Example@33a17727.
```
The specification of the requirements for the delegated object can be found below.

You can declare a delegated property inside a function or code block; it doesn't have to be a member of a class. Below you can find an example.

#### Standard delegates

The Kotlin standard library provides factory methods for several useful kinds of delegates.


###### **Lazy properties**

`lazy()` is  a function that takes a lambda and returns an instance of `Lazy<T>`, which can serve as a delegate for implementing a lazy property. The first call to `get()` executes the lambda passed to `lazy()` and remembers the result. Subsequent calls to `get()` simply return the remembered result/

```kotlin
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}

/// computed!
/// Hello
/// Hello
```
By default, the evaluation of lazy properties is **synchronized**: the value is computed only in one thread, but all threads will see the same value. If the synchronization of the initialization delegate is not required to allow multiple threads to execute it simultaneously, pass `LazyThreadSafetyMode.PUBLICATION` as a parameter to `lazy()`.

If you're sure that the initialization will always happen in the same thread as the one where you use the property, you can use `LazyThreadSafetyMode.NONE`. It doesn't incur any thread-safety guarantees and related overhead.

###### **Observable properties**

`Delegates.observable()` takes two arguments: the initial value and a handle for modifications

The handler is called every time you assign to the property (**after** the assignment has been performed). It has three parameters: the property being assigned to, the old value, and the new value:

```kotlin
import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"
}

/// <no name> -> first
/// first -> second
```
If you want to intercept assignments and `veto` them, use `vetoable()` instead of `observable()`. The handler passed to `vetoable` will be called `before` the assignment of a new property value.


#### Delegating to another property

A property can delegate its getter and setter to another property. Such delegation is available for both top-level and class properties (member and extension). This delegate property can be:
- A top-level property
- A member or an extension property of the same class
- A member or an extension property of another class

To delegate a property to another property, use the `::` qualifier in the delegate name, for example, `this::delegate` or `MyClass:delegate`:

```kotlin
var topLevelInt: Int = 0
class ClassWithDelegate(val anotherClassInt: Int)

class MyClass(var memberInt: Int, val anotherClassInstance: ClassWithDelegate) {
    var delegatedToMember: Int by this::memberInt
    var delegatedToTopLevel: Int by ::topLevelInt
    
    val delegatedToAnotherClass: Int by anotherClassInstance::anotherClassInt
}

var MyClass.extDelegated: Int by ::topLevelInt
```
This may be useful, for example, when you want to rename a property in a backward-compatible way: introduce a new property, annotate the old one with the `@Deprecated` annotation, and delegate its implementation.

```kotlin
class MyClass {
    var newName: Int = 0
    @Deprecated("Use 'newName' instead", ReplaceWith("newName"))
    val oldName: Int by this::newName
}

fun main() {
    val myClass = MyClass()
    // Notification: `oldName: Int` is deprecated
    // Use 'newName' instead
    myClass.oldName=42
    println(myClass.newName) // 42
}

```

#### Storing properties in a map

One common use case is storing the values of properties in a map. This comes up often in applications for things like parsing JSON or performing other dynamic tasks. In this case, you can use the map instance itself as the delegate for a delegated property.

```kotlin
class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}
```

In this example, the constructor takes a map:

```kotlin
val user= User(mapOf("name" to "John Doe", "age" to 25))

```
Delegated properties take values from this map through string keys, which are associated with the names of properties:

```kotlin
println(user.name) // John Doe
println(user.age) // 25
```

This also works for `var`'s properties if you use a `MutableMap` instead of a read-only `Map`:

```kotlin
class MutableUser(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int     by map
}
```

#### Local delegated properties

You can declare local variables as delegated properties. For example, you can make a local variable lazy:

```kotlin
fun example(computeFoo: () -> Foo){
    val memoziedFoo by lazy(computeFoo) 
    
    if (someCondition && memoizedFoo.isValid()) {
        memoziedFoo.doSomgthing()
    }
}
```

The `memoziedFoo` variable will be computed on first access only. If `someCondition` fail, the variable won't be computed at all.

#### Property delegate requirements

For a **read-only` property (`val`), a delegate should provide an operator function `getValue()` with the following parameters:

- `thisRef` must be the same type as, or a supertype of, the **property owner** (for extension properties, it should be the type being extended).
- `property` must be of the `KProperty<*>` or its supertype.

`getValue()` must return the same type as the property (or its subtype).

```kotlin
import kotlin.reflect.KProperty

class Resource

class Owner {
  val valResource: Resource by ResourceDelegate()
}


class ResourceDelegate {
  operator fun getValue(thisRef: Owner, property: KProperty<*>): Resource {
    return Resource()
  }
}
```

For a **mutable** property (`var`), a delegate has to additionally provide an operator function `setValue()` with the following parameters:

- `thisRef` must be the same type as, or a supertype of, the **property owner** (for extension properties, it should be the type being extended).
- `property` must be of type `KProperty<*>` or its supertype.
- `value` must be of the same type as the property (or its supertype).

```kotlin
import kotlin.reflect.KProperty

class Resource

class Owner {
  var varResource: Resource by ResourceDelegate()
}


class ResourceDelegate(private var resource: Resource = Resource()) {
  operator fun getValue(thisRef: Owner, property: KProperty<*>): Resouce {
      return resource
  }
  
  operator fun setValue(thisRef: Owner, property: KProperty<*>, value: Any?) {
      if (value is Resouce) {
          resource = value
      }
  }
}

```

`getValue()` and/or `setValue()` functions can be provided either as member functions of the delegate class or as extension functions. The latter is handy when you need to delegate a property to an object that doesn't originally provide these functions. Both of the functions need to be marked with the `operator` keyword.

You can create delegates as anonymous objects without creating new classes, by using the interfaces `ReadOnlyProperty` and `ReadWriteProperty` from the Kotlin standard library. They provide the required methods: `getValue()` is declared in `ReadOnlyProperty`; `ReadWriteProperty` extends it and adds `setValue()`. This means you can pass a `ReadWriteProperty` whenever a `ReadOnlyProperty` is expected.


```kotlin
fun resourceDelegate(resource: Resource = Resource()): ReadWriteProperty<Any?, Resource> =
    object : ReadWriteProperty<Any?, Resource> {
        var curValue = resource
        override fun getValue(thisRef: Any?, property: KProperty<*>): Resource = curValue
        override fun setValue(thisRef: Any?, property: KProperty<*>, value: Resource) {
            curValue = value
        }
    }

val readOnlyResource: Resource by resourceDelegate()  // ReadWriteProperty as val
var readWriteResource: Resource by resourceDelegate()
```

#### Translation rules for delegated properties


Under the hood, the Kotlin compiler generates auxiliary properties for some kinds of delegated properties and then delegates to them.

>✨ For optimization purposes, the compiler **does not** generate auxiliary properties in several cases.  

For example, for the property `prop` it generates the hidden property `pro$delegate`, and the code of the accessors simply delegates to this additional property:

```kotlin
class C {
    var prop: Type by MyDelegate()
}

// this code is generated by the compiler instead:

class C {
    private val prop$delegate = MyDelegate()
    var prop: Type 
      get() = pro$delegate.getValue(this, this::prop)
      set(value: Type) = prod$delegate.setValue(this, this::prop, value)      
}

```

The Kotlin compiler provides all the necessary information about `prop` in the arguments: The first argument `this` refers to an instance of the outer class `C`, and `this::prop` is a reflection object of the `KProperty` type describing `prop` itself.



###### **Optimized cases for delegated properties**

The `$delegate` field will be omitted if a delegate is:

- A referenced property:
  ```kotlin
  class C<Type> {
    private var impl: Type = ...
    var prop: Type by :: impl
  }
  ```
  
- A named object:

  ```kotlin
  object NamedObject {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String = ...
  }
  val s: String by NamedObject

  ```
- A final `val` property with a backing field and a default getter in the same module:

  ```kotlin
  val impl: ReadOnlyProperty<Any?, String> = ...
  
  class A {
    val s: String by impl
  }
  ```
- A constant expression, enum entry, `this`, `null`. The example of `this`:

  ```kotlin
  class A {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) ...

    val s by this
  } 
  ```
  

###### **Translation rules when delegating to another property**

When delegating to another property, the Kotlin compiler generates immediate access to referenced property. This means that the compiler doesn't generate the field `prop$delegate`. This optimization helps save memory.

Take the following code, for example:

```kotlin
class C<Type> {
    private var impl: Type = ...
    var prop: Type by :: impl        
}
```

Property accessors of the `prop` variable invoke the `impl` variable directly, skipping the delegated property's `getValue` and `setValue` operators, and thus the `KProperty` reference object is not needed.

For the code above, the compiler generates the following code:

```kotlin
class C<Type> {
    private var impl: Type = ...
    var prop: Type 
      get() = impl
      set(value) {
          impl = value
      }
  
    fun getProp$delegate(): Type = impl // This method is needed only for reflection
}
```

#### Providing a delegate

By defining the `provideDelegate` operator, you can extend the logic for creating the object to which the property implementation is delegated. If the object used on the right-hand side of `by` defines `provideDelegate` as a member or extension function, that function will be called to create the property delegate instance.

One of the possible use cases of `provideDelegate` is to check the consistency of the property upon its initialization.

For example, to check the property name before binding, you can write something like this:

```kotlin
class ResourceDelegate<T> : ReadOnlyProperty<MyUI, T> {
    override fun getValue(thisRef: MyUI, property: KProperty<*>): T { ... }
}

class ResourceLoader<T>(id: ResourceID<T>) {
    operator fun provideDelegate(
            thisRef: MyUI,
            prop: KProperty<*>
    ): ReadOnlyProperty<MyUI, T> {
        checkProperty(thisRef, prop.name)
        // create delegate
        return ResourceDelegate()
    }

    private fun checkProperty(thisRef: MyUI, name: String) { ... }
}

class MyUI {
    fun <T> bindResource(id: ResourceID<T>): ResourceLoader<T> { ... }

    val image by bindResource(ResourceID.image_id)
    val text by bindResource(ResourceID.text_id)
}
```

The parameters of `provideDelegate` are the same as those of `getValue`:

- `thisRef` must be the same type as, or a supertype of, the **property owner** (for extension properties, it should be the type being extended);
- `property` must be of type `KProperty<*>` or its supertype.

The `provideDelegate` method is called for each property during the creation of the `MyUI` instance, and it performs the necessary validation right away.

Without this ability to intercept the binding between the property and its delegate, to achieve the same functionality you'd have to pass the property name explicitly, which isn't very convenient:


```kotlin
// Checking the property name without "provideDelegate" functionality
class MyUI {
    val image by bindResource(ResourceID.image_id, "image")
    val text by bindResource(ResourceID.text_id, "text")
}

fun <T> MyUI.bindResource(
        id: ResourceID<T>,
        propertyName: String
): ReadOnlyProperty<MyUI, T> {
    checkProperty(this, propertyName)
    // create delegate
}
```

In the generated code, the `provideDelegate` method is called to initialize the auxiliary `prop$delegate` property. Compare the generated code for the property declaration `val prop: Type by MyDelegate()` with the generated code above (when the `provideDelegate` method is not present):

```kotlin
class C {
    var prop: Type by MyDelegate()
}

// this code is generated by the compiler
// when the 'provideDelegate' function is available:
class C {
    // calling "provideDelegate" to create the additional "delegate" property
    private val prop$delegate = MyDelegate().provideDelegate(this, this::prop)
    var prop: Type
        get() = prop$delegate.getValue(this, this::prop)
        set(value: Type) = prop$delegate.setValue(this, this::prop, value)
}
```

Note that the `provideDelegate` method affects only the creation of the auxiliary property and doesn't affect the code generated for the getter or the setter.

With the `PropertyDelegateProvider` interface from the standard library, you can create delegate providers without creating new classes.

```kotlin
val provider = PropertyDelegateProvider { thisRef: Any?, property ->
    ReadOnlyProperty<Any?, Int> {_, property -> 42 }
}
val delegate: Int by provider
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

## Packages and imports

A source file may start with a package declaration.

```kotlin
package org.example

fun printMessage(){
    
}

class Message{}
```

All the contents, such as classes and functions, of the source file are included in this package. So, in the example above, the full name of `printMessage()` is `org.example.printMessage`, and the full name of `Message` is `org.example.Message`.

If the package is not specified, the contents of such a file belong to the `default` package with no name.

#### Default imports 

A number of packages are imported into every Kotlin file by default:

- kotlin.*
- kotlin.annotation.*
- kotlin.collections.*
- kotlin.comparisons.*
- kotlin.io.*
- kotlin.ranges.*
- kotlin.sequences.*
- kotlin.text.*

Additional packages are imported depending on the target platform:

- JVM:
  - java.lang.*
  - kotlin.jvm.*
- JS:
  - kotlin.js.*

#### Imports

Apart from the default imports, each file may contain its own `import` directives.

You can import either a single name:

```kotlin
import org.example.Message // Message is now accessible without qualification.
```
or all the accessible contents of a scope: package, class, object, and so on:

```kotlin
import org.example.* // everything in `org.example` becomes accessible
```

If there's a name clash, you can disambiguate by using `as` keyword to locally rename the clashing entity:

```kotlin
import org.example.Message // Message is accessible
import org.test.Message as TestMessage // TestMessage stands for `org.test.Message`
```

The `import` keyword is not restricted to importing classes, you can also use it to import other declarations:

- top-level functions and properties
- functions and properties declared in [object declarations]()
- [enum constants]()

#### Visibility of top-level declarations

If a top-level declaration is marked `private`, it's private to the file it's declared in, see [Visibility modifiers]() 


## Generics: in, out, where

Classes in Kotlin can have type parameters, just like Java:

```kotlin
class Box<T>(t: T) {
    val value = t
}
```

To create an instance of such a class, simply provide the type arguments:

```kotlin
val box= Box<Int>(1)
```
But if the type parameters can be inferred, for example, from the constructor arguments, you can omit the type parameters:

```kotlin
val box = Box(1) // 1 has type Int,  so the compiler figures out that it is Box<Int>
```
#### Variance

One of the trickiest aspects of Java's type system is the wildcard types (see Java Generics FAQ). Kotlin doesn't have these. Instead, Kotlin has declaration-site variance and type projections.

###### **Variance and wildcards in Java**

Let's think about why Java needs these mysterious wildcards. First, generic types in Java is invariant, meaning that `List<String>` is **not** a subtype of `List<Object>`. If `List` were not invariant, it would have been no better than Java`s arrays, as the following code would have complied but causes an exception at runtime:

```java
// Java
List<String> strs = new ArrayList<String>();

// Java reports a type mismatch here at compile-time.
List<Object> objs = strs;

// What if it didn't?
// We would be able to put an Integer into a list of Strings.
objs.add(1);

// And then at runtime, Java would throw
// a ClassCastException: Integer cannot be cast to String
String s = strs.get(0);
```
Java prohibits such things to guarantee runtime safety. But this has implications. For example, consider the `addAll()` method from the Collection interface. What's the signature of this method? Intuitively, you'd write it this way:

```java
// Java
interface Collection<E> ... {
    void addAll(Collection<E> items);
}
```
But then, you would not be able to do the following (which is perfectly safe):

```java
// Java

// The following would not compile with the naive declaration of addAll:
// Collection<String> is not a subtype of Collection<Object>
void copyAll(Collection<Object> to, Collection<String> from) {
    to.addAll(from);
}
```

That's why the actual signature of addAll() is the following:

```java
// Java
interface Collection<E> ... {
    void addAll(Collection<? extends E> items);
}
```
The **wildcard type argument** `? extends E` indicates that this method accepts a collection of objects of `E` or `a subtype of E`, not just `E` itself. This means that you can safely `read` `E`'s from items (elements of this collection are instances of a subclass of E), but `cannot write` to it as you don't know what objects comply with that unknown subtype of `E`.  In return for this limitation, you get the desired behavior: `Collection<String>` is a subtype of `Collection<? extends Object>`. In other words, the wildcard with an `extends`-bound (`upper` bound) makes the type `covariant`. 

The key to understanding why this works is rather simple: if you can only `take` items from a collection, then using a collection of `String`'s and reading `Object`'s from it is fine. Conversely, if you can only `put` items into the collection, it's okay to take a collection of `Object`'s and put `String`'s into it: in Java there is `List<? super String>`, which accepts `String`'s or any of its supertypes.

The latter is called `contravariance`, and you can only call methods that take `String` as an argument on `List<? super String>` (for example, you can call `add(String)` or `set(int, String)`). If you call something that returns` T in List<T>`, you don't get a `String`, but rather an `Object`.

Joshua Bloch, in his book Effective Java, 3rd Edition, explains the problem well (Item 31: "Use bounded wildcards to increase API flexibility"). He gives the name `Producers` to objects you only read from and `Consumers` to those you only write to. 

He then proposes the following mnemonic: `PECS` stands for `Producer-Extends`, `Consumer-Super`.
>If you use a producer-object, say, List<? extends Foo>, you are not allowed to call add() or set() on this object, but this does not mean that it is immutable: for example, nothing prevents you from calling clear() to remove all the items from the list, since clear() does not take any parameters at all.
>
>The only thing guaranteed by wildcards (or other types of variance) is type safety. Immutability is a completely different story.


###### **Declaration-side variance**

Let's suppose that there is a generic interface `Source<T>` that does not have any methods that take `T` as a parameter, only methods that return `T`:

```java
interface Source<T> {
    T nextT();
}
```

Then, it would be perfectly safe to store a reference to an instance of `Source<String>` in a variable of type `Source<Object>` - there are no consumer-methods to call. But Java does not know this, and still prohibits it:

```java
// Java
void demo(Source<String> strs) {
    Source<Object> objects = strs; // !!! Not allowed in Java
    // ...
}
```

To fix this, you should declare objects of the type `Source<? extends Object>`. Doing so is meaningless, because you can call all the same methods on such a variable as before, so there's no value added by the more complex type. But the compiler does not know that.

In Kotlin, there is a way to explain this sort of thing to the compiler. This is called **declaration-site variance**: you can annotate the **type parameter** `T` of `Source` to make sure that it is only **returned**(produced) from members of `Source<T>`, and never consumed. To do this, use `out` modifer:


```kotlin
interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>){
    val objects: Source<Any> = strs // This is OK< since T is an out-parameter
}
```

The general rule is this: when a type parameter `T` of a class `C` is declared `out`, it may occur only in the **out**-position in the members of `C`, but it returns `C<Base>` can safely be a supertype of `C<Derived>`.

In other words, you can say that the class `C` is **covariant** in the parameter `T`, or that `T` is a **covariant** type parameter. You can think of `C` as being a **producer** of `T`'s, and NOT a **consumer** of `T`'s.

The `out` modifier is called a **variance annotation**, and since it is provided at the type parameter declaration site, it provides **declaration-site variance**. This is in contrast with Java's **use-site variance** where wildcards in the type usages make the types covariant.

In additional to `out`, Kotlin providers a complementary variance annotation: `in`. It makes a type parameter **contravariant**, meaning it can only be consumed and never produced. A good example of a contravariant type is `Comparable`:

```kotlin
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 has type Double, which is a subtype of Number
    // Thus, you can assign x to a variable of type Comparable<Double>
    val y: Comparable<Double> = x
}
```

The words **in** and **out** seem to be self-explanatory(as they've already been used successfully in C# for quite some time), so the mnemonic above is not really needed. It can in fact be rephrased at a higher level of abstraction. 


#### Type projections

###### **Use-site variance: type projections**

It's very easy to declare a type parameter `T` as `out` and avoid trouble with subtyping on the use site, but some classes **can't** actually be restricted to only return `T`'s! A good example of this is `Array`:

```kotlin
class Array<T>(val size: Int) {
    operator fun get(index: Int): T {}
    operator fun set(index: Int, value: T) {}
}
```

This class can be neither co- nor contravariant in `T`. And this imposes certain inflexibilities. Consider the following function:

```kotlin
class Array<T>(val size: Int) {
    operator fun get(index: Int): T {}
    operator fun set(index: Int, value: T) {}
}

fun copy(from: Array<Any>, to: Array<Any>) {
    assert((from.size == to.size))
    for (i in from.indices){
        to[i] = from[i]
    }
}
```
This function is supposed to copy items from one array to another. Let's try to apply it in practice:

```kotlin
val ints: Array<Int> = arrayOf(1, 2, 3)
val any = Array<Any>(3) {""}
copy(ints, any)
// type is Array<Int> but Array<Any> was expected.
```
Here you run into the same familiar problem: `Array<T>` is **invariant** in `T`, and neither `Array<Int>` or `Array<Any>` is a subtype of the other. Why not?. Again, this is because `copy` could have an unexpected behavior, for example, it may attempt to write a `String` to `from`, and if you actually pass an array of `Int` there, a `ClassCastExeption` will the thrown later.

To prohibit the `copy` function **writing** to `from`, you can do the following:

```kotlin
fun copy(from: Array<out Any>, to: Array<Any>){}
```

This is **type projection**, which means that `from` is not a simple array, but is rather a restricted(**projected**) one. You can only call methods that return tye type parameter `T`, which in this case means that you can only call `get()`. This is our approach to **use-site variance**, and it corresponds to Java's `Array<? extends Object>` while being slightly simpler.

You can project a type with `in` as well:

```kotlin
fun fill(dest: Array<in String>, value: String){}

```

`Array<in String>` corresponds to Java's `Array<? super String>` This means that you can pass an array of `CharSequence` or an array of `Object` to the `fill()` function.

###### **Star-projections**

Sometimes you want to say that you know nothing about the type argument, but you still want to use it in a safe way. The safe way here is to define such a projection of the generic type, that every concrete instantiation of that generic type will be a subtype of that projection.

Kotlin provides so-called **star-projection** syntax for this:
- For `Foo<out T: TUpper>`, where `T` is a covariant type parameter with the upper bound `TUpper`, Foo<*> is equivalent to `Foo<out TUpper>`. This means that when the `T` is unknown you can safely **read** values of `TUpper` from `Foo<*>`.
- For `Foo<in T>`, where `T` is contravariant type parameter, `Foo<*>` is equivalent to `Foo<in Nothing>`. This means there is nothing you can **write** to `Foo<*>` in a safe way when `T` is unknown.
- For `For<T : TUpper>`, where `T` is an invariant type parameter with the upper bound `TUpper`, `Foo<*>` is equivalent to `Foo<out TUpper>` for reading values and to `Foo<in Nothing>` for writing values.

If a generic type has several type parameters, each of them can be projected independently. For example, if the type is declared as `interface Function<in T, out U` you could use the following star-projections:

- `Function<*, String>` means `Function<in Nothing, String>`.
- `Function<Int, *>` means `Function<Int, out Any?>.`
- `Function<*, *>` means `Function<in Nothing, out Any?>`.

>✨ Star-projections are very much like Java's raw types, but safe.


#### Generic functions

Class aren't the only declarations that can have type parameters. Functions can, too. Type parameters are placed before the name of the function:

```kotlin
fun <T> singletonList(item: T): List<T> {
    
}

fun <T> T.basicToString(): String {} // extension function
```

To call a generic function, specify the type arguments at all the call site after the name of the function:

```kotlin
val l = singtonList<Int>(1)
```

Type arguments can be omitted if they can be inferred from the context, so the following example works as well:

```kotlin
val l = singletonList(1)
```


#### Generic constrains

The set of all possible types that can be substituted for a given type parameter may be restricted by **generic constrains**.

###### **Upper bounds**

The most common type of constraint is an **upper bound**, which corresponds  to Java's `extends` keyword:

```kotlin
fun <T: Comparable<T>> sort(list: List<T>){}
```
The type specified after a colon is the **upper bound**, indicating that only subtype of `Comparable<T>` can be substituted for `T`. For example:

```kotlin
fun <T: Comparable<T>> sort(list: List<T>){}

sort(listOf(1,2,3)) // OK. Int is a subtype of Comparable<Int>

sort(listOf(HashMap<Int,String>())) // Error: HashMap<Int,String> is not a subtype of Comparable<HashMap<Int,String>>
```

The default upper bound(if there was none specified) is `Any?`. Only one upper bound can be specified inside the angle brackets. If the same type parameter needs more than one upper bound, you need a separate **where*-clause:

```kotlin
fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String> 
    where T: CharSequence,
          T: Comparable<T>{
              return list.filter { it > threshold }.map { it.toString() }
  
          }
```

The passes type must satisfy all conditions of the `where` clause simultaneously. In the above example, the `T` type must implement both `CharSequence` and `Comparable`.

#### Definitely non-nullable types

To make interoperability with generic Java classes and interface easier, Kotlin supports declaring a generic type parameter as **definitely non-nullable**.

To declare a generic type `T` as definitely non-nullable, declare the type with `& Any`. For example: `T & Any`.

A definitely non-nullable type must have a nullable upper bound.

The most common use case for declaring definitely only non-nullable type is when you to override a Java method that contains `@NotNull" as an argument. For example, consider the `load()` method:

```java
import org.jetbrains.annotations.*;

public interface Game<T> {
    public T save(T x) {}
    @NotNull
    public T load(@NotNull T x) {}
}
```
To override the `load()` method in Kotlin successfully, you need `T1` to be declared as definitely non-nullable:

```kotlin
interface ArcadeGame<T1> : Game<T1>{
    override fun save(x: T1): T1 
    override fun load(x: T1 & Any) : T1 & Any
}
```
When working only with Kotlin, it's unlikely that you will need to declare definitely non-nullable types explicitly because Kotlin's type inference takes care of this for you.

#### Type erasure

The type safety checks that Kotlin performs for generic declaration usages are done at compile time. At runtime, the instances of generic types do not hold any information about their actual type arguments. The type information is said to be **erased**. For example, the instances of `Foo<Bar>` and `Foo<Baz?>` are erased to just `Foo<*>`.

###### **Generics type checks and casts**

Due to the type erasure, there is no general way to check whether an instance of a generic type was created with certain type arguments at runtime, and the compiler prohibits such `is`- checks such as `ints is List<Int>` or `list is T` (type parameter). However, you can check an instance against a star-projected type:

```kotlin
if (something is List<*>){
    something.forEach { // The items are typed as `Any?`
        println(it)
    }
}
```
Similarly, when you already have the type arguments of an instance checked statically(at the compile time), you can make an `is`-check or a cast that involves the non-generic part of the type. Note that angle brackets are omitted in this case:

```kotlin
fun handleStrings(list: MutableList<String>) {
    if (list is ArrayList) {
        // `list` is smart-cast to `ArrayList<String>`
    }
}
```
The same syntax but with the type arguments omitted can be used for casts that do not take type arguments into account: `list as ArrayList`.

The type arguments of generic function calls are also only checked at compile time. Inside the function bodies, the type parameters cannot be used for type checks, and type casts to type parameters (`foo as T`) are unchecked. The only exclusion is inline functions will reified type parameters, which have their actual arguments inlined at each call site. This enables type checks and casts for type parameters. However, the restrictions described above still apply for instances of generic types used inside checks or casts. For example, in the type check `arg is T`, if `arg` is an instance of a generic type itself, its type arguments are still erased.

```kotlin
inline fun <reified A, reified B> Pair<*, *>.asPairOf(): Pair<A, B>? {
    if (first !is A || second !is B) return null
    return first as A to second as B
}

val somePair: Pair<Any?, Any?> = "items" to listOf(1, 2, 3)


val stringToSomething = somePair.asPairOf<String, Any>()
val stringToInt = somePair.asPairOf<String, Int>()
val stringToList = somePair.asPairOf<String, List<*>>()
val stringToStringList = somePair.asPairOf<String, List<String>>() // Compiles but breaks type safety!

/// stringToSomething = (items, [1, 2, 3])
/// stringToInt = null
/// stringToList = (items, [1, 2, 3])
/// stringToStringList = (items, [1, 2, 3])

```

###### **Unchecked casts**

Type casts to generic types with concrete type arguments such as foo as `List<String>` cannot be checked at runtime.
These unchecked casts can be used when type safety is implied by the high-level program logic but cannot be inferred directly by the compiler. See the example below.

```kotlin
fun readDictionary(file: File): Map<String, *> = file.inputStream().use {
    TODO("Read a mapping of strings to arbitrary elements.")
}

// We saved a map with `Int`s into this file
val intsFile = File("ints.dictionary")

// Warning: Unchecked cast: `Map<String, *>` to `Map<String, Int>`
val intsDictionary: Map<String, Int> = readDictionary(intsFile) as Map<String, Int>
```
A warning appears for the cast in the last line. The compiler can't fully check it at runtime and provides no guarantee that the values in the map are `Int`.

To avoid unchecked casts, you can redesign the program structure. In the example above, you could use the `DictionaryReader<T>` and `DictionaryWriter<T>` interfaces with type-safe implementations for different types. You can introduce reasonable abstractions to move unchecked casts from the call site to the implementation details. Proper use of generic variance can also help.

For generic functions, using reified type parameters makes casts like `arg as T` checked, unless `arg`'s type has its own type arguments that are erased.

An unchecked cast warning can be suppressed by annotating the statement or the declaration where it occurs with `@Suppress("UNCHECKED_CAST")`:

```kotlin
inline fun <reified T> List<*>.asListOfType(): List<T>? =
    if (all { it is T })
        @Suppress("UNCHECKED_CAST")
        this as List<T> else
        null
```
>✨On the JVM: array types (`Array<Foo>`) retain information about the erased type of their elements, and type casts to an array type are partially checked: the nullability and actual type arguments of the element type are still erased. For example, the cast `foo as Array<List<String>?>` will succeed if `foo` is an array holding any `List<*>`, whether it is nullable or not.

#### Underscore operator for type arguments

The underscore operator `_` can be used for type arguments. Use it to automatically infer a type of the argument when other types are explicitly specified:

```kotlin
abstract class SomeClass<T> {
    abstract fun execute() : T
}

class SomeImplementation: SomeClass<String>() {
    override fun execute(): String = "Test"
}

class OtherImplementation: SomeClass<Int>() {
    override fun execute(): Int = 42
}

object Runner {
    inline fun <reified S: SomeClass<T>, T>  run(): T {
        return S::class.java.getDeclaredConstructor().newInstance().execute()
    }
}

fun main(){
    // T is inferred as String because SomeImplementation derives from SomeClass<T>
    val s= Runner.run<SomeImplementation,_>()
    assert(s == "Test")

    // T is inferred as Int because OtherImplementation derives from SomeClass<Int>
    val n = Runner.run<OtherImplementation, _>()
    assert(n == 42)
}
```


## Kotlin for Android

You can benefit from:

- **Less code combined with greater readability:** Spend less time writing your code and working to understand the code of others.
- **Fewer common errors:** Apps built with Kotlin are 20% less likely to crash by on Google's internal data.
- **Kotlin support in Jetpack libraries:** Jetpack Compose is Android's recommended modern toolkit for building native UI in Kotlin. KTX extension and Kotlin language features, like coroutines, extension functions, lambdas, and named parameters to existing Android libraries.
- **Support for multiplatform development:** Kotlin Multiplatform, JetBrain's declarative UI framework based on Kotlin and Jetpack Compose, makes it possible to share UIs across platforms - iOS, Android, desktop, and web.
- **Mature language and environment:** Since ít creation in 2011, Kotlin has developed continuously, not only as a language but as a whole ecosystem with robust tooling. Now it's seamlessly integrated into Android Studio and is actively used by many companies for developing Android application.
- **Interoperability wih Java:** You can use Kotlin along with the Java programming language in your applications without needing to migrate all your code to Kotlin.
- **Easy leaning:** Kotlin is very easy to learn, especially for Java developers.
- **Big community:** Kotlin has great support and many contributions from the community, which is growing all over the world. Over 95% of top thousand Android apps use Kotlin.