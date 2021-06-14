import { Component, OnInit } from '@angular/core';
import { Profesor } from '../profesor';
import { ProfesoresService } from './profesores.service';

@Component({
  selector: 'app-profesores-list',
  templateUrl: './profesores-list.component.html',
  styleUrls: ['./profesores-list.component.css']
})
export class ProfesoresListComponent implements OnInit {

  constructor(private profesoresService: ProfesoresService) { }

  profesores: Profesor[];
  getProfesores(): void {
        this.profesoresService.getProfesores().subscribe(profesores => this.profesores = profesores);
    }

  ngOnInit(): void {
  }

}
