import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent implements OnInit {
f1:boolean=true
f2:boolean=false
f3:boolean=false
b1:string="show"
f4:boolean=false;
num1:number[]=[10,20,30,40,50]
names:string[]=["Raju","Giri","Sowa","Somu","Bhagya"]
employees:Array<Employee>=[]; 
constructor() { }

  ngOnInit(): void {
    let emp1 = new Employee(100,"Raju",12000);
    let emp2 = new Employee(101,"Raj",14000);
    let emp3 = new Employee(100,"Ravi",15000);
    this.employees.push(emp1);
    this.employees.push(emp2);
    this.employees.push(emp3);
  }
  addEmployeeDetails(idRef:any,nameRef:any,salaryRef:any){
    let idValue = idRef.value;
    let nameValue = nameRef.value;
    let salaryValue = salaryRef.value;
    let emp:Employee={id:idValue,name:nameValue,salary:salaryValue};
    this.employees.push(emp);
    idRef.value="";
    nameRef.value="";
    salaryRef.value="";
  }

  changeValue(){
    this.f3=true;
  }
  toggle(){
    if(this.f4){
      this.f4=false; 
      this.b1="show";
    }
    else{
      this.f4=true;
      this.b1="hide";
    }
  }

}
