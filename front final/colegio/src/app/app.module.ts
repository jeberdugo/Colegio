import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import {AppRoutingModule} from './app-routing/app-routing.module';

import { AppComponent } from './app.component';
import { ProfesoresListComponent } from './profesores-list/profesores-list.component';
import { ProfesoresService } from './profesores.service';
import { AsignaturasListComponent } from './asignaturas-list/asignaturas-list.component';

@NgModule({
  declarations: [
    AppComponent,
    ProfesoresListComponent,
    AsignaturasListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [ProfesoresService],
  bootstrap: [AppComponent]
})
export class AppModule { }
