### 🟡 **DOM Basic Structure**

DOM (Document Object Model) represents the structure of an HTML document as a tree.

**Structure:**

* `document` → Root of the DOM

  * `html`

    * `head`

      * `title`, `meta`, etc.
    * `body`

      * `div`, `p`, `h1`, `ul`, etc.

---

### 🟢 **DOM Selection Methods**

| Method                     | Description                                                 |
| -------------------------- | ----------------------------------------------------------- |
| `getElementById()`         | Selects an element by **ID**                                |
| `getElementsByClassName()` | Selects elements by **class name** (returns HTMLCollection) |
| `getElementsByTagName()`   | Selects elements by **tag name**                            |
| `querySelector()`          | Selects the **first** matching element (CSS selector)       |
| `querySelectorAll()`       | Selects **all** matching elements (NodeList)                |

---

### 🔵 **DOM Manipulation Methods**

| Method / Property     | Use                       |
| --------------------- | ------------------------- |
| `.innerHTML`          | Get/set HTML content      |
| `.textContent`        | Get/set text content      |
| `.style.property`     | Change CSS styles         |
| `.setAttribute()`     | Add/change an attribute   |
| `.getAttribute()`     | Get an attribute value    |
| `.classList.add()`    | Add a class               |
| `.classList.remove()` | Remove a class            |
| `.classList.toggle()` | Toggle a class            |
| `createElement()`     | Create a new element      |
| `appendChild()`       | Add an element as a child |
| `removeChild()`       | Remove a child element    |

---


