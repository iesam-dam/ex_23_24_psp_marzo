## Examen Programación de Servicios y Procesos 22-23 (Marzo)

## Aviso Importante

Tal como se indica en la programación didáctica del módulo, para aprobar se necesita tener un apto
en los dos ejercicios propuesto.

**Para obtener un APTO el código entregado debe cumplir los requisitos solicitados en cada
ejercicio**.

Los objetivos están agrupados en:

- Coroutines: El alumno domina la implementación de procesos e hilos con Corrutinas y su integración
  en Android.
- Retrofit: El alumno obtiene datos de una API a través de la librería Retrofit.

## Requisitos para la realización de la prueba

- La prueba tiene una duración de 3 horas. Una vez terminada la prueba, se quitarán los privilegios
  al usuario para evitar modificaciones.
- La prueba se hará sobre el
  repositorio: [Prueba PSP Curso 23/24 Marzo](https://github.com/IESAM-DAM/ex_23_24_psp_marzo.git)
- La prueba se entrega a través de una Pull Request por cada uno de los ejercicios solicitados. Si
  no se entrega una Pull Request se considerará incompleta.
- En la Pull Request pondrá como revisor al profesor.
- **No se hará nada de la capa de UI** todo lo necesario de esta capa está ya en el proyecto.
- Se deberá seguir una arquitectura Clean Architecture: presentation, domain y data.
- Se podrán crear todas las funciones de extensión o complementarias que ayuden en la mejora y
  calidad del código.

Si se incumple algunos de los requisitos descritos la prueba se considerará como **Suspensa**.

## Ejercicio 1: Listado de Adopciones (remoto)

Se pide crear el flujo completo para visualizar un listado de adopciones en el MainActivity.

1. Añadir las librerías que se crean oportunas.
2. Los datos de la API se deben obtener con Retrofit.
3. La gestión de hilos se hará con Coroutines. Se valorará que sea eficiente con respecto al ciclo
   de vida.
4. La comunicación del ViewModel con la Activity se hará con LiveData en la Coroutina.
5. En el MainActivity existe un método initAdoptions que tiene el código necesario para ejecutar el
   proceso que obtiene los datos desde la API.
6. Añadir los objetos necesarios en la creación del ViewModel en el MainActivity.
7. Crea las modificaciones oportunas en los método ya definidos.
8. El servicio que contiene la información está en el
   siguiente [Link](https://huellas.sitehub.es/api/v1/adoptions.json)

## Ejercicio 2: Procesos

Se pide crear una corrutina en el Activity2 que muestre un texto en consola y que cuando se cierre
Activity2 siga mostrandose ese texto y sólo se deje de mostrar cuando se cierre la aplicación.


