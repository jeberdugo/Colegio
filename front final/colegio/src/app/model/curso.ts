import { Asignatura } from "./asignatura";

export class Curso {
    id:Number | undefined;
    grado:Number | undefined;
    salon:String | undefined;
    asignaturas:Asignatura[] | undefined;
}
