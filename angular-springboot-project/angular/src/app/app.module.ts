import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonelListComponent } from './components/personel-list/personel-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PersonelEditComponent } from './components/personel-edit/personel-edit.component';
import { NgbModule }from '@ng-bootstrap/ng-bootstrap';
import {NgxPaginationModule} from 'ngx-pagination';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { SearchpipePipe } from './searchpipe.pipe';
import { PortalModule } from '@angular/cdk/portal';

@NgModule({
  declarations: [
    AppComponent,
    PersonelListComponent,
    PersonelEditComponent,
    SearchpipePipe
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
   NgbModule,
   NgxPaginationModule,
   Ng2SearchPipeModule,
   PortalModule

   
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
