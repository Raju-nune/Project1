// // normal function 
// display1();         // we call this function before declaration 
// function display1() {
//     document.write("<br/>Normal function declaration")
// }
//     display1();
// // expression style function with name 
// let display3 = function display2() {
//     document.write("<br/>Expression style function with name")
// }
// //display2();
// display3();

// //display4();         // we can't call this function before declaration 

// // expression style function without name 
// let display4 = function() {
//     document.write("<br/> Expression style function without name");
// }

// display4();
// let display5=()=>document.write("</br> Simple Arrow Function")
// display5();
// let addnumber=(a,b)=>a+b;
// document.write("</br> Addition of two number "+addnumber(10,20))
// let findlargest=(a,b)=>{
//     if(a>b){
//         return "a is largesrt";
//     }
//     else{
//         return "b is largest";
//     }
// }
// document.write("</br> find largest of number "+findlargest(1000,100))
function greeting(fname,callback){
    return "welcome "+callback(fname);
}
 let maleinfo =function(fname){
    return "Mr "+fname;
 }
 let femaleinfo =(fname)=>"Miss "+fname;
 document.write("</br>"+greeting  ("Raj",maleinfo));
 document.write("</br>"+greeting ("seeta",femaleinfo));


 (function(){
    document.write("</br>IIIFe function")
 })()

 document.write("</br>");   
 (function(a,b){
    document.write(a+b)
 })(10,20)