import { Curso } from "./curso";
import { Estudiante } from "./estudiante";
import { Profesor } from "./profesor";

export class Asignatura {
    id:Number | undefined
    nombre:String | undefined;
    profesor:Profesor | undefined;
    estudiantes!:Estudiante[] ;
    curso:Curso[] | undefined;
}
