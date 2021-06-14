import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Profesor } from '../profesor';

const API_URL = "";

@Injectable({
  providedIn: 'root'
})
export class ProfesoresService {

  constructor(private http: HttpClient) { }

  getProfesores() : Observable<Profesor[]> {
    return this.http.get<Profesor[]>(API_URL);
}
}
