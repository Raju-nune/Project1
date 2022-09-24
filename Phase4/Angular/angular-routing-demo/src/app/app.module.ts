import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { LoginComponent } from './login/login.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { SignupComponent } from './signup/signup.component';
import {ReactiveFormsModule} from '@angular/forms';
import { DashboardComponent } from './dashboard/dashboard.component'
@NgModule({
  declarations: [
    AppComponent,
    AboutUsComponent,
    ContactUsComponent,
    LoginComponent,
    FeedbackComponent,
    SignupComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
