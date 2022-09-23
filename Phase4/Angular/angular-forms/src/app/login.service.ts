import { Injectable } from "@angular/core";

@Injectable()
export class LoginService{
    checkUserDetails(login:any):string{
        if(login.email=="raj@gmail.com"&& login.pass =="123"){
            return"successfully login";
        }
        else{
            return "Failure try one agian";
        }
    }
}