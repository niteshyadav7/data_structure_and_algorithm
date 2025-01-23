// const authModule = (function () {
//   let loggedInUser = null;
//   function login(username, password) {
//     loggedInUser = username;
//   }
//   function logout() {
//     loggedInUser = null;
//   }
//   function getUser() {
//     return loggedInUser;
//   }
//   return {
//     login,
//     logout,
//     getUser,
//   };
// })();

// // authModule.login("Nitesh", 1234);
// // console.log(authModule.getUser());

// // currying

// function counter() {
//   let count = 0;
//   function increase() {
//     count++;
//   }
//   function decrease() {
//     count--;
//   }
//   return count;
// }

// // memoization

// function complexCalucation(num) {
//   let sum = 0;
//   for (var i = 1; i <= num; i++) {
//     sum += i;
//   }
//   return sum;
// }
// const memo = function (fn) {
//   let ans = {
//     5: 15,
//   };
//   return function (...args) {
//     let n = args[0];
//     if (n in ans) {
//       console.log("from memo:");
//       return ans[n];
//     } else {
//       let complexCalucation = fn(n);
//       ans[n] = complexCalucation;
//       console.log("without memo");
//       return complexCalucation;
//     }
//   };
// };
// const ans = memo(complexCalucation)(6);
// console.log(ans);

// function print() {
//   for (var i = 1; i <= 5; i++) {
//     setTimeout(() => {
//       console.log(i);
//     }, i * 1000);
//   }
// }
// print()

// Hoisting : Hositing is the behaviour in js where variables and function declarations are moved to top to the containing scope during
// the compliation phase , before the code is executed. This means that we can access the variable and functions before declarations.

// console.log(myName);
// var myName = "Nitesh";
// console.log(myName);
// function printName(args) {
//   console.log(`My name is ${args}`);
// }
// printName(myName);

// // var is the global scope while let and const are scoped variables means they are hoisted but in different ways
// // like var is store into the global scope and let and const are store in script scope <i.e we can't access these variable before>.

// // Closure:A closure is feature of JS where the inner function can access it's own scope ,the outer scope of the function, and global
// // scope even after the function is returned from the callstack

// function parent(parent) {
//   function child(child) {
//     console.log(child, parent);
//   }
//   return child;
// }
// parent("Hello!")("Nitesh");

// const counter = function () {
//   let count = 0;
//   function increase() {
//     count++;
//   }
//   function decrease() {
//     count--;
//   }
//   function getCount() {
//     return count;
//   }
//   return { increase, decrease, getCount };
// };
// let ans = counter();
// for (let i = 1; i <= 10; i++) {
//   ans.increase();
// }
// console.log(ans.getCount());

// function complexCalucation(n) {
//   if (n <= 1) return n;
//   return complexCalucation(n - 1) + complexCalucation(n - 2);
// }

// const memo = function (cb) {
//   let cache = {};
//   return function (...args) {
//     const n = args[0];
//     if (n in cache) {
//       console.log(`From memo : ${cache[n]}`);
//     } else {
//       console.log(`Withour memo : ${cb(n)}`);
//       cache[n] = cb(n);
//     }
//   };
// };

// memo(complexCalucation)(10);
// memo(complexCalucation)(10);

// Callback function: A callback function is a function passed into the another function as an argument ,then invoked inside the outer
// function to complete the some routine or action.

/**
function sayGoodBye() {
  console.log(`GoodBye!`);
}

function greet(name, callback) {
  console.log(`Hello, ${name}`);
  callback();
}

greet("Nitesh", sayGoodBye);

function fetchData(callback) {
  setTimeout(() => {
    const data = { name: "Alice", age: 23 };
    callback(data);
  }, 2000);
}

function dataRetrieve(data) {
  console.log(`My name is ${data.name} and I'm ${data.age} years old.`);
}

fetchData(dataRetrieve);


function first(cb) {
  setTimeout(() => {
    console.log(1);
    cb();
  }, 3000);
}
function second(cb) {
  setTimeout(() => {
    console.log(2);
    cb();
  }, 2000);
}
function third() {
  setTimeout(() => {
    console.log(3);
  }, 1000);
}
 */

// Hoisting :A Hoisting is a behaviour in javascript where variables and function declarations are moved to top of there
// containing scope during the compilation phase of code , before the code is executed. This means we can use vaiables and funtion
// before they are declared into the code .

// console.log(x);
// greet();
// var x = 1;
// console.log(x);
// function greet() {
//   console.log("Heyy!");
// }

// let and const are also hoisted but in a different ways. like they are block scope and they are store into script context
// when they are in the TDZ zone i.e time taken variable declaration to the variable initialization.

// Closure : A closure is the features in javascript where the inner function has the access to its own scope ,the outer scope of
// the function , and global scope even after the function is return from the callstack.

/**
function parent() {
  let age = 43;
  return function child() {
    console.log("Child", age);
  };
}
const ans = parent();
ans();

// memo:
function complexCalculation(n) {
  let sum = 0;
  for (let i = 1; i <= n; i++) {
    sum += i;
  }
  return sum;
}

const memoFun = function (cb) {
  let cache = {};
  return function (...args) {
    let n = args[0];
    if (n in cache) {
      console.log("WITH ");
      return cache[n];
    } else {
      let res = cb(n);
      cache[n] = res;
      console.log("WITHOUT ");
      return res;
    }
  };
};
const anses = memoFun(complexCalculation);
console.log(anses(5));
console.log(anses(5));
console.log(anses(5));
// Callback: A callback is the function which is passes into another function as an arguments
// to complete the some routine or actions.

// callback can handle the tasks like syncrounous and asyncronous

function GoodBye() {
  console.log("GoodBye👋");
}
function greet(cb) {
  console.log("rer");
  cb();
}
greet(GoodBye);
 */

// function stepOne(val, cb) {
//   setTimeout(() => {
//     console.log(val);
//     cb();
//   }, 3000);
// }
// function stepTwo(val, cb) {
//   setTimeout(() => {
//     console.log(val);
//     cb();
//   }, 2000);
// }
// function stepThree(val) {
//   setTimeout(() => {
//     console.log(val);
//   }, 1000);
// }

// stepOne(1, () => {
//   stepTwo(2, () => {
//     stepThree(3);
//   });
// });

function stepOne(val) {
  const promise = new Promise((res, rej) => {
    setTimeout(() => {
      console.log(val);
      res();
    }, 3000);
  });
  return promise;
}
function stepTwo(val) {
  const promise2 = new Promise((res, rej) => {
    setTimeout(() => {
      console.log(val);
      res();
    }, 2000);
  });
  return promise2;
}
function stepThree(val) {
  const promise3 = new Promise((res, rej) => {
    setTimeout(() => {
      console.log(val);
      res();
    }, 1000);
  });
  return promise3;
}
/**
stepOne(1)
  .then(() => stepTwo(2))
  .then(() => stepThree(3))
  .then(() => {
    console.log("All steps completed.");
  })
  .finally(() => console.log("error"));
 */

// async function print() {
//     await stepOne(1);
//     await stepTwo(2);
//     await stepTwo(3);
// }
// print()

