//arrow function
const multiplication=()=>{
    return 2*4;

}
// console.log(multiplication);

const result=multiplication();
console.log(result);

//callback function
function myfunc(name)
{
    console.log(`Welcome to javascript ${name}`);
}
 function myfunc1(callback)
 {
    console.log("Lets learn how to use callback function.");
    myfunc("Sayali");
 }

 myfunc1(myfunc);


 //default parameter
 function myfunc2(a,b=0)
 {
    return a+b;
 }

 const ans=myfunc2(6);
 console.log(ans);

 //function returning function
 function fun1()
 {
    console.log("Its function1...")
    function fun2()
    {
        return "Its function2..."
    }

    return fun2();
 }


 //Lexical Scope in JavaScript
 const result1=fun1();
 console.log(result1);

 function greet(name) {
  let message = "Hello";

  return function() {
    console.log(`${message}, ${name}`);
  };
}

let sayHi = greet("Sayali");
sayHi(); // Output: Hello, Sayali
