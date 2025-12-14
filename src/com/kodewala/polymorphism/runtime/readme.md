
# Core OOP & Runtime Polymorphism Concepts

## 1️⃣ Inheritance
- Child class inherits parent class members
- Reuse code without rewriting

```java
class Parent {
    void greet() { System.out.println("Hello from Parent"); }
}

class Child extends Parent {
    void greetChild() { System.out.println("Hello from Child"); }
}

Child c = new Child();
c.greet();       // from Parent
c.greetChild();  // from Child
```

---

## 2️⃣ Method Overriding
- Child provides its own version of a parent method
- Same method signature

```java
class Parent {
    void show() { System.out.println("Parent"); }
}

class Child extends Parent {
    @Override
    void show() { System.out.println("Child"); }
}

Child c = new Child();
c.show(); // Child
```

---

## 3️⃣ Upcasting
- Parent reference points to Child object
- Compiler only sees parent members
- JVM decides which overridden method runs

```java
Parent p = new Child(); // upcasting
p.show(); // calls Child's show() at runtime
```

- Access limited to parent methods
- Enables **polymorphism**

---

## 4️⃣ Runtime Polymorphism (Dynamic Method Dispatch)
- Parent reference can point to different child objects
- Same method call, behavior changes at runtime

```java
Parent p;

p = new Dog();
p.sound(); // Dog barks

p = new Cat();
p.sound(); // Cat meows
```

---

## 5️⃣ Why Child reference alone is not polymorphism
```java
Child c = new Child();
c.show(); // works, but cannot switch to another child
```
- Overriding exists
- But no **runtime substitution**
- Code is **tightly coupled**

---

## 6️⃣ Parent reference vs Child reference
| Reference type | Access | Polymorphism |
|----------------|--------|--------------|
| Parent p = new Child() | Only parent members | ✅ Yes (runtime substitution) |
| Child c = new Child()  | Parent + Child members | ❌ No (fixed implementation) |

---

## 7️⃣ Practical Example: List
- Code to **interface**, not implementation
- Allows easy substitution

```java
List<String> list = new ArrayList<>();
list.add("A");

list = new LinkedList<>();
list.add("B");
```

- Logic stays the same  
- Implementation can change

---

## 8️⃣ Key Principles
- **Reference type** decides what can be accessed (compile-time)  
- **Object type** decides which method runs (runtime)  
- Use **parent/interface references** for flexibility  
- Use **child/concrete references** only when no substitution needed

```java
Payment p = new UPI(); // flexible, can switch to Card later
Child c = new Child(); // fixed, no substitution
```

---

## 9️⃣ Mental Model
- Overriding = mechanism  
- Polymorphism = **using that mechanism via parent references**  
- Core idea = **write stable logic, swap behavior at runtime**
