### ✅ **Short Note on Arrays in JavaScript**

* An **array** is a special variable used to store **multiple values** in a single variable.
* Arrays are **zero-indexed**, meaning the first element is at index `0`.
* Created using square brackets `[]`.

---

### 💡 **Example:**

```javascript
let colors = ["red", "blue", "green"];
```

---

### 🔁 **Common Methods:**

* `push()` – Adds element to end
* `pop()` – Removes last element
* `shift()` – Removes first element
* `unshift()` – Adds element at beginning
* `length` – Returns total number of elements

---

### 🔄 **Looping Example:**

```javascript
for (let i = 0; i < colors.length; i++) {
  console.log(colors[i]);
}
```

✅ Arrays can hold **numbers, strings, objects, or mixed types**.


### ✅ **Short Note on Loops in JavaScript**

Loops are used to **execute a block of code repeatedly** based on a condition.

---

### 🔁 **Types of Loops:**

1. **`for` loop** – Used when the number of iterations is known.

   ```javascript
   for (let i = 0; i < 5; i++) {
     console.log(i);
   }
   ```

2. **`while` loop** – Repeats as long as the condition is true.

   ```javascript
   let i = 0;
   while (i < 5) {
     console.log(i);
     i++;
   }
   ```

3. **`do...while` loop** – Runs **at least once**, then checks condition.

   ```javascript
   let i = 0;
   do {
     console.log(i);
     i++;
   } while (i < 5);
   ```

---

### 🔄 **Special Loops for Arrays:**

* `for...of` – Loops through array values

  ```javascript
  for (let color of colors) {
    console.log(color);
  }
  ```

* `for...in` – Loops through object keys or array indexes

  ```javascript
  for (let index in colors) {
    console.log(colors[index]);
  }
  ```

### ✅ **Short Note on String Methods in JavaScript**

Strings in JavaScript are used to store and manipulate **text**. JavaScript provides several **built-in methods** to work with strings.

---

### 💡 **Common String Methods:**

| Method              | Description                           | Example                                  |
| ------------------- | ------------------------------------- | ---------------------------------------- |
| `length`            | Returns the length of the string      | `"hello".length` → `5`                   |
| `toUpperCase()`     | Converts string to uppercase          | `"hello".toUpperCase()` → `"HELLO"`      |
| `toLowerCase()`     | Converts string to lowercase          | `"HELLO".toLowerCase()` → `"hello"`      |
| `includes()`        | Checks if string contains a substring | `"hello".includes("he")` → `true`        |
| `indexOf()`         | Returns index of first occurrence     | `"hello".indexOf("e")` → `1`             |
| `slice(start, end)` | Extracts part of a string             | `"hello".slice(1, 4)` → `"ell"`          |
| `trim()`            | Removes whitespace from both ends     | `"  hello  ".trim()` → `"hello"`         |
| `replace()`         | Replaces part of the string           | `"hello".replace("h", "y")` → `"yello"`  |
| `charAt(index)`     | Returns character at specified index  | `"hello".charAt(0)` → `"h"`              |
| `split()`           | Splits string into array              | `"a,b,c".split(",")` → `["a", "b", "c"]` |

---

### 🔍 **Example:**

```javascript
let name = " JavaScript ";
console.log(name.trim().toUpperCase());  // Output: JAVASCRIPT
```

### ✅ **Short Note on Conditional Statements in JavaScript**

Conditional statements are used to **make decisions** based on **conditions**. They allow your program to take different paths.

---

### 🔁 **Types of Conditional Statements:**

1. ### **`if` Statement**

   Executes a block if the condition is true.

   ```javascript
   if (age > 18) {
     console.log("Adult");
   }
   ```

2. ### **`if...else` Statement**

   Executes one block if condition is true, another if false.

   ```javascript
   if (marks >= 40) {
     console.log("Pass");
   } else {
     console.log("Fail");
   }
   ```

3. ### **`if...else if...else`**

   Checks multiple conditions.

   ```javascript
   if (marks >= 75) {
     console.log("Distinction");
   } else if (marks >= 40) {
     console.log("Pass");
   } else {
     console.log("Fail");
   }
   ```

4. ### **`switch` Statement**

   An alternative to many `if...else` conditions.

   ```javascript
   let day = "Monday";
   switch (day) {
     case "Monday":
       console.log("Start of week");
       break;
     case "Friday":
       console.log("Weekend soon");
       break;
     default:
       console.log("Midweek");
   }
   ```

---







