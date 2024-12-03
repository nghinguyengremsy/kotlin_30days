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

- [Variable number of arguments (varargs)](#variable-number-of-arguments-varargs)

- [Infix notation](#infix-notation)

- [Function scope](#function-scope):
  - [Local functions](#local-functions)
  - [Member functions](#member-functions)

- [Generic functions](#generic-functions)
- [Tail recursive functions](#tail-recursive-functions)
- [Operator overloading](#operator-overloading):
  - [Unary operations](#unary-operations-):
    - [Unary prefix operations](#unary-prefix-operations)
    - [Increments and decrements](#increments-and-decrements)
  - [Binary operations](#binary-operations):
    - [Arithmetic operators](#arithmetic-operators)
    - [in operator](#in-operator)
    - [Indexed access operator](#indexed-access-operator)
    - [invoke operator](#invoke-operator)
    - [Augmented assignments](#augmented-assignments)
    - [Equality and inequality operators](#equality-and-inequality-operators)
    - [Comparison operators](#comparison-operators)
    - [Property delegation operators](#property-delegation-operators)
  - [Infix calls for named functions](#infix-calls-for-named-functions)


- [Lambdas](#lambdas):
  - [Higher-order functions and lambdas](#higher-order-functions-and-lambdas)
  
  - [Higher-order functions](#higher-order-functions)
  
  - [Function types](#function-types):
  
    - [Instantiating a function type](#instantiating-a-function-type)
    
    - [Invoking a function type instance](#invoking-a-function-type-instance)
    
    - [Inline functions](#inline-functions)
  
  - [Lambda expressions and anonymous functions](#lambda-expressions-and-anonymous-functions):
    - [Lambda expression syntax](#lambda-expression-syntax)
    - [Passing trailing lambdas](#passing-trailing-lambdas)
    - [it: implicit name of a single parameter](#it-implicit-name-of-a-single-parameter)
    - [Returning a value from a lambda expression](#returning-a-value-from-a-lambda-expression)
    - [Underscore for unused variables](#underscore-for-unused-variables)
    - [Destructuring in lambdas](#destructuring-in-lambdas)
    - [Closure](#closure)
    - [Function literals with receiver](#function-literals-with-receiver)
    - [Pass to another function](#pass-to-another-function)
    - [Return from a function](#return-from-a-function)
    - [Invoke separately](#invoke-separately)



- [Inline functions](#inline-functions-1):
  - [noinline](#noinline)
  - [Non-local returns](#non-local-returns)
  - [Reified type parameters](#reified-type-parameters)
  - [Inline properties](#inline-properties)
  - [Restrictions for public API inline functions](#restrictions-for-public-api-inline-functions-)

- [Builders](#builders):
  - [Type-safe builders](#type-safe-builders):
    - [How it works](#how-it-works)
    - [Scope control: @DsiMarker](#scope-control-dsimarker)
    - [Full definition of the com.example.html package](#full-definition-of-the-comexamplehtml-package)
  - [Using builders with builder type inference](#using-builders-with-builder-type-inference):
    - [Writing your own builders](#writing-your-own-builders)
    - [How builder inference works](#how-builder-inference-works)


[Classes](#classes):
- [Constructors](#constructors)
- [Secondary constructors](#secondary-constructors)
- [Create instance](#create-instance)
- [Properties](#properties):
  - [Getters and setters](#getters-and-setters)
  - [Compile-time constants](#compile-time-constants)
  - [Late-initialized properties and variables](#late-initialized-properties-and-variables)
- [Access properties](#access-properties)
- [Member functions](#member-functions-1)
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
- [Use Elvis operator](#use-elvis-operator)
- [Not-null assertion operator](#not-null-assertion-operator)

[Equality](#equality):
- [Structural equality](#structural-equality)
- [Referential equality](#referential-equality)
- [Floating-point number equality](#floating-point-number-equality)
- [Array equality](#array-equality)

[Extensions](#extensions):
- [Extension functions](#extension-functions-)
- [Extensions are resolved statically](#extensions-are-resolved-statically)
- [Nullable receiver](#nullable-receiver)
- [Extension properties](#extension-properties)
- [Companion object extensions](#companion-object-extensions)
- [Scope of extensions](#scope-of-extensions)
- [Declaring extensions as members](#declaring-extensions-as-members)

[Delegation](#delegation):
- [Overriding a member of an interface implemented by delegation](#overriding-a-member-of-an-interface-implemented-by-delegation)

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

[Type aliases](#type-aliases-)

[This expression](#this-expressions):
- [Qualified this](#qualified-this)
- [Implicit this](#implicit-this)


[Annotations](#annotations):
- [Usage](#usage)
- [Constructors](#constructors-2)
- [Instantiation](#instantiation)
- [Lambdas](#lambdas-1)
- [Annotation use-site targets](#annotation-use-side-targets)
- [Java annotations](#java-annotations):
  - [Arrays as annotation parameters](#arrays-as-annotation-parameters)
  - [Accessing properties of an annotation parameters](#accessing-properties-of-an-annotation-parameters)
  - [Ability to not generate JVM 1.8+ annotation targets](#ability-to-not-generate-jvm-18-annotation-targets)
- [Repeatable annotations](#repeatable-annotations)

[Destructuring declarations](#destructuring-declarations):
- [Example: returning two values from a function](#example-returning-two-values-from-a-function)
- [Example: destructuring declarations and maps](#example-destructuring-declarations-and-maps)
- [Underscore for unused variables](#underscore-for-unused-variables-1)
- [Destructuring in lambdas](#destructuring-in-lambdas-1)


[Reflection](#reflection):
- [JVM dependency](#jvm-dependency)
- [Class references](#class-references):
  - [Bound class references](#bound-class-references)
- [Callable references](#callable-references):
  - [Function references](#function-references)
  - [Property references](#property-references)
  - [Interoperability with Java reflection](#interoperability-with-java-reflection)
  - [Constructor references](#constructor-references)
  - [Bound function and property references](#bound-function-and-property-references)
  - [Bound constructor references](#bound-constructor-references)


[Asynchronous programming techniques](#asynchronous-programming-techniques):
- [Threading](#threading)
- [Callbacks](#callbacks)
- [Futures, promises, and others](#futures-promises-and-others)
- [Reactive extensions](#reactive-extensions)
- [Coroutines](#coroutines):
  - [Your first coroutine](#your-first-coroutine)
  - [Extract function refactoring](#extract-function-refactoring)
  - [Scope builder](#scope-builder)
  - [Scope builder and concurrency](#scope-builder-and-concurrency)
  - [An explicit job](#an-explicit-job)
  - [Coroutines are light-weight](#coroutines-are-light-weight)
  - [Cancellation and timeouts](#cancellation-and-timeouts)
  - [Composing suspending functions](#composing-suspending-functions)
  - [Coroutine context and dispatchers](#coroutine-context-and-dispatchers)
  - [Asynchronous Flow](#asynchronous-flow)
  - [Channels](#channels-)
  - [Coroutine exceptions handling](#coroutine-exceptions-handling)
  - [Shared mutable state and concurrency](#shared-mutable-state-and-concurrency)

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
- [Generic functions](#generic-functions-1)
- [Generic constraints](#generic-constrains):
  - [Upper bounds](#upper-bounds)
- [Definitely non-nullable types](#definitely-non-nullable-types)
- [Type erasure](#type-erasure):
  - [Generics type checks and casts](#generics-type-checks-and-casts)
  - [Unchecked casts](#unchecked-casts)
  - [Underscore operator for type arguments](#underscore-operator-for-type-arguments)

[Kotlin for Android](#kotlin-for-android)


# Variables and Data Types

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


# Collections

When programming, it's useful to be able to group data for later processing.
Kotlin provides collections for exactly this purpose.

Kotlin has the following collections for grouping items:

| Collection type | Description |
|----------|----------|
| Lists | Ordered collections of items|
|Sets| Unique unordered collections of items |
| Map | Sets of key-value pairs where keys are unique and map to only one value |

Each collection type can be mutable or read only.

## List

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

# Control Structures

Kotlin has familiar control structures like `if`, `when`, `for` and `while`.

## 1. If Statement:

The `if` statement works just like in many languages, but in Kotlin, it can also be an expression (it returns a value).

```kotlin
val max = if (a > b) a else b
```

## 2. When Expression (similar to switch in other languages):

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

## 3. Ranges  

The most common way to create a range in Kotlin is to use the `..` operator. For example, 1..4 is equivalent to 1, 2, 3 ,4.

To declare a range that doesn't include the end value, use the `..<` operator. For example, 1..<4 is equivalent to 1, 2, 3.

To declare a range in reverse order, use `downTo`. For example, `4 downTo 1` is equivalent to 4, 3, 2, 1.

To declare a range that increments in a step that isn't 1, use `step` and your desired increment value. For example, `1..5 step 2` is equivalent to 1, 3, 5.

You can also do the same with `Char` ranges:

- `'a'..'b'` is equivalent to 'a', 'b', 'c', 'd'
- `'z' downTo 's'` is equivalent to 'z', 'y', 'v', 't'



## 4. `for` loop

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
## 5. `while` loop

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
## 6. `do-while` loop

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


# Functions

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

## Named arguments

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

## Default parameter values

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

## Functions without return 

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

## Single-expression functions 

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

## Early returns in functions


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

## Variable number of arguments (varargs)

You can mark a parameter of a function (usually the last one) with the `vararg` modifier:

```kotlin
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}
```

In this case, you can pass a variable number of arguments to the function:

```kotlin
val list = asList(1, 2, 3)
```

Inside a function, a `vararg`-parameter of type `T` is visible as an array of `T`, as in the example above, where the ts variable has type `Array<out T>`.

Only one parameter can be marked as `vararg`. If a `vararg` parameter is not the last one in the list, values for the subsequent parameters can be passed using named argument syntax, or, if the parameter has a function type, by passing a lambda outside the parentheses.

When you call a `vararg`-function, you can pass arguments individually, for example `asList(1, 2, 3)`. If you already have an array and want to pass its contents to the function, use the **spread** operator (prefix the array with `*`):


```kotlin
val a = arrayOf(1, 2, 3)
val list = asList(-1, 0, *a, 4)
```

If you want to pass a primitive type array into `vararg`, you need to convert it to a regular (typed) array using the `toTypedArray()` function:

```kotlin
val a = intArrayOf(1, 2, 3) // IntArray is a primitive type array
val list = asList(-1, 0, *a.toTypedArray(), 4)
```


## Infix notation

Functions marked with the `infix` keyword can also be called using the infix notation (omitting the dot and the parentheses for the call). Infix functions must meet the following requirements:
- They must be member functions or extension functions.
- They must have a single parameter.
- The parameter must not accept variable number of arguments and must have no default value.

```kotlin
infix fun Int.shl(x: Int): Int { ... }

// calling the function using the infix notation
1 shl 2

// is the same as
1.shl(2)
```
>✨Infix function calls have lower precedence than arithmetic operators, type casts, and the `rangeTo` operator. The following expressions are equivalent:
>   - `1 shl 2 + 3` is equivalent to `1 shl (2 + 3)`
>   - `0 until n * 2` is equivalent to `0 until (n * 2)`
>   - `xs union ys as Set<*>` is equivalent to `xs union (ys as Set<*>)`
> On the other hand, an infix function call's precedence is higher than that of the boolean operators `&&` and `||`, `is` - and in-checks, and some other operators. These expressions are equivalent as well:
>   - `a && b xor c` is equivalent to `a && (b xor c)`
>   - `a xor b in c` is equivalent to `(a xor b) in c`

Note that infix functions always require both the receiver and the parameter to be specified. When you're calling a method on the current receiver using the infix notation, use `this` explicitly. This is required to ensure unambiguous parsing.

```kotlin
class MyStringCollection {
    infix fun add(s: String) { /*...*/ }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
        //add "abc"        // Incorrect: the receiver must be specified
    }
}
```

## Function scope

Kotlin functions can be declared at the top level in a file, meaning you do not need to create a class to hold a function, which you are required to do in languages such as Java, C#, and Scala (top level definition is available since Scala 3). In addition to top level functions, Kotlin functions can also be declared locally as member functions and extension functions.

#### Local functions

Kotlin supports local functions, which are functions inside other functions:

```kotlin
fun dfs(graph: Graph) {
    fun dfs(current: Vertex, visited: MutableSet<Vertex>) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v, visited)
    }

    dfs(graph.vertices[0], HashSet())
}
```

A local function can access local variables of outer functions (the closure). In the case above, visited can be a local variable:

```kotlin
fun dfs(graph: Graph) {
    val visited = HashSet<Vertex>()
    fun dfs(current: Vertex) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v)
    }

    dfs(graph.vertices[0])
}
```

#### Member functions


A member function is a function that is defined inside a class or object:

```kotlin
class Sample {
    fun foo() { print("Foo") }
}
```
Member functions are called with dot notation:

```kotlin
Sample().foo() // creates instance of class Sample and calls foo
```

## Generic functions

Functions can have generic parameters, which are specified using angle brackets before the function name:

```kotlin
fun <T> singletonList(item: T): List<T> { /*...*/ }
```
For more information on generic functions, see [Generics](#generics-in-out-where)


## Tail recursive functions

Kotlin supports a style of functional programming known as tail recursion. For some algorithms that would normally use loops, you can use a recursive function instead without the risk of stack overflow. When a function is marked with the `tailrec` modifier and meets the required formal conditions, the compiler optimizes out the recursion, leaving behind a fast and efficient loop based version instead:

```kotlin
val eps = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
```

This code calculates the `fixpoint` of cosine, which is a mathematical constant. It simply calls `Math.cos` repeatedly starting at `1.0` until the result no longer changes, yielding a result of `0.7390851332151611` for the specified `eps` precision. The resulting code is equivalent to this more traditional style:


```kotlin
val eps = 1E-10 // "good enough", could be 10^-15

private fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (Math.abs(x - y) < eps) return x
        x = Math.cos(x)
    }
}
```

To be eligible for the `tailrec` modifier, a function must call itself as the last operation it performs. You cannot use tail recursion when there is more code after the recursive call, within `try`/`catch`/`finally` blocks, or on open functions. Currently, tail recursion is supported by Kotlin for the JVM and Kotlin/Native.

## Operator overloading


Kotlin allows you to provide custom implementations for the predefined set of operators on types. These operators have predefined symbolic representation (like `+` or `*`) and precedence. To implement an operator, provide a member function or an extension function with a specific name for the corresponding type. This type becomes the left-hand side type for binary operations and the argument type for the unary ones.

To overload an operator, mark the corresponding function with the `operator` modifier:

```kotlin
interface IndexedContainer {
    operator fun get(index: Int)
}
```

When overriding your operator overloads, you can omit operator:

```kotlin
class OrdersList: IndexedContainer {
    override fun get(index: Int) { /*...*/ }
}
```


#### Unary operations 
###### **Unary prefix operations**

| Expression | Translated to |
|----------|-------------|
|`+a`|`a.unaryPlus()`|
|`-a`|`a.unaryMinus()`|
|`!a`|`a.not()`|

This table says that when the compiler processes, for example, an expression `+a`, it performs the following steps:

- Determines the type of `a`, let it be `T`.
- Looks up a function `unaryPlus()` with the operator modifier and no parameters for the receiver `T`, that means a member function or an extension function.
- If the function is absent or ambiguous, it is a compilation error.
- If the function is present and its return type is `R`, the expression `+a` has type `R`.

>✨These operations, as well as all the others, are optimized for basic types and do not introduce overhead of function calls for them.

As an example, here's how you can overload the unary minus operator:

```kotlin
data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

val point = Point(10, 20)

fun main() {
   println(-point)  // prints "Point(x=-10, y=-20)"
}
```

###### **Increments and decrements**

|Expression|Translated to|
|--------|--------|
|`a++`|`a.inc()` + see below|
|`a--`|`a.dec()` + see below|


The `inc()` and `dec()` functions must return a value, which will be assigned to the variable on which the `++` or `--` operation was used. They shouldn't mutate the object on which the `inc` or `dec` was invoked.

The compiler performs the following steps for resolution of an operator in the **postfix** form, for example `a++`:

- Determines the type of `a`, let it be `T`.

- Looks up a function `inc()` with the `operator` modifier and no parameters, applicable to the receiver of type `T`.

- Checks that the return type of the function is a subtype of `T`.

The effect of computing the expression is:

- Store the initial value of `a` to a temporary storage `a0`.

- Assign the result of `a0.inc()` to `a`.

- Return `a0` as the result of the expression.

For `a--` the steps are completely analogous.

For the prefix forms `++a` and `--a` resolution works the same way, and the effect is:

- Assign the result of `a.inc()` to `a`.

- Return the new value of `a` as a result of the expression.

#### Binary operations
###### **Arithmetic operators**

|Expression|Translated to|
|--------|--------|
|`a + b`|`a.plus(b)`|
|`a - b`|`a.minus(b)`|
|`a * b`|`a.times(b)`|
|`a / b`|`a.div(b)`|
|`a % b`|`a.rem(b)`|
|`a..b`|`a.rangeTo(b)`|
|`a..<b`|`a.rangeUntil(b)`|



For the operations in this table, the compiler just resolves the expression in the **Translated to** column.


Below is an example `Counter` class that starts at a given value and can be incremented using the overloaded `+` operator:

```Kotlin
data class Counter(val dayIndex: Int) {
    operator fun plus(increment: Int): Counter {
        return Counter(dayIndex + increment)
    }
}
```

###### **in operator**


|Expression|Translated to|
|--------|--------|
|`a in b`|`b.contains(a)`|
|`a !in b`|`!b.contains(a)`|

For `in` and `!in` the procedure is the same, but the order of arguments is reversed.


###### **Indexed access operator**

|Expression|Translated to|
|--------|--------|
|`a[i]`|`a.get(i)`|
|`a[i, j]`|`a.get(i, j)`|
|`a[i_1, ..., i_n]`|`a.get(i_1, ..., i_n)`|
|`a[i] = b`|`a.set(i, b)`|
|`a[i, j] = b`|`a.set(i, j, b)`|
|`a[i_1, ..., i_n] = b`|`a.set(i_1, ..., i_n, b)`|


Square brackets are translated to calls to `get` and `set` with appropriate numbers of arguments.

###### **invoke operator**

|Expression|Translated to|
|--------|--------|
|`a()`|`a.invoke()`|
|`a(i)`|`a.invoke(i)`|
|`a(i, j)`|`a.invoke(i, j)`|
|`a(i_1, ..., i_n)`|`a.invoke(i_1, ..., i_n)`|

Parentheses are translated to calls to `invoke` with appropriate number of arguments.



###### **Augmented assignments**

|Expression|Translated to|
|--------|--------|
|`a += b`|`a.plusAssign(b)`|
|`a -= b`|`a.minusAssign(b)`|
|`a *= b`|`a.timesAssign(b)`|
|`a /= b`|`a.divAssign(b)`|
|`a %= b`|`a.remAssign(b)`|

For the assignment operations, for example `a += b`, the compiler performs the following steps:

- If the function from the right column is available:
  - If the corresponding binary function (that means `plus()` for `plusAssign()`) is available too, `a` is a mutable variable, and the return type of `plus` is a subtype of the type of `a`, report an error (ambiguity).
  - Make sure its return type is `Unit`, and report an error otherwise.
  - Generate code for `a.plusAssign(b)`.
  - Otherwise, try to generate code for `a = a + b` (this includes a type check: the type of `a + b` must be a subtype of `a`).

>✨Assignments are **NOT** expressions in Kotlin.

###### **Equality and inequality operators**

|Expression|Translated to|
|--------|--------|
|a == b|a?.equals(b) ?: (b === null)|
|a != b|!(a?.equals(b) ?: (b === null))|

These operators only work with the function `equals(other: Any?): Boolean`, which can be overridden to provide custom equality check implementation. Any other function with the same name (like `equals(other: Foo)`) will not be called.

>✨`===` and `!==` (identity checks) are not overloadable, so no conventions exist for them.

The `==` operation is special: it is translated to a complex expression that screens for `null`'s. `null == null` is always true, and `x == null` for a non-null `x` is always false and won't invoke `x.equals()`.


###### **Comparison operators**

|Expression|Translated to|
|--------|--------|
|a > b|a.compareTo(b) > 0|
|a < b|a.compareTo(b) < 0|
|a >= b|a.compareTo(b) >= 0|
|a <= b|a.compareTo(b) <= 0|


All comparisons are translated into calls to `compareTo`, that is required to return `Int`.


###### **Property delegation operators**

`provideDelegate`, `getValue` and `setValue` operator functions are described in [Delegated properties](#delegated-properties-1).

#### Infix calls for named functions

You can simulate custom infix operations by using [infix function calls](#infix-notation).



## Lambdas

#### Higher-order functions and lambdas

Kotlin functions are first-class, which means they can be stored in variables and data structures, and can be passed as arguments to and returned from other higher-order functions. You can perform any operations on functions that are possible for other non-function values.

To facilitate this, Kotlin, as a statically typed programming language, uses a family of function types to represent functions, and provides a set of specialized language constructs, such as lambda expressions.


#### Higher-order functions

A higher-order function is a function that takes functions as parameters, or returns a function.

A good example of a higher-order function is the functional programming idiom `fold` for collections. It takes an accumulator value and a combining function and builds its return value by consecutively combining the current accumulator value with each collection element, replacing the accumulator value each time:

```kotlin
fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}
```

In the code above, the combine parameter has the function type `(R, T) -> R`, so it accepts a function that takes two arguments of types `R` and `T` and returns a value of type `R`. It is invoked inside the `for` loop, and the return value is then assigned to accumulator.

To call `fold`, you need to pass an instance of the function type to it as an argument, and lambda expressions (described in more detail below) are widely used for this purpose at higher-order function call sites:

```kotlin
val items = listOf(1, 2, 3, 4, 5)

// Lambdas are code blocks enclosed in curly braces.
items.fold(0, { 
    // When a lambda has parameters, they go first, followed by '->'
    acc: Int, i: Int -> 
    print("acc = $acc, i = $i, ") 
    val result = acc + i
    println("result = $result")
    // The last expression in a lambda is considered the return value:
    result
})

// Parameter types in a lambda are optional if they can be inferred:
val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

// Function references can also be used for higher-order function calls:
val product = items.fold(1, Int::times)

/// acc = 0, i = 1, result = 1
/// acc = 1, i = 2, result = 3
/// acc = 3, i = 3, result = 6
/// acc = 6, i = 4, result = 10
/// acc = 10, i = 5, result = 15
/// joinedToString = Elements: 1 2 3 4 5
/// product = 120
```

#### Function types

Before you can return a lambda expression from a function, you first need to understand **function types**.

You have already learned about basic types but functions themselves also have a type. Kotlin's type inference can infer a function's type from the parameter type. But there may be times when you need to explicitly specify the function type. The compiler needs the function type so that it knows what is and isn't allowed for that function.

These types have a special notation that corresponds to the signatures of the functions - their parameters and return values:

- Each parameter's type written within parentheses `()` and separated by commas `,`. `(A, B) -> C` denotes a type that represents functions that take two arguments of types `A` and `B` and return a value of type `C`. The list of parameter types may be empty, as in `() -> A`.
- The return type written after `->`. The `Unit` return type cannot be omitted.
- Function types can optionally have an additional **receiver** type, which is specified before the dot in the notation: the type `A.(B) -> C` represents functions that can be called on a receiver object `A` with a parameter `B` and return a value `C`. Function literals with receiver are often used along with these types.
- Suspending functions belong to a special kind of function type that have a suspend modifier in their notation, such as `suspend () -> Unit` or `suspend A.(B) -> C`.

For example: `(String) -> String` or `(Int, Int) -> Int`.

This is what a lambda expression looks like if a function type for `upperCaseString()` is defined:

```kotlin
val upperCaseString: (String) -> String = { text -> text.uppercase()}

fun main() {
    println(upperCaseString("hello")) // HELLO
}
```

The function type notation can optionally include names for the function parameters: `(x: Int, y: Int) -> Point`. These names can be used for documenting the meaning of the parameters.

To specify that a function type is nullable, use parentheses as follows: `((Int, Int) -> Int)?`.

Function types can also be combined using parentheses: `(Int) -> ((Int) -> Unit)`.

>✨The arrow notation is right-associative, `(Int) -> (Int) -> Unit` is equivalent to the previous example, but not to `((Int) -> (Int)) -> Unit`.

You can also give a function type an alternative name by using a type alias:

```kotlin
typealias ClickHandler = (Button, ClickEvent) -> Unit
```

if your lambda expression has no parameter then the parentheses `()` are left empty. For example: `() -> Unit`

>✨You must declare parameter and return types either in the lambda expression or as a function type. Otherwise, the compiler won't be able to know what type your lambda expression is.
>For example, the following won't work:
>   ```kotlin
>   val upperCaseString = { str -> str.uppercase() }
>   ```

###### **Instantiating a function type**

There are several ways to obtain an instance of a function type:

- Use a code block within a function literal, in one of the following forms:
  - a lambda expression: `{ a, b -> a + b }`.
  - an anonymous function: `fun(s: String): Int { return s.toIntOrNull() ?: 0}`.
  
  Function literals with receiver can be used as values of function types with receiver.
- Use a callable reference to an existing declaration:
  - a top-level, local, member, or extension function: `::isOdd`, `String::toInt`
  - a top-level, member, or extension property: `List<Int>::size`.
  - a constructor: `::Regex`

  These include bound callable references that point to a member of a particular instance: `foo::toString`.
- Use instances of a customer class that implements a function type as an interface:

  ```kotlin
  class IntTransformer: (Int) -> Int {
    override operator fun invoke(x: Int): Int = TODO()
  }
  
  val intFunction: (Int) -> Int = IntTransformer()
  ```

The compiler can infer the function types for variables if there is enough information:

```kotlin
val a = { i: Int -> i+ 1} // The inferred type is (Int) -> (Int)
```
    
**Non-literal** values of function types with and without a receiver are interchangeable, so the receiver can stand in for the first parameter, vice versa. For instance, a value of type `(A,B) -> C` can be passed or assigned where a value of type `A.(B) -> C` is expected, and the other way around:

```kotlin
val repeatFun: String.(Int) -> String = { times -> this.repeat(times)}
val twoParameters: (String, Int) -> String = repeatFun

fun runTransformation(f:(String, Int)-> String) : String {
    return f("Hello",3)
}
val result = runTransformation(repeatFun);
val list = listOf("a","a");
val size= list.size
/// result = HelloHelloHello
```

>✨A function type with no receiver is inferred by default, even if a variable is initialized with a reference to an extension function. To alter that, specify the variable type explicitly.


###### **Invoking a function type instance**

A value of a function type can be invoked by using its `invoke(...)` operator: `f.invoke(x)` or just `f(x)`.

If the value has a receiver type, the receiver object should be passed as the first argument.
Another way to invoke a value of a function type with receiver is to prepend it with the receiver object, as if the value were an extension function: `1.foo(2)`.

Example:

```kotlin
val stringPlus: (String, String) -> String = String::plus
val intPlus: Int.(Int) -> Int = Int::plus 

println(stringPlus.invoke("<-", "->"))
println(stringPlus("Hello, ", "world!"))

println(intPlus.invoke(1,1))
println(intPlus(1,2))
println(2.intPlus(3))

/// <-->
/// Hello, world!
/// 2
/// 3
/// 5


```

###### **Inline functions**

Sometimes it's beneficial to use inline functions, which provide flexible control flow, for higher-order functions.



#### Lambda expressions and anonymous functions

Lambda expressions and anonymous functions are **function literals**. Function literals are functions that are not declared but are passed immediately as an expression. Consider the following example:

```kotlin
max(strings, {a, b -> a.length < b.length })

```
The function `max` is a higher-order function, as it takes a function value as its second argument. The second argument is an expression that is itself a function, called a function literal, which is equivalent to the following named function:

```kotlin
fun compare(a: String, b: String): Boolean = a.length < b.length
```
Lambda expressions can be used in a number of ways. You can: 

- Pass a lambda expression as a parameter to another function
- Return a lambda expression from a function
- Invoke a lambda expression on its own

###### **Lambda expression syntax**


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

- The parameters followed by an `->` and have optional type annotations.
- The function body after the `->`.
- If the inferred return type of the lambda is not `Unit`, the last (or possibly single) expression inside the lambda body is treated as the return value.


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

If you leave all the optional annotations out, what's left looks like this:

```kotlin
val sum = { x: Int, y: Int -> x + y }
```

###### **Passing trailing lambdas**

As you have already seen, if a lambda expression is the only function parameter, you can drop the function parentheses `()`. If a lambda expression is passed as the last parameter of a function, then the expression can be written outside the function parentheses `()`. In both cases, this syntax is called a **trailing lambda**.

For example, the [.fold()]() function accepts an initial value and an operation:

```kotlin
// The initial value is zero. 
// The operation sums the initial value with every item in the list cumulatively.
println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

// Alternatively, in the form of a trailing lambda
println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6
```
###### **it: implicit name of a single parameter**

It's very common for a lambda expression to have only one parameter.


If the compiler can parse the signature without any parameters, the parameter does not need to be declared and `->` can be omitted. The parameter will be implicitly declared under the name `it`:

```kotlin
ints.filter { it > 0 } // this literal is of type '(it: Int) -> Boolean'
```


###### **Returning a value from a lambda expression**

You can explicitly return a value from the lambda using the qualified return syntax. Otherwise, the value of the last expression is implicitly returned.

Therefore, the two following snippets are equivalent:

```kotlin
ints.filter {
    val shouldFilter = it > 0
    shouldFilter
}

ints.filter {
    val shouldFilter = it > 0
    return@filter shouldFilter
}
```

This convention, along with passing a lambda expression outside of parentheses, allows for LINQ-style code:


```kotlin
strings.filter { it.length == 5 }.sortedBy { it }.map { it.uppercase() }
```


###### **Underscore for unused variables**

If the lambda parameter is unused, you can place an underscore instead of its name:

```kotlin
map.forEach { (_, value) -> println("$value!") }
```

###### **Destructuring in lambdas**


You can use the destructuring declarations syntax for lambda parameters. If a lambda has a parameter of the `Pair` type (or` Map.Entry`, or any other type that has the appropriate `componentN` functions), you can introduce several new parameters instead of one by putting them in parentheses:

```kotlin
map.mapValues { entry -> "${entry.value}!" }
map.mapValues { (key, value) -> "$value!" }
```

Note the difference between declaring two parameters and declaring a destructuring pair instead of a parameter:

```kotlin
{ a -> ... } // one parameter
{ a, b -> ... } // two parameters
{ (a, b) -> ... } // a destructured pair
{ (a, b), c -> ... } // a destructured pair and another parameter
```

If a component of the destructured parameter is unused, you can replace it with the underscore to avoid inventing its name:

```kotlin
map.mapValues { (_, value) -> "$value!" }
```
You can specify the type for the whole destructured parameter or for a specific component separately:

```kotlin
map.mapValues { (_, value): Map.Entry<Int, String> -> "$value!" }

map.mapValues { (_, value: String) -> "$value!" }
```

###### **Anonymous functions**

The lambda expression syntax above is missing one thing – the ability to specify the function's return type. In most cases, this is unnecessary because the return type can be inferred automatically. However, if you do need to specify it explicitly, you can use an alternative syntax: an anonymous function.

```kotlin
fun(x: Int, y: Int): Int = x + y
```

An anonymous function looks very much like a regular function declaration, except its name is omitted. Its body can be either an expression (as shown above) or a block:

```kotlin
fun(x: Int, y: Int): Int {
    return x + y
} 
````

The parameters and the return type are specified in the same way as for regular functions, except the parameter types can be omitted if they can be inferred from the context:

```kotlin
ints.filter(fun(item) = item > 0)
```

The return type inference for anonymous functions works just like for normal functions: the return type is inferred automatically for anonymous functions with an expression body, but it has to be specified explicitly (or is assumed to be `Unit`) for anonymous functions with a block body.

>✨ When passing anonymous functions as parameters, place them inside the parentheses. The shorthand syntax that allows you to leave the function outside the parentheses works only for lambda expressions.

Another difference between lambda expressions and anonymous functions is the behavior of non-local returns. A `return` statement without a label always returns from the function declared with the `fun` keyword. This means that a `return` inside a lambda expression will return from the enclosing function, whereas a `return` inside an anonymous function will return from the anonymous function itself.

###### **Closure**

A lambda expression or anonymous function (as well as a local function and an object expression) can access its **closure**, which includes the variables declared in the outer scope. The variables captured in the closure can be modified in the lambda:

```kotlin
var sum = 0
ints.filter { it > 0 }.forEach {
    sum += it
}
print(sum)
```

###### **Function literals with receiver**
Function types with receiver, such as` A.(B) -> C`, can be instantiated with a special form of function literals – function literals with receiver.

As mentioned above, Kotlin provides the ability to call an instance of a function type with receiver while providing the **receiver object**.

Inside the body of the function literal, the receiver object passed to a call becomes an implicit `this`, so that you can access the members of that receiver object without any additional qualifiers, or access the receiver object using a `this` expression.

Here is an example of a function literal with receiver along with its type, where plus is called on the receiver object:

```kotlin
val sum: Int.(Int) -> Int = { other -> plus(other) }
```
The anonymous function syntax allows you to specify the receiver type of a function literal directly. This can be useful if you need to declare a variable of a function type with receiver, and then to use it later.  


```kotlin
val sum = fun Int.(other: Int): Int = this + other
```

Lambda expressions can be used as function literals with receiver when the receiver type can be inferred from the context. One of the most important examples of their usage is type-safe builders:

```kotlin
class HTML {
    fun body() { ... }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // create the receiver object
    html.init()        // pass the receiver object to the lambda
    return html
}

html {       // lambda with receiver begins here
    body()   // calling a method on the receiver object
}
```

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


## Inline functions

Using higher-order functions imposes certain runtime penalties: each function is an object, and it captures a closure. A closure is a scope of variables that can be accessed in the body of the function. Memory allocations (both for function objects and classes) and virtual calls introduce runtime overhead.

But it appears that in many cases this kind of overhead can be eliminated by inlining the lambda expressions. The functions shown below are good examples of this situation. The `lock()` function could be easily inlined at call-sites. Consider the following case:


```kotlin
lock(l) { foo() }
```

Instead of creating a function object for the parameter and generating a call, the compiler could emit the following code:

```kotlin
l.lock()
try {
    foo()
} finally {
    l.unlock()
}
```
To make the compiler do this, mark the `lock()` function with the inline modifier:

```kotlin
inline fun <T> lock(lock: Lock, body: () -> T): T { ... }
```

The `inline` modifier affects both the function itself and the lambdas passed to it: all of those will be inlined into the call site.

Inlining may cause the generated code to grow. However, if you do it in a reasonable way (avoiding inlining large functions), it will pay off in performance, especially at "megamorphic" call-sites inside loops.


#### noinline

If you don't want all the lambdas passed to an inline function to be inlined, mark some of your function parameters with the `noinline` modifier:

```kotlin
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) { ... }
```

Inlinable lambdas can only be called inside inline functions or passed as inlinable arguments. `noinline` lambdas, however, can be manipulated in any way you like, including being stored in fields or passed around.


>✨ If an inline function has no inlinable function parameters and no reified type parameters, the compiler will issue a warning, since inlining such functions is very unlikely to be beneficial (you can use the `@Suppress("NOTHING_TO_INLINE")` annotation to suppress the warning if you are sure the inlining is needed).


#### Non-local returns

In Kotlin, you can only use a normal, unqualified `return` to exit a named function or an anonymous function. To exit a lambda, use a label. A bare `return` is forbidden inside a lambda because a lambda cannot make the enclosing function `return`:

```kotlin
fun foo() {
    ordinaryFunction {
        return // ERROR: cannot make `foo` return here
    }
}
```

But if the function the lambda is passed to is inlined, the return can be inlined, as well. So it is allowed:

```kotlin
fun foo() {
    inlined {
        return // OK: the lambda is inlined
    }
}
```

Such returns (located in a lambda, but exiting the enclosing function) are called `non-local` returns. This sort of construct usually occurs in loops, which inline functions often enclose:


```kotlin
fun hasZeros(ints: List<Int>): Boolean {
    ints.forEach {
        if (it == 0) return true // returns from hasZeros
    }
    return false
}
```

Note that some inline functions may call the lambdas passed to them as parameters not directly from the function body, but from another execution context, such as a local object or a nested function. In such cases, non-local control flow is also not allowed in the lambdas. To indicate that the lambda parameter of the inline function cannot use non-local returns, mark the lambda parameter with the `crossinline` modifier:

```kotlin
inline fun f(crossinline body: () -> Unit) {
    val f = object: Runnable {
        override fun run() = body()
    }
    // ...
}
```

>✨ `break` and `continue` are not yet available in inlined lambdas, but we are planning to support them, too.

#### Reified type parameters

Sometimes you need to access a type passed as a parameter:

```kotlin
fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
  var p = parent
  while (p != null && !clazz.isInstance(p)) {
    p = p.parent
  }
  @Suppress("UNCHECKED_CAST")
  return p as T?
}
```

Here, you walk up a tree and use reflection to check whether a node has a certain type. It's all fine, but the call site is not very pretty:

```kotlin
treeNode.findParentOfType(MyTreeNode::class.java)
```

A better solution would be to simply pass a type to this function. You can call it as follows:

```kotlin
treeNode.findParentOfType<MyTreeNode>()
```

To enable this, inline functions support **reified type parameters**, so you can write something like this:

```kotlin
inline fun <reified T> TreeNode.findParentOfType(): T? {
    var p = parent
    while (p != null && p !is T) {
        p = p.parent
    }
    return p as T?
}
```

The code above qualifies the type parameter with the `reified` modifier to make it accessible inside the function, almost as if it were a normal class. Since the function is inlined, no reflection is needed and normal operators like `!is` and `as` are now available for you to use. Also, you can call the function as shown above: `myTree.findParentOfType<MyTreeNodeType>()`.

Though reflection may not be needed in many cases, you can still use it with a reified type parameter:

```kotlin
inline fun <reified T> membersOf() = T::class.members

fun main(s: Array<String>) {
    println(membersOf<StringBuilder>().joinToString("\n"))
}
```

Normal functions (not marked as inline) cannot have reified parameters. A type that does not have a run-time representation (for example, a non-reified type parameter or a fictitious type like `Nothing`) cannot be used as an argument for a reified type parameter.

#### Inline properties

The `inline` modifier can be used on accessors of properties that don't have backing fields. You can annotate individual property accessors:

```kotlin
val foo: Foo
    inline get() = Foo()

var bar: Bar
    get() = ...
    inline set(v) { ... }
```

You can also annotate an entire property, which marks both of its accessors as `inline`:

```kotlin
inline var bar: Bar
    get() = ...
    set(v) { ... }
```

At the call site, inline accessors are inlined as regular inline functions.


#### Restrictions for public API inline functions 


When an inline function is `public` or `protected` but is not a part of a `private` or `internal` declaration, it is considered a module's public API. It can be called in other modules and is inlined at such call sites as well.

This imposes certain risks of binary incompatibility caused by changes in the module that declares an inline function in case the calling module is not re-compiled after the change.

To eliminate the risk of such incompatibility being introduced by a change in a **non**-public API of a module, public API inline functions are not allowed to use non-public-API declarations, i.e. `private` and `internal` declarations and their parts, in their bodies.

An `internal` declaration can be annotated with `@PublishedApi`, which allows its use in public API inline functions. When an `internal` inline function is marked as `@PublishedApi`, its body is checked too, as if it were public.

## Builders

#### Type-safe builders

By using well-named functions as builders in combination with function literals with receiver it is possible to create type-safe, statically-typed builders in Kotlin.

Type-safe builders allow creating Kotlin-based domain-specific languages (DSLs) suitable for building complex hierarchical data structures in a semi-declarative way. Sample use cases for the builders are:

- Generating markup with Kotlin code, such as HTML or XML.

- Configuring routes for a web server: Ktor.

Consider the following code:

```kotlin
import com.example.html.* // see declarations below

fun result() =
    html {
        head {
            title {+"XML encoding with Kotlin"}
        }
        body {
            h1 {+"XML encoding with Kotlin"}
            p  {+"this format can be used as an alternative markup to XML"}

            // an element with attributes and text content
            a(href = "https://kotlinlang.org") {+"Kotlin"}

            // mixed content
            p {
                +"This is some"
                b {+"mixed"}
                +"text. For more see the"
                a(href = "https://kotlinlang.org") {+"Kotlin"}
                +"project"
            }
            p {+"some text"}

            // content generated by
            p {
                for (arg in args)
                    +arg
            }
        }
    }

/// <html>
/// <head>
/// <title>
///         HTML encoding with Kotlin
/// </title>
/// </head>
/// <body>
/// <h1>
///         HTML encoding with Kotlin
/// </h1>
/// <p>
///         this format can be used as an
/// alternative markup to HTML
/// </p>
/// <a href="http://kotlinlang.org">
///         Kotlin
/// </a>
/// <p>
///         This is some
///         <b>
/// mixed
/// </b>
///         text. For more see the
/// <a href="http://kotlinlang.org">
///         Kotlin
/// </a>
///         project
/// </p>
/// <p>
///         some text
/// <ul>
/// <li>
///         1*2 = 2
/// </li>
/// <li>
///         2*2 = 4
/// </li>
/// <li>
///         3*2 = 6
/// </li>
/// <li>
///         4*2 = 8
/// </li>
/// <li>
///         5*2 = 10
/// </li>
/// </ul>
/// </p>
/// </body>
/// </html>

```

This is completely legitimate Kotlin code. You can play with this code online [(modify it and run in the browser) here](https://play.kotlinlang.org/byExample/09_Kotlin_JS/06_HtmlBuilder?_gl=1*1jvex8p*_gcl_au*MjAwNDYzNDA1Ni4xNzI4MzU0OTUx*_ga*MTA4MTA0NTE0Mi4xNzI4MzU0OTQ4*_ga_9J976DJZ68*MTczMTg5Njc2OC4xNDIuMS4xNzMxOTA0NTA0LjQyLjAuMA..).

###### **How it works**

Assume that you need to implement a type-safe builder in Kotlin. First of all, define the model you want to build. In this case you need to model HTML tags. It is easily done with a bunch of classes. For example, `HTML` is a class that describes the `<html>` tag defining children like `<head>` and `<body>`. (See its declaration below.)

Now, let's recall why you can say something like this in the code:

```kotlin
html {
 // ...
}
```

`html` is actually a function call that takes a lambda expression as an argument. This function is defined as follows:

```kotlin
fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}
```
This function takes one parameter named `init`, which is itself a function. The type of the function is `HTML.() -> Unit`, which is a **function type with receiver**. This means that you need to pass an instance of type `HTML` (a **receiver**) to the function, and you can call members of that instance inside the function.


The receiver can be accessed through the `this` keyword:

```kotlin
html {
    this.head { ... }
    this.body { ... }
}
```
(`head` and `body` are member functions of HTML.)

Now, `this` can be omitted, as usual, and you get something that looks very much like a builder already:

```kotlin
public fun getTrafficLightAction(trafficLightState: String): String{
  var trafficAction = ""
  when(trafficLightState){
    "Red"-> trafficAction = "Stop"
    "Yellow"-> trafficAction ="Slow down"
  }
  return trafficAction
}
html {
    head { ... }
    body { ... }
}
```
So, what does this call do? Let's look at the body of `html` function as defined above. It creates a new instance of `HTML`, then it initializes it by calling the function that is passed as an argument (in this example this boils down to calling `head` and `body` on the `HTML` instance), and then it returns this instance. This is exactly what a builder should do.

The `head` and `body` functions in the `HTML` class are defined similarly to `html`. The only difference is that they add the built instances to the `children` collection of the enclosing `HTML` instance:

```kotlin
fun head(init: Head.() -> Unit): Head {
    val head = Head()
    head.init()
    children.add(head)
    return head
}

fun body(init: Body.() -> Unit): Body {
    val body = Body()
    body.init()
    children.add(body)
    return body
}
```

Actually these two functions do just the same thing, so you can have a generic version, `initTag`:

```kotlin
protected fun <T : Element> initTag(tag: T, init: T.() -> Unit): T {
    tag.init()
    children.add(tag)
    return tag
}
```

So, now your functions are very simple:

```kotlin
fun head(init: Head.() -> Unit) = initTag(Head(), init)

fun body(init: Body.() -> Unit) = initTag(Body(), init)
```

And you can use them to build `<head>` and `<body>` tags.
One other thing to be discussed here is how you add text to tag bodies. In the example above you say something like:

```kotlin
html {
    head {
        title {+"XML encoding with Kotlin"}
    }
    // ...
}
```
So basically, you just put a string inside a tag body, but there is this little `+` in front of it, so it is a function call that invokes a prefix `unaryPlus()` operation. That operation is actually defined by an extension function `unaryPlus()` that is a member of the `TagWithText` abstract class (a parent of `Title`):

```kotlin
operator fun String.unaryPlus() {
    children.add(TextElement(this))
}
```
So, what the prefix `+` does here is wrapping a string into an instance of `TextElement` and adding it to the `children` collection, so that it becomes a proper part of the tag tree.


All this is defined in a package `com.example.html` that is imported at the top of the builder example above. In the last section you can read through the full definition of this package.

###### **Scope control: @DsiMarker**

When using DSLs, one might have come across the problem that too many functions can be called in the context. You can call methods of every available implicit receiver inside a lambda and therefore get an inconsistent result, like the tag `head` inside another `head`:

```kotlin
html {
    head {
        head {} // should be forbidden
    }
    // ...
}
```

In this example only members of the nearest implicit receiver `this@head` must be available; `head()` is a member of the outer receiver `this@html`, so it must be illegal to call it.

To address this problem, there is a special mechanism to control receiver scope.

To make the compiler start controlling scopes you only have to annotate the types of all receivers used in the DSL with the same marker annotation. For instance, for HTML Builders you declare an annotation `@HTMLTagMarker`:

```kotlin
@DslMarker
annotation class HtmlTagMarker
```
In our DSL all the tag classes extend the same superclass `Tag`. It's enough to annotate only the superclass with `@HtmlTagMarker` and after that the Kotlin compiler will treat all the inherited classes as annotated:

```kotlin
@HtmlTagMarker
abstract class Tag(val name: String) { ... }
```

You don't have to annotate the `HTML` or `Head` classes with `@HtmlTagMarker` because their superclass is already annotated:


```kotlin
class HTML() : Tag("html") { ... }

class Head() : Tag("head") { ... }
```

After you've added this annotation, the Kotlin compiler knows which implicit receivers are part of the same DSL and allows to call members of the nearest receivers only:

```kotlin
html {
    head {
        head { } // error: a member of outer receiver
    }
    // ...
}
```
Note that it's still possible to call the members of the outer receiver, but to do that you have to specify this receiver explicitly:

```kotlin
html {
    head {
        this@html.head { } // possible
    }
    // ...
}
```


###### **Full definition of the com.example.html package**

This is how the package com.example.html is defined (only the elements used in the example above). It builds an HTML tree. It makes heavy use of extension functions and lambdas with receiver.

```kotlin
package com.example.html

interface Element {
    fun render(builder: StringBuilder, indent: String)
}

class TextElement(val text: String) : Element {
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent$text\n")
    }
}

@DslMarker
annotation class HtmlTagMarker

@HtmlTagMarker
abstract class Tag(val name: String) : Element {
    val children = arrayListOf<Element>()
    val attributes = hashMapOf<String, String>()

    protected fun <T : Element> initTag(tag: T, init: T.() -> Unit): T {
        tag.init()
        children.add(tag)
        return tag
    }

    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent<$name${renderAttributes()}>\n")
        for (c in children) {
            c.render(builder, indent + "  ")
        }
        builder.append("$indent</$name>\n")
    }

    private fun renderAttributes(): String {
        val builder = StringBuilder()
        for ((attr, value) in attributes) {
            builder.append(" $attr=\"$value\"")
        }
        return builder.toString()
    }

    override fun toString(): String {
        val builder = StringBuilder()
        render(builder, "")
        return builder.toString()
    }
}

abstract class TagWithText(name: String) : Tag(name) {
    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}

class HTML : TagWithText("html") {
    fun head(init: Head.() -> Unit) = initTag(Head(), init)

    fun body(init: Body.() -> Unit) = initTag(Body(), init)
}

class Head : TagWithText("head") {
    fun title(init: Title.() -> Unit) = initTag(Title(), init)
}

class Title : TagWithText("title")

abstract class BodyTag(name: String) : TagWithText(name) {
    fun b(init: B.() -> Unit) = initTag(B(), init)
    fun p(init: P.() -> Unit) = initTag(P(), init)
    fun h1(init: H1.() -> Unit) = initTag(H1(), init)
    fun a(href: String, init: A.() -> Unit) {
        val a = initTag(A(), init)
        a.href = href
    }
}

class Body : BodyTag("body")
class B : BodyTag("b")
class P : BodyTag("p")
class H1 : BodyTag("h1")

class A : BodyTag("a") {
    var href: String
        get() = attributes["href"]!!
        set(value) {
            attributes["href"] = value
        }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}
```


#### Using builders with builder type inference
###### **Writing your own builders**
###### **How builder inference works**

# Classes

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

## Constructors

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

## Secondary constructors

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

## Create instance

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


## Properties

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

#### Getters and setters

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
#### Compile-time constants

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
#### Late-initialized properties and variables

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

#### Overriding properties

See [Overriding properties](#overriding-properties-1)

#### Delegated properties

The most common kind of property simply reads from (and maybe writes to) a backing field, but custom getters and setters allow you to use properties so one can implement any sort of behavior of a property. Somewhere in between the simplicity ò the first kind and variety of the second, there are common patterns for what properties can do. A few examples: lazy values, reading from a map by a given key, accessing a database, notifying a listener on access.

Such common behaviors can be implemented as libraries using delegated properties.


## Access properties

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

## Member functions

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

## Data classes

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

#### Properties declared in the class body

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
#### Copying

Use the `copy()` function to copy an object, allowing you to alter **some** of its properties while keeping the rest unchanged. The implementation of this function for the `User` class above would be as follows:

```kotlin
data class User(val name: String = "", val age: Int = 0){
}

fun main() {
    val jack= User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
}
```
#### Data classes and destructuring declarations

Component functions generated for data classes make it possible to use them in destructuring declarations:

```kotlin
val jane = User("Jane",35)
val (name,age) = jane

println("$name, $age years of age")  // Jane, 35 years of age
```

#### Standard data classes

The standard library provides the `Pair` and `Triple` classes. In most cases, though, named data classes are a better design choice because they make the code easier to read by providing meaningful names for the properties.
## Abstract class

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

## Inheritance

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

## Interfaces

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
#### Implementing interfaces

A class or object can implement one or more interfaces:

```kotlin
class Child: MyInterface {
    override fun bar() {
        //body
    }
}
```

#### Properties in interfaces

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

#### Interfaces Inheritance

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

#### Resolving overriding conflicts

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

## Sealed classes and interfaces

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

#### Declare a sealed class or interface

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

#### Inheritance

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


#### Use sealed classes with when expression

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

#### Use case scenarios

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

## Nested and inner classes 

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

#### Inner classes

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


#### Anonymous inner classes

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

## Enum classes

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

#### Anonymous classes

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

#### Implementing interfaces in enum classes

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

#### Working with enum constants

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

## Inline value classes

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


#### Members

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

#### Inheritance

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

#### Representation

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

#### Inline classes vs type aliases

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

#### Inline classes and delegation

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

## Object declaration and expressions

In Kotlin, objects allow you to define a class and create an instance of it in a single step. This is useful when you need either a reusable singleton instance or a one-time object. To handle these scenarios, Kotlin provides two key approaches: **object declarations** for creating singletons and **object expressions** for creating anonymous, one-time objects

>✨ A singleton ensures that a class has only one instance and provides a global point of access to it.

Object declarations and object expression are best used for scenarios when:

- **Using singletons for shared resources**: You need to ensure that only one instance of a class exists throughout the application. For example, managing a database connection pool.
- **Creating factory methods**: You need a convenient way to create instances efficiently. Companion objects allow you to define class-level functions and properties tied to a class, simplifying the creation and management of these instances.
- **Modifying existing class behavior temporarily**: You want to modify the behavior of an existing class without the need to create new subclass. For example, adding temporary functionality to an object for a specific operation.
- **Type-safe design is required**: You require one-time implementations of interfaces or abstract classes using object expressions. This can be useful for scenarios like a button click handler.

#### Object declarations

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


#### Object expressions

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

#### Behavior difference between object declarations and expressions

There are differences in the initialization behavior between object declarations and object expressions:

- Object expressions are executed (and initialized) `immediately`, where they are used.
- Object declarations are initialized `lazily`, when accessed for the first time.
- A companion object is initialized when the corresponding class is loaded (resolved) that matches the semantics of a Java static initializer.

## Overriding methods

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
## Overriding properties

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

## Derived class initialization order

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

## Calling the superclass implementation

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

## Overriding rules

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

## Functional (SAM) interfaces

An interface with only one abstract member function is called a **functional interface**, or a **Single Abstract Method (SAM) interface**. The functional interface can have several non-abstract member functions but only one abstract member function.

To declare a functional interface in Kotlin, use the `fun` modifier.

```kotlin
fun interface KRunnable {
    fun invoke()
}
```

#### SAM conversions

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

#### Migration from an interface with constructor function to a functional interface

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
#### Functional interfaces vs. type aliases

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

# Visibility modifiers

Classes, objects, interfaces, constructors, and functions, as well as properties and their setters, can have **visibility modifiers**. Getters always have the same visibility as their properties.

There are four visibility modifiers in Kotlin: `private`, `protected`, `internal`, and `public`.
The default visibility is `public`.

We will learn how the modifiers apply to different types of declaring scopes.

## Packages

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

## Class member

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

#### Constructors

Use the following syntax to specify the visibility of the primary constructor of a class:

>✨ You need to and an explicit `constructor` keyword.

```kotlin
class C private constructor(a: Int)
```
Here the constructor is `private`. By default, all constructors are `public`, which effectively amounts to them being visible everywhere the class is visible(This means that a constructor of an `internal` class is only visible within the same module).

For sealed classes, constructors are `protected` by default.

#### Local declarations

Local variables, functions, and classes cannot have visibility modifiers.

## Modules

The `internal` visibility modifier means that the member is visible within the same module. More specifically, a module is a set of Kotlin files compiled together, for example:

- An IntelliJ IDEA module.
- A Maven project.
- A Gradle source set (with the exception that the `test` source set can access the internal declarations of `main`).
- A set of files compiled with one invocation of the `<kotlinc>` Ant task.




# Null safety

In Kotlin, it's possible to have a `null` value. Kotlin use `null` values when something is missing or not yet set. You've already seen an example of Kotlin returning a null value in the Collections chapter when you tried to access a key-value pair with a key that does not exist in the map. Although it's useful to use `null` values in this way, you might run into problems if your code isn't prepared to handle them.

To help prevent issues with `null` values in your programs, Kotlin has null safety in place. Null safety detects potential problems with `null` values at compile time, rather than at run time.

Null safety is combination of features that allow you to:

- Explicitly declare when `null` values are allowed in your program.

- Check for `null` values.

- Use safe calls to properties or functions that may contain `null` values.

- Declare actions to take if `null` values are detected.

## Nullable types

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

## Check for null values

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

## Use safe calls

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

## Use Elvis operator

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
## Not-null assertion operator

The not-null assertion operator `!!` converts any value to a non-nullable type.

When you apply the `!!` operator to a variable whose value is not null, it's safely handled as a non-nullable type, and the code executes normally. However, if the value is `null`, the `!!` operator forces it to be treated as non-nullable, which results in an NPE.

When `b` is not null and the `!!` operator makes it return its non-null value (which is a `String` in this example), it accesses `length` correctly:

```kotlin
// Assigns a nullable string to a variable  
val b: String? = "Kotlin"
// Treats b as non-null and accesses its length
val l = b!!.length
println(l)
// 6
```

When `b` is null and the `!!` operator makes it return its non-null value, and an NPE occurs:

```kotlin
// Assigns null to a nullable variable  
val b: String? = null
// Treats b as non-null and tries to access its length
val l = b!!.length
println(l) 
// Exception in thread "main" java.lang.NullPointerException
```

The `!!` operator is particularly useful when you are confident that a value is not `null` and there’s no chance of getting an NPE, but the compiler cannot guarantee this due to certain rules. In such cases, you can use the `!!` operator to explicitly tell the compiler that the value is not `null`.

# Equality

In Kotlin, there are two types of equality:

- `Structural` equality (`==`) - a check for the `equals()` function.
- `Referential` equality (`===`) - a check for two references pointing to the same object


## Structural equality

Structural equality verifies if two objects have the same content or structure. Structural equality is checked by the `==` operation and its negated counterpart `!=`. By convention, an expression like `a == b` is translated to:

```kotlin
a?.equals(b) ?: (b === null)
```

If `a` is not `null`, it calls the `equals(Any?)` function. Otherwise (`a` is null), it checks that `b` is referentially equal to `null`:

```kotlin
fun main() {
    var a = "hello"
    var b = "hello"
    var c = null
    var d = null
    var e = d

    println(a == b)
    // true
    println(a == c)
    // false
    println(c == e)
    // true
}
```

Note that there's no point in optimizing your code when comparing to `null` explicitly: `a == null` will be automatically translated to `a === null`.

In Kotlin, the `equals()` function is inherited by all classes from the `Any` class. By default, the `equals()` function implements referential equality. However, classes in Kotlin can override the `equals()` function to provide a custom equality logic and, in this way, implement structural equality.

Value classes and data classes are two specific Kotlin types that automatically override the `equals()` function. That's why they implement structural equality by default.

However, in the case of data classes, if the `equals()` function is marked as `final` in the parent class, its behavior remains unchanged.

Distinctly, non-data classes (those not declared with the `data` modifier) do not override the `equals()` function by default. Instead, non-data classes implement referential equality behavior inherited from the `Any` class. To implement structural equality, non-data classes require a custom equality logic to override the `equals()` function.

To provide a custom equals check implementation, override the `equals(other: Any?): Boolean` function:

```kotlin
class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point) return false

        // Compares properties for structural equality
        return this.x == other.x && this.y == other.y
    }
}
```

>✨When overriding the equals() function, you should also override the `hashCode()` function to keep consistency between equality and hashing and ensure a proper behavior of these functions.

Functions with the same name and other signatures (like `equals(other: Foo)`) don't affect equality checks with the operators `==` and `!=`.

Structural equality has nothing to do with comparison defined by the `Comparable<...>` interface, so only a custom `equals(Any?)` implementation may affect the behavior of the operator.

## Referential equality

Referential equality verifies the memory addresses of two objects to determine if they are the same instance.

Referential equality is checked by the `===` operation and its negated counterpart `!==`. `a === b` evaluates to true if and only if `a` and `b` point to the same object:

```kotlin
fun main() {
    var a = "Hello"
    var b = a
    var c = "world"
    var d = "world"

    println(a === b)
    // true
    println(a === c)
    // false
    println(c === d)
    // true

}
```
For values represented by primitive types at runtime (for example, `Int`), the `===` equality check is equivalent to the `==` check.

>✨The referential equality is implemented differently in Kotlin/JS. For more information about equality, see the Kotlin/JS documentation.

## Floating-point number equality

When the operands of an equality check are statically known to be `Float` or `Double` (nullable or not), the check follows the IEEE 754 Standard for Floating-Point Arithmetic.

The behavior is different for operands that are not statically typed as floating-point numbers. In these cases, structural equality is implemented. As a result, checks with operands not statically typed as floating-point numbers differ from the IEEE standard. In this scenario:

- `NaN` is equal to itself
- `NaN` is greater than any other element (including `POSITIVE_INFINITY`)
- `-0.0` is not equal to `0.0`

For more information, see Floating-point numbers comparison.

## Array equality

To compare whether two arrays have the same elements in the same order, use `contentEquals()`.

For more information, see Compare arrays.



# Extensions

Kotlin provides the ability to extend a class or an interface with new functionality without have to inherit from the class or use design patterns such as **Decorator**. This is done via a special declarations called **extensions**.

For example, you can write new functions for a class or an interface from a third-party library that you can't modify. Such functions can be called in usual way, as if they were methods of the original class. This mechanism is called an **extension function**. There are also **extension properties** that let you define new properties for existing classes.

## Extension functions

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

## Extensions are resolved statically

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

## Nullable receiver

Note that extensions can be defined with a nullable receiver type. These extensions can be called on an object variable even if its value is null. If the receiver type is `null`, then `this` is also `null`. So when defining an extension with a nullable receiver type, we recommend performing a `this == null` check inside the function body to avoid compiler errors.

You can call `toString()` in Kotlin without checking for `null`, as the check already happens inside the extension function:

```kotlin
fun Any?.toString(): String {
    if (this == null) return "null"
  // After the null check, `this` is autocast to a non-nullable type, so the toString below resolves to the member function of the Any class
  return toString()
}
```

## Extension properties

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

## Companion object extensions

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

## Scope of extensions

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

## Declaring extensions as members

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

## Note on visibility

Extensions utilize the same visibility modifiers as regular functions declared in same scope would. For example:

- An extension declared at the top level of a file has access to the other `private` top-level declarations in the same file.
- If an extension is declared outside its receiver type, it cannot access the receiver's `private` or `protected` members.

# Delegation

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

## Overriding a member of an interface implemented by delegation

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

# Delegated properties

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

## Standard delegates

The Kotlin standard library provides factory methods for several useful kinds of delegates.


#### Lazy properties

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

#### Observable properties

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


## Delegating to another property

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

## Storing properties in a map

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

## Local delegated properties

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

## Property delegate requirements

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

## Translation rules for delegated properties


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



#### Optimized cases for delegated properties

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
  

#### Translation rules when delegating to another property

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

## Providing a delegate

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

# Type aliases 

Type aliases provide alternative names for existing types. If the type name too long you can introduce a different shorter name and use the new one instead.

It's useful to shorten long generic types. For instance, it's often tempting to shrink collection types:

```kotlin
typealias NodeSet = Set<Network.Node>

typealias FileTable<K> = MutableMap<K, MutableList<File>>
```

You can provide different aliases for function types:

```kotlin
typealias  MyHandler = (Int, String, Any) -> Unit

typealias Predicate<T> = (T) -> Boolean
```

You can have new names for inner and nested classes:

```kotlin
class A {
    inner class Inner
}

class B {
    inner class Inner
}

typealias AInner = A.Inner

typealias BInner = B.Inner
```

Type aliases do not introduce new types. They are equivalent to the corresponding underlying types. When you add `typealias Predicate<T>` and use `Predicate<Int>` in your code, the Kotlin compiler always expands it to `(Int) -> Boolean`. Thus you can pass a variable of your type whenever a general function type is required and vice versa:


```kotlin
typealias  Predicate<T> = (T) -> Boolean

fun foo(p: Predicate<Int>) = p (42)


fun main() {
    val f: (Int) -> Boolean = { it > 0}
    println(foo(f)) // true
  
    val p: Predicate<Int> = {it > 0}
    println(listOf(1,-2).filter(p)) // prints [1]
}

```

# This expressions

To denote the current `receiver`, you use `this` expressions:

- In a member of a class, `this` refers to the current object of that class.

- In an extension function or a function literal with receiver `this` denotes the **receiver** parameter that is passed on the left-hand side of a dot.


If `this` has no qualifiers, it refers to the **innermost enclosing scope**. To refer to `this` in other scopes, **label qualifiers** are used.

## Qualified this

To access `this` from an outer scope (a class, extension function, or labeled function literal with receiver) you write `this@label`, where `@label` is a label on the scope `this` is meant to be from:


```kotlin
class A { // implicit label @A
    inner class B { // implicit label @B
        fun Int.foo() { // implicit label @foo
            val a = this@A // A's this
            val b = this@B // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver, a String
            }

            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }
    }
}
```

## Implicit this

When you call a member function on `this`, you can skip the `this`. part. If you have a non-member function with the same name, use this with caution because in some cases it can be called instead:

```kotlin
fun printLine() { println("Top-level function") }

class A {
    fun printLine() { println("Member function") }

    fun invokePrintLine(omitThis: Boolean = false)  { 
        if (omitThis) printLine()
        else this.printLine()
    }
}

A().invokePrintLine() // Member function
A().invokePrintLine(omitThis = true) // Top-level function
```

# Annotations

Annotations are means of attaching metadata to code. To declare an annotation, put the `annotation` modifier in front of a class:

```kotlin
annotation class Fancy
```

Additional attributes of the annotation can be specified by annotating the annotation class with meta-annotations:

- `@Target` specifies the possible kinds of elements which can be annotated with the annotation (such as classes, functions, properties, and expressions).

- `@Retention` specifies whether the annotation is stored in the compiled class files and whether it's visible through reflection at runtime (by default, both are true).

- `@Repeatable` allows using the same annotation on a single element multiple times.

- `@MustBeDocumented` specifies that the annotation is part of the public API and should be included in the class or method signature shown in the generated API documentation.


```kotlin
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
        AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.VALUE_PARAMETER,
        AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy
```



## Usage

```kotlin
@Fancy class Foo {
    @Fancy fun baz(@Fancy foo: Int): Int {
        return (@Fancy 1)
    }
}
```

If you need to annotate the primary constructor of a class, you need to add the `constructor` keyword to the constructor declaration, and add the annotations before it:

```kotlin
class Foo @Inject constructor(dependency: MyDependency) { ... }
```

You can also annotate property accessors:

```kotlin
class Foo {
    var x: MyDependency? = null
        @Inject set
}
```


## Constructors

Annotations can have constructors that take parameters.

```kotlin
annotation class Special(val why: String)

@Special("example") class Foo {}
```

Allowed parameter types are:

- Types that correspond to Java primitive types (Int, Long etc.).

- Strings

- Classes(`Foo::class`)

- Enums

- Other annotations

- Arrays of the types listed above

Annotation parameters cannot have nullable types, because the JVM does not support storing `null` as a value of an annotation attribute.

If an annotation is used as a parameter of another annotation, its name is not prefixed with the `@` character:

```kotlin
annotation class ReplaceWith(val expression: String)

annotation class Deprecated(
        val message: String,
        val replaceWith: ReplaceWith = ReplaceWith(""))

@Deprecated("This function is deprecated, use === instead", ReplaceWith("this === other"))
```

If you need to specify a class as an argument of an annotation, use a Kotlin class (KClass). The Kotlin compiler will automatically convert it to a Java class, so that the Java code can access the annotations and arguments normally.

```kotlin
import kotlin.reflect.KClass

annotation class Ann(val arg1: KClass<*>, val arg2: KClass<out Any>)

@Ann(String::class, Int::class) class MyClass
```

## Instantiation

In Java, an annotation type is a form of an interface, so you can implement it and use an instance. As an alternative to this mechanism, Kotlin lets you call a constructor of an annotation class in arbitrary code and similarly use the resulting instance.

```kotlin
annotation class InfoMarker(val info: String)

fun processInfo(marker: InfoMarker): Unit = TODO()

fun main(args: Array<String>) {
    if (args.isNotEmpty())
        processInfo(getAnnotationReflective(args))
    else
        processInfo(InfoMarker("default"))
}
```

## Lambdas

Annotations can also be used on lambdas. They will be applied to the invoke() method into which the body of the lambda is generated. This is useful for frameworks like Quasar, which uses annotations for concurrency control.

```kotlin
annotation class Suspendable

val f = @Suspendable { Fiber.sleep(10) }
```


## Annotation use-side targets

When you're annotating a property or a primary constructor parameter, there are multiple Java elements which are generated from the corresponding Kotlin element, and therefore multiple possible locations for the annotation in the generated Java bytecode. To specify how exactly the annotation should be generated, use the following syntax:

```kotlin
class Example(@field:Ann val foo,    // annotate Java field
              @get:Ann val bar,      // annotate Java getter
              @param:Ann val quux)   // annotate Java constructor parameter
```

The same syntax can be used to annotate the entire file. To do this, put an annotation with the target `file` at the top level of a file, before the package directive or before all imports if the file is in the default package:

```kotlin
@file:JvmName("Foo")

package org.jetbrains.demo
```

If you have multiple annotations with the same target, you can avoid repeating the target by adding brackets after the target and putting all the annotations inside the brackets:

```kotlin
class Example {
     @set:[Inject VisibleForTesting]
     var collaborator: Collaborator
}
```
The full list of supported use-site targets is:

- `file`
- `property` (annotations with this target are not visible to Java)
- `field`
- `get` (property getter)
- `set` (property setter)
- `receiver` (receiver parameter of an extension function or property)
- `param` (constructor parameter)
- `setparam` (property setter parameter)
- `delegate` (the field storing the delegate instance for a delegated property)

To annotate the receiver parameter of an extension function, use the following syntax:

```kotlin
fun @receiver:Fancy String.myExtension() { ... }
```

If you don't specify a use-site target, the target is chosen according to the `@Target` annotation of the annotation being used. If there are multiple applicable targets, the first applicable target from the following list is used:

- `param`
- `property`
- `field`

## Java annotations

Java annotations are 100% compatible with Kotlin:

```kotlin
import org.junit.Test
import org.junit.Assert.*
import org.junit.Rule
import org.junit.rules.*

class Tests {
    // apply @Rule annotation to property getter
    @get:Rule val tempFolder = TemporaryFolder()

    @Test fun simple() {
        val f = tempFolder.newFile()
        assertEquals(42, getTheAnswer())
    }
}
```
Since the order of parameters for an annotation written in Java is not defined, you can't use a regular function call syntax for passing the arguments. Instead, you need to use the named argument syntax:

```java
// Java
public @interface Ann {
    int intValue();
    String stringValue();
}
```

```kotlin
// Kotlin
@Ann(intValue = 1, stringValue = "abc") class C
```

#### Arrays as annotation parameters

If the `value` argument in Java has an array type, it becomes a `vararg` parameter in Kotlin:

```java
// Java
public @interface AnnWithArrayValue {
    String[] value();
}
```

```kotlin
// Kotlin
@AnnWithArrayValue("abc", "foo", "bar") class C
```


For other arguments that have an array type, you need to use the array literal syntax or `arrayOf(...)`:

```java
// Java
public @interface AnnWithArrayMethod {
    String[] names();
}
```


```kotlin
@AnnWithArrayMethod(names = ["abc", "foo", "bar"])
class C
```

#### Accessing properties of an annotation parameters

Values of an annotation instance are exposed as properties to Kotlin code:

```java
// Java
public @interface Ann {
    int value();
}
```


```kotlin
// Kotlin
fun foo(ann: Ann) {
    val i = ann.value
}
```



#### Ability to not generate JVM 1.8+ annotation targets

If a Kotlin annotation has `TYPE` among its Kotlin targets, the annotation maps to `java.lang.annotation.ElementType.TYPE_USE` in its list of Java annotation targets. This is just like how the `TYPE_PARAMETER` Kotlin target maps to the `java.lang.annotation.ElementType.TYPE_PARAMETER` Java target. This is an issue for Android clients with API levels less than 26, which don't have these targets in the API.

To avoid generating the `TYPE_USE` and `TYPE_PARAMETER` annotation targets, use the new compiler argument `-Xno-new-java-annotation-targets`.

## Repeatable annotations

Just like in Java, Kotlin has repeatable annotations, which can be applied to a single code element multiple times. To make your annotation repeatable, mark its declaration with the `@kotlin.annotation.Repeatable` meta-annotation. This will make it repeatable both in Kotlin and Java. Java repeatable annotations are also supported from the Kotlin side.

The main difference with the scheme used in Java is the absence of a containing annotation, which the Kotlin compiler generates automatically with a predefined name. For an annotation in the example below, it will generate the containing annotation `@Tag.Container`:

```kotlin
@Repeatable
annotation class Tag(val name: String)

// The compiler generates the @Tag.Container containing annotation
```


You can set a custom name for a containing annotation by applying the `@kotlin.jvm.JvmRepeatable` meta-annotation and passing an explicitly declared containing annotation class as an argument:

```kotlin
@JvmRepeatable(Tags::class)
annotation class Tag(val name: String)

annotation class Tags(val value: Array<Tag>)
```

```kotlin
@JvmRepeatable(Tags::class)
annotation class Tag(val name: String)

annotation class Tags(val value: Array<Tag>)
```

To extract Kotlin or Java repeatable annotations via reflection, use the `KAnnotatedElement.findAnnotations()` function.


# Destructuring declarations

Sometimes it is convenient to **destructure** an object into a number of variables, for example:

```kotlin
val (name, age) = person
```
This syntax is called a **destructuring declaration**. A destructuring declaration creates multiple variables at once. You have declared two new variables: `name` and `age`, and can use them independently:

```kotlin
println(name)
println(age)
```
A destructuring declaration is compiled down to the following code:

```kotlin
val name = person.component1()
val age = person.component2()
```

The `component1()` and `component2()` functions are another example of the **principle of conventions** widely used in Kotlin (see operators like `+` and `*`, `for-loops` as an example). Anything can be on the right-hand side of a destructuring declaration, as long as the required number of component functions can be called on it. And, of course, there can be `component3()` and `component4()` and so on.

>✨The `componentN()` functions need to be marked with the `operator` keyword to allow using them in a destructuring declaration.

Destructuring declarations also work in `for`-loops:

```kotlin
for ((a, b) in collection) { ... }
```

Variables `a` and `b` get the values returned by `component1()` and `component2()` called on elements of the collection.

## Example: returning two values from a function

Assume that you need to return two things from a function - for example, a result object and a status of some sort. A compact way of doing this in Kotlin is to declare a data class and return its instance:

```kotlin
data class Result(val result: Int, val status: Status)
fun function(...): Result {
    // computations

    return Result(result, status)
}

// Now, to use this function:
val (result, status) = function(...)
```
Since data classes automatically declare `componentN()` functions, destructuring declarations work here.

>✨You could also use the standard class `Pair` and have `function()` return `Pair<Int, Status>`, but it's often better to have your data named properly.


## Example: destructuring declarations and maps

Probably the nicest way to traverse a map is this:

```kotlin
for ((key, value) in map) {
   // do something with the key and the value
}
```
To make this work, you should:

- Present the map as a sequence of values by providing an `iterator()` function.
- Present each of the elements as a pair by providing functions `component1()` and `component2()`.

And indeed, the standard library provides such extensions:

```kotlin
operator fun <K, V> Map<K, V>.iterator(): Iterator<Map.Entry<K, V>> = entrySet().iterator()
operator fun <K, V> Map.Entry<K, V>.component1() = getKey()
operator fun <K, V> Map.Entry<K, V>.component2() = getValue()
```

So you can freely use destructuring declarations in `for`-loops with maps (as well as collections of data class instances or similar).


## Underscore for unused variables

If you don't need a variable in the destructuring declaration, you can place an underscore instead of its name:

```kotlin
val (_, status) = getResult()
```

The `componentN()` operator functions are not called for the components that are skipped in this way.

## Destructuring in lambdas

You can use the destructuring declarations syntax for lambda parameters. If a lambda has a parameter of `Pair` type (or `Map.Entry`, or any other type that has the appropriate `componentN` function), you can introduce several new parameters instead of one by putting them in parenthese:

```kotlin
map.mapValues { entry -> "${entry.value}"}
map.mapValues { (key, value) -> "$value"}
```

Note the difference between declaring two parameters and declaring a destructuring pair instead of a parameter:

```kotlin
{ a -> ... } // one parameter
{ a, b -> ... } // two parameters
{ (a, b) -> ... } // a destructured pair
{ (a, b), c -> ... } // a destructured pair and another parameter
```

If a component of the destructured parameter is unused, you can replace it with the underscore to avoid inventing its name:

```kotlin
map.mapValues { (_,value) -> "$value"}
```

You can specify the type for the whole destructured parameter or for a specific component separately:

```kotlin
map.mapValues { (_, value): Map.Entry<Int, String> -> "$value"}
map.mapValues{ (_,value: String) -> "$value"}
```

# Reflection

**Reflection** is a set of language and library features that allows you to introspect the structure of your program at runtime. Functions and properties are first-class citizens in Kotlin, and the ability to introspect them (for example, learning the name or the type of a property or function at runtime) is essential when using a functional or reactive style.

>✨ Kotlin/JS provides limited support for reflection features. Learn more about reflection in Kotlin/JS.

## JVM dependency

On the JVM platform, the Kotlin compiler distribution includes the runtime component required for using the reflection features as a separate artifact, `kotlin-reflect.jar`. This is done to reduce the required size of the runtime library for applications that do not use reflection features.

To use reflection in a Gradle or Maven project, add the dependency on `kotlin-reflect`:

- In Gradle:

  ```kotlin
  dependencies {
    implementation(kotlin("reflect"))
  }
  ```

- In Gradle:

  ```kotlin
  <dependencies>
  <dependency>
      <groupId>org.jetbrains.kotlin</groupId>
      <artifactId>kotlin-reflect</artifactId>
  </dependency>
  </dependencies>
  ```

If you don't use Gradle or Maven, make sure you have `kotlin-reflect.jar` in the classpath of your project. In other supported cases (IntelliJ IDEA projects that use the command-line compiler or Ant), it is added by default. In the command-line compiler and Ant, you can use the `-no-reflect` compiler option to exclude `kotlin-reflect.jar` from the classpath.

## Class references

The most basic reflection feature is getting the runtime reference to a Kotlin class. To obtain the reference to a statically known Kotlin class, you can use the **class literal** syntax:

```kotlin
val c = MyClass::class
```

The reference is a `KClass` type value.

>✨ On JVM: a Kotlin class reference is not the same as a Java class reference. To obtain a Java class reference, use the `.java` property on a `KClass` instance.


#### Bound class references

You can get the reference to the class of a specific object with the same `::class` syntax by using the object as a receiver:

```kotlin
val widget: Widget = ...
assert(widget is GoodWidget) { "Bad widget: ${widget::class.qualifiedName}" }
```
You will obtain the reference to the exact class of an object, for example, `GoodWidget` or `BadWidget`, regardless of the type of the receiver expression (`Widget`).


## Callable references

References to functions, properties, and constructors  can also be called or used as instances of function types.

The common supertype for all callable references is `KCallable<out R>`, where `R` is the return value type. It's the property type for properties, and the constructed type for constructors.

#### Function references

When you have a named function declared as below, you can call it directly ( `isOdd(5)` ):

```kotlin
fun isOdd(x: Int) = x % 2 != 0
```


Alternatively, you can use the function as a function type value, that is, pass it to another function. To do so, use the `::` operator:

```kotlin
val numbers = listOf(1, 2, 3)
println(numbers.filter(::isOdd))
```

Here `::isOdd` is a value of function type `(Int) -> Boolean`.

Function references belong to one of the `KFunction<out R>` subtypes, depending on the parameter count. For instance, `KFunction3<T1,T2,T3,R>.

`::` can be used with overloaded functions when the expected type is known from the context. For example:

```kotlin
fun isOdd(x: Int) = x % 2 != 0
fun isOdd(s: String) = s == "brillig" || s == "slighty" || s =="tove"

val numbers = listOf(1,2,3)
println(numbers.filter(::isOdd)) // Refers to isOdd(x: Int)

```

Alternatively, you can provide the necessary context by storing the method reference in a variable with an explicitly specified type:

```kotlin
val predicate: (String) -> Boolean = ::isOdd // Refers to isOdd(x: String)
```

If you need to use a member of a class or an extension function, it needs to be qualified: `String::toCharArray`.

Even if you initialize a variable with a reference to an extension function, the inferred function type will have no receiver, but it will have an additional parameter accepting a receiver object.
To have a function type with a receiver instead, specify the type explicitly:

```kotlin
val isEmptyStringList: List<String>.() -> Boolean = List<String>::isEmpty
```

**Example: function composition**

Consider the following function:

```kotlin
fun <A, B, C> compose(f: (B) -> C, g: (A) -> B) {
  return { x -> f(g(x)) }
}
```

It returns a composition of two functions passed to it: `compose(f,g)= f(g(*))`. You can apply this function to callable references:

```kotlin
fun isOdd(x: Int) = x % 2 != 0
fun length(s:String) = s.length 

val oddLength = compose(::isOdd, ::length)
val strings= listOf("a", "ab", "abc")

println(strings.filter(oddLength) )
```

#### Property references

To access properties as first-class objects in Kotlin, use the `::` operator:

```kotlin
val x = 1

fun main() {
    println(::x.get())
    println(::x.name)
}
```

The expression `::x` evaluates to a `KProperty0<Int>` type property object. You can read its value using `get()` or retrieve the property name using the name property. For more information, see the docs on the `KProperty` class.

For a mutable property such as `var y = 1`, `::y` returns a value with the `KMutableProperty0<Int>` type which has a `set()` method:

```kotlin
var y = 1

fun main() {
    ::y.set(2)
    println(y)
}

/// 2
```

A property reference can be used where a function with a single generic parameter is expected:

```kotlin
val strs = listOf("a", "bc", "def")
println(strs.map(String::length))

/// 1 2 3
```
To access a property that is a member of a class, qualify it as follows:

```kotlin
class A(val p: Int)
var prop= A::p
println(prop.get(A(1)))

/// 1
```

For an extension property: 

```kotlin
val String.testLastChar: Char
  get() = this[length-1]

fun main() {
    println(String::testLastChar.get("abc"))
}

/// c
```

#### Interoperability with Java reflection

On the JVM platform, the standard library contains extensions for reflection classes that provide a mapping to and from Java reflection objects (see package `kotlin.reflect.jvm`). For example, to find a backing field or a Java method that serves as a getter for a Kotlin property, you can write something like this:

```kotlin
import kotlin.reflect.jvm.*

class A(val p: Int)

fun main() {
    println(A::p.javaGetter) // prints "public final int A.getP()"
    println(A::p.javaField)  // prints "private final int A.p"
}
```

To get the Kotlin class that corresponds to a Java class, use the `.kotlin` extension property:

```kotlin
fun getKClass(o: Any): KClass<Any> = o.javaClass.kotlin
```


#### Constructor references

Constructors can be referenced just like methods and properties. You can use them wherever the program expects a function type object that takes the same parameters as the constructor and returns an object of the appropriate type. Constructors are referenced by using the :: operator and adding the class name. Consider the following function that expects a function parameter with no parameters and return type `Foo`:

```kotlin
class Foo

fun function(factory: () -> Foo) {
    val x: Foo = factory()
}
```

Using `::Foo`, the zero-argument constructor of the class Foo, you can call it like this:

```kotlin
function(::Foo)
```
Callable references to constructors are typed as one of the `KFunction<out R>` subtypes depending on the parameter count.

#### Bound function and property references

You can refer to an instance method of a particular object:


```kotlin
val numberRegex = "\\d+".toRegex()
println(numberRegex.matches("29"))

val isNumber = numberRegex::matches
println(isNumber("29"))


/// true
/// true
```

Instead of calling the method `matches` directly, the example uses a reference to it.  It can be called directly (like in the example above) or used whenever a function type expression is expected:

```kotlin
val numberRegex = "\\d+".toRegex()
val strings = listOf("abc", "124", "a70")
println(strings.filter(numberRegex::matches))

/// [124]

```
Compare the types of the bound and the unbound references. The bound callable reference has its receiver "attached" to it, so the type of the receiver is no longer a parameter:

```kotlin
val isNumber: (CharSequence) -> Boolean = numberRegex::matches

val matches: (Regex, CharSequence) -> Boolean = Regex::matches
```

A property reference can be bound as well:

```kotlin
val prop = "abc"::length
println(prop.get())
```

You don't need to specify this as the receiver: this::foo and ::foo are equivalent.


#### Bound constructor references

A bound callable reference to a constructor of an inner class can be obtained by providing an instance of the outer class:

```kotlin
class Outer {
    inner class Inner
}

val o = Outer()
val boundInnerCtor = o::Inner
```


# Asynchronous programming techniques

For decades, as developers we are confronted with a problem to solve - how to prevent our applications from blocking. Whether we're developing desktop, mobile, or even server-side applications, we want to avoid having the user wait or what's worse cause bottlenecks that would prevent an application from scaling.

There have been many approaches to solving this problem, including:

- Threading
- Callbacks
- Futures, promises, and others
- Reactive extensions
- Coroutines


## Threading

Threads are by far probably the most well-known approach to avoid applications from blocking.

```kotlin
fun postItem(item: Item) {
    val token = preparePost()
    val post = submitPost(token, item)
    processPost(post)
}

fun preparePost(): Token {
    // makes a request and consequently blocks the main thread
    return token
}
```

Let's assume in the code above that `preparePost` is a long-running process and consequently would block the user interface. What we can do is launch it in a separate thread. This would then allow us to avoid the UI from blocking. This is a very common technique, but has a series of drawbacks:

- Threads aren't cheap. Threads require context switches which are costly.
- Threads aren't infinite. The number of threads that can be launched is limited by the underlying operating system. In server-side applications, this could cause a major bottleneck.
- Threads aren't always available. Some platforms, such as JavaScript do not even support threads.
- Threads aren't easy. Debugging threads and avoiding race conditions are common problems we suffer in multi-threaded programming.



## Callbacks

With callbacks, the idea is to pass one function as a parameter to another function, and have this one invoked once the process has completed.

```kotlin
fun postItem(item: Item) {
    preparePostAsync { token ->
        submitPostAsync(token, item) { post ->
            processPost(post)
        }
    }
}

fun preparePostAsync(callback: (Token) -> Unit) {
    // make request and return immediately
    // arrange callback to be invoked later
}
```

This in principle feels like a much more elegant solution, but once again has several issues:

- Difficulty of nested callbacks. Usually a function that is used as a callback, often ends up needing its own callback. This leads to a series of nested callbacks which lead to incomprehensible code. The pattern is often referred to as the titled christmas tree (braces represent branches of the tree).
- Error handling is complicated. The nesting model makes error handling and propagation of these somewhat more complicated.

Callbacks are quite common in event-loop architectures such as JavaScript, but even there, generally people have moved away to using other approaches such as promises or reactive extensions.

## Futures, promises, and others

The idea behind futures or promises (there are also other terms these can be referred to depending on language/platform), is that when we make a call, we're promised that at some point it will return with an object called a Promise, which can then be operated on.

```kotlin
fun postItem(item: Item) {
    preparePostAsync()
        .thenCompose { token ->
            submitPostAsync(token, item)
        }
        .thenAccept { post ->
            processPost(post)
        }

}

fun preparePostAsync(): Promise<Token> {
    // makes request and returns a promise that is completed later
    return promise
}
```

This approach requires a series of changes in how we program, in particular:

- Different programming model. Similar to callbacks, the programming model moves away from a top-down imperative approach to a compositional model with chained calls. Traditional program structures such as loops, exception handling, etc. usually are no longer valid in this model.
- Different APIs. Usually there's a need to learn a completely new API such as `thenCompose` or `thenAccept`, which can also vary across platforms.
- Specific return type. The return type moves away from the actual data that we need and instead returns a new type `Promise` which has to be introspected.
- Error handling can be complicated. The propagation and chaining of errors aren't always straightforward.
## Reactive extensions

Reactive Extensions (Rx) were introduced to C# by Erik Meijer. While it was definitely used on the .NET platform it really didn't reach mainstream adoption until Netflix ported it over to Java, naming it RxJava. From then on, numerous ports have been provided for a variety of platforms including JavaScript (RxJS).

The idea behind Rx is to move towards what's called `observable streams` whereby we now think of data as streams (infinite amounts of data) and these streams can be observed. In practical terms, Rx is simply the Observer Pattern with a series of extensions which allow us to operate on the data.

In approach it's quite similar to Futures, but one can think of a Future as returning a discrete element, whereas Rx returns a stream. However, similar to the previous, it also introduces a complete new way of thinking about our programming model, famously phrased as:

```kotlin
"everything is a stream, and it's observable"
```
This implies a different way to approach problems and quite a significant shift from what we're used to when writing synchronous code. One benefit as opposed to Futures is that given it's ported to so many platforms, generally we can find a consistent API experience no matter what we use, be it C#, Java, JavaScript, or any other language where Rx is available.

In addition, Rx does introduce a somewhat nicer approach to error handling.


## Coroutines

Kotlin's approach to working with asynchronous code is using coroutines, which is the idea of suspendable computations, i.e. the idea that a function can suspend its execution at some point and resume later on.

One of the benefits however of coroutines is that when it comes to the developer, writing non-blocking code is essentially the same as writing blocking code. The programming model in itself doesn't really change.

Take for instance the following code:

```kotlin
fun postItem(item: Item) {
    launch {
        val token = preparePost()
        val post = submitPost(token, item)
        processPost(post)
    }
}

suspend fun preparePost(): Token {
    // makes a request and suspends the coroutine
    return suspendCoroutine { /* ... */ }
}
```
This code will launch a long-running operation without blocking the main thread. The `preparePost` is what's called a suspendable function, thus the keyword `suspend` prefixing it. What this means as stated above, is that the function will execute, pause execution and resume at some point in time.

- The function signature remains exactly the same. The only difference is `suspend` being added to it. The return type however is the type we want to be returned.
- The code is still written as if we were writing synchronous code, top-down, without the need of any special syntax, beyond the use of a function called `launch` which essentially kicks off the coroutine (covered in other tutorials).
- The programming model and APIs remain the same. We can continue to use loops, exception handling, etc. and there's no need to learn a complete set of new APIs.
- It is platform independent. Whether we're targeting JVM, JavaScript or any other platform, the code we write is the same. Under the covers the compiler takes care of adapting it to each platform.


Coroutines are not a new concept, let alone invented by Kotlin. They've been around for decades and are popular in some other programming languages such as Go. What is important to note though is that the way they're implemented in Kotlin, most of the functionality is delegated to libraries. In fact, beyond the `suspend` keyword, no other keywords are added to the language. This is somewhat different from languages such as C# that have `async` and `await` as part of the syntax. With Kotlin, these are just library functions.

**Documentation**:
- [Coroutines guide](https://kotlinlang.org/docs/coroutines-guide.html)
- [Basics](https://kotlinlang.org/docs/coroutines-basics.html)
- [Channels](https://kotlinlang.org/docs/channels.html)
- [Coroutine context and dispatchers](https://kotlinlang.org/docs/coroutine-context-and-dispatchers.html)
- [Shared mutable state and concurrency](https://kotlinlang.org/docs/shared-mutable-state-and-concurrency.html)
- [Asynchronous flow](https://kotlinlang.org/docs/flow.html)

**Tutorials**:
- [Asynchronous programming techniques](https://kotlinlang.org/docs/async-programming.html)
- [Introduction to coroutines and channels](https://kotlinlang.org/docs/coroutines-and-channels.html)
- [Debug coroutines using IntelliJ IDEA](https://kotlinlang.org/docs/debug-coroutines-with-idea.html)
- [Debug Kotlin Flow using IntelliJ IDEA – tutorial](https://kotlinlang.org/docs/debug-flow-with-idea.html)
- [Testing Kotlin coroutines on Android](https://developer.android.com/kotlin/coroutines/test)

**Sample projects**:
- [kotlinx.coroutines examples and sources](https://github.com/Kotlin/coroutines-examples/tree/master/examples)
- [KotlinConf app](https://github.com/JetBrains/kotlinconf-app)

#### Your first coroutine

Coroutines can be thought of as light-weight threads, but there is a number of important differences that make their real-life usage very different from threads.

```kotlin
fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}

/// Hello
/// World
```

`launch` is **coroutine builder**. It launches a new coroutine concurrently with the rest of the code, which continues to work independently. That's why `Hello` has been printed first.

`delay` is special **suspending function**. It **suspends** the coroutine for a specific time. Suspending a coroutine does not **block** the underlying thread, but allow other coroutines to run and use the underlying thread for their code.

`runBlocking` is also a coroutine builder that bridges the non-coroutine world of a regular `fun main()` and the code with coroutines inside of `runBlocking {...}` curly braces. This is highlighted in an IDE by `this: CoroutineScope` hint right after the `runBlocking` opening curly brace.

If you remove or forget `runBlocking` in this code, you'll get an error on the `launch` call, since `launch` is declared only on the `CoroutineScope`:

```
Unresolved reference: launch
```

The name of `runBlocking` means that the thread that runs it (in this case — the main thread) gets blocked for the duration of the call, until all the coroutines inside `runBlocking { ... }` complete their execution. You will often see `runBlocking` used like that at the very top-level of the application and quite rarely inside the real code, as threads are expensive resources and blocking them is inefficient and is often not desired.


**Structured concurrency**

Coroutines follow a principle of **structured concurrency** which means that new coroutines can only be launched in a specific `CoroutineScope` which delimits the lifetime of the coroutine. The above example shows that `runBlocking` establishes the corresponding scope and that is why the previous example waits until `World!` is printed after a second's delay and only then exits.

In a real application, you will be launching a lot of coroutines. Structured concurrency ensures that they are not lost and do not leak. An outer scope cannot complete until all its children coroutines complete. Structured concurrency also ensures that any errors in the code are properly reported and are never lost.

#### Extract function refactoring

Let's extract the block of code inside `launch { ... }` into a separate function. When you perform "Extract function" refactoring on this code, you get a new function with the `suspend` modifier. This is your first **suspending function**. Suspending functions can be used inside coroutines just like regular functions, but their additional feature is that they can, in turn, use other suspending functions (like delay in this example) to `suspend` execution of a coroutine.

```kotlin
fun main() = runBlocking { // this: CoroutineScope
    launch { doWorld() }
    println("Hello")
}

// this is your first suspending function
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}
```

#### Scope builder

In addition to the coroutine scope provided by different builders, it is possible to declare your own scope using the coroutineScope builder. It creates a coroutine scope and does not complete until all launched children complete.

runBlocking and coroutineScope builders may look similar because they both wait for their body and all its children to complete. The main difference is that the runBlocking method **blocks** the current thread for waiting, while coroutineScope just suspends, releasing the underlying thread for other usages. Because of that difference, runBlocking is a regular function and coroutineScope is a suspending function.

You can use `coroutineScope` from any suspending function. For example, you can move the concurrent printing of `Hello` and `World` into a `suspend fun doWorld()` function:

```kotlin
fun main() = runBlocking {
    doWorld()
}

suspend fun doWorld() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}
```


#### Scope builder and concurrency

A coroutineScope builder can be used inside any suspending function to perform multiple concurrent operations. Let's launch two concurrent coroutines inside a `doWorld` suspending function:

````kotlin
// Sequentially executes doWorld followed by "Done"
fun main() = runBlocking {
    doWorld()
    println("Done")
}

// Concurrently executes both sections
suspend fun doWorld() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}


/// Hello
/// World 1
/// World 2
/// Done
````


Both pieces of code inside `launch { ... }` blocks execute concurrently, with `World 1` printed first, after a second from start, and `World 2` printed next, after two seconds from start. A `coroutineScope` in `doWorld` completes only after both are complete, so `doWorld` returns and allows `Done` string to be printed only after that:

#### An explicit job

A launch coroutine builder returns a `Job` object that is a handle to the launched coroutine and can be used to explicitly wait for its completion. For example, you can wait for completion of the child coroutine and then print "Done" string:

```kotlin
val job = launch {
    // launch a new coroutine and keep a reference to its Job
    delay(1000L)
    println("World!")
}

println("Hello")
job.join() // wait until child coroutine completes
println("Done")
```

#### Coroutines are light-weight

Coroutines are less resource-intensive than JVM threads. Code that exhausts the JVM's available memory when using threads can be expressed using coroutines without hitting resource limits. For example, the following code launches 50,000 distinct coroutines that each waits 5 seconds and then prints a period ('.') while consuming very little memory:

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    repeat(50_000) { // launch a lot of coroutines
        launch {
            delay(5000L)
            print(".")
        }
    }
}
```

If you write the same program using threads (remove `runBlocking`, replace `launch` with `thread`, and replace `delay` with `Thread.sleep`), it will consume a lot of memory. Depending on your operating system, JDK version, and its settings, it will either throw an out-of-memory error or start threads slowly so that there are never too many concurrently running threads.

#### Cancellation and timeouts

###### **Cancelling coroutine execution**

In a long-running application you might need fine-grained control on your background coroutines. For example, a user might have closed the page that launched a coroutine and now its result is no longer needed and its operation can be cancelled. The launch function returns a Job that can be used to cancel the running coroutine:

````kotlin
val job = launch {
    repeat(1000) { i ->
        println("job: I'm sleeping $i ...")
        delay(500L)
    }
}
delay(1300L) // delay a bit
println("main: I'm tired of waiting!")
job.cancel() // cancels the job
job.join() // waits for job's completion 
println("main: Now I can quit.")
````

Output: 

```
job: I'm sleeping 0 ...
job: I'm sleeping 1 ...
job: I'm sleeping 2 ...
main: I'm tired of waiting!
main: Now I can quit.
```

As soon as main invokes `job.cancel`, we don't see any output from the other coroutine because it was cancelled. There is also a Job extension function cancelAndJoin that combines cancel and join invocations.

###### **Cancellation is cooperative**

Coroutine cancellation is **cooperative**. A coroutine code has to cooperate to be cancellable. All the suspending functions in `kotlinx.coroutines` are **cancellable**. They check for cancellation of coroutine and throw `CancellationException` when cancelled. However, if a coroutine is working in a computation and does not check for cancellation, then it cannot be cancelled, like the following example shows:

```kotlin
val startTime = System.currentTimeMillis()
val job = launch(Dispatchers.Default) {
    var nextPrintTime = startTime
    var i = 0
    while (i < 5) { // computation loop, just wastes CPU
        // print a message twice a second
        if (System.currentTimeMillis() >= nextPrintTime) {
            println("job: I'm sleeping ${i++} ...")
            nextPrintTime += 500L
        }
    }
}
delay(1300L) // delay a bit
println("main: I'm tired of waiting!")
job.cancelAndJoin() // cancels the job and waits for its completion
println("main: Now I can quit.")
```

Output:

```
job: I'm sleeping 0 ...
job: I'm sleeping 1 ...
job: I'm sleeping 2 ...
main: I'm tired of waiting!
job: I'm sleeping 3 ...
job: I'm sleeping 4 ...
main: Now I can quit.
```

Run it to see that it continues to print "I'm sleeping" even after cancellation until the job completes by itself after five iterations.

The same problem can be observed by catching a CancellationException and not rethrowing it:

```kotlin
val job = launch(Dispatchers.Default) {
    repeat(5) { i ->
        try {
            // print a message twice a second
            println("job: I'm sleeping $i ...")
            delay(500)
        } catch (e: Exception) {
            // log the exception
            println(e)
        }
    }
}
delay(1300L) // delay a bit
println("main: I'm tired of waiting!")
job.cancelAndJoin() // cancels the job and waits for its completion
println("main: Now I can quit.")
```

```
job: I'm sleeping 0 ...
job: I'm sleeping 1 ...
job: I'm sleeping 2 ...
main: I'm tired of waiting!
kotlinx.coroutines.JobCancellationException: StandaloneCoroutine was cancelled; job="coroutine#2":StandaloneCoroutine{Cancelling}@1fea1ce6
job: I'm sleeping 3 ...
kotlinx.coroutines.JobCancellationException: StandaloneCoroutine was cancelled; job="coroutine#2":StandaloneCoroutine{Cancelling}@1fea1ce6
job: I'm sleeping 4 ...
kotlinx.coroutines.JobCancellationException: StandaloneCoroutine was cancelled; job="coroutine#2":StandaloneCoroutine{Cancelling}@1fea1ce6
main: Now I can quit.
```

While catching Exception is an anti-pattern, this issue may surface in more subtle ways, like when using the `runCatching` function, which does not rethrow CancellationException.


###### **Making computation code cancellable**

There are two approaches to making computation code cancellable. The first one is to periodically invoke a suspending function that checks for cancellation. There is a yield function that is a good choice for that purpose. The other one is to explicitly check the cancellation status. Let us try the latter approach.

Replace `while (i < 5)` in the previous example with `while (isActive)` and rerun it.

```kotlin
val startTime = System.currentTimeMillis()
val job = launch(Dispatchers.Default) {
    var nextPrintTime = startTime
    var i = 0
    while (isActive) { // cancellable computation loop
        // print a message twice a second
        if (System.currentTimeMillis() >= nextPrintTime) {
            println("job: I'm sleeping ${i++} ...")
            nextPrintTime += 500L
        }
    }
}
delay(1300L) // delay a bit
println("main: I'm tired of waiting!")
job.cancelAndJoin() // cancels the job and waits for its completion
println("main: Now I can quit.")
```

Output:

```
job: I'm sleeping 0 ...
job: I'm sleeping 1 ...
job: I'm sleeping 2 ...
main: I'm tired of waiting!
main: Now I can quit.
```

As you can see, now this loop is cancelled. isActive is an extension property available inside the coroutine via the CoroutineScope object.

###### **Closing resources with finally**

Cancellable suspending functions throw `CancellationException` on cancellation, which can be handled in the usual way. For example, the `try {...} finally {...}` expression and Kotlin's use function execute their finalization actions normally when a coroutine is cancelled:

```kotlin
val job = launch {
    try {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    } finally {
        println("job: I'm running finally")
    }
}
delay(1300L) // delay a bit
println("main: I'm tired of waiting!")
job.cancelAndJoin() // cancels the job and waits for its completion
println("main: Now I can quit.")
```

Output: 

```
job: I'm sleeping 0 ...
job: I'm sleeping 1 ...
job: I'm sleeping 2 ...
main: I'm tired of waiting!
job: I'm running finally
main: Now I can quit.
```

###### **Run non-cancellable block**

Any attempt to use a suspending function in the `finally` block of the previous example causes CancellationException, because the coroutine running this code is cancelled.
Usually, this is not a problem, since all well-behaving closing operations (closing a file, cancelling a job, or closing any kind of a communication channel) are usually non-blocking and do not involve any suspending functions. However, in the rare case when you need to suspend in a cancelled coroutine you can wrap the corresponding code in `withContext(NonCancellable) {...}` using withContext function and NonCancellable context as the following example shows:

```kotlin
val job = launch {
    try {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    } finally {
        withContext(NonCancellable) {
            println("job: I'm running finally")
            delay(1000L)
            println("job: And I've just delayed for 1 sec because I'm non-cancellable")
        }
    }
}
delay(1300L) // delay a bit
println("main: I'm tired of waiting!")
job.cancelAndJoin() // cancels the job and waits for its completion
println("main: Now I can quit.")
```

Output: 

```
job: I'm sleeping 0 ...
job: I'm sleeping 1 ...
job: I'm sleeping 2 ...
main: I'm tired of waiting!
job: I'm running finally
job: And I've just delayed for 1 sec because I'm non-cancellable
main: Now I can quit.
```

###### **Timeout**

The most obvious practical reason to cancel execution of a coroutine is because its execution time has exceeded some timeout. While you can manually track the reference to the corresponding Job and launch a separate coroutine to cancel the tracked one after delay, there is a ready to use `withTimeout` function that does it. Look at the following example:

```kotlin
withTimeout(1300L) {
    repeat(1000) { i ->
        println("I'm sleeping $i ...")
        delay(500L)
    }
}
```

Output:

``` 
I'm sleeping 0 ...
I'm sleeping 1 ...
I'm sleeping 2 ...
Exception in thread "main" kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 1300 ms
 at _COROUTINE._BOUNDARY._ (CoroutineDebugging.kt:46) 
 at FileKt$main$1$1.invokeSuspend (File.kt:-1) 
 at FileKt$main$1.invokeSuspend (File.kt:-1) 
Caused by: kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 1300 ms
at kotlinx.coroutines.TimeoutKt .TimeoutCancellationException(Timeout.kt:191)
at kotlinx.coroutines.TimeoutCoroutine .run(Timeout.kt:159)
at kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask .run(EventLoop.common.kt:501)
```

The `TimeoutCancellationException` that is thrown by `withTimeout` is a subclass of CancellationException. We have not seen its stack trace printed on the console before. That is because inside a cancelled coroutine CancellationException is considered to be a normal reason for coroutine completion. However, in this example we have used `withTimeout` right inside the `main` function.

Since cancellation is just an exception, all resources are closed in the usual way. You can wrap the code with timeout in a `try {...} catch (e: TimeoutCancellationException) {...}` block if you need to do some additional action specifically on any kind of timeout or use the `withTimeoutOrNull` function that is similar to `withTimeout` but returns `null` on timeout instead of throwing an exception:

```kotlin
val result = withTimeoutOrNull(1300L) {
    repeat(1000) { i ->
        println("I'm sleeping $i ...")
        delay(500L)
    }
    "Done" // will get cancelled before it produces this result
}
println("Result is $result")
```

Output:
```
I'm sleeping 0 ...
I'm sleeping 1 ...
I'm sleeping 2 ...
Result is null
```

###### **Asynchronous timeout and resources**

The timeout event in withTimeout is asynchronous with respect to the code running in its block and may happen at any time, even right before the return from inside the timeout block. Keep this in mind if you open or acquire some resource inside the block that needs closing or release outside the block.

For example, here we imitate a closeable resource with the `Resource` class that simply keeps track of how many times it was created by incrementing the `acquired` counter and decrementing the `counter` in its close function.  Now let us create a lot of coroutines, each of which creates a `Resource` at the end of the `withTimeout` block and releases the resource outside the block. We add a small delay so that it is more likely that the timeout occurs right when the `withTimeout` block is already finished, which will cause a resource leak.

```kotlin
var acquired = 0

class Resource {
    init { acquired++ } // Acquire the resource
    fun close() { acquired-- } // Release the resource
}

fun main() {
    runBlocking {
        repeat(10_000) { // Launch 10K coroutines
            launch { 
                val resource = withTimeout(60) { // Timeout of 60 ms
                    delay(50) // Delay for 50 ms
                    Resource() // Acquire a resource and return it from withTimeout block     
                }
                resource.close() // Release the resource
            }
        }
    }
    // Outside of runBlocking all coroutines have completed
    println(acquired) // Print the number of resources still acquired
}
```

If you run the above code, you'll see that it does not always print zero, though it may depend on the timings of your machine. You may need to tweak the timeout in this example to actually see non-zero values.

>✨ Note that incrementing and decrementing `acquired` counter here from 10K coroutines is completely thread-safe, since it always happens from the same thread, the one used by `runBlocking`. More on that will be explained in the chapter on coroutine context.

```kotlin
runBlocking {
    repeat(10_000) { // Launch 10K coroutines
        launch { 
            var resource: Resource? = null // Not acquired yet
            try {
                withTimeout(60) { // Timeout of 60 ms
                    delay(50) // Delay for 50 ms
                    resource = Resource() // Store a resource to the variable if acquired      
                }
                // We can do something else with the resource here
            } finally {  
                resource?.close() // Release the resource if it was acquired
            }
        }
    }
}
// Outside of runBlocking all coroutines have completed
println(acquired) // Print the number of resources still acquired
```

#### Composing suspending functions

###### **Sequential by default**


Assume that we have two suspending functions defined elsewhere that do something useful like some kind of remote service call or computation. We just pretend they are useful, but actually each one just delays for a second for the purpose of this example:

```kotlin
suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}
```

What do we do if we need them to be invoked **sequentially** — first `doSomethingUsefulOne` and then `doSomethingUsefulTwo`, and compute the sum of their results? In practice, we do this if we use the result of the first function to make a decision on whether we need to invoke the second one or to decide on how to invoke it.

We use a normal sequential invocation, because the code in the coroutine, just like in the regular code, is **sequential** by default. The following example demonstrates it by measuring the total time it takes to execute both suspending functions:

```kotlin
val time = measureTimeMillis {
    val one = doSomethingUsefulOne()
    val two = doSomethingUsefulTwo()
    println("The answer is ${one + two}")
}
println("Completed in $time ms")
```

Output:

```
The answer is 42
Completed in 2016 ms
```

###### **Concurrent using async**

What if there are no dependencies between invocations of `doSomethingUsefulOne` and `doSomethingUsefulTwo` and we want to get the answer faster, by doing both **concurrently**? This is where async comes to help.

Conceptually, `async` is just like `launch`. It starts a separate coroutine which is a light-weight thread that works concurrently with all the other coroutines. The difference is that `launch` returns a Job and does not carry any resulting value, while `async` returns a `Deferred` — a light-weight non-blocking future that represents a promise to provide a result later. You can use `.await()` on a deferred value to get its eventual result, but `Deferred` is also a `Job`, so you can cancel it if needed.

```kotlin
val time = measureTimeMillis {
    val one = async { doSomethingUsefulOne() }
    val two = async { doSomethingUsefulTwo() }
    println("The answer is ${one.await() + two.await()}")
}
println("Completed in $time ms")
```

Output:

```
The answer is 42
Completed in 1026 ms
```

This is twice as fast, because the two coroutines execute concurrently. Note that concurrency with coroutines is always explicit.

###### **Lazily started async** 

Optionally, `async` can be made lazy by setting its start parameter to CoroutineStart.LAZY. In this mode it only starts the coroutine when its result is required by `await`, or if its `Job`'s start function is invoked. Run the following example:

```kotlin
val time = measureTimeMillis {
  val one = async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
  val two = async(start = CoroutineStart.LAZY) { doSomethingUsefulTwo() }
  // some computation
  one.start() // start the first one
  two.start() // start the second one
  println("The answer is ${one.await() + two.await()}")
}
println("Completed in $time ms")
```
Output: 
```
The answer is 42
Completed in 1022 ms
```

So, here the two coroutines are defined but not executed as in the previous example, but the control is given to the programmer on when exactly to start the execution by calling start. We first start `one`, then start `two`, and then await for the individual coroutines to finish.

Note that if we just call `await` in println without first calling `start` on individual coroutines, this will lead to sequential behavior, since `await` starts the coroutine execution and waits for its finish, which is not the intended use-case for laziness. The use-case for `async(start = CoroutineStart.LAZY)` is a replacement for the standard lazy function in cases when computation of the value involves suspending functions.

###### **Async-style functions**

>✨ This programming style with async functions is provided here only for illustration, because it is a popular style in other programming languages. Using this style with Kotlin coroutines is **strongly discouraged** for the reasons explained below.

We can define async-style functions that invoke `doSomethingUsefulOne` and `doSomethingUsefulTwo` **asynchronously** using the async coroutine builder using a GlobalScope reference to opt-out of the structured concurrency.
We name such functions with the "...Async" suffix to highlight the fact that they only start asynchronous computation and one needs to use the resulting deferred value to get the result.

>✨ GlobalScope is a delicate API that can backfire in non-trivial ways, one of which will be explained below, so you must explicitly opt-in into using `GlobalScope` with `@OptIn(DelicateCoroutinesApi::class)`.

```kotlin
// The result type of somethingUsefulOneAsync is Deferred<Int>
@OptIn(DelicateCoroutinesApi::class)
fun somethingUsefulOneAsync() = GlobalScope.async {
    doSomethingUsefulOne()
}

// The result type of somethingUsefulTwoAsync is Deferred<Int>
@OptIn(DelicateCoroutinesApi::class)
fun somethingUsefulTwoAsync() = GlobalScope.async {
    doSomethingUsefulTwo()
}
```

Note that these `xxxAsync` functions are **not suspending** functions. They can be used from anywhere. However, their use always implies asynchronous (here meaning **concurrent**) execution of their action with the invoking code.

The following example shows their use outside of coroutine:

```kotlin

// note that we don't have `runBlocking` to the right of `main` in this example
fun main() {
  val time = measureTimeMillis {
    // we can initiate async actions outside of a coroutine
    val one = somethingUsefulOneAsync()
    val two = somethingUsefulTwoAsync()
    // but waiting for a result must involve either suspending or blocking.
    // here we use `runBlocking { ... }` to block the main thread while waiting for the result
    runBlocking {
      println("The answer is ${one.await() + two.await()}")
    }
  }
  println("Completed in $time ms")
}

```

Output: 

```
The answer is 42
Completed in 1125 ms
```

Consider what happens if between the val `one = somethingUsefulOneAsync()` line and `one.await()` expression there is some logic error in the code, and the program throws an exception, and the operation that was being performed by the program aborts. Normally, a global error-handler could catch this exception, log and report the error for developers, but the program could otherwise continue doing other operations. However, here we have `somethingUsefulOneAsync` still running in the background, even though the operation that initiated it was aborted. This problem does not happen with structured concurrency, as shown in the section below.


###### **Structured concurrency with async**

Let us take the Concurrent using async example and extract a function that concurrently performs `doSomethingUsefulOne` and `doSomethingUsefulTwo` and returns the sum of their results. Because the async coroutine builder is defined as an extension on CoroutineScope, we need to have it in the scope and that is what the coroutineScope function provides:

```kotlin
suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethingUsefulOne() }
    val two = async { doSomethingUsefulTwo() }
    one.await() + two.await()
}
```

This way, if something goes wrong inside the code of the `concurrentSum` function, and it throws an exception, all the coroutines that were launched in its scope will be cancelled.

```kotlin
val time = measureTimeMillis {
    println("The answer is ${concurrentSum()}")
}
println("Completed in $time ms")
```
Output:

```
The answer is 42
Completed in 1026 ms
```

Cancellation is always propagated through coroutine's hierarchy:

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    try {
        failedConcurrentSum()
    } catch(e: ArithmeticException) {
        println("Computation failed with ArithmeticException")
    }
}

suspend fun failedConcurrentSum(): Int = coroutineScope {
    val one = async<Int> { 
        try {
            delay(Long.MAX_VALUE) // Emulates very long computation
            42
        } finally {
            println("First child was cancelled")
        }
    }
    val two = async<Int> { 
        println("Second child throws an exception")
        throw ArithmeticException()
    }
    one.await() + two.await()
}
```

Note how both the first `async` and the awaiting parent are cancelled on failure of one of the children (namely, `two`):

```
Second child throws an exception
First child was cancelled
Computation failed with ArithmeticException
```

#### Coroutine context and dispatchers

Coroutines always execute in some context represented by a value of the CoroutineContext type, defined in the Kotlin standard library.

The coroutine context is a set of various elements. The main elements are the Job of the coroutine, which we've seen before, and its dispatcher, which is covered in this section.

###### **Dispatchers and threads**

The coroutine context includes a **coroutine dispatcher** (see CoroutineDispatcher) that determines what thread or threads the corresponding coroutine uses for its execution. The coroutine dispatcher can confine coroutine execution to a specific thread, dispatch it to a thread pool, or let it run unconfined.

All coroutine builders like launch and async accept an optional CoroutineContext parameter that can be used to explicitly specify the dispatcher for the new coroutine and other context elements.

Try the following example:

```kotlin
launch { // context of the parent, main runBlocking coroutine
    println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
}
launch(Dispatchers.Unconfined) { // not confined -- will work with main thread
    println("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
}
launch(Dispatchers.Default) { // will get dispatched to DefaultDispatcher 
    println("Default               : I'm working in thread ${Thread.currentThread().name}")
}
launch(newSingleThreadContext("MyOwnThread")) { // will get its own new thread
    println("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
}
```

Output:

```
Unconfined            : I'm working in thread main @coroutine#3
Default               : I'm working in thread DefaultDispatcher-worker-2 @coroutine#4
main runBlocking      : I'm working in thread main @coroutine#2
newSingleThreadContext: I'm working in thread MyOwnThread @coroutine#5
```

When `launch { ... }` is used without parameters, it inherits the context (and thus dispatcher) from the CoroutineScope it is being launched from. In this case, it inherits the context of the main `runBlocking` coroutine which runs in the main thread.

Dispatchers.Unconfined is a special dispatcher that also appears to run in the `main` thread, but it is, in fact, a different mechanism that is explained later.

The default dispatcher is used when no other dispatcher is explicitly specified in the scope. It is represented by Dispatchers.Default and uses a shared background pool of threads.

newSingleThreadContext creates a thread for the coroutine to run. A dedicated thread is a very expensive resource. In a real application it must be either released, when no longer needed, using the close function, or stored in a top-level variable and reused throughout the application.

###### **Unconfined vs confined dispatcher**

The Dispatchers.Unconfined coroutine dispatcher starts a coroutine in the caller thread, but only until the first suspension point. After suspension, it resumes the coroutine in the thread that is fully determined by the suspending function that was invoked. The unconfined dispatcher is appropriate for coroutines which neither consume CPU time nor update any shared data (like UI) confined to a specific thread.

On the other side, the dispatcher is inherited from the outer CoroutineScope by default. The default dispatcher for the runBlocking coroutine, in particular, is confined to the invoker thread, so inheriting it has the effect of confining execution to this thread with predictable FIFO scheduling.

```kotlin
launch(Dispatchers.Unconfined) { // not confined -- will work with main thread
    println("Unconfined      : I'm working in thread ${Thread.currentThread().name}")
    delay(500)
    println("Unconfined      : After delay in thread ${Thread.currentThread().name}")
}
launch { // context of the parent, main runBlocking coroutine
    println("main runBlocking: I'm working in thread ${Thread.currentThread().name}")
    delay(1000)
    println("main runBlocking: After delay in thread ${Thread.currentThread().name}")
}
```

Output:
```
Unconfined      : I'm working in thread main @coroutine#2
main runBlocking: I'm working in thread main @coroutine#3
Unconfined      : After delay in thread kotlinx.coroutines.DefaultExecutor @coroutine#2
main runBlocking: After delay in thread main @coroutine#3
```

So, the coroutine with the context inherited from `runBlocking {...}` continues to execute in the `main` thread, while the unconfined one resumes in the default executor thread that the delay function is using.


>✨ The unconfined dispatcher is an advanced mechanism that can be helpful in certain corner cases where dispatching of a coroutine for its execution later is not needed or produces undesirable side-effects, because some operation in a coroutine must be performed right away. The unconfined dispatcher should not be used in general code.
 
 


###### **Debugging coroutines and threads**

Coroutines can suspend on one thread and resume on another thread. Even with a single-threaded dispatcher it might be hard to figure out what the coroutine was doing, where, and when if you don't have special tooling.

**Debugging with IDEA**

The Coroutine Debugger of the Kotlin plugin simplifies debugging coroutines in IntelliJ IDEA.

>✨ Debugging works for versions 1.3.8 or later of `kotlinx-coroutines-core`.

The **Debug** tool window contains the **Coroutines** tab. In this tab, you can find information about both currently running and suspended coroutines. The coroutines are grouped by the dispatcher they are running on.

With the coroutine debugger, you can:

- Check the state of each coroutine.
- See the values of local and captured variables for both running and suspended coroutines.
- See a full coroutine creation stack, as well as a call stack inside the coroutine. The stack includes all frames with variable values, even those that would be lost during standard debugging.
- Get a full report that contains the state of each coroutine and its stack. To obtain it, right-click inside the **Coroutines** tab, and then click **Get Coroutines Dump**.

To start coroutine debugging, you just need to set breakpoints and run the application in debug mode.

**Debugging using logging**

Another approach to debugging applications with threads without Coroutine Debugger is to print the thread name in the log file on each log statement. This feature is universally supported by logging frameworks. When using coroutines, the thread name alone does not give much of a context, so `kotlinx.coroutines` includes debugging facilities to make it easier.

Run the following code with `-Dkotlinx.coroutines.debug` JVM option:

There are three coroutines. The main coroutine (`#1`) inside runBlocking and two coroutines computing the deferred values a (`#2`) and b (`#3`). They are all executing in the context of `runBlocking` and are confined to the main thread. The output of this code is:

```
[main @coroutine#2] I'm computing a piece of the answer
[main @coroutine#3] I'm computing another piece of the answer
[main @coroutine#1] The answer is 42
```

The `log` function prints the name of the thread in square brackets, and you can see that it is the `main` thread with the identifier of the currently executing coroutine appended to it. This identifier is consecutively assigned to all created coroutines when the debugging mode is on.

>✨ Debugging mode is also turned on when JVM is run with `-ea` option. You can read more about debugging facilities in the documentation of the DEBUG_PROPERTY_NAME property.

###### **Jumping between threads**


Run the following code with the `-Dkotlinx.coroutines.debug` JVM option (see debug):

```kotlin
import kotlinx.coroutines.*

fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

fun main() {
    newSingleThreadContext("Ctx1").use { ctx1 ->
        newSingleThreadContext("Ctx2").use { ctx2 ->
            runBlocking(ctx1) {
                log("Started in ctx1")
                withContext(ctx2) {
                    log("Working in ctx2")
                }
                log("Back to ctx1")
            }
        }
    }
}
```

It demonstrates several new techniques. One is using runBlocking with an explicitly specified context, and the other one is using the withContext function to change the context of a coroutine while still staying in the same coroutine, as you can see in the output below:

```
[Ctx1 @coroutine#1] Started in ctx1
[Ctx2 @coroutine#1] Working in ctx2
[Ctx1 @coroutine#1] Back to ctx1
```
Note that this example also uses the `use` function from the Kotlin standard library to release threads created with `newSingleThreadContext` when they are no longer needed.

###### **Job in the context**

The coroutine's Job is part of its context, and can be retrieved from it using the coroutineContext[Job] expression:


```kotlin
println("My job is ${coroutineContext[Job]}")
```

Output:

```
My job is "coroutine#1":BlockingCoroutine{Active}@4c75cab9

```
Note that isActive in CoroutineScope is just a convenient shortcut for `coroutineContext[Job]?.isActive == true`.

###### **Children of a coroutine**


When a coroutine is launched in the CoroutineScope of another coroutine, it inherits its context via CoroutineScope.coroutineContext and the Job of the new coroutine becomes a **child** of the parent coroutine's job. When the parent coroutine is cancelled, all its children are recursively cancelled, too.

However, this parent-child relation can be explicitly overridden in one of two ways:

- When a different scope is explicitly specified when launching a coroutine (for example, `GlobalScope.launch`), then it does not inherit a Job from the parent scope.

- When a different `Job` object is passed as the context for the new coroutine (as shown in the example below), then it overrides the `Job` of the parent scope.

In both cases, the launched coroutine is not tied to the scope it was launched from and operates independently.


```kotlin
// launch a coroutine to process some kind of incoming request
val request = launch {
    // it spawns two other jobs
    launch(Job()) { 
        println("job1: I run in my own Job and execute independently!")
        delay(1000)
        println("job1: I am not affected by cancellation of the request")
    }
    // and the other inherits the parent context
    launch {
        delay(100)
        println("job2: I am a child of the request coroutine")
        delay(1000)
        println("job2: I will not execute this line if my parent request is cancelled")
    }
}
delay(500)
request.cancel() // cancel processing of the request
println("main: Who has survived request cancellation?")
delay(1000) // delay the main thread for a second to see what happens
```

Output:

```
job1: I run in my own Job and execute independently!
job2: I am a child of the request coroutine
main: Who has survived request cancellation?
job1: I am not affected by cancellation of the request
```

###### **Parental responsibilities**

A parent coroutine always waits for completion of all its children. A parent does not have to explicitly track all the children it launches, and it does not have to use `Job.join` to wait for them at the end:


```kotlin
// launch a coroutine to process some kind of incoming request
val request = launch {
    repeat(3) { i -> // launch a few children jobs
        launch  {
            delay((i + 1) * 200L) // variable delay 200ms, 400ms, 600ms
            println("Coroutine $i is done")
        }
    }
    println("request: I'm done and I don't explicitly join my children that are still active")
}
request.join() // wait for completion of the request, including all its children
println("Now processing of the request is complete")
```

Output: 

```
request: I'm done and I don't explicitly join my children that are still active
Coroutine 0 is done
Coroutine 1 is done
Coroutine 2 is done
Now processing of the request is complete
```


###### **Naming coroutines for debugging**

Automatically assigned ids are good when coroutines log often, and you just need to correlate log records coming from the same coroutine. However, when a coroutine is tied to the processing of a specific request or doing some specific background task, it is better to name it explicitly for debugging purposes. The CoroutineName context element serves the same purpose as the thread name. It is included in the thread name that is executing this coroutine when the debugging mode is turned on.

The following example demonstrates this concept:

```kotlin
log("Started main coroutine")
// run two background value computations
val v1 = async(CoroutineName("v1coroutine")) {
    delay(500)
    log("Computing v1")
    6
}
val v2 = async(CoroutineName("v2coroutine")) {
    delay(1000)
    log("Computing v2")
    7
}
log("The answer for v1 * v2 = ${v1.await() * v2.await()}")
```
Output: 

```
[main @main#1] Started main coroutine
[main @v1coroutine#2] Computing v1
[main @v2coroutine#3] Computing v2
[main @main#1] The answer for v1 * v2 = 42
```


###### **Combining context elements**

Sometimes we need to define multiple elements for a coroutine context. We can use the + operator for that. For example, we can launch a coroutine with an explicitly specified dispatcher and an explicitly specified name at the same time:

```kotlin
launch(Dispatchers.Default + CoroutineName("test")) {
    println("I'm working in thread ${Thread.currentThread().name}")
}
```
The output of this code with the `-Dkotlinx.coroutines.debug` JVM option is:

```
I'm working in thread DefaultDispatcher-worker-1 @test#2
```


###### **Coroutine scope**

Let us put our knowledge about contexts, children and jobs together. Assume that our application has an object with a lifecycle, but that object is not a coroutine. For example, we are writing an Android application and launch various coroutines in the context of an Android activity to perform asynchronous operations to fetch and update data, do animations, etc. All of these coroutines must be cancelled when the activity is destroyed to avoid memory leaks. We, of course, can manipulate contexts and jobs manually to tie the lifecycles of the activity and its coroutines, but `kotlinx.coroutines` provides an abstraction encapsulating that: `CoroutineScope`. You should be already familiar with the coroutine scope as all coroutine builders are declared as extensions on it.

We manage the lifecycles of our coroutines by creating an instance of CoroutineScope tied to the lifecycle of our activity. A `CoroutineScope` instance can be created by the CoroutineScope() or MainScope() factory functions. The former creates a general-purpose scope, while the latter creates a scope for UI applications and uses Dispatchers.Main as the default dispatcher:

```kotlin
class Activity {
    private val mainScope = MainScope()

    fun destroy() {
        mainScope.cancel()
    }
    // to be continued ...
```


Now, we can launch coroutines in the scope of this `Activity` using the defined `mainScope`. For the demo, we launch ten coroutines that delay for a different time:

```kotlin
// class Activity continues
    fun doSomething() {
        // launch ten coroutines for a demo, each working for a different time
        repeat(10) { i ->
            mainScope.launch {
                delay((i + 1) * 200L) // variable delay 200ms, 400ms, ... etc
                println("Coroutine $i is done")
            }
        }
    } 
// class Activity ends
```

In our main function we create the activity, call our test `doSomething` function, and destroy the activity after 500ms. This cancels all the coroutines that were launched from `doSomething`. We can see that because after the destruction of the activity no more messages are printed, even if we wait a little longer.

```kotlin
val activity = Activity()
activity.doSomething() // run test function
println("Launched coroutines")
delay(500L) // delay for half a second
println("Destroying activity!")
activity.destroy() // cancels all coroutines
delay(1000) // visually confirm that they don't work
```

Output:

```
Launched coroutines
Coroutine 0 is done
Coroutine 1 is done
Destroying activity!
```
As you can see, only the first two coroutines print a message and the others are cancelled by a single invocation of `job.cancel()` in `Activity.destroy()`.

>✨Note that Android has first-party support for coroutine scope in all entities with the lifecycle.

**Thread-local data**

Sometimes it is convenient to have an ability to pass some thread-local data to or between coroutines. However, since they are not bound to any particular thread, this will likely lead to boilerplate if done manually.

For `ThreadLocal`, the asContextElement extension function is here for the rescue. It creates an additional context element which keeps the value of the given `ThreadLocal` and restores it every time the coroutine switches its context.

It is easy to demonstrate it in action:

```kotlin
threadLocal.set("main")
println("Pre-main, current thread: ${Thread.currentThread()}, thread local value: '${threadLocal.get()}'")
val job = launch(Dispatchers.Default + threadLocal.asContextElement(value = "launch")) {
    println("Launch start, current thread: ${Thread.currentThread()}, thread local value: '${threadLocal.get()}'")
    yield()
    println("After yield, current thread: ${Thread.currentThread()}, thread local value: '${threadLocal.get()}'")
}
job.join()
println("Post-main, current thread: ${Thread.currentThread()}, thread local value: '${threadLocal.get()}'")
```
In this example we launch a new coroutine in a background thread pool using Dispatchers.Default, so it works on a different thread from the thread pool, but it still has the value of the thread local variable that we specified using `threadLocal.asContextElement(value = "launch")`, no matter which thread the coroutine is executed on. Thus, the output (with debug) is:

```
Pre-main, current thread: Thread[main @coroutine#1,5,main], thread local value: 'main'
Launch start, current thread: Thread[DefaultDispatcher-worker-1 @coroutine#2,5,main], thread local value: 'launch'
After yield, current thread: Thread[DefaultDispatcher-worker-2 @coroutine#2,5,main], thread local value: 'launch'
Post-main, current thread: Thread[main @coroutine#1,5,main], thread local value: 'main'
```

It's easy to forget to set the corresponding context element. The thread-local variable accessed from the coroutine may then have an unexpected value, if the thread running the coroutine is different. To avoid such situations, it is recommended to use the ensurePresent method and fail-fast on improper usages.

`ThreadLocal` has first-class support and can be used with any primitive `kotlinx.coroutines` provides. It has one key limitation, though: when a thread-local is mutated, a new value is not propagated to the coroutine caller (because a context element cannot track all `ThreadLocal` object accesses), and the updated value is lost on the next suspension. Use withContext to update the value of the thread-local in a coroutine, see asContextElement for more details.

Alternatively, a value can be stored in a mutable box like class `Counter(var i: Int)`, which is, in turn, stored in a thread-local variable.  However, in this case you are fully responsible to synchronize potentially concurrent modifications to the variable in this mutable box.

For advanced usage, for example for integration with logging MDC, transactional contexts or any other libraries which internally use thread-locals for passing data, see the documentation of the ThreadContextElement interface that should be implemented.

#### Asynchronous Flow

A suspending function asynchronously returns a single value, but how can we return multiple asynchronously computed values? This is where Kotlin Flows come in.

###### **Representing multiple values**

Multiple values can be represented in Kotlin using collections. For example, we can have a `simple` function that returns a List of three numbers and then print them all using forEach:

```kotlin
fun simple(): List<Int> = listOf(1, 2, 3)
 
fun main() {
    simple().forEach { value -> println(value) } 
}
```

**Sequences**

If we are computing the numbers with some CPU-consuming blocking code (each computation taking 100ms), then we can represent the numbers using a `Sequence`:

```kotlin
fun simple(): Sequence<Int> = sequence { // sequence builder
    for (i in 1..3) {
        Thread.sleep(100) // pretend we are computing it
        yield(i) // yield next value
    }
}

fun main() {
    simple().forEach { value -> println(value) } 
}
```

This code outputs the same numbers, but it waits 100ms before printing each one:

```
1
2
3
```

**Suspending functions**

However, this computation blocks the main thread that is running the code. When these values are computed by asynchronous code we can mark the `simple` function with a `suspend` modifier, so that it can perform its work without blocking and return the result as a list:

```kotlin
suspend fun simple(): List<Int> {
    delay(1000) // pretend we are doing something asynchronous here
    return listOf(1, 2, 3)
}

fun main() = runBlocking<Unit> {
    simple().forEach { value -> println(value) } 
}
```

**Flows**

Using the `List<Int>` result type, means we can only return all the values at once.  To represent the stream of values that are being computed asynchronously, we can use a `Flow<Int>` type just like we would use a `Sequence<Int>` type for synchronously computed values:

```kotlin
fun simple(): Flow<Int> = flow { // flow builder
    for (i in 1..3) {
        delay(100) // pretend we are doing something useful here
        emit(i) // emit next value
    }
}

fun main() = runBlocking<Unit> {
    // Launch a concurrent coroutine to check if the main thread is blocked
    launch {
        for (k in 1..3) {
            println("I'm not blocked $k")
            delay(100)
        }
    }
    // Collect the flow
    simple().collect { value -> println(value) } 
}
```

This code waits 100ms before printing each number without blocking the main thread. This is verified by printing "I'm not blocked" every 100ms from a separate coroutine that is running in the main thread:

```
I'm not blocked 1
1
I'm not blocked 2
2
I'm not blocked 3
3
```

Notice the following differences in the code with the Flow from the earlier examples:

- A builder function of Flow type is called flow.
- Code inside a `flow {...}` builder block can suspend.
- The `simple` function is no longer marked with a `suspend` modifier.
- Values are **emitted** from the flow using an `emit` function.
- Values are **collected** from the flow using a `collect` function.


>✨ We can replace `delay` with `Thread.sleep` in the body of` simple`'s `flow { ... }` and see that the main thread is blocked in this case.

###### **Flows are cold**

Flows are **cold** streams similar to sequences — the code inside a flow builder does not run until the flow is collected. This becomes clear in the following example:

```kotlin
fun simple(): Flow<Int> = flow { 
    println("Flow started")
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    println("Calling simple function...")
    val flow = simple()
    println("Calling collect...")
    flow.collect { value -> println(value) } 
    println("Calling collect again...")
    flow.collect { value -> println(value) } 
}
```

Output:

```
Calling simple function...
Calling collect...
Flow started
1
2
3
Calling collect again...
Flow started
1
2
3
```

This is a key reason the `simple` function (which returns a `flow`) is not marked with `suspend` modifier. The `simple()` call itself returns quickly and does not wait for anything. The flow starts afresh every time it is collected and that is why we see "Flow started" every time we call `collect` again.

###### **Flow cancellation basics**

Flows adhere to the general cooperative cancellation of coroutines. As usual, flow collection can be cancelled when the flow is suspended in a cancellable suspending function (like delay). The following example shows how the flow gets cancelled on a timeout when running in a `withTimeoutOrNull` block and stops executing its code:

```kotlin
fun simple(): Flow<Int> = flow { 
    for (i in 1..3) {
        delay(100)          
        println("Emitting $i")
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    withTimeoutOrNull(250) { // Timeout after 250ms 
        simple().collect { value -> println(value) } 
    }
    println("Done")
}
```

Output:

```
Emitting 1
1
Emitting 2
2
Done
```

###### **Flow builders**

The `flow { ... }` builder from the previous examples is the most basic one. There are other builders that allow flows to be declared:

- The flowOf builder defines a flow that emits a fixed set of values.
- Various collections and sequences can be converted to flows using the `.asFlow()` extension function.

For example, the snippet that prints the numbers 1 to 3 from a flow can be rewritten as follows:

```kotlin
// Convert an integer range to a flow
(1..3).asFlow().collect { value -> println(value) }
```


###### **Intermedia flow operators**

Flows can be transformed using operators, in the same way as you would transform collections and sequences. Intermediate operators are applied to an upstream flow and return a downstream flow. These operators are cold, just like flows are. A call to such an operator is not a suspending function itself. It works quickly, returning the definition of a new transformed flow.

The basic operators have familiar names like map and filter. An important difference of these operators from sequences is that blocks of code inside these operators can call suspending functions.

For example, a flow of incoming requests can be mapped to its results with a map operator, even when performing a request is a long-running operation that is implemented by a suspending function:

```kotlin
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun performRequest(request: Int): String {
    delay(1000) // imitate long-running asynchronous work
    return "response $request"
}

fun main() = runBlocking<Unit> {
    (1..3).asFlow() // a flow of requests
        .map { request -> performRequest(request) }
        .collect { response -> println(response) }
}
```

Output:


```
response 1
response 2
response 3
```

**Transform operator**

Among the flow transformation operators, the most general one is called transform. It can be used to imitate simple transformations like `map` and `filter`, as well as implement more complex transformations. Using the `transform` operator, we can emit arbitrary values an arbitrary number of times.

For example, using `transform` we can emit a string before performing a long-running asynchronous request and follow it with a response:

```kotlin
(1..3).asFlow() // a flow of requests
    .transform { request ->
        emit("Making request $request") 
        emit(performRequest(request)) 
    }
    .collect { response -> println(response) }
```
Output: 

```
Making request 1
response 1
Making request 2
response 2
Making request 3
response 3
```

**Size-limiting operators**

Size-limiting intermediate operators like take cancel the execution of the flow when the corresponding limit is reached. Cancellation in coroutines is always performed by throwing an exception, so that all the resource-management functions (like `try { ... } finally { ... }` blocks) operate normally in case of cancellation:

```kotlin
fun numbers(): Flow<Int> = flow {
    try {                          
        emit(1)
        emit(2) 
        println("This line will not execute")
        emit(3)    
    } finally {
        println("Finally in numbers")
    }
}

fun main() = runBlocking<Unit> {
    numbers() 
        .take(2) // take only the first two
        .collect { value -> println(value) }
}    
```

Output: 

```
1
2
Finally in numbers
```


###### **Terminal flow operators**

Terminal operators on flows are **suspending functions** that start a collection of the flow. The collect operator is the most basic one, but there are other terminal operators, which can make it easier:

- Conversion to various collections like toList and toSet.
- Operators to get the first value and to ensure that a flow emits a single value.
- Reducing a flow to a value with reduce and fold.

For example:

```kotlin
val sum = (1..5).asFlow()
    .map { it * it } // squares of numbers from 1 to 5                           
    .reduce { a, b -> a + b } // sum them (terminal operator)
println(sum)
```

###### **Flows are sequential**

Each individual collection of a flow is performed sequentially unless special operators that operate on multiple flows are used. The collection works directly in the coroutine that calls a terminal operator. No new coroutines are launched by default. Each emitted value is processed by all the intermediate operators from upstream to downstream and is then delivered to the terminal operator after.

See the following example that filters the even integers and maps them to strings:

```kotlin
(1..5).asFlow()
    .filter {
        println("Filter $it")
        it % 2 == 0              
    }              
    .map { 
        println("Map $it")
        "string $it"
    }.collect { 
        println("Collect $it")
    }  
```

Output:

```
Filter 1
Filter 2
Map 2
Collect string 2
Filter 3
Filter 4
Map 4
Collect string 4
Filter 5
```

###### **Flow context**


Collection of a flow always happens in the context of the calling coroutine. For example, if there is a `simple` flow, then the following code runs in the context specified by the author of this code, regardless of the implementation details of the `simple` flow:


```kotlin
withContext(context) {
    simple().collect { value ->
        println(value) // run in the specified context
    }
}
```

This property of a flow is called **context preservation**.

So, by default, code in the `flow { ... }` builder runs in the context that is provided by a collector of the corresponding flow. For example, consider the implementation of a `simple` function that prints the thread it is called on and emits three numbers:

```kotlin
fun simple(): Flow<Int> = flow {
    log("Started simple flow")
    for (i in 1..3) {
        emit(i)
    }
}  

fun main() = runBlocking<Unit> {
    simple().collect { value -> log("Collected $value") } 
}   
```


Output: 

```
[main @coroutine#1] Started simple flow
[main @coroutine#1] Collected 1
[main @coroutine#1] Collected 2
[main @coroutine#1] Collected 3
```

Since `simple().collect` is called from the `main` thread, the body of `simple`'s flow is also called in the `main` thread. This is the perfect default for fast-running or asynchronous code that does not care about the execution context and does not block the caller.

**A common pitfall when using withContext**

However, the long-running CPU-consuming code might need to be executed in the context of Dispatchers.Default and UI-updating code might need to be executed in the context of Dispatchers.Main. Usually, withContext is used to change the context in the code using Kotlin coroutines, but code in the `flow { ... }` builder has to honor the context preservation property and is not allowed to emit from a different context.

Try running the following code:

```kotlin
fun simple(): Flow<Int> = flow {
    // The WRONG way to change context for CPU-consuming code in flow builder
    kotlinx.coroutines.withContext(Dispatchers.Default) {
        for (i in 1..3) {
            Thread.sleep(100) // pretend we are computing it in CPU-consuming way
            emit(i) // emit next value
        }
    }
}

fun main() = runBlocking<Unit> {
    simple().collect { value -> println(value) } 
}
```

This code produces the following exception:

```
Exception in thread "main" java.lang.IllegalStateException: Flow invariant is violated:
		Flow was collected in [CoroutineId(1), "coroutine#1":BlockingCoroutine{Active}@5511c7f8, BlockingEventLoop@2eac3323],
		but emission happened in [CoroutineId(1), "coroutine#1":DispatchedCoroutine{Active}@2dae0000, Dispatchers.Default].
		Please refer to 'flow' documentation or use 'flowOn' instead
	at ...
```

**flowOn operator**

The exception refers to the flowOn function that shall be used to change the context of the flow emission. The correct way to change the context of a flow is shown in the example below, which also prints the names of the corresponding threads to show how it all works:

```kotlin
fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        Thread.sleep(100) // pretend we are computing it in CPU-consuming way
        log("Emitting $i")
        emit(i) // emit next value
    }
}.flowOn(Dispatchers.Default) // RIGHT way to change context for CPU-consuming code in flow builder

fun main() = runBlocking<Unit> {
    simple().collect { value ->
        log("Collected $value") 
    } 
}
```

Notice how `flow { ... }` works in the background thread, while collection happens in the main thread:

```
[DefaultDispatcher-worker-1 @coroutine#2] Emitting 1
[main @coroutine#1] Collected 1
[DefaultDispatcher-worker-1 @coroutine#2] Emitting 2
[main @coroutine#1] Collected 2
[DefaultDispatcher-worker-1 @coroutine#2] Emitting 3
[main @coroutine#1] Collected 3
```

Another thing to observe here is that the flowOn operator has changed the default sequential nature of the flow. Now collection happens in one coroutine ("coroutine#1") and emission happens in another coroutine ("coroutine#2") that is running in another thread concurrently with the collecting coroutine. The flowOn operator creates another coroutine for an upstream flow when it has to change the CoroutineDispatcher in its context.

###### **Buffering**

Running different parts of a flow in different coroutines can be helpful from the standpoint of the overall time it takes to collect the flow, especially when long-running asynchronous operations are involved. For example, consider a case when the emission by a `simple` flow is slow, taking 100 ms to produce an element; and collector is also slow, taking 300 ms to process an element. Let's see how long it takes to collect such a flow with three numbers:

```kotlin
fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100) // pretend we are asynchronously waiting 100 ms
        emit(i) // emit next value
    }
}

fun main() = runBlocking<Unit> { 
    val time = measureTimeMillis {
        simple().collect { value -> 
            delay(300) // pretend we are processing it for 300 ms
            println(value) 
        } 
    }   
    println("Collected in $time ms")
}
```

It produces something like this, with the whole collection taking around 1200 ms (three numbers, 400 ms for each):

```
1
2
3
Collected in 1220 ms
```

We can use a `buffer` operator on a flow to run emitting code of the simple flow concurrently with collecting code, as opposed to running them sequentially:

```kotlin
val time = measureTimeMillis {
    simple()
        .buffer() // buffer emissions, don't wait
        .collect { value -> 
            delay(300) // pretend we are processing it for 300 ms
            println(value) 
        } 
}   
println("Collected in $time ms")
```

It produces the same numbers just faster, as we have effectively created a processing pipeline, having to only wait 100 ms for the first number and then spending only 300 ms to process each number. This way it takes around 1000 ms to run:

```
1
2
3
Collected in 1071 ms
```

>✨Note that the `flowOn` operator uses the same buffering mechanism when it has to change a CoroutineDispatcher, but here we explicitly request buffering without changing the execution context.

_Conflation_

When a flow represents partial results of the operation or operation status updates, it may not be necessary to process each value, but instead, only most recent ones. In this case, the `conflate` operator can be used to skip intermediate values when a collector is too slow to process them. Building on the previous example:

```kotlin
val time = measureTimeMillis {
    simple()
        .conflate() // conflate emissions, don't process each one
        .collect { value -> 
            delay(300) // pretend we are processing it for 300 ms
            println(value) 
        } 
}   
println("Collected in $time ms")
```

We see that while the first number was still being processed the second, and third were already produced, so the second one was **conflated** and only the most recent (the third one) was delivered to the collector:


```
1
3
Collected in 753 ms
```

_Processing the latest value_

Conflation is one way to speed up processing when both the emitter and collector are slow. It does it by dropping emitted values. The other way is to cancel a slow collector and restart it every time a new value is emitted. There is a family of xxxLatest operators that perform the same essential logic of a xxx operator, but cancel the code in their block on a new value. Let's try changing `conflate` to `collectLatest` in the previous example:

```kotlin
val time = measureTimeMillis {
    simple()
        .collectLatest { value -> // cancel & restart on the latest value
            println("Collecting $value") 
            delay(300) // pretend we are processing it for 300 ms
            println("Done $value") 
        } 
}   
println("Collected in $time ms")
```

Since the body of collectLatest takes 300 ms, but new values are emitted every 100 ms, we see that the block is run on every value, but completes only for the last value:

```
Collecting 1
Collecting 2
Collecting 3
Done 3
Collected in 741 ms
```

###### **Composing multiple flows**

There are lots of ways to compose multiple flows.

_Zip_ 

Just like the Sequence.zip extension function in the Kotlin standard library, flows have a zip operator that combines the corresponding values of two flows:

```kotlin
val nums = (1..3).asFlow() // numbers 1..3
val strs = flowOf("one", "two", "three") // strings 
nums.zip(strs) { a, b -> "$a -> $b" } // compose a single string
    .collect { println(it) } // collect and print
```

__Combine_

When flow represents the most recent value of a variable or operation (see also the related section on conflation), it might be needed to perform a computation that depends on the most recent values of the corresponding flows and to recompute it whenever any of the upstream flows emit a value. The corresponding family of operators is called combine.

For example, if the numbers in the previous example update every 300ms, but strings update every 400 ms, then zipping them using the zip operator will still produce the same result, albeit results that are printed every 400 ms:

>✨ We use a onEach intermediate operator in this example to delay each element and make the code that emits sample flows more declarative and shorter.

```kotlin
val nums = (1..3).asFlow().onEach { delay(300) } // numbers 1..3 every 300 ms
val strs = flowOf("one", "two", "three").onEach { delay(400) } // strings every 400 ms
val startTime = System.currentTimeMillis() // remember the start time 
nums.zip(strs) { a, b -> "$a -> $b" } // compose a single string with "zip"
    .collect { value -> // collect and print 
        println("$value at ${System.currentTimeMillis() - startTime} ms from start") 
    } 
```

Output: 

```
1 -> one at 452 ms from start
2 -> two at 852 ms from start
3 -> three at 1256 ms from start
```
However, when using a combine operator here instead of a zip:

```kotlin
val nums = (1..3).asFlow().onEach { delay(300) } // numbers 1..3 every 300 ms
val strs = flowOf("one", "two", "three").onEach { delay(400) } // strings every 400 ms          
val startTime = System.currentTimeMillis() // remember the start time 
nums.combine(strs) { a, b -> "$a -> $b" } // compose a single string with "combine"
    .collect { value -> // collect and print 
        println("$value at ${System.currentTimeMillis() - startTime} ms from start") 
    } 
```

Output: 

```
1 -> one at 440 ms from start
2 -> one at 643 ms from start
2 -> two at 842 ms from start
3 -> two at 944 ms from start
3 -> three at 1244 ms from start
```


###### **Flattening flows**

Flows represent asynchronously received sequences of values, and so it is quite easy to get into a situation where each value triggers a request for another sequence of values. For example, we can have the following function that returns a flow of two strings 500 ms apart:

```kotlin
fun requestFlow(i: Int): Flow<String> = flow {
    emit("$i: First")
    delay(500) // wait 500 ms
    emit("$i: Second")
}
```

Now if we have a flow of three integers and call `requestFlow` on each of them like this:

```kotlin
(1..3).asFlow().map { requestFlow(it) }
```

Then we will end up with a flow of flows (`Flow<Flow<String>>`) that needs to be flattened into a single flow for further processing. Collections and sequences have `flatten` and flatMap operators for this. However, due to the asynchronous nature of flows they call for different modes of flattening, and hence, a family of flattening operators on flows exists.

_flatMapConcat_

Concatenation of flows of flows is provided by the flatMapConcat and flattenConcat operators. They are the most direct analogues of the corresponding sequence operators. They wait for the inner flow to complete before starting to collect the next one as the following example shows:

```kotlin
val startTime = System.currentTimeMillis() // remember the start time 
(1..3).asFlow().onEach { delay(100) } // emit a number every 100 ms 
    .flatMapConcat { requestFlow(it) }                                                                           
    .collect { value -> // collect and print 
        println("$value at ${System.currentTimeMillis() - startTime} ms from start") 
    } 
```

The sequential nature of flatMapConcat is clearly seen in the output:

```kotlin
1: First at 121 ms from start
1: Second at 622 ms from start
2: First at 727 ms from start
2: Second at 1227 ms from start
3: First at 1328 ms from start
3: Second at 1829 ms from start
```

_flatMapMerge_

Another flattening operation is to concurrently collect all the incoming flows and merge their values into a single flow so that values are emitted as soon as possible. It is implemented by `flatMapMerge` and `flattenMerge` operators. They both accept an optional `concurrency` parameter that limits the number of concurrent flows that are collected at the same time (it is equal to DEFAULT_CONCURRENCY by default).

```kotlin
val startTime = System.currentTimeMillis() // remember the start time 
(1..3).asFlow().onEach { delay(100) } // a number every 100 ms 
    .flatMapMerge { requestFlow(it) }                                                                           
    .collect { value -> // collect and print 
        println("$value at ${System.currentTimeMillis() - startTime} ms from start") 
    }   
```
Output:

```
1: First at 167 ms from start
2: First at 264 ms from start
3: First at 365 ms from start
1: Second at 668 ms from start
2: Second at 764 ms from start
3: Second at 866 ms from start
```
>✨ Note that the `flatMapMerge` calls its block of code `({ requestFlow(it) }` in this example) sequentially, but collects the resulting flows concurrently, it is the equivalent of performing a sequential `map { requestFlow(it) }` first and then calling `flattenMerge` on the result.

_flatMapLatest_

In a similar way to the collectLatest operator, that was described in the section "Processing the latest value", there is the corresponding "Latest" flattening mode where the collection of the previous flow is cancelled as soon as new flow is emitted. It is implemented by the flatMapLatest operator.

```kotlin
val startTime = System.currentTimeMillis() // remember the start time 
(1..3).asFlow().onEach { delay(100) } // a number every 100 ms 
    .flatMapLatest { requestFlow(it) }                                                                           
    .collect { value -> // collect and print 
        println("$value at ${System.currentTimeMillis() - startTime} ms from start") 
    } 
```

Output:

```
1: First at 154 ms from start
2: First at 285 ms from start
3: First at 387 ms from start
3: Second at 887 ms from start
```

>✨ Note that `flatMapLatest` cancels all the code in its block (`{ requestFlow(it) }` in this example) when a new value is received. It makes no difference in this particular example, because the call to `requestFlow` itself is fast, not-suspending, and cannot be cancelled. However, a difference in output would be visible if we were to use suspending functions like delay in `requestFlow`.

###### **Flow exceptions**

Flow collection can complete with an exception when an emitter or code inside the operators throw an exception. There are several ways to handle these exceptions.

_Collector try and catch_

A collector can use Kotlin's `try/catch` block to handle exceptions:

```kotlin
fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        println("Emitting $i")
        emit(i) // emit next value
    }
}

fun main() = runBlocking<Unit> {
    try {
        simple().collect { value ->         
            println(value)
            check(value <= 1) { "Collected $value" }
        }
    } catch (e: Throwable) {
        println("Caught $e")
    } 
}  
```

This code successfully catches an exception in collect terminal operator and, as we see, no more values are emitted after that:

```
Emitting 1
1
Emitting 2
2
Caught java.lang.IllegalStateException: Collected 2
```

_Everything is caught_

The previous example actually catches any exception happening in the emitter or in any intermediate or terminal operators. For example, let's change the code so that emitted values are mapped to strings, but the corresponding code produces an exception:


```kotlin
fun simple(): Flow<String> = 
    flow {
        for (i in 1..3) {
            println("Emitting $i")
            emit(i) // emit next value
        }
    }
    .map { value ->
        check(value <= 1) { "Crashed on $value" }                 
        "string $value"
    }

fun main() = runBlocking<Unit> {
    try {
        simple().collect { value -> println(value) }
    } catch (e: Throwable) {
        println("Caught $e")
    } 
} 
```

This exception is still caught and collection is stopped:

```kotlin
Emitting 1
string 1
Emitting 2
Caught java.lang.IllegalStateException: Crashed on 2
```

###### **Exception transparency**


But how can code of the emitter encapsulate its exception handling behavior?

Flows must be **transparent to exceptions**, and it is a violation of the exception transparency to emit values in the `flow { ... }` builder from inside a `try/catch` block. This guarantees that a collector throwing an exception can always catch it using `try/catch` as in the previous example.

The emitter can use a catch operator that preserves this exception transparency and allows encapsulation of its exception handling. The body of the `catch` operator can analyze an exception and react to it in different ways depending on which exception was caught:

- Exceptions can be rethrown using `throw`.
- Exceptions can be turned into emission of values using emit from the body of catch.
- Exceptions can be ignored, logged, or processed by some other code.

For example, let us emit the text on catching an exception:

```kotlin
simple()
    .catch { e -> emit("Caught $e") } // emit on exception
    .collect { value -> println(value) }
```

The output of the example is the same, even though we do not have `try/catch` around the code anymore.

_Transparent catch_

The catch intermediate operator, honoring exception transparency, catches only upstream exceptions (that is an exception from all the operators above `catch`, but not below it). If the block in `collect { ... }` (placed below catch) throws an exception then it escapes:

```kotlin
fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        println("Emitting $i")
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    simple()
        .catch { e -> println("Caught $e") } // does not catch downstream exceptions
        .collect { value ->
            check(value <= 1) { "Collected $value" }                 
            println(value) 
        }
}  
```

A "Caught ..." message is not printed despite there being a `catch` operator:

```
Emitting 1
1
Emitting 2
Exception in thread "main" java.lang.IllegalStateException: Collected 2
	at ...
```


_Catching declaratively_

We can combine the declarative nature of the catch operator with a desire to handle all the exceptions, by moving the body of the collect operator into `onEach` and putting it before the `catch` operator. Collection of this flow must be triggered by a call to `collect()` without parameters:


```kotlin
simple()
    .onEach { value ->
        check(value <= 1) { "Collected $value" }                 
        println(value) 
    }
    .catch { e -> println("Caught $e") }
    .collect()
```

Now we can see that a "Caught ..." message is printed, and so we can catch all the exceptions without explicitly using a `try/catch` block:

```
Emitting 1
1
Emitting 2
Caught java.lang.IllegalStateException: Collected 2
```

###### **Flow completion**

When flow collection completes (normally or exceptionally) it may need to execute an action. As you may have already noticed, it can be done in two ways: imperative or declarative.

_Imperative finally block_

In addition to `try/catch`, a collector can also use a `finally` block to execute an action upon `collect` completion.

```kotlin
fun simple(): Flow<Int> = (1..3).asFlow()

fun main() = runBlocking<Unit> {
    try {
        simple().collect { value -> println(value) }
    } finally {
        println("Done")
    }
}  
```

_Declarative handling_

For the declarative approach, flow has onCompletion intermediate operator that is invoked when the flow has completely collected.

The previous example can be rewritten using an onCompletion operator and produces the same output:

```kotlin
simple()
    .onCompletion { println("Done") }
    .collect { value -> println(value) }
```

The key advantage of onCompletion is a nullable `Throwable` parameter of the lambda that can be used to determine whether the flow collection was completed normally or exceptionally. In the following example the `simple` flow throws an exception after emitting the number 1:

```kotlin
fun simple(): Flow<Int> = flow {
    emit(1)
    throw RuntimeException()
}

fun main() = runBlocking<Unit> {
    simple()
        .onCompletion { cause -> if (cause != null) println("Flow completed exceptionally") }
        .catch { cause -> println("Caught exception") }
        .collect { value -> println(value) }
}
```

As you may expect, it prints:

```kotlin
1
Flow completed exceptionally
Caught exception
```

The onCompletion operator, unlike catch, does not handle the exception. As we can see from the above example code, the exception still flows downstream. It will be delivered to further `onCompletion` operators and can be handled with a `catch` operator.

_Successful completion_

Another difference with `catch` operator is that `onCompletion` sees all exceptions and receives a `null` exception only on successful completion of the upstream flow (without cancellation or failure).

```kotlin
fun simple(): Flow<Int> = (1..3).asFlow()

fun main() = runBlocking<Unit> {
    simple()
        .onCompletion { cause -> println("Flow completed with $cause") }
        .collect { value ->
            check(value <= 1) { "Collected $value" }                 
            println(value) 
        }
}
```

We can see the completion cause is not null, because the flow was aborted due to downstream exception:

```kotlin
1
Flow completed with java.lang.IllegalStateException: Collected 2
Exception in thread "main" java.lang.IllegalStateException: Collected 2
 at FileKt$main$1$2.emit (File.kt:10) 
 at FileKt$main$1$2.emit (File.kt:9) 
 at kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.collect (SafeCollector.common.kt:116) 
```

###### **Imperative versus declarative**

Now we know how to collect flow, and handle its completion and exceptions in both imperative and declarative ways. The natural question here is, which approach is preferred and why? As a library, we do not advocate for any particular approach and believe that both options are valid and should be selected according to your own preferences and code style.

###### **Launching flow**

It is easy to use flows to represent asynchronous events that are coming from some source.
In this case, we need an analogue of the `addEventListener` function that registers a piece of code with a reaction for incoming events and continues further work. The `onEach` operator can serve this role. However, `onEach` is an intermediate operator. We also need a terminal operator to collect the flow. Otherwise, just calling `onEach` has no effect.

If we use the collect terminal operator after `onEach`, then the code after it will wait until the flow is collected:

```kotlin
// Imitate a flow of events
fun events(): Flow<Int> = (1..3).asFlow().onEach { delay(100) }

fun main() = runBlocking<Unit> {
    events()
        .onEach { event -> println("Event: $event") }
        .collect() // <--- Collecting the flow waits
    println("Done")
}        
```

As you can see, it prints:

```markdown
Event: 1
Event: 2
Event: 3
Done
```

The launchIn terminal operator comes in handy here. By replacing `collect` with `launchIn` we can launch a collection of the flow in a separate coroutine, so that execution of further code immediately continues:

```kotlin
fun main() = runBlocking<Unit> {
    events()
        .onEach { event -> println("Event: $event") }
        .launchIn(this) // <--- Launching the flow in a separate coroutine
    println("Done")
}  
```
Output:

```
Done
Event: 1
Event: 2
Event: 3
```

The required parameter to `launchIn` must specify a CoroutineScope in which the coroutine to collect the flow is launched. In the above example this scope comes from the `runBlocking` coroutine builder, so while the flow is running, this runBlocking scope waits for completion of its child coroutine and keeps the main function from returning and terminating this example.


In actual applications a scope will come from an entity with a limited lifetime. As soon as the lifetime of this entity is terminated the corresponding scope is cancelled, cancelling the collection of the corresponding flow. This way the pair of `onEach { ... }.launchIn(scope)` works like the `addEventListener`. However, there is no need for the corresponding `removeEventListener` function, as cancellation and structured concurrency serve this purpose.

Note that launchIn also returns a Job, which can be used to cancel the corresponding flow collection coroutine only without cancelling the whole scope or to join it.

_Flow cancellation checks_

For convenience, the flow builder performs additional ensureActive checks for cancellation on each emitted value. It means that a busy loop emitting from a `flow { ... }` is cancellable:

```kotlin
fun foo(): Flow<Int> = flow { 
    for (i in 1..5) {
        println("Emitting $i") 
        emit(i) 
    }
}

fun main() = runBlocking<Unit> {
    foo().collect { value -> 
        if (value == 3) cancel()  
        println(value)
    } 
}
```

We get only numbers up to 3 and a CancellationException after trying to emit number 4:

```
Emitting 1
1
Emitting 2
2
Emitting 3
3
Emitting 4
Exception in thread "main" kotlinx.coroutines.JobCancellationException: BlockingCoroutine was cancelled; job="coroutine#1":BlockingCoroutine{Cancelled}@6d7b4f4c
```

However, most other flow operators do not do additional cancellation checks on their own for performance reasons. For example, if you use `IntRange.asFlow` extension to write the same busy loop and don't suspend anywhere, then there are no checks for cancellation:

```kotlin
fun main() = runBlocking<Unit> {
    (1..5).asFlow().collect { value -> 
        if (value == 3) cancel()  
        println(value)
    } 
}
```

All numbers from 1 to 5 are collected and cancellation gets detected only before return from `runBlocking`:

```kotlin
1
2
3
4
5
Exception in thread "main" kotlinx.coroutines.JobCancellationException: BlockingCoroutine was cancelled; job="coroutine#1":BlockingCoroutine{Cancelled}@3327bd23
```

_Making busy flow cancellable_

In the case where you have a busy loop with coroutines you must explicitly check for cancellation. You can add .onEach { currentCoroutineContext().ensureActive() }, but there is a ready-to-use cancellable operator provided to do that:


```kotlin
fun main() = runBlocking<Unit> {
    (1..5).asFlow().cancellable().collect { value -> 
        if (value == 3) cancel()  
        println(value)
    } 
}
```

With the `cancellable` operator only the numbers from 1 to 3 are collected:

```
1
2
3
Exception in thread "main" kotlinx.coroutines.JobCancellationException: BlockingCoroutine was cancelled; job="coroutine#1":BlockingCoroutine{Cancelled}@5ec0a365
```

###### **Flow and Reactive Streams**

For those who are familiar with Reactive Streams or reactive frameworks such as RxJava and project Reactor, design of the Flow may look very familiar.

Indeed, its design was inspired by Reactive Streams and its various implementations. But Flow main goal is to have as simple design as possible, be Kotlin and suspension friendly and respect structured concurrency. Achieving this goal would be impossible without reactive pioneers and their tremendous work. You can read the complete story in Reactive Streams and Kotlin Flows article.

While being different, conceptually, Flow is a reactive stream, and it is possible to convert it to the reactive (spec and TCK compliant) Publisher and vice versa. Such converters are provided by `kotlinx.coroutines` out-of-the-box and can be found in corresponding reactive modules (`kotlinx-coroutines-reactive` for Reactive Streams, `kotlinx-coroutines-reactor` for Project Reactor and `kotlinx-coroutines-rx2`/`kotlinx-coroutines-rx3` for RxJava2/RxJava3). Integration modules include conversions from and to Flow, integration with Reactor's Context and suspension-friendly ways to work with various reactive entities.

#### Channels 

Deferred values provide a convenient way to transfer a single value between coroutines. Channels provide a way to transfer a stream of values.


###### **Channel basic**

A Channel is conceptually very similar to `BlockingQueue`. One key difference is that instead of a blocking `put` operation it has a suspending `send`, and instead of a blocking `take` operation it has a suspending `receive`.

```kotlin
val channel = Channel<Int>()
launch {
    // this might be heavy CPU-consuming computation or async logic, 
    // we'll just send five squares
    for (x in 1..5) channel.send(x * x)
}
// here we print five received integers:
repeat(5) { println(channel.receive()) }
println("Done!")
```
Output:

```
1
4
9
16
25
Done!
```

###### **Closing and iteration over channels**

Unlike a queue, a channel can be closed to indicate that no more elements are coming. On the receiver side it is convenient to use a regular `for` loop to receive elements from the channel.

Conceptually, a close is like sending a special close token to the channel. The iteration stops as soon as this close token is received, so there is a guarantee that all previously sent elements before the close are received:


```kotlin
val channel = Channel<Int>()
launch {
    for (x in 1..5) channel.send(x * x)
    channel.close() // we're done sending
}
// here we print received values using `for` loop (until the channel is closed)
for (y in channel) println(y)
println("Done!")
```

Output:

```
1
4
9
16
25
Done!
```

###### **Building channel producers**

The pattern where a coroutine is producing a sequence of elements is quite common. This is a part of **producer-consumer** pattern that is often found in concurrent code. You could abstract such a producer into a function that takes channel as its parameter, but this goes contrary to common sense that results must be returned from functions.

There is a convenient coroutine builder named produce that makes it easy to do it right on producer side, and an extension function `consumeEach`, that replaces a `for` loop on the consumer side:

```kotlin
fun CoroutineScope.produceSquares(): ReceiveChannel<Int> = produce {
    for (x in 1..5) send(x * x)
}

fun main() = runBlocking {
    val squares = produceSquares()
    squares.consumeEach { println(it) }
    println("Done!")
```


Output:

```
1
4
9
16
25
Done!
```

###### **Pipelines**

A pipeline is a pattern where one coroutine is producing, possibly infinite, stream of values:

```kotlin
fun CoroutineScope.produceNumbers() = produce<Int> {
    var x = 1
    while (true) send(x++) // infinite stream of integers starting from 1
}
```
And another coroutine or coroutines are consuming that stream, doing some processing, and producing some other results. In the example below, the numbers are just squared:

```kotlin
fun CoroutineScope.square(numbers: ReceiveChannel<Int>): ReceiveChannel<Int> = produce {
    for (x in numbers) send(x * x)
}
```

The main code starts and connects the whole pipeline:

```kotlin
val numbers = produceNumbers() // produces integers from 1 and on
val squares = square(numbers) // squares integers
repeat(5) {
    println(squares.receive()) // print first five
}
println("Done!") // we are done
coroutineContext.cancelChildren() // cancel children coroutines
```

Output:


```
1
4
9
16
25
Done!
```

>✨ All functions that create coroutines are defined as extensions on CoroutineScope, so that we can rely on structured concurrency to make sure that we don't have lingering global coroutines in our application.


###### **Prime numbers with pipeline**

Let's take pipelines to the extreme with an example that generates prime numbers using a pipeline of coroutines. We start with an infinite sequence of numbers.

```kotlin
fun CoroutineScope.numbersFrom(start: Int) = produce<Int> {
    var x = start
    while (true) send(x++) // infinite stream of integers from start
}
```
The following pipeline stage filters an incoming stream of numbers, removing all the numbers that are divisible by the given prime number:

```kotlin
fun CoroutineScope.filter(numbers: ReceiveChannel<Int>, prime: Int) = produce<Int> {
    for (x in numbers) if (x % prime != 0) send(x)
}
```

Now we build our pipeline by starting a stream of numbers from 2, taking a prime number from the current channel, and launching new pipeline stage for each prime number found:

```kotlin
numbersFrom(2) -> filter(2) -> filter(3) -> filter(5) -> filter(7) ...
```

The following example prints the first ten prime numbers, running the whole pipeline in the context of the main thread. Since all the coroutines are launched in the scope of the main runBlocking coroutine we don't have to keep an explicit list of all the coroutines we have started. We use cancelChildren extension function to cancel all the children coroutines after we have printed the first ten prime numbers.


```kotlin
var cur = numbersFrom(2)
repeat(10) {
    val prime = cur.receive()
    println(prime)
    cur = filter(cur, prime)
}
coroutineContext.cancelChildren() // cancel all children to let main finish
```

Output:

```
2
3
5
7
11
13
17
19
23
29
```


Note that you can build the same pipeline using `iterator` coroutine builder from the standard library. Replace `produce` with `iterator`, `send` with `yield`, `receive` with `next`, `ReceiveChannel` with `Iterator`, and get rid of the coroutine scope. You will not need `runBlocking` either. However, the benefit of a pipeline that uses channels as shown above is that it can actually use multiple CPU cores if you run it in Dispatchers.Default context.


Anyway, this is an extremely impractical way to find prime numbers. In practice, pipelines do involve some other suspending invocations (like asynchronous calls to remote services) and these pipelines cannot be built using `sequence`/`iterator`, because they do not allow arbitrary suspension, unlike `produce`, which is fully asynchronous.


###### **Fan-out**

Multiple coroutines may receive from the same channel, distributing work between themselves. Let us start with a producer coroutine that is periodically producing integers (ten numbers per second):

```kotlin

fun CoroutineScope.produceNumbers() = produce<Int> {
    var x = 1 // start from 1
    while (true) {
        send(x++) // produce next
        delay(100) // wait 0.1s
    }
}

```

Then we can have several processor coroutines. In this example, they just print their id and received number:

```kotlin
fun CoroutineScope.launchProcessor(id: Int, channel: ReceiveChannel<Int>) = launch {
    for (msg in channel) {
        println("Processor #$id received $msg")
    }
}
```
Now let us launch five processors and let them work for almost a second. See what happens:

```kotlin
val producer = produceNumbers()
repeat(5) { launchProcessor(it, producer) }
delay(950)
producer.cancel() // cancel producer coroutine and thus kill them all
```

The output will be similar to the following one, albeit the processor ids that receive each specific integer may be different:

```
Processor #2 received 1
Processor #4 received 2
Processor #0 received 3
Processor #1 received 4
Processor #3 received 5
Processor #2 received 6
Processor #4 received 7
Processor #0 received 8
Processor #1 received 9
Processor #3 received 10
```

Note that cancelling a producer coroutine closes its channel, thus eventually terminating iteration over the channel that processor coroutines are doing.


Also, pay attention to how we explicitly iterate over channel with `for` loop to perform fan-out in `launchProcessor` code. Unlike `consumeEach`, `this` for loop pattern is perfectly safe to use from multiple coroutines. If one of the processor coroutines fails, then others would still be processing the channel, while a processor that is written via `consumeEach` always consumes (cancels) the underlying channel on its normal or abnormal completion.

###### **Fan-in**

Multiple coroutines may send to the same channel. For example, let us have a channel of strings, and a suspending function that repeatedly sends a specified string to this channel with a specified delay:

```kotlin
suspend fun sendString(channel: SendChannel<String>, s: String, time: Long) {
while (true) {
delay(time)
channel.send(s)
}
}
```

Now, let us see what happens if we launch a couple of coroutines sending strings (in this example we launch them in the context of the main thread as main coroutine's children):

```kotlin
val channel = Channel<String>()
launch { sendString(channel, "foo", 200L) }
launch { sendString(channel, "BAR!", 500L) }
repeat(6) { // receive first six
    println(channel.receive())
}
coroutineContext.cancelChildren() // cancel all children to let main finish
```

Output:

```
foo
foo
BAR!
foo
foo
BAR!
```

###### **Buffered channels**

The channels shown so far had no buffer. Unbuffered channels transfer elements when sender and receiver meet each other (aka rendezvous). If send is invoked first, then it is suspended until receive is invoked, if receive is invoked first, it is suspended until send is invoked.

Both Channel() factory function and produce builder take an optional `capacity` parameter to specify **buffer size**. Buffer allows senders to send multiple elements before suspending, similar to the BlockingQueue with a specified capacity, which blocks when buffer is full.

Take a look at the behavior of the following code:

```kotlin
val channel = Channel<Int>(4) // create buffered channel
val sender = launch { // launch sender coroutine
    repeat(10) {
        println("Sending $it") // print before sending each element
        channel.send(it) // will suspend when buffer is full
    }
}
// don't receive anything... just wait....
delay(1000)
sender.cancel() // cancel sender coroutine
```

It prints "sending" five times using a buffered channel with capacity of four:

```kotlin
Sending 0
Sending 1
Sending 2
Sending 3
Sending 4
```

The first four elements are added to the buffer and the sender suspends when trying to send the fifth one.

###### **Channels are fair**

Send and receive operations to channels are **fair** with respect to the order of their invocation from multiple coroutines. They are served in first-in first-out order, e.g. the first coroutine to invoke `receive` gets the element. In the following example two coroutines "ping" and "pong" are receiving the "ball" object from the shared "table" channel.

```kotlin
data class Ball(var hits: Int)

fun main() = runBlocking {
    val table = Channel<Ball>() // a shared table
    launch { player("ping", table) }
    launch { player("pong", table) }
    table.send(Ball(0)) // serve the ball
    delay(1000) // delay 1 second
    coroutineContext.cancelChildren() // game over, cancel them
}

suspend fun player(name: String, table: Channel<Ball>) {
    for (ball in table) { // receive the ball in a loop
        ball.hits++
        println("$name $ball")
        delay(300) // wait a bit
        table.send(ball) // send the ball back
    }
}
```

The "ping" coroutine is started first, so it is the first one to receive the ball. Even though "ping" coroutine immediately starts receiving the ball again after sending it back to the table, the ball gets received by the "pong" coroutine, because it was already waiting for it:

```
ping Ball(hits=1)
pong Ball(hits=2)
ping Ball(hits=3)
pong Ball(hits=4)
```
Note that sometimes channels may produce executions that look unfair due to the nature of the executor that is being used. See this issue for details.


###### **Ticker channels**

Ticker channel is a special rendezvous channel that produces `Unit` every time given delay passes since last consumption from this channel. Though it may seem to be useless standalone, it is a useful building block to create complex time-based produce pipelines and operators that do windowing and other time-dependent processing. Ticker channel can be used in select to perform "on tick" action.

To create such channel use a factory method `ticker`. To indicate that no further elements are needed use `ReceiveChannel.cancel` method on it.


Now let's see how it works in practice: 

```kotlin
fun main() = runBlocking<Unit> {
    val tickerChannel = ticker(delayMillis = 200, initialDelayMillis = 0) // create a ticker channel
    var nextElement = withTimeoutOrNull(1) { tickerChannel.receive() }
    println("Initial element is available immediately: $nextElement") // no initial delay

    nextElement = withTimeoutOrNull(100) { tickerChannel.receive() } // all subsequent elements have 200ms delay
    println("Next element is not ready in 100 ms: $nextElement")

    nextElement = withTimeoutOrNull(120) { tickerChannel.receive() }
    println("Next element is ready in 200 ms: $nextElement")

    // Emulate large consumption delays
    println("Consumer pauses for 300ms")
    delay(300)
    // Next element is available immediately
    nextElement = withTimeoutOrNull(1) { tickerChannel.receive() }
    println("Next element is available immediately after large consumer delay: $nextElement")
    // Note that the pause between `receive` calls is taken into account and next element arrives faster
    nextElement = withTimeoutOrNull(120) { tickerChannel.receive() }
    println("Next element is ready in 100ms after consumer pause in 300ms: $nextElement")

    tickerChannel.cancel() // indicate that no more elements are needed
```

It prints following lines:

```
Initial element is available immediately: kotlin.Unit
Next element is not ready in 100 ms: null
Next element is ready in 200 ms: kotlin.Unit
Consumer pauses for 300ms
Next element is available immediately after large consumer delay: kotlin.Unit
Next element is ready in 100ms after consumer pause in 300ms: kotlin.Unit
```

Optionally, a `mode` parameter equal to `TickerMode.FIXED_DELAY` can be specified to maintain a fixed delay between elements.

#### Coroutine exceptions handling

This section covers exception handling and cancellation on exceptions. We already know that a cancelled coroutine throws CancellationException in suspension points and that it is ignored by the coroutines' machinery. Here we look at what happens if an exception is thrown during cancellation or multiple children of the same coroutine throw an exception.

###### **Exception propagation**

Coroutine builders come in two flavors: propagating exceptions automatically (`launch`) or exposing them to users (`async` and `produce`).  When these builders are used to create a **root** coroutine, that is not a **child** of another coroutine, the former builders treat exceptions as **uncaught** exceptions, similar to Java's `Thread.uncaughtExceptionHandler`, while the latter are relying on the user to consume the final exception, for example via `await` or `receive` (`produce` and `receive` are covered in `Channels` section).

It can be demonstrated by a simple example that creates root coroutines using the `GlobalScope`:

>✨ `GlobalScope` is a delicate API that can backfire in non-trivial ways.  Creating a root coroutine for the whole application is one of the rare legitimate uses for `GlobalScope`, so you must explicitly opt-in into using `GlobalScope` with `@OptIn(DelicateCoroutinesApi::class)`.

```kotlin
@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking {
    val job = GlobalScope.launch { // root coroutine with launch
        println("Throwing exception from launch")
        throw IndexOutOfBoundsException() // Will be printed to the console by Thread.defaultUncaughtExceptionHandler
    }
    job.join()
    println("Joined failed job")
    val deferred = GlobalScope.async { // root coroutine with async
        println("Throwing exception from async")
        throw ArithmeticException() // Nothing is printed, relying on user to call await
    }
    try {
        deferred.await()
        println("Unreached")
    } catch (e: ArithmeticException) {
        println("Caught ArithmeticException")
    }
}
```
Output: 

```
Throwing exception from launch
Exception in thread "DefaultDispatcher-worker-1 @coroutine#2" java.lang.IndexOutOfBoundsException
	at FileKt$main$1$job$1.invokeSuspend(File.kt:7)
	at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
	at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:108)
	at kotlinx.coroutines.scheduling.CoroutineScheduler.runSafely(CoroutineScheduler.kt:584)
	at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.executeTask(CoroutineScheduler.kt:793)
	at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.runWorker(CoroutineScheduler.kt:697)
	at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.run(CoroutineScheduler.kt:684)
	Suppressed: kotlinx.coroutines.internal.DiagnosticCoroutineContextException: [CoroutineId(2), "coroutine#2":StandaloneCoroutine{Cancelling}@70f3f436, Dispatchers.Default]
Joined failed job
Throwing exception from async
Caught ArithmeticException
```

###### **CoroutineExceptionHandler**

It is possible to customize the default behavior of printing **uncaught** exceptions to the console. CoroutineExceptionHandler context element on a **root** coroutine can be used as a generic `catch` block for this root coroutine and all its children where custom exception handling may take place. It is similar to `Thread.uncaughtExceptionHandler`. You cannot recover from the exception in the `CoroutineExceptionHandler`. The coroutine had already completed with the corresponding exception when the handler is called. Normally, the handler is used to log the exception, show some kind of error message, terminate, and/or restart the application.

`CoroutineExceptionHandler` is invoked only on **uncaught** exceptions — exceptions that were not handled in any other way. In particular, all **children** coroutines (coroutines created in the context of another Job) delegate handling of their exceptions to their parent coroutine, which also delegates to the parent, and so on until the root, so the `CoroutineExceptionHandler` installed in their context is never used. In addition to that, `async` builder always catches all exceptions and represents them in the resulting Deferred object, so its `CoroutineExceptionHandler` has no effect either.

>✨ Coroutines running in supervision scope do not propagate exceptions to their parent and are excluded from this rule. A further Supervision section of this document gives more details.

```kotlin
val handler = CoroutineExceptionHandler { _, exception -> 
    println("CoroutineExceptionHandler got $exception") 
}
val job = GlobalScope.launch(handler) { // root coroutine, running in GlobalScope
    throw AssertionError()
}
val deferred = GlobalScope.async(handler) { // also root, but async instead of launch
    throw ArithmeticException() // Nothing will be printed, relying on user to call deferred.await()
}
joinAll(job, deferred)
```

The output of this code is:

```
CoroutineExceptionHandler got java.lang.AssertionError
```

###### **Cancellation and exceptions**

`Cancellation` is closely related to exceptions. Coroutines internally use `CancellationException` for cancellation, these exceptions are ignored by all handlers, so they should be used only as the source of additional debug information, which can be obtained by `catch` block. When a coroutine is cancelled using `Job.cancel`, it terminates, but it does not cancel its parent.

```kotlin
val job = launch {
    val child = launch {
        try {
            delay(Long.MAX_VALUE)
        } finally {
            println("Child is cancelled")
        }
    }
    yield()
    println("Cancelling child")
    child.cancel()
    child.join()
    yield()
    println("Parent is not cancelled")
}
job.join()
```

Output:

```
Cancelling child
Child is cancelled
Parent is not cancelled
```


If a coroutine encounters an exception other than `CancellationException`, it cancels its parent with that exception. This behaviour cannot be overridden and is used to provide stable coroutines hierarchies for structured concurrency. `CoroutineExceptionHandler` implementation is not used for child coroutines.

>✨ In these examples, `CoroutineExceptionHandler` is always installed to a coroutine that is created in `GlobalScope`. It does not make sense to install an exception handler to a coroutine that is launched in the scope of the main `runBlocking`, since the main coroutine is going to be always cancelled when its child completes with exception despite the installed handler.

The original exception is handled by the parent only when all its children terminate, which is demonstrated by the following example.

```kotlin
val handler = CoroutineExceptionHandler { _, exception -> 
    println("CoroutineExceptionHandler got $exception") 
}
val job = GlobalScope.launch(handler) {
    launch { // the first child
        try {
            delay(Long.MAX_VALUE)
        } finally {
            withContext(NonCancellable) {
                println("Children are cancelled, but exception is not handled until all children terminate")
                delay(100)
                println("The first child finished its non cancellable block")
            }
        }
    }
    launch { // the second child
        delay(10)
        println("Second child throws an exception")
        throw ArithmeticException()
    }
}
job.join()
```

Output:

```
Second child throws an exception
Children are cancelled, but exception is not handled until all children terminate
The first child finished its non cancellable block
CoroutineExceptionHandler got java.lang.ArithmeticException
```

###### **Exceptions aggregation**

When multiple children of a coroutine fail with an exception, the general rule is "the first exception wins", so the first exception gets handled. All additional exceptions that happen after the first one are attached to the first exception as suppressed ones.

```kotlin
import kotlinx.coroutines.*
import java.io.*

@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking {
    val handler = CoroutineExceptionHandler { _, exception ->
        println("CoroutineExceptionHandler got $exception with suppressed ${exception.suppressed.contentToString()}")
    }
    val job = GlobalScope.launch(handler) {
        launch {
            try {
                delay(Long.MAX_VALUE) // it gets cancelled when another sibling fails with IOException
            } finally {
                throw ArithmeticException() // the second exception
            }
        }
        launch {
            delay(100)
            throw IOException() // the first exception
        }
        delay(Long.MAX_VALUE)
    }
    job.join()  
}
```

Output:

```
CoroutineExceptionHandler got java.io.IOException with suppressed [java.lang.ArithmeticException]
```

>✨ Note that this mechanism currently only works on Java version 1.7+. The JS and Native restrictions are temporary and will be lifted in the future.

Cancellation exceptions are transparent and are unwrapped by default:


```kotlin
val handler = CoroutineExceptionHandler { _, exception ->
    println("CoroutineExceptionHandler got $exception")
}
val job = GlobalScope.launch(handler) {
    val innerJob = launch { // all this stack of coroutines will get cancelled
        launch {
            launch {
                throw IOException() // the original exception
            }
        }
    }
    try {
        innerJob.join()
    } catch (e: CancellationException) {
        println("Rethrowing CancellationException with original cause")
        throw e // cancellation exception is rethrown, yet the original IOException gets to the handler  
    }
}
job.join()
```

Output: 

```
Rethrowing CancellationException with original cause
CoroutineExceptionHandler got java.io.IOException
```

###### **Supervision**

As we have studied before, cancellation is a bidirectional relationship propagating through the whole hierarchy of coroutines. Let us take a look at the case when unidirectional cancellation is required.

A good example of such a requirement is a UI component with the job defined in its scope. If any of the UI's child tasks have failed, it is not always necessary to cancel (effectively kill) the whole UI component, but if the UI component is destroyed (and its job is cancelled), then it is necessary to cancel all child jobs as their results are no longer needed.

Another example is a server process that spawns multiple child jobs and needs to **supervise** their execution, tracking their failures and only restarting the failed ones.

_Supervision job_

The `SupervisorJob` can be used for these purposes. It is similar to a regular Job with the only exception that cancellation is propagated only downwards. This can easily be demonstrated using the following example:

```kotlin
val supervisor = SupervisorJob()
with(CoroutineScope(coroutineContext + supervisor)) {
    // launch the first child -- its exception is ignored for this example (don't do this in practice!)
    val firstChild = launch(CoroutineExceptionHandler { _, _ ->  }) {
        println("The first child is failing")
        throw AssertionError("The first child is cancelled")
    }
    // launch the second child
    val secondChild = launch {
        firstChild.join()
        // Cancellation of the first child is not propagated to the second child
        println("The first child is cancelled: ${firstChild.isCancelled}, but the second one is still active")
        try {
            delay(Long.MAX_VALUE)
        } finally {
            // But cancellation of the supervisor is propagated
            println("The second child is cancelled because the supervisor was cancelled")
        }
    }
    // wait until the first child fails & completes
    firstChild.join()
    println("Cancelling the supervisor")
    supervisor.cancel()
    secondChild.join()
}
```

Output:


```
The first child is failing
The first child is cancelled: true, but the second one is still active
Cancelling the supervisor
The second child is cancelled because the supervisor was cancelled
```

_Supervision scope_

Instead of `coroutineScope`, we can use supervisorScope for **scoped** concurrency. It propagates the cancellation in one direction only and cancels all its children only if it failed itself. It also waits for all children before completion just like `coroutineScope` does.


```kotlin
try {
    supervisorScope {
        val child = launch {
            try {
                println("The child is sleeping")
                delay(Long.MAX_VALUE)
            } finally {
                println("The child is cancelled")
            }
        }
        // Give our child a chance to execute and print using yield 
        yield()
        println("Throwing an exception from the scope")
        throw AssertionError()
    }
} catch(e: AssertionError) {
    println("Caught an assertion error")
}
```

Output:

```
The child is sleeping
Throwing an exception from the scope
The child is cancelled
Caught an assertion error
```

_Exceptions in supervised coroutines_

Another crucial difference between regular and supervisor jobs is exception handling. Every child should handle its exceptions by itself via the exception handling mechanism. This difference comes from the fact that child's failure does not propagate to the parent. It means that coroutines launched directly inside the supervisorScope `do` use the CoroutineExceptionHandler that is installed in their scope in the same way as root coroutines do (see the CoroutineExceptionHandler section for details).

```kotlin
val handler = CoroutineExceptionHandler { _, exception -> 
    println("CoroutineExceptionHandler got $exception") 
}
supervisorScope {
    val child = launch(handler) {
        println("The child throws an exception")
        throw AssertionError()
    }
    println("The scope is completing")
}
println("The scope is completed")
```

Output: 

```
The scope is completing
The child throws an exception
CoroutineExceptionHandler got java.lang.AssertionError
The scope is completed
```

#### Shared mutable state and concurrency

Coroutines can be executed parallelly using a multi-threaded dispatcher like the Dispatchers.Default. It presents all the usual parallelism problems. The main problem being synchronization of access to **shared mutable state**. Some solutions to this problem in the land of coroutines are similar to the solutions in the multi-threaded world, but others are unique.

###### **The problem**

Let us launch a hundred coroutines all doing the same action a thousand times. We'll also measure their completion time for further comparisons:

```kotlin
suspend fun massiveRun(action: suspend () -> Unit) {
    val n = 100  // number of coroutines to launch
    val k = 1000 // times an action is repeated by each coroutine
    val time = measureTimeMillis {
        coroutineScope { // scope for coroutines
            repeat(n) {
                launch {
                    repeat(k) { action() }
                }
            }
        }
    }
    println("Completed ${n * k} actions in $time ms")
}
```

We start with a very simple action that increments a shared mutable variable using multi-threaded `Dispatchers.Default`.

```kotlin
var counter = 0

fun main() = runBlocking {
    withContext(Dispatchers.Default) {
        massiveRun {
            counter++
        }
    }
    println("Counter = $counter")
}
```
What does it print at the end? It is highly unlikely to ever print "Counter = 100000", because a hundred coroutines increment the `counter` concurrently from multiple threads without any synchronization.


###### **Volatiles are of no help**

There is a common misconception that making a variable volatile solves concurrency problem. Let us try it:

```kotlin
@Volatile // in Kotlin `volatile` is an annotation 
var counter = 0

fun main() = runBlocking {
    withContext(Dispatchers.Default) {
        massiveRun {
            counter++
        }
    }
    println("Counter = $counter")
}
```

This code works slower, but we still don't always get "Counter = 100000" at the end, because volatile variables guarantee linearizable (this is a technical term for "atomic") reads and writes to the corresponding variable, but do not provide atomicity of larger actions (increment in our case).

###### **Thread-safe data structures**

The general solution that works both for threads and for coroutines is to use a thread-safe (aka synchronized, linearizable, or atomic) data structure that provides all the necessary synchronization for the corresponding operations that needs to be performed on a shared state. In the case of a simple counter we can use `AtomicInteger` class which has atomic `incrementAndGet` operations:


```kotlin
val counter = AtomicInteger()

fun main() = runBlocking {
    withContext(Dispatchers.Default) {
        massiveRun {
            counter.incrementAndGet()
        }
    }
    println("Counter = $counter")
}
```

This is the fastest solution for this particular problem. It works for plain counters, collections, queues and other standard data structures and basic operations on them. However, it does not easily scale to complex state or to complex operations that do not have ready-to-use thread-safe implementations.

###### **Thread confinement fine-grained**

**Thread confinement** is an approach to the problem of shared mutable state where all access to the particular shared state is confined to a single thread. It is typically used in UI applications, where all UI state is confined to the single event-dispatch/application thread. It is easy to apply with coroutines by using a single-threaded context.

```kotlin
val counterContext = newSingleThreadContext("CounterContext")
var counter = 0

fun main() = runBlocking {
    withContext(Dispatchers.Default) {
        massiveRun {
            // confine each increment to a single-threaded context
            withContext(counterContext) {
                counter++
            }
        }
    }
    println("Counter = $counter")
}
```

This code works very slowly, because it does **fine-grained** thread-confinement. Each individual increment switches from multi-threaded Dispatchers.Default context to the single-threaded context using `withContext(counterContext)` block.

###### **Thread confinement coarse-grained**

In practice, thread confinement is performed in large chunks, e.g. big pieces of state-updating business logic are confined to the single thread. The following example does it like that, running each coroutine in the single-threaded context to start with.


```kotlin
val counterContext = newSingleThreadContext("CounterContext")
var counter = 0

fun main() = runBlocking {
    // confine everything to a single-threaded context
    withContext(counterContext) {
        massiveRun {
            counter++
        }
    }
    println("Counter = $counter")
}
```

This now works much faster and produces correct result.

###### **Mutual exclusion**

Mutual exclusion solution to the problem is to protect all modifications of the shared state with a **critical section** that is never executed concurrently. In a blocking world you'd typically use `synchronized` or `ReentrantLock` for that. Coroutine's alternative is called Mutex. It has `lock` and `unlock` functions to delimit a critical section. The key difference is that `Mutex.lock()` is a suspending function. It does not block a thread.

There is also withLock extension function that conveniently represents `mutex.lock(); try { ... } finally { mutex.unlock() }` pattern:

```kotlin
val mutex = Mutex()
var counter = 0

fun main() = runBlocking {
    withContext(Dispatchers.Default) {
        massiveRun {
            // protect each increment with lock
            mutex.withLock {
                counter++
            }
        }
    }
    println("Counter = $counter")
}
```

The locking in this example is fine-grained, so it pays the price. However, it is a good choice for some situations where you absolutely must modify some shared state periodically, but there is no natural thread that this state is confined to.

# Idioms

A collection of random and frequently used idioms in Kotlin.

## Create DTOs (POJOs/POCOs)

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

## Default values for function parameters

```kotlin
fun foo(a: Int =0, b: String = ""){}
```

## Filter a list

```kotlin
val positives = list.filter {x: Int -> x > 0}
```
Or alternatively, even shoter:

```kotlin
val positives = list.filter {it > 0}
```

## Check the presence of an element in a collection

```kotlin
if ("john@example.com" in emailList){}
```

## String interpolation

```kotlin
println("Name $name")
```

## Read standard input safely

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

## Instance checks

```kotlin
when(x) {
    is Foo -> ...
    is Bar -> ...
    else -> ...
}
```

## Read-only list

```kotlin
val list = listOf("a", "b", "c")
```

## Read-only map


```kotlin
val map = mapOf("a" to 1, "b" to 2, "c" to 3)
```


## Access a map entry

```kotlin
println(map["key"])

map["key"]= value
```

## Traverse a map or a list of pairs

```kotlin
for ((k,v) in map) {
    println("$k -> $v")
}
```

## Iterate over a range

```kotlin
for (i in 1..100) {} // closed-ended range: includes 100
for (i in 1..<100){} // open-ended range: does not include 100
for (i in 1..100 step 2) // 2, 4, 6, ... 100
for (i in 100 downTo 1) // 100, 99, ... 1
(1..10).forEach {}
```

## Lazy property


```kotlin
val p: String by lazy {
    // The value is computed only on first access
    // compute the string
}
```

## Extension functions 


```kotlin
fun String.spaceToCamelCase() {}

"Convert this to camelcase".spaceToCamelCase()
```

## Create a singleton


```kotlin
object Resource {
    val name: String = "Name"
}
```

## Use inline value classes for type-safe values

```kotlin
@JvmInline
value class EmployeeId(private val id: String)

@JvmInline
value class CustomerId(private val id: String)
```

If you accidentally mix up `EmployeeId` and `CustomerId`, a compilation error is triggered.

>✨ The `@JvmInline` annotation is only needed for JVM backends.

## Instantiate an abstract class

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

## If-not-null shorthand

```kotlin
val files = File("Test").listFiles()

println(files?.size) // size is printed if files is not null
```


## If-not-null-else shorthand

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

## Execute a statement if null

```kotlin

val values = ...
val email = values["email"] ?: throw IllegalStateException("Email is missing!")
```

## Get first item of a possibly empty collection

```kotlin
val emails= ...
val mainEmail = emails.firstOrNull() ?: ""
```

## Execute if not null 

```kotlin
val value: String? =null 

value?.let{
    /// execute this block if not null
}
```

## Map nullable value if not null

```kotlin
val value = ...

val mapped = value?.let{
    transformValut(it)
} ?: defaultValue
```
## Return on when statement

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

## try-catch expression

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

## if expression

```kotlin
val result: String = if (x == 1){
    "one"
} else if (x == 2) {
    "two"
} else {
    "other"
}
```

## Builder-style usage of methods that return Unit

```kotlin
fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}
```

## Single-expression functions

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

## Call multiple methods on an object instance (with)

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

## Configure properties of an object (apply)

```kotlin
val myRectangle = Rectangle().apply {
    length = 4
    breadth = 5
    color = 0xFAFAFA
}
```
This is useful for configuring properties that aren't present in the object constructor.

## Java 7's try-with-resources


```kotlin
val stream = Files.newInputStream(Paths.get("/some/file.txt"))
stream.buffered().reader().use { reader ->
    println(reader.readText())
}
```

## Generic function that requires the generic type information

```kotlin
//  public final class Gson {
//     ...
//     public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
//     ...

inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)
```
## Swap two variables

```kotlin
var a = 1
var b = 2
a = b.also { b = a }
```
## Mark code as incomplete (TODO)

Kotlin's standard library has a `TODO()` function that will always throw a `NotImplementedError`. Its return type is `Nothing` so it can be used regardless of expected type. There's also an overload that accepts a reason parameter:

```kotlin
fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")
```

IntelliJ IDEA's kotlin plugin understands the semantics of TODO() and automatically adds a code pointer in the TODO tool window.

# Packages and imports

A source file may start with a package declaration.

```kotlin
package org.example

fun printMessage(){
    
}

class Message{}
```

All the contents, such as classes and functions, of the source file are included in this package. So, in the example above, the full name of `printMessage()` is `org.example.printMessage`, and the full name of `Message` is `org.example.Message`.

If the package is not specified, the contents of such a file belong to the `default` package with no name.

## Default imports 

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

## Imports

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

## Visibility of top-level declarations

If a top-level declaration is marked `private`, it's private to the file it's declared in, see [Visibility modifiers]() 


# Generics: in, out, where

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
## Variance

One of the trickiest aspects of Java's type system is the wildcard types (see Java Generics FAQ). Kotlin doesn't have these. Instead, Kotlin has declaration-site variance and type projections.

#### Variance and wildcards in Java

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


#### Declaration-side variance

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


## Type projections

#### Use-site variance: type projections

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

#### Star-projections

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


## Generic functions

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


## Generic constrains

The set of all possible types that can be substituted for a given type parameter may be restricted by **generic constrains**.

#### Upper bounds

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

## Definitely non-nullable types

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

## Type erasure

The type safety checks that Kotlin performs for generic declaration usages are done at compile time. At runtime, the instances of generic types do not hold any information about their actual type arguments. The type information is said to be **erased**. For example, the instances of `Foo<Bar>` and `Foo<Baz?>` are erased to just `Foo<*>`.

#### Generics type checks and casts

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

#### Unchecked casts

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

## Underscore operator for type arguments

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


# Kotlin for Android

You can benefit from:

- **Less code combined with greater readability:** Spend less time writing your code and working to understand the code of others.
- **Fewer common errors:** Apps built with Kotlin are 20% less likely to crash by on Google's internal data.
- **Kotlin support in Jetpack libraries:** Jetpack Compose is Android's recommended modern toolkit for building native UI in Kotlin. KTX extension and Kotlin language features, like coroutines, extension functions, lambdas, and named parameters to existing Android libraries.
- **Support for multiplatform development:** Kotlin Multiplatform, JetBrain's declarative UI framework based on Kotlin and Jetpack Compose, makes it possible to share UIs across platforms - iOS, Android, desktop, and web.
- **Mature language and environment:** Since ít creation in 2011, Kotlin has developed continuously, not only as a language but as a whole ecosystem with robust tooling. Now it's seamlessly integrated into Android Studio and is actively used by many companies for developing Android application.
- **Interoperability wih Java:** You can use Kotlin along with the Java programming language in your applications without needing to migrate all your code to Kotlin.
- **Easy leaning:** Kotlin is very easy to learn, especially for Java developers.
- **Big community:** Kotlin has great support and many contributions from the community, which is growing all over the world. Over 95% of top thousand Android apps use Kotlin.