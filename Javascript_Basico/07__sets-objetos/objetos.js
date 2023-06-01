const datosPersonales = {
  nombre: "Emmanuel",
  apellido: "corrales",
  edad: 18,
  altura: 1.8,
  isDeveloper: true,
};

const edad = datosPersonales.edad;

const lista = [
    {
        ...datosPersonales,
    },
  {
    nombre: "Ricardo",
    apellido: "Mondragon",
    edad: 16,
    altura: 1.7,
    isDeveloper: false,
  },

  {
    nombre: "Luis",
    apellido: "Ramos",
    edad: 20,
    altura: 1.7,
    isDeveloper: false,
  },
];
const listaOrdenada = lista.sort((a, b) => b.edad - a.edad)
console.log(listaOrdenada);