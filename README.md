# APAW. ECP1. Patrones de Diseño
#### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)
**Práctica de Ramón Roca.**
# Descripción
Este es el desarrollo de la primera práctica de Patrones de Diseño, correspondiente a la asignatura *Arquitectura y Patrones para Aplicaciones Web*.
# Elaboración de entidades
![themes-architecture-diagram](https://github.com/rrocamar/APAW-ECP2-RamonRoca/blob/develop/docs/DiagramaDeClases.png)

# Ejercicios
## 1 Factoría con patrón Singleton de una entidad. Se almacenan y se buscan las entidades por la id de la entidad . La factoría no los crea, solo gestiona los objetos.
  Creada una factoria para la clase Empleado y otra para la calse Restaurante. Ambas tienen su clase de Test.
## 2 Se aplica patron Builder a la entidad Restaurante. Se acompaña de la clase de pruebra RestauranteTest.
## 3 Se aplica patron Composite. Se acompaña de la clase de Test.
## 4 Patron strategy.
Este patron, permite a una clase cliente poder elegir entre una familia de algoritmos, elegir que más le conviene en cada momento y cambiarlo dinámicamente a su antojo.


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

