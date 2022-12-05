import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { HttpParams } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';




@Injectable({
  providedIn: 'root'
})
export class PersonelServiceService {
  baseUrl =" http://localhost:8080/api/personel/sicil";
  
 


  constructor(private http: HttpClient) {
    
   }
 
  getData(){
    return this.http.get(this.baseUrl);
   }


  get(id) {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  create(data) {
    return this.http.post(`${this.baseUrl}`, data);
  }

  update(id, data) {
    return this.http.put(`${this.baseUrl}/${id}`, data);
  }

  delete(id) {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }

  deleteAll() {
    return this.http.delete(this.baseUrl);
  }

  findByTitle(title) {
    return this.http.get(`${this.baseUrl}?title=${title}`);
  }




}

