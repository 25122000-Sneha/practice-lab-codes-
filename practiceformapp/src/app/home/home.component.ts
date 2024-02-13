import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  formModel:any={PurposeOfLoan:null}
  itemForm: FormGroup;
  constructor(private formBuilder: FormBuilder, private router:Router) 
    {
      this.itemForm = this.formBuilder.group({
        FullName: [this.formModel.FullName,[ Validators.required]],
        LoanAmount: [this.formModel.LoanAmount,[ Validators.required, Validators.min(1000), Validators.max(100000)]],
        PurposeOfLoan: [this.formModel.PurposeOfLoan,[ Validators.required]],
        Tenure: [this.formModel.Tenure,[ Validators.required, Validators.min(1), Validators.max(30)]],
       
    });
   }
  ngOnInit(): void {

  }
  onRegister()
  {
    if(this.itemForm.valid)
    {
      this.router.navigateByUrl('/welcome')
    }
    else{
      this.itemForm.markAllAsTouched();
      this.router.navigateByUrl('error');
    }
  }
  dateShouldNotBeFuture(control: AbstractControl): { [key: string]: boolean } | null {
    const currentDate = new Date();
    const selectedDate = new Date(control.value);

    if (selectedDate > currentDate) {
      return { dateShouldNotBeFuture: true };
    }

    return null;
  }
}
