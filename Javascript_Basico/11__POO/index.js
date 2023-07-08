class Estudiante {
    nombre = "Emmanuel"
    asignaturas = ["Javascript", "HTML", "CSS"]
    obtenDatos() {
        return{
            nombre: this.nombre,
            asignaturas: this.asignaturas
        }
    }
}
const nuevo = new Estudiante
console.log(nuevo.obtenDatos());