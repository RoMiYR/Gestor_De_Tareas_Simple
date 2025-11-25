Este proyecto es un gestor de tareas simple, desarrollado en Java, enfocado en practicar el uso de clases, colecciones (ArrayList), manejo de fechas (LocalDate) y ordenamiento con sort().
El programa permite registrar tareas y administrarlas mediante un menú interactivo.

Funcionalidades
1 -> Agregar tareas

Cada tarea incluye:

1 -> Nombre

2 -> Descripción

3 -> Nivel de prioridad

4 ->Fecha de vencimiento

Las tareas se guardan en un ArrayList<Tarea>.

2 -> Listar todas las tareas

Muestra todas las tareas registradas, ordenadas automáticamente de menor a mayor según su fecha de vencimiento.

3 -> Ver tareas vencidas

Identifica y muestra solo aquellas tareas cuya fecha límite ya pasó.

✔ Dos modos de fecha

El usuario puede elegir cómo evaluar las tareas vencidas:

Usar la fecha actual del sistema, o

Elegir una fecha específica (útil para pruebas o escenarios simulados)

✔ Ordenamiento automático

El proyecto utiliza:

tareas.sort(Comparator.comparing(Tarea::getFechaVencimiento));


Esto asegura que las tareas siempre aparezcan ordenadas cronológicamente.

✔ Salir del programa

El menú permite cerrar la aplicación de forma segura.
