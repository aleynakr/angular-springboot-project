import { Component, OnInit } from '@angular/core';
import { resetFakeAsyncZone } from '@angular/core/testing';
import {Router} from '@angular/router';
import { PersonelServiceService } from 'src/app/services/personel-service.service';
import { format } from 'url';
import { PersonelEditComponent } from '../personel-edit/personel-edit.component';


@Component({
  selector: 'app-personel-list',
  templateUrl: './personel-list.component.html',
  styleUrls: ['./personel-list.component.css']
})
export class PersonelListComponent implements OnInit {
 
  employeeList:any;
  data: any;
  p:number=1;
  title="Personel Listesi";
  searchText;
   searchSicil_no;
   searchKimlik_no;
   searchAdi;
   searchSoyadi;

  constructor(private personelService :PersonelServiceService ,private router: Router ) { 
    
  }

  ngOnInit(){
    this.getData();
  }

  openEdit(id:number){
    this.router.navigate(['/employeedit',id]);
    }

  
  getData(){
    this.personelService.getData().subscribe(
      (data) => {
        this.employeeList = data;
        console.log(this.employeeList);
      }
    );
   }

search(){
  
  if(this.searchSicil_no!==null)
  this.searchText=this.searchSicil_no;
  
}


}

  

