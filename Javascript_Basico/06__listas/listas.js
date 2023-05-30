const ListaCompras = ["leche", "huevos", "tortilla", "pan", "queso"]
ListaCompras.push("Aceite de Girasol")
ListaCompras.pop()
console.log(ListaCompras);

const peliculas = [
    { titulo: "chunking express", director: "wong kar wai", fecha: new Date(1994, 1, 1) },
    { titulo: "chicuarotes", director: "Gael García Bernal", fecha: new Date(2019, 1, 1) },
    { titulo: "akira", director: "Katsuhiro Ôtomo", fecha: new Date(1998, 1, 1) }
]
const Posteriores2010 = peliculas.filter(o => o.fecha > new Date(2010, 0, 1))
const Directores = peliculas.map(o => o.director)
const Titulos = peliculas.map(o => o.titulo)
const Director_Titulo = Directores.concat(Titulos)
const Director_Titulo_Prop = [...Directores, ...Titulos]

console.log(Director_Titulo);
console.log(Director_Titulo_Prop);











