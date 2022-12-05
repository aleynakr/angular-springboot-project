import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PersonelEditComponent } from './components/personel-edit/personel-edit.component';
import { PersonelListComponent } from './components/personel-list/personel-list.component';


const routes: Routes = [
  {path:'employeeList',component:PersonelListComponent},
  {path:'',redirectTo:'employeeList',pathMatch:'full'},
  {path:'employeedit/:id',component:PersonelEditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
