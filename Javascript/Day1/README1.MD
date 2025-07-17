#KEYWORDS TO DECLARE VARIABLE 

### 🟨 JavaScript Variable Keywords – `var`, `let`, and `const`

#### 1️⃣ `var`

* **Old way** to declare variables.
* **Function-scoped**.
* Can be **redeclared and updated**.
* **Hoisted** (moved to the top of the function, but undefined until used).

```javascript
var x = 10;
```

---

#### 2️⃣ `let`

* Introduced in **ES6 (2015)**.
* **Block-scoped** (limited to `{}` block).
* Can be **updated**, but **not redeclared** in the same scope.
* Not hoisted like `var`.

```javascript
let x = 20;
```

---

#### 3️⃣ `const`

* Also introduced in **ES6**.
* **Block-scoped**.
* **Cannot be updated or redeclared**.
* Must be **initialized** at the time of declaration.
* Used for **constants** (unchanging values).

```javascript
const pi = 3.14;
```
**************************************************************************************************
✅ Rules for Declaring Variables in JavaScript
1️⃣ Valid Keywords
Use var, let, or const to declare variables.

2️⃣ Naming Rules
Variable names must start with a letter (a-z, A-Z), underscore (_), or dollar sign ($)

✅ Valid: name, _value, $price

❌ Invalid: 1name, @value

3️⃣ Case Sensitive
JavaScript treats Name and name as different variables.


********************************************************************************************************
#DATATYPES IN JS

### 🟨 **JavaScript Data Types**

JavaScript has two main types of data:

---

### 🔹 **1. Primitive Data Types** (store single values)

| Data Type   | Example                                     | Description                        |
| ----------- | ------------------------------------------- | ---------------------------------- |
| `String`    | `"Hello"`                                   | Sequence of characters             |
| `Number`    | `42`, `3.14`                                | Integer or floating-point number   |
| `Boolean`   | `true`, `false`                             | True or false values               |
| `Null`      | `null`                                      | Empty or non-existent value        |
| `Undefined` | `undefined`                                 | Variable declared but not assigned |
| `BigInt`    | `1234567890123456789012345678901234567890n` | Large integers                     |
| `Symbol`    | `Symbol('id')`                              | Unique and immutable identifier    |

---

### 🔹 **2. Non-Primitive (Reference) Data Types**

| Data Type  | Example                      | Description                   |
| ---------- | ---------------------------- | ----------------------------- |
| `Object`   | `{ name: "Alice", age: 25 }` | Collection of key-value pairs |
| `Array`    | `[1, 2, 3]`                  | Ordered list of values        |
| `Function` | `function greet() {}`        | Block of reusable code        |
| `Date`     | `new Date()`                 | Represents date and time      |

---

### 🔎 How to Check Type?

Use `typeof` operator:

```javascript
typeof "hello"; // "string"
typeof 42;      // "number"
typeof true;    // "boolean"
typeof null;    // "object" (⚠️ a known quirk in JS)
```

---


