import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Profesor } from '../profesor';

const API_URL = "https://jsonplaceholder.typicode.com/todos";

@Injectable({
  providedIn: 'root'
})
export class ProfesoresService {

  httpOptions = {
    headers: new HttpHeaders({ "Content-Type": "application/json" })
  };


  constructor(private http: HttpClient) { }

  getProfesores() : Observable<any> {
    return this.http.get<any>(API_URL);
}
}
