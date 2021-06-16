import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { AsignaturasListComponent } from '../asignaturas-list/asignaturas-list.component';

const routes: Routes = [{
  path: "profesores/:id",
  component: AsignaturasListComponent
}];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes, {onSameUrlNavigation: 'reload'})
  ],
  exports:[RouterModule]
})
export class AppRoutingModule { }
