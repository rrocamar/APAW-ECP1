# APAW. ECP1. Patrones de Diseño
#### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)
# Descripción
Este es el desarrollo de la primera práctica de Patrones de Diseño, correspondiente a la asignatura *Arquitectura y Patrones para Aplicaciones Web*.
# Elaboración de entidades
![themes-architecture-diagram](https://github.com/rrocamar/APAW-ECP2-RamonRoca/blob/develop/docs/DiagramaDeClasesPatronEstrategia.png)
**Imágen extraida de wikipedia**
# Ejercicios
## 1 Factoría con patrón Singleton de una entidad. Se almacenan y se buscan las entidades por la id de la entidad . La factoría no los crea, solo gestiona los objetos.
  Creada una factoria para la clase Empleado y otra para la calse Restaurante. Ambas tienen su clase de Test.
## 2 Se aplica patron Builder a la entidad Restaurante. Se acompaña de la clase de pruebra RestauranteTest.
## 3 Se aplica patron Composite. Se acompaña de la clase de Test.
## 4 Patron strategy.
#### Descripcion
Este patron, permite a una clase cliente poder elegir entre una familia de algoritmos, elegir que más le conviene en cada momento y cambiarlo dinámicamente a su antojo.
#### Motivacion
Separar las clases clientes de los algoritmos nos permite:
* Mantener los clientes más pequeños. Esto los hace más fáciles de mantener.
* Si no usa un algoritmo, no tiene porque tenerlo. Se lo proporcionaremos cuando lo necesite.
* Si más de un cliente utiliza el mismo algoritmo, no hay que repetirlo. Favorece la reutilización.
#### Aplicabilidad
Cuando se ofrece una funcionalidad, que se puede llevar a cabo de varias maneras. Puede haber muchas estrategias, y se permite dotar a una clase de un compartamiento entre muchos disponibles.
Cuando un algoritmo utiliza datos que los clientes no tienen que conocer.
Cuando una clase define muchos comportamientos, se generan muchas sentencias condicionales. Para evitar ese código espagueti, se lleva cada rama a una implementación de la estrategia.
#### Estructura
![Diagrama ](https://es.wikipedia.org/wiki/Strategy_(patr%C3%B3n_de_dise%C3%B1o)#/media/File:DiagramaEjemplo.png)

#### Participantes
* Contexto: La clase que utiliza los distintos algoritmos. Configura una estrategia concreta. También podría definir una interfaz, por si las estrategias necesitarán acceder a sus datos. O, también, pasarse él mismo como parámetro.
* Estrategia: Define el interfaz comun de los distintos algoritmos.
* Estrategia concreta: Implementa la estrategia concreta utilizando la interfaz definida en estrategia.

#### Implementación
En este caso, para aplicar el patrón estrategia en el restaurante, se pretende calcular las horas disponibles de formación de los distintos empleados.
Para ello se van a utilizar una serie de criterios, y se va a aplicar un calculo u otro, dependiendo del algoritmo que desee el responsable o dueño del restaurante.
En esto ejemplo, las clase HorasFormacionTest es el cliente, la estrategia está definida por la clase EstrategiaCalculoHoras. Y las distintas implementaciones de la estrategia son: EstrategiaEmpleadoNoMeGusta, EstrategiaEmpleadoMeGusta, EstrategiaEmpleadoMeEsIndiferente.
El contexto es la clase HorasFormacion. El cliente (en esta caso el test, pero podría ser una instrancia de Director de RR.HH, ResponsableFranquicia, etc..) solicita a la clase HorasFormacion que le calcule las horas disponibles para un empleado. Y le pasa una estrategia concreta para que haga el cálculo.
[Más información](https://es.wikipedia.org/wiki/Strategy_(patr%C3%B3n_de_dise%C3%B1o))
## 5 Aplicar patron observer a la factoria.
Para aplicar este patron, he pensado que va a existir un dueño de la franquicia que desea que se le notifique cada vez que se abre un nuevo restaurante.
La finalidad es crear una nueva cuenta bancaria, para ingresar los pingües beneficios.
Para ello, la clase PropietarioFranquicia, implementa la interfaz Observer, que tiene un unico metodo llamado update que pasa por parametro un string con el id del nuevo restaurante creao.
En el test, comprobaré que después de crear un restaurante, el dueño de la franquicia tiene una nueva cuenta bancaria.
El test lo haré en la clase PropietarioFranquicia, ya que considero que es lo mismo comprobar que la clase RestauranteFactoria notifica a PropietarioFranquicia, que PropietarioFranquicia es notificado por RestauranteFranquicia. Y, de esta manera, mantengo sencilla la clase de test de RestauranteFranquicia.

### Tecnologías utilizadas
* Java
* Maven
* IntelliJ
* GitHub
* Travis
* Sonar

[![Build Status](https://travis-ci.org/rrocamar/APAW-ECP2-RamonRoca.svg?branch=develop)](https://travis-ci.org/rrocamar/APAW-ECP1-RamonRoca)

##### Autor: Ramón Roca Martínez
