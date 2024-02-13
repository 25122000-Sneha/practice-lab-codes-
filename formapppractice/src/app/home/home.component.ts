import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{

  formModel : any = {PurposeOfLoan : null};
  itemForm : FormGroup;

  constructor(private formBuilder : FormBuilder , private router : Router)
  {
    this.itemForm = this.formBuilder.group({
      FullName : [this.formModel.FullName, [Validators.required, this.fullNameStartsWithP]],
      LoanAmount : [this.formModel.LoanAmount, [Validators.required, Validators.min(1000), Validators.max(1000000)]],
      PurposeOfLoan : [this.formModel.PurposeOfLoan, [Validators.required]],
      Tenure : [this.formModel.Tenure, [Validators.required, Validators.min(5), Validators.max(30)]],
      
    });

  }

  ngOnInit() : void{

  }

  onSubmit() : void {
    if(this.itemForm.valid)
    {
      this.router.navigateByUrl("welcome");
    }
    else 
    {
      this.itemForm.markAllAsTouched();
      this.router.navigateByUrl("error");
    }
  }

  /*dateShouldNotBeInFutureValidation(control : AbstractControl) : {[key : string] : boolean} | null
  {
    let currentDate = new Date();
    let issueDate = control.value;

    if(issueDate > currentDate)
    {
      return {dateShouldNotBeInFutureValidator : true};
    }
    return null;
  }*/


  fullNameStartsWithP(control : AbstractControl) : {[key : string] : boolean} | null
  {
    let fullName = control.value as string;
  
    if(fullName && fullName.charAt(0) !== 'P')
    {
      return {invalidFullName : true};
    }
    return null;
  }

  
}
