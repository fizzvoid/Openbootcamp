const fechaHoy = new Date
const nacimiento = new Date(2004, 7, 20)
const comparacion = fechaHoy > nacimiento
const dia = nacimiento.getDate()
const mes = nacimiento.getMonth()+1
const anyo = nacimiento.getFullYear()
console.log(anyo);