#OBJECT IN JAVASCRIPT
### 📘 **Short Note on Object in JavaScript**

An **object** in JavaScript is a **collection of key-value pairs**, where **keys (also called properties)** are strings (or Symbols), and **values** can be any data type (including other objects or functions).

---

### ✅ **Syntax:**

```javascript
let person = {
  name: "Sayali",
  age: 22,
  greet: function() {
    console.log("Hello!");
  }
};
```

---

### 🔑 **Key Concepts:**

* Created using **curly braces `{}`**.
* Keys are **property names**, and values can be **data or functions** (methods).
* Access values using:

  * **Dot notation**: `person.name`
  * **Bracket notation**: `person["age"]`

---

### 📌 **Example:**

```javascript
let car = {
  brand: "Toyota",
  model: "Camry",
  start: function() {
    console.log("Engine started");
  }
};

console.log(car.brand); // Toyota
car.start();            // Engine started
```

---

### 🧠 Uses:

* Store related data together
* Represent real-world entities
* Build complex data structures like arrays of objects
* Support object-oriented programming

### 🔍 **Types to Access Values in an Object (JavaScript)**

There are **two main ways** to access values from an object in JavaScript:

---

### ✅ 1. **Dot Notation (`object.key`)**

* Most common and readable
* Used when you know the exact property name

```javascript
let person = { name: "Sayali", age: 22 };

console.log(person.name); // Output: Sayali
console.log(person.age);  // Output: 22
```

---

### ✅ 2. **Bracket Notation (`object["key"]`)**

* Useful when:

  * The property name is stored in a variable
  * The property name has special characters or spaces

```javascript
let person = { name: "Sayali", "home-town": "Pune" };

console.log(person["name"]);         // Output: Sayali
console.log(person["home-town"]);    // Output: Pune

let key = "name";
console.log(person[key]);            // Output: Sayali
```

---
 🔄 Use of Spread Operator (...) in JavaScript Objects
      
      The spread operator (...) in objects is used to copy, merge, or update objects easily. 


****************************************************************************************
#FUNCTION IN JS
ChatGPT said:
📘 Short Note on Functions in JavaScript
A function in JavaScript is a block of reusable code designed to perform a specific task. Functions help in organizing code, improving readability, and reducing repetition.

🔥 Arrow Function in JavaScript
An arrow function is a shorter syntax for writing functions introduced in ES6 (ECMAScript 2015). It's especially useful for writing small, concise functions.

### 🔧 **Using `function` Keyword in JavaScript**

The `function` keyword is used to **declare** or **define** a function in JavaScript.

---

### ✅ **1. Function Declaration (Named Function)**

```javascript
function greet() {
  console.log("Hello, World!");
}
greet(); // Output: Hello, World!
```

---

### ✅ **2. Function with Parameters and Return**

```javascript
function add(a, b) {
  return a + b;
}
let result = add(5, 3);
console.log(result); // Output: 8
```

---

### ✅ **3. Function Expression**

You can also assign a function to a variable:

```javascript
const sayHi = function() {
  console.log("Hi there!");
};
sayHi(); // Output: Hi there!
```

---

### ✅ **4. Function as Argument (Callback)**

```javascript
function process(callback) {
  callback();
}

function done() {
  console.log("Task complete!");
}

process(done); // Output: Task complete!
```

