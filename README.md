# Laboratorio3
### Ingenieria de Software 2
### Universidad Nacional de Colombia

## Integrantes
* Johan Sebastian Salamanca
* Harold Nicolas Saavedra Alvarado
* Jose Fernando Morantes Florez

## Punto 2
Con el fin de agregar una nueva franquicia se crearon 5 clases nuevas, 1 que corresponde a la franquicia como tal heredando de la clase "PizzaStore" y 4 clases correspondientes a las recetas que se venderan en este punto, todas ellas heredando de la clase "Pizza" , adicional a esto se hicieron los cambios pertinentes en la clase "DependentPizzaStore" y "PizzaTestDrive", en esta ultima se realizo una prueba de funcionamiento de cada una de las clases agregadas.

## Punto 4
### Spaghetti Code
En este ejemplo mostramos un codigo corto pero con una estructura de control de flujo anormal debido al uso de la sentencia goto, en este caso al no ser un codigo muy complejo se puede llegar a entender su funcionamiento con facilidad pero en caso de que este sea mas extenso puede llegar a ser totalmente incomprensible. Este flujo anormal es totalmente innecesario en el codigo puesto que con una estructura diferente se puede generar un codigo con el mismo funcionamiento.

### Input Kludge
En este ejemplo mostramos una de las consecuencias de no realizar la validacion correspondiente a los datos que el usuario suministrara, en este caso se realizo un ejemplo muy sencillo donde se piden dos valores (posicion y valor) para modificar los datos dentro de un arreglo, en caso de que el usuario ingrese un dato no numerico o negativo vemos como el programa se comporta de una manera anormal y termina sin presentar los resutados buscados, este tipo de errores se puede extender a ejemplos mas complejos produciendo consecuencias mas grave, por ello siempre es necesario garantizar que los datos suministrados por el usuario no generen ningun inconveniente en nuestros programas, para ello existen multiples algoritmos y practicas a adoptar.
