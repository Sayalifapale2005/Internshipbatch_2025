### 🔶 **DOM Events**

**Events** are actions that happen in the browser — e.g., clicking, typing, loading, etc.

**Common Events:**

| Event       | Description        |
| ----------- | ------------------ |
| `click`     | Mouse click        |
| `mouseover` | Mouse over element |
| `keydown`   | Key is pressed     |
| `submit`    | Form is submitted  |
| `load`      | Page is loaded     |

**Event Handling Methods:**

* `element.addEventListener("event", function)` → Recommended
* `onclick = function` → Older method

---

### 🔷 **Event Flow (3 Phases)**

1. **Capture Phase (Capturing/Bubbling from top to target):**

   * Event travels **from document → target element**
   * Use: `addEventListener(event, handler, true)`

2. **Target Phase:**

   * Event reaches the **actual element** that was triggered

3. **Bubble Phase (Bubbling):**

   * Event bubbles **back from target → document**
   * Default phase for `addEventListener(event, handler)`

---


