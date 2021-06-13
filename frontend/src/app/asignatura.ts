import { Curso } from "./curso";
import { Estudiante } from "./estudiante";
import { Profesor } from "./profesor";

export class Asignatura {
    nombre:String;
    profesor:Profesor;
    estudiantes:Estudiante[];
    curso:Curso[];
}
