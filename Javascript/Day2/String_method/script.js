let str = "Javascript";



console.log(str[0]);
console.log(str[1]);
console.log(str[2]);
console.log(str[3]);
console.log(str[4]);
console.log(str[5]);
console.log(str[6]);
console.log(str[7]);
console.log(str[8]);
console.log(str[9]);




// length of String

console.log(str.length);

// last Index :
console.log(str[str.length-1]);

//slice method
let strnew= str.slice(4,10);
console.log("new string after using slice method:-",strnew);


// adding two strings

let string1 = "Sayali";
let str2 = "Fapale";

let full_name = string1 + " " + str2;
console.log(full_name);  

//template string
// let name;
function myFunction(name)
{
    console.log(`welcome to javascript ${name}`);
}

myFunction("Sanika");

//toUpperCase
let str1="muskan";
console.log(str1);
console.log(str1.toUpperCase());

//trim method
let str3= "   R a d h a   ";
let newstr3=str3.trim();
console.log(str3);
console.log(str3.length);
console.log(newstr3);
console.log(newstr3.length);




