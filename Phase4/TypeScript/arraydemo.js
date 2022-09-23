var num1 = []; // memory creation in literal style 
var num2 = []; // memory creation in litral style with generics 
var num3 = new Array(); // memroy creation with new keyworod with generics 
num1.push(10);
num1.push(20);
num1.push(30);
//num1.push("Ravi");
var names = new Array();
var info = new Array();
info.push(100);
info.push("Ravi");
info.push(true);
var emp1 = { id: 100, name: "Ravi", age: 21 };
var emp2 = { id: 101, name: "Ramesh", age: 25 };
var emp3 = { id: 102, name: "Rajesh", age: 28 };
var emp4 = { id: 103, name: "Lokesh", age: 36 };
var emp5 = { id: 104, name: "Mahes", age: 34 };
var employees = new Array(); // array object. 
employees.push(emp1);
employees.push(emp2);
employees.push(emp3);
employees.push(emp4);
employees.push(emp5);
employees.forEach(function (e) { return console.log(e.id + " " + e.name + " " + e.age); });
var res1 = employees.find(function (e) { return e.id == 101; }); // searching the record from array if present it return that object 
var res2 = employees.find(function (e) { return e.id == 1000; }); // else return undefined 
var res3 = employees.findIndex(function (e) { return e.id == 103; }); // searching the record from array if present it return that record index position  
var res4 = employees.findIndex(function (e) { return e.id == 1000; }); // else return -1 
console.log(res3);
console.log(res4);
