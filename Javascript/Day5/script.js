//every method 
let numbers = [2, 4, 6, 8];
let allPositive = numbers.every(num => (num > 0));
console.log(allPositive); // true

//fill method
let arr = [1, 2, 3, 4];
arr.fill(0);
console.log(arr); // [0, 0, 0, 0]

//find method
let nums = [3, 7, 8, 10];
let firstEven = nums.find(n => n % 2 === 0);
console.log(firstEven); // 8

//filter method
let numbers1 = [1, 2, 3, 4, 5, 6];
let evens = numbers1.filter(num => num % 2 === 0);
console.log(evens); // [2, 4, 6]

//map method
let num = [1, 2, 3, 4];
let doubled = num.map(num => num * 2);
console.log(doubled); // [2, 4, 6, 8]

//reduce method
let nums1 = [10, 25, 7, 90];
let max = nums1.reduce((acc, curr) => (curr > acc ? curr : acc));
console.log(max); // 90
