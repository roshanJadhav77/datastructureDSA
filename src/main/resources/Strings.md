
# 🚀 **Java String & Immutability — Must-Know + Tricky Interview Questions**

---

## 🔹 PART 1: **Java String — Core & Must-Know**

---

## 1️⃣ **Why is String immutable in Java?**

### 🎤 Final Answer to Speak:

> String is immutable to ensure **security, thread safety, and performance**.
>
> * Security: Used in class loading, file paths, DB connections
> * Thread safety: Safe to share between threads
> * Performance: Hashcode caching improves HashMap performance
> * String Pool works correctly only because Strings are immutable

---

## 2️⃣ **What is String Pool? How does it work?**

### 🎤 Final Answer:

> String Pool is a special memory area in the heap that stores **unique String literals**.
>
> When a String literal is created, JVM checks the pool.
> If it exists, the reference is reused; otherwise, a new String is added.

```java
String a = "java";
String b = "java"; // same reference
```

---

## 3️⃣ **Difference between `String s = "abc"` and `String s = new String("abc")`?**

### 🎤 Final Answer:

> `"abc"` is stored in String Pool.
> `new String("abc")` creates a **new object in heap**, even if `"abc"` exists in the pool.

---

## 4️⃣ **Why are Strings immutable but StringBuilder is mutable?**

### 🎤 Final Answer:

> String is immutable for safety and reuse.
> StringBuilder is mutable to provide **better performance** for string manipulation.

---

## 5️⃣ **String vs StringBuffer vs StringBuilder**

| Feature     | String | StringBuffer | StringBuilder |
| ----------- | ------ | ------------ | ------------- |
| Mutable     | ❌      | ✅            | ✅             |
| Thread-safe | ✅      | ✅            | ❌             |
| Performance | Slow   | Medium       | Fast          |

---

## 🔹 PART 2: **Immutability — Very Important**

---

## 6️⃣ **What is an Immutable class?**

### 🎤 Final Answer:

> An immutable class is one whose **state cannot be changed after creation**.

---

## 7️⃣ **How do you create a custom Immutable class?**

### 🎤 Final Answer:

Steps:

1. Make class `final`
2. Make fields `private final`
3. No setters
4. Initialize via constructor
5. Defensive copies for mutable fields

### Example:

```java
final class Employee {
    private final String name;
    private final List<String> skills;

    public Employee(String name, List<String> skills) {
        this.name = name;
        this.skills = new ArrayList<>(skills);
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }
}
```

---

## 8️⃣ **Why immutability is important in multithreading?**

### 🎤 Final Answer:

> Immutable objects are inherently thread-safe because their state never changes.
> No synchronization is required.

---

## 🔹 PART 3: **Tricky String Questions (Very Common)**

---

## 9️⃣ **What will be the output?**

```java
String a = "hello";
a.concat("world");
System.out.println(a);
```

### 🎤 Answer:

```
hello
```

> Because String is immutable — `concat()` creates a new object.

---

## 🔟 **What is the output?**

```java
String a = "java";
String b = a;
a = "python";
System.out.println(b);
```

### 🎤 Answer:

```
java
```

---

## 1️⃣1️⃣ **What happens when you do `String s = s + "abc"`?**

### 🎤 Answer:

> A new String object is created.
> Old String becomes eligible for GC.

---

## 1️⃣2️⃣ **Why String is slow in loops?**

```java
for(int i=0;i<1000;i++){
    s += i;
}
```

### 🎤 Answer:

> Each concatenation creates a new String → performance issue.
> Use StringBuilder.

---

## 🔹 PART 4: **equals() vs == (VERY IMPORTANT)**

---

## 1️⃣3️⃣ **Difference between == and equals() in String?**

### 🎤 Final Answer:

> `==` compares references.
> `equals()` compares content.

---

## 1️⃣4️⃣ **Output?**

```java
String a = "java";
String b = new String("java");
System.out.println(a == b);
System.out.println(a.equals(b));
```

### 🎤 Answer:

```
false
true
```

---

## 🔹 PART 5: **String Intern & Tricky Intern Questions**

---

## 1️⃣5️⃣ **What does intern() do?**

### 🎤 Final Answer:

> `intern()` adds the string to String Pool if not present and returns the pooled reference.
String literals are automatically `interned`, while strings created with new are not by default.
> `new String --> string litrals(String pool)`
---

## 1️⃣6️⃣ **Tricky Output**

```java
String s1 = new String("java").intern();
String s2 = "java";
System.out.println(s1 == s2);
```

### 🎤 Answer:

```
true
```

---

## 🔹 PART 6: **Java Record Feature (Java 16+)**

---

## 1️⃣7️⃣ **What is a Record in Java?**

### 🎤 Final Answer:

> A record is a **compact syntax for immutable data carrier classes**.
> It automatically generates constructor, getters, equals, hashCode, and toString.

---

## 1️⃣8️⃣ **Why were Records introduced?**

### 🎤 Final Answer:

> To reduce boilerplate code and promote immutability.

---

## 1️⃣9️⃣ **Are Records immutable?**

### 🎤 Final Answer:

> Records are **shallowly immutable**.
> Fields are final, but mutable objects inside can still change.

---

## 2️⃣0️⃣ **Can we add methods in Records?**

### 🎤 Final Answer:

> Yes, we can add custom methods and validation logic.

---

## 2️⃣1️⃣ **Can Records extend a class?**

### 🎤 Final Answer:

> No. Records implicitly extend `java.lang.Record`.

---

## 🔹 PART 7: **Record vs POJO vs Immutable Class**

| Feature     | Record  | Immutable Class | POJO    |
| ----------- | ------- | --------------- | ------- |
| Boilerplate | Minimal | High            | Medium  |
| Mutability  | Shallow | Deep            | Mutable |
| Best use    | DTO     | Domain objects  | General |

---

## 🔹 PART 8: **Tricky Record Questions**

---

## 2️⃣2️⃣ **Can Record have setters?**

### 🎤 Answer:

> No. Records do not allow setters.

---

## 2️⃣3️⃣ **Can Record fields be changed?**

### 🎤 Answer:

> No, fields are final.

---

## 2️⃣4️⃣ **Can we override equals() in Record?**

### 🎤 Answer:

> Yes, but generally not recommended unless required.

---

## 🔹 PART 9: **Very Tricky Interview Questions**

---

## 2️⃣5️⃣ **Is String truly immutable?**

### 🎤 Answer:

> Yes, logically immutable.
> Reflection can break it, but that's not standard usage.

---

## 2️⃣6️⃣ **Why StringBuilder is not thread-safe?**

### 🎤 Answer:

> No synchronization is applied — to improve performance.

---

## 2️⃣7️⃣ **Can String be garbage collected?**

### 🎤 Answer:

> Yes, if no references exist — even pooled strings in modern JVMs.

---

## 🔹 PART 10: **Final Interview Summary (30 seconds)**

> “String is immutable for security, performance, and thread safety.
> String Pool optimizes memory usage.
> For heavy modifications, StringBuilder is preferred.
> Java Records provide a clean way to create immutable data carriers with less boilerplate.”


