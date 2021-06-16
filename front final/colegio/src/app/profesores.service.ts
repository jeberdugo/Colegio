import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

const API_URL = 'https://jsonplaceholder.typicode.com/todos';

@Injectable()
export class ProfesoresService {

  constructor(private http: HttpClient) { }

  getProfesores() : Observable<any> {
    
    return this.http.get<any>('http://localhost:8080/profesores');
}
getProfesor(id:Number) : Observable<any> {
    
  return this.http.get<any>('http://localhost:8080/profesores/'+id);
}
}
