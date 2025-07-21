 //creating object
 const product={
    productId:101,
    productName:"Laptop",
    productPrice:75000,
}

console.log(typeof(product));

//accesing values in  product object using dot notation
console.log(product.productId);
console.log(product.productName);
console.log(product.productPrice);

//accessing values in product object using bracket notation
// console.log(product["productId"]);
// console.log(product["productName"]);
// console.log(product["productPrice"]);

//adding new value in object
product.Company="Hp";
console.log(product.Company);

//iterate thtough objects
for(let key in product){
    console.log(key," : " ,product[key]);
}

//creating array of objects
const productDetails=[
    {
        productId:1,
        productName:"Mobile",
        productPrice:60000,
    },
    {
        productId:2,
        productName:"Tablet",
        productPrice:65000,
    },
    {
        productId:3,
        productName:"Computer",
        productPrice:80000,
    }
]
//accessing the values in array of objects
console.log(productDetails[0].productId);
console.log(productDetails[0].productName);
console.log(productDetails[0].productPrice);
console.log(productDetails[1].productId);
console.log(productDetails[1].productName);
console.log(productDetails[1].productPrice);
console.log(productDetails[2].productId);
console.log(productDetails[2].productName);
console.log(productDetails[2].productPrice);

//spread opertor
let arr1 = [1, 2, 3];
let arr2 = [...arr1]; // copies all elements
console.log(arr2); // [1, 2, 3]





