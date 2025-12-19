# 🚀 **Java 8 – Most Common & Must-Know Interview Questions**

---

## 1️⃣ **What are the main features introduced in Java 8?**

### 🎤 Final Answer to Speak:

> Java 8 introduced functional programming features to Java.
> The key features are **Lambda expressions, Functional Interfaces, Streams API, Optional, Method References, Default methods, and the new Date/Time API**.

---

## 2️⃣ **What is a Lambda Expression? Why do we need it?**

### 🎤 Final Answer:

> A lambda expression is a **short, anonymous function** that lets us write cleaner and more readable code.
>
> It helps reduce boilerplate code, especially when working with functional interfaces.

### Example:

```java
// Before Java 8
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Hello");
    }
};

// Java 8
Runnable r = () -> System.out.println("Hello");
```

---

## 3️⃣ **What is a Functional Interface?**

### 🎤 Final Answer:

> A functional interface is an interface with **exactly one abstract method**.
>
> Lambda expressions work only with functional interfaces.

### Common examples:

* Runnable
* Callable
* Comparator
* Predicate
* Function
* Consumer
* Supplier

---

## 4️⃣ **What is the @FunctionalInterface annotation? Is it mandatory?**

### 🎤 Final Answer:

> `@FunctionalInterface` is optional but recommended.
> It ensures at compile time that the interface has only one abstract method.

---

## 5️⃣ **What is the Streams API?**

### 🎤 Final Answer:

> Streams API allows us to process collections **in a declarative and functional way**.
>
> It helps write clean, readable code using operations like filter, map, and reduce.

---

## 6️⃣ **Difference between Collection and Stream?**

### 🎤 Final Answer:

| Collection    | Stream                 |
| ------------- | ---------------------- |
| Stores data   | Processes data         |
| Eager         | Lazy                   |
| Can be reused | Single-use             |
| Modifiable    | Does not modify source |

---

## 7️⃣ **What is Lazy Evaluation in Streams?**

### 🎤 Final Answer:

> Stream operations are executed **only when a terminal operation** (like `collect()` or `forEach()`) is called.
>
> This improves performance by avoiding unnecessary computations.

---

## 8️⃣ **Difference between map() and flatMap()?**

### 🎤 Final Answer:

> `map()` transforms each element into another object.
> `flatMap()` flattens nested structures into a single stream.

### Example:

```java
List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4));

list.stream().map(x -> x.stream());     // Stream<Stream<Integer>>
list.stream().flatMap(x -> x.stream()); // Stream<Integer>
```

---

## 9️⃣ **What is Optional? Why was it introduced?**

### 🎤 Final Answer:

> Optional is a container that may or may not hold a value.
>
> It was introduced to **avoid NullPointerException** and make null handling explicit.

---

## 🔟 **Difference between orElse() and orElseGet()?**

### 🎤 Final Answer:

> `orElse()` always evaluates its argument.
> `orElseGet()` evaluates only when value is absent.

### Example:

```java
optional.orElse(expensiveMethod());      // Always executed
optional.orElseGet(() -> expensiveMethod()); // Lazy
```

---

## 1️⃣1️⃣ **What is Method Reference?**

### 🎤 Final Answer:

> Method reference is a shorthand way to refer to an existing method using `::`.
> It improves readability.

### Example:

```java
list.forEach(System.out::println);
```

---

## 1️⃣2️⃣ **Types of Method References**

### 🎤 Final Answer:

1. Static method reference – `ClassName::staticMethod`
2. Instance method reference – `object::method`
3. Arbitrary object method – `ClassName::method`
4. Constructor reference – `ClassName::new`

---

## 1️⃣3️⃣ **What are Default Methods in Interfaces?**

### 🎤 Final Answer:

> Default methods allow interfaces to have method implementations using the `default` keyword.
>
> They help in adding new methods without breaking existing implementations.

---

## 1️⃣4️⃣ **What is the new Date/Time API in Java 8? Why was it needed?**

### 🎤 Final Answer:

> The old Date API was mutable and not thread-safe.
>
> Java 8 introduced a new immutable and thread-safe Date/Time API under `java.time`.

### Common classes:

* LocalDate
* LocalTime
* LocalDateTime
* ZonedDateTime

---

## 1️⃣5️⃣ **Difference between findFirst() and findAny()?**

### 🎤 Final Answer:

> `findFirst()` returns the first element in encounter order.
> `findAny()` may return any element and is faster in parallel streams.

---

## 1️⃣6️⃣ **What is Parallel Stream? When should you avoid it?**

### 🎤 Final Answer:

> Parallel streams process data using multiple threads.
>
> Avoid them when:
>
> * Tasks are I/O bound
> * Order matters
> * Shared mutable state exists

---

## 1️⃣7️⃣ **Difference between forEach() and forEachOrdered()?**

### 🎤 Final Answer:

> `forEach()` doesn’t guarantee order in parallel streams.
> `forEachOrdered()` preserves order but is slower.

---

## 1️⃣8️⃣ **What is Reduce Operation?**

### 🎤 Final Answer:

> Reduce combines elements of a stream into a single result.
> Example: sum, max, concatenation.

```java
int sum = list.stream().reduce(0, Integer::sum);
```

---

## 1️⃣9️⃣ **What is Collectors?**

### 🎤 Final Answer:

> Collectors provide common reduction operations like collecting into lists, sets, maps, grouping, partitioning, etc.

---

## 2️⃣0️⃣ **Difference between Predicate, Function, Consumer, Supplier**

### 🎤 Final Answer:

| Interface | Input | Output  |
| --------- | ----- | ------- |
| Predicate | T     | boolean |
| Function  | T     | R       |
| Consumer  | T     | void    |
| Supplier  | none  | T       |

---

## 2️⃣1️⃣ **Can Lambda expressions access local variables?**

### 🎤 Final Answer:

> Yes, but only **effectively final** variables.
> This avoids concurrency issues.

---

## 2️⃣2️⃣ **What is Optional.map() vs Optional.flatMap()?**

### 🎤 Final Answer:

> `map()` wraps result in Optional.
> `flatMap()` avoids nested Optional.

---

## 2️⃣3️⃣ **How Java 8 supports Functional Programming?**

### 🎤 Final Answer:

> Java 8 supports functional programming through:
>
> * Lambda expressions
> * Functional interfaces
> * Streams
> * Method references

---

## 2️⃣4️⃣ **Common Mistakes in Java 8 (Interview Tip)**

### 🎤 Final Answer:

> * Using parallel streams blindly
> * Modifying shared state in streams
> * Using Optional as method parameter
> * Overusing streams where loops are clearer

---

## 🎯 **How to Answer Java 8 Questions Confidently**

Remember this flow:
1️⃣ Why Java 8 was introduced
2️⃣ Lambda + Functional Interfaces
3️⃣ Streams + Lazy evaluation
4️⃣ Optional
5️⃣ Parallel streams cautions

---

If you want, I can:
✔ Give **Java 8 mock interview**
✔ Create a **1-page Java 8 cheat sheet**
✔ Map **Java 8 usage to your payment project**

Just tell me 👍
