# Forja
#### Asignatura: *Ingeniería Web: Visión General*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

## Aplicar patron observer a la factoria.
Para aplicar este patron, he pensado que va a existir un dueño de la franquicia que desea que se le notifique cada vez que se abre un nuevo restaurante.
La finalidad es crear una nueva cuenta bancaria, para ingresar los pingües beneficios.
Para ello, la clase PropietarioFranquicia, implementa la interfaz Observer, que tiene un unico metodo llamado update que pasa por parametro un string con el id del nuevo restaurante creao.
En el test, comprobaré que después de crear un restaurante, el dueño de la franquicia tiene una nueva cuenta bancaria.
El test lo haré en la clase PropietarioFranquicia, ya que considero que es lo mismo comprobar que la clase RestauranteFactoria notifica a PropietarioFranquicia, que PropietarioFranquicia es notificado por RestauranteFranquicia. Y, de esta manera, mantengo sencilla la clase de test de RestauranteFranquicia.

### Tecnologías necesarias
* Java
* Maven
* IntelliJ
* GitHub

### Descripción
Este proyecto pretende ser una plantilla maven para crear un proyecto
1.- Descomprimir en la carpeta de trabajo
1.- Editar el pom.xml y cambiarle el nombre del proyecto
1.- Desde IntelliJ, `Import Project`, marcar `Create Project from external model` y elegir `Maven`

