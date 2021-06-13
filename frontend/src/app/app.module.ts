import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProfesoresListComponent } from './profesores-list/profesores-list.component';
import { AsignaturasListComponent } from './asignaturas-list/asignaturas-list.component';
import { EstudiantesListComponent } from './estudiantes-list/estudiantes-list.component';

@NgModule({
  declarations: [
    AppComponent,
    ProfesoresListComponent,
    AsignaturasListComponent,
    EstudiantesListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
