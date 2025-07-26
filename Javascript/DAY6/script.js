// Create the main card container
let card = document.createElement("div");
card.style.width = "350px";
card.style.padding = "20px";
card.style.border = "2px solid #000";
card.style.borderRadius = "10px";
card.style.fontFamily = "Arial, sans-serif";
card.style.backgroundColor = " rgba(167, 23, 23, 0.2)";
card.style.boxShadow = "0 0 10px` rgba(0,0,0,0.2)`";
card.style.margin = "50px auto";
card.style.textAlign = "center";

// Create college name heading
let collegeName = document.createElement("h2");
collegeName.innerText = "KK Wagh Polytechnic, Nashik";
collegeName.style.color = "#004080";
collegeName.style.fontSize = "18px";
collegeName.style.marginBottom = "10px";
card.appendChild(collegeName);

// Create a profile image
let profileImg = document.createElement("img");
profileImg.src = "myimg.jpeg"; 
profileImg.alt = "Student Photo";
profileImg.style.width = "100px";
profileImg.style.height = "100px";
profileImg.style.borderRadius = "50%";
profileImg.style.border = "2px solid #004080";
profileImg.style.marginBottom = "10px";
card.appendChild(profileImg);

// Student name
let studentName = document.createElement("h3");
studentName.innerText = "Sayali Fapale"; // Change name if needed
studentName.style.margin = "10px 0 5px";
studentName.style.color = "#222";
card.appendChild(studentName);

// Course details
let course = document.createElement("p");
course.innerText = "Diploma in Computer Engineering";
course.style.margin = "2px";
card.appendChild(course);

// Roll number
let rollNo = document.createElement("p");
rollNo.innerText = "Roll No: 27"; // Example
rollNo.style.margin = "2px";
card.appendChild(rollNo);

// Year or Batch
let batch = document.createElement("p");
batch.innerText = "Batch: 2022 - 2025";
batch.style.margin = "2px";
card.appendChild(batch);

// Add college logo (optional)
let logo = document.createElement("img");
logo.src = "kkwlogo.png"; // Replace if broken
logo.alt = "KK Wagh Logo";
logo.style.width = "50px";
logo.style.marginTop = "10px";
card.appendChild(logo);

// Append card to body
document.body.appendChild(card);
