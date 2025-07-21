**JavaScript array methods**:

---

### 🔁 **Array Modification Methods:**

1. **push()**
   ➤ Adds element(s) at the end of an array.
   `arr.push(4)`

2. **pop()**
   ➤ Removes the last element from an array.
   `arr.pop()`

3. **unshift()**
   ➤ Adds element(s) at the beginning of an array.
   `arr.unshift(1)`

4. **shift()**
   ➤ Removes the first element from an array.
   `arr.shift()`

5. **splice(start, deleteCount, ...items)**
   ➤ Adds/removes/replaces elements at a specific index.
   `arr.splice(2, 1, 'a')`

6. **slice(start, end)**
   ➤ Returns a shallow copy of part of the array.
   `arr.slice(1, 3)`

7. **concat()**
   ➤ Merges two or more arrays and returns a new one.
   `arr1.concat(arr2)`

---

### 🔍 **Searching Methods:**

8. **includes(value)**
   ➤ Checks if a value exists in the array (returns true/false).
   `arr.includes(5)`

9. **indexOf(value)**
   ➤ Returns first index of value, or -1 if not found.
   `arr.indexOf(3)`

10. **lastIndexOf(value)**
    ➤ Returns last index of value, or -1 if not found.
    `arr.lastIndexOf(3)`

---

### 🔄 **Iteration & Output:**

11. **forEach(callback)**
    ➤ Executes a function once for each array element.
    `arr.forEach(item => console.log(item))`

12. **join(separator)**
    ➤ Joins all elements into a string with a given separator.
    `arr.join(', ')`

---
