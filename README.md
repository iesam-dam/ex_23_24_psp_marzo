## Examen Programación de Servicios y Procesos 22-23 (Marzo)

## Aviso Importante

Tal como se indica en la programación didáctica del módulo, para aprobar se necesita superar todos
los objetivos.

Los objetivos están agrupados en:

1. [Coroutines](https://iesam-dam.github.io/programacion-servicios-procesos/evaluation/ra-coroutines.html)
   .
2. [Retrofit](https://iesam-dam.github.io/programacion-servicios-procesos/evaluation/ra-retrofit.html)
   .
3. [Flow](https://iesam-dam.github.io/programacion-servicios-procesos/evaluation/ra-flow.html)
   .
4. [Security](https://iesam-dam.github.io/programacion-servicios-procesos/evaluation/ra-security.html)
   .
5. [Calidad del código](https://iesam-dam.github.io/programacion-servicios-procesos/evaluation/ra-commons.htmll)

Si en la prueba existiera algo que no se haya visto en clase o esté fuera de los objetivos no será
calificado y lo dará el profesor.

## Requisitos para la realización de la prueba

- La prueba tiene una duración de 3 horas. Una vez terminada la prueba, se quitarán los privilegios
  al usuario para evitar modificaciones.
- La prueba se hará sobre el
  repositorio: [Prueba PSP Curso 22/23 Marzo](https://github.com/IESAM-DAM/ex_22_23_psp_marzo.git)
- La prueba se entrega a través de una Pull Request por cada uno de los ejercicios solicitados. Si
  no se entrega una Pull Request se considerará incompleta pues existe un objetivo sobre la
  documentación a través de Pull Request.
- En la Pull Request pondrá como revisor al profesor.
- **No se hará nada de la capa de UI** todo lo necesario de esta capa está ya en el proyecto.
- Se deberá seguir una arquitectura Clean Architecture: presentation, domain y data.
- Se podrán crear todas las funciones de extensión o complementarias que ayuden en la mejora y
  calidad del código.

Si se incumple algunos de los requisitos descritos la prueba se considerará como **No entregada**.

## Contexto de  los ejercicios

Se pide realizar una aplicación que recoja los datos de adopciones de una API.

## Ejercicio 1: Listado de Adopciones (remoto)

Se pide crear el flujo completo para visualizar un listado de adopciones en el MainActivity.

1. Añadir las librerías que se crean oportunas.
2. Los datos de la API se deben obtener con Retrofit.
3. La gestión de hilos se hará con Coroutines. Se valorará que sea eficiente con respecto al ciclo
   de vida.
4. En el MainActivity existe un método initAdoptions que tiene el código necesario para ejecutar el
   proceso que obtiene los datos desde la API.
5. Añadir los objetos necesarios en la creación del ViewModel en el MainActivity.
6. Crea las modificaciones oportunas en los método ya definidos.
7. El servicio que contiene la información está en el
   siguiente [Link](https://protectorahuellas.sitehub.es/api/v1/adoptions.json)

## Ejercicio 2: Listado de Ofertas con Flow

1. Añadir las librerías que se crean oportunas.
2. Los datos de 

