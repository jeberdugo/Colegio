import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { Asignatura } from '../model/asignatura';
import { Estudiante } from '../model/estudiante';
import { Profesor } from '../model/profesor';
import { ProfesoresService } from '../profesores.service';

@Component({
  selector: 'app-asignaturas-list',
  templateUrl: './asignaturas-list.component.html',
  styleUrls: ['./asignaturas-list.component.css']
})
export class AsignaturasListComponent implements OnInit {

  constructor(private route: ActivatedRoute,private router: Router, private profServ:ProfesoresService) { }


  profesor!: any;

  asignaturas!:any;
  estudiantes:any;
  @Input() id: number | undefined;
  loader:any;
  
  onLoad(params: { [x: string]: any; }) {

    this.id = parseInt(params['id']);
    console.log(" en detail " + this.id);

    this.getProfe();
  }
  /**
  * The method which initializes the component
  * We need to initialize the editorial so it is never considered as undefined
  */
  ngOnInit() {
    
     this.loader = this.route.params.subscribe((params: Params) => this.onLoad(params));
    

  }
  ngOnDestroy() {
    this.loader.unsubscribe();
  }

  public activePillIndex:number = 0;



public selectPill(index:number) {
    this.activePillIndex = index;
}

  getProfe(): void {
     if(this.id===undefined){

     }
     else{

    this.profServ.getProfesor(this.id)
      .subscribe(prof => {
        console.log("retrieved");
        this.profesor = prof;
        console.log(prof);
        if(this.profesor.asignaturas!==undefined){
          this.asignaturas = this.profesor.asignaturas;
        }
        

        
        
        

      });
    }
  }

}
