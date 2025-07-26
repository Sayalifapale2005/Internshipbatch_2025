// Get reference to the display input
const display = document.getElementById("display");

// Get all buttons
const buttons = document.querySelectorAll("button");

// Add click event listener to each button
buttons.forEach(button => {
  button.addEventListener("click", () => {
    const value = button.innerText;

    if (value === "Clear") {
      display.value = ""; // Clear the display
    } else if (value === "=") {
      try {
        display.value = eval(display.value); // Evaluate the expression
      } catch (err) {
        display.value = "Error"; // Handle invalid input
      }
    } else {
      display.value += value; // Append the clicked button value
    }
  });
});
