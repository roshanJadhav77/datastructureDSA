#### 1. Why Java is not 100 % object oriented ?
a. primitive data types
   Java includes primitive data types like int, double, boolean, short, float, long and char which are not object.
   in pure Object oriented language everything should be object including basic data types

b. Static members and Methods
    Java supports static members (variables and methods)that are associated with class rather than an instance of class.
    in a static OOP everything should be encapsulated within objects and there should be no concept of static members.

#### 2. Why pointers are not used in Java ?
Answer:
    Memory safety - java manages memory automatically using garbage collection, avoiding issues like dangling pointer and memory leaks.
    platform Independence - java uses references instead of pointers to ensure code runs consistently across different hardware architectures.
    simplicity - java's design hides complexity  of direct memory management, making it easier to write and maintain the code.
    security - By avoiding pointers java prevents unauthorized access to memory locations enhancing the security.____

#### 3. What is 'JIT' compiler in java ?
Answer:
    JDK compilers java source code to byte code then byte code is converted to native machine code which is understood by system.
    JRE converts byte code to machine code for this conversion interpreter and JIT compiler are required.

#### 4. What is Interpreter:
Answer:
    Interpreter interpret the code line by line and converts it into native machine code.

#### 4. What is Write Once Run Anywhere concept in Java ?
Answer:
    Java compiler converts source code to byte code, byte code comprises instructions for the java virtual machine and is not bound to any specific hardware or OS.
    the compiler byte code is executable on any device  with compatible JVM .

#### 5. What is 'marker interface' in java ?
Answer:
    A marker interface is a interface that does not declare any method.
    basically empty interface, it is also known as Tag interface.
    ex:
    Serializable, cloneable, Remote interface
    Why Do We Need It?
    Marker interfaces are used to give metadata or signals to the Java runtime or tools that a class has a special behavior or permission.

Real-Life Analogy:::
    Imagine a movie set. Actors with a VIP badge get access to special areas. The badge doesn’t say anything — it just shows you’re VIP.
    Similarly, a marker interface is like a VIP badge for Java classes — it doesn't do anything itself, but the system checks for it to make decisions.

6. What is Serializable ?
Answer:
    Serializable is a marker interface in java.io package — it marks a class as serializable, meaning its objects can be converted to a byte stream (to save to a file, send over a network, etc.).
