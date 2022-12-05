import { CdkPortal,DomPortalHost} from '@angular/cdk/portal';
import {Component, ViewChild, OnInit, ComponentFactoryResolver, ApplicationRef, Injector, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';
import { PersonelServiceService } from 'src/app/services/personel-service.service';
import { ActivatedRoute } from '@angular/router';
import { toNumber } from 'lodash';

@Component({
  selector: 'app-personel-edit',
  
  templateUrl: `./personel-edit.component.html`
  
,
  styleUrls: ['./personel-edit.component.css']
})
export class PersonelEditComponent implements OnInit {
  title="Sicil Takip İşlemleri";
  personel:any;
  param = this.activatedRoute.snapshot.paramMap.get("id");
  id=toNumber(this.param)

  


  constructor(private router:Router,private personelService :PersonelServiceService,private activatedRoute: ActivatedRoute) {}

  ngOnInit() {
    
  
    this.getEmployee(this.id)
  }
 
goBack(){
  this.router.navigate(['/employeeList']);
}

getEmployee(id:number){
  this.personelService.get(this.id).subscribe(
    (data) => {
      this.personel= data;
      console.log(this.personel,);
    }
  );
}
  
  

}
