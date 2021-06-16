import { Component, OnInit } from '@angular/core';
import { ProfesoresService } from '../profesores.service';
import { Router } from '@angular/router';
import { Profesor } from '../model/profesor';

@Component({
  selector: 'app-profesores-list',
  templateUrl: './profesores-list.component.html',
  styleUrls: ['./profesores-list.component.css']
})
export class ProfesoresListComponent implements OnInit {
  
  constructor(private profesoresService: ProfesoresService, private router:Router) { }

  profesores: Profesor[] | undefined;
  getProfesores(): void {
        this.profesoresService.getProfesores().subscribe(prof => {this.profesores = prof;
          console.log(this.profesores);});
        
    }

  ngOnInit(): void {

    this.getProfesores();
  }

  navigateTo(value:string) {
    if (value!==undefined) {
        this.router.navigate(['profesores/'+value]);
    }
    return false;
}

}
