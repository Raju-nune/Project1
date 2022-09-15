let num1 =[10,20,30,40,50,60,70]
document.write("</br> using classical loop")
for(let i=0;i<num1.length;i++){
    document.write("</br> "+num1[i])
}
document.write("</br> using of loop")
for(let obj of num1){
    document.write("</br> "+obj)
}
document.write("</br> using for each with callback")
num1.forEach(n=>document.write("</br>"+n))

