*GRID
### 🔲 **CSS Grid in Short**

**CSS Grid** is a **2D layout system** in CSS that lets you design web layouts using **rows and columns**.

---

### 🧱 **Key Terms**

* **Grid Container** → Parent with `display: grid`
* **Grid Items** → Children of the container
* **Rows & Columns** → Defined using `grid-template-rows` and `grid-template-columns`
* **Gap** → Adds spacing between items

---

### ✨ **Basic Example**

```css
.container {
  display: grid;
  grid-template-columns: 1fr 2fr;
  gap: 10px;
}
```

---

### 📊 **Why Use Grid?**

* Two-dimensional layout (rows + columns)
* Great for **complex page layouts**
* Combines well with Flexbox

---

### ⚔️ **Grid vs Flexbox**

| Grid             | Flexbox         |
| ---------------- | --------------- |
| 2D (rows & cols) | 1D (row or col) |
| Layout-based     | Content-based   |

---


#ANIMATION
---

### 🎞️ **CSS Animation – In Short**

**CSS Animation** allows elements to **change styles over time** without using JavaScript.

---

### 🔑 **Key Properties**

| Property                    | Purpose                                         |
| --------------------------- | ----------------------------------------------- |
| `@keyframes`                | Defines the animation steps                     |
| `animation-name`            | Name of the keyframes                           |
| `animation-duration`        | How long the animation runs                     |
| `animation-delay`           | Delay before animation starts                   |
| `animation-iteration-count` | How many times it repeats                       |
| `animation-direction`       | Normal / Reverse / Alternate                    |
| `animation-fill-mode`       | Style before/after animation (e.g., `forwards`) |

---

### 🧪 **Basic Example**

```css
@keyframes slide {
  from { transform: translateX(0); }
  to { transform: translateX(100px); }
}

.box {
  animation-name: slide;
  animation-duration: 2s;
  animation-iteration-count: infinite;
}
```

---

### ⚡ Shorthand

```css
animation: slide 2s ease-in-out infinite;
```

---

### 💡 Use Cases

* Button hover effects
* Loading spinners
* Slide-in/out elements
* Fading banners

---

