const arr=[1,2,3,4,5]
console.log("array :-",arr);


//push method
arr.push(6);
console.log("array after push method:-",arr);


//pop method
arr.pop();
console.log("array after pop method:-",arr);


//shift method
arr.shift();
console.log("array after shift method:-",arr);


//unshift method
arr.unshift(1);
console.log("array after unshift method:-",arr);

//concat method
arr1=[1,2,3,4,5];
arr2=[,6,7,8,9,10];
arr3=arr1+arr2;
console.log("array after concat method:-",arr3);

// COnvert arr to String
//  replace and replaceAll method
const charArr = ["A", "M", "A", "N"];
const res = charArr.toString().replaceAll(",", "");
console.log(res);

//slice method
const newarr=arr.slice(2,5);
console.log("array after slice method:-",newarr);


//splice method
arr.splice(1,2,8);
console.log("array after splice method:-",arr);

//join method
let fruits = ["apple", "banana", "cherry"];
// console.log(fruits);
let result = fruits.join();
console.log("array after join method:-",result);

//includes method
//indexOf method
//lastIndexOf method
let newArray = ["N", 1, 3, 4, 5, "A", 87];
console.log(newArray.includes("A"));
console.log(newArray.includes(2));
console.log(newArray.indexOf(2));
console.log(newArray.indexOf("N"));
console.log(newArray.lastIndexOf("N"));

//forEach method
let numbers = [1, 2, 3, 4];
numbers.forEach((num, index) => {
  console.log(`Index ${index}: ${num}`);
});

