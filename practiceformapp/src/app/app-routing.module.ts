import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';

import { HomeComponent } from './home/home.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ErrorComponent } from './error/error.component';


const routes: Routes = [
 
  {
  
    path: 'home',
    component: HomeComponent,
    data: {
      title: 'home'
    }
  },
  {
  
    path: 'welcome',
    component: WelcomeComponent,
    data: {
      title: 'welcome'
    }
  },
  {
  
    path: 'error',
    component: ErrorComponent,
    data: {
      title: 'error'
    }
  },
  
  
{ path: '**', component: HomeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
