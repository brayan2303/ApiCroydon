# ApiCroydon
Prueba Tecnica Para Croydon
  
Esta aplicación es una ApiRestFull y tiene su integración los servicios de la Api https://www.themoviedb.org/documentation/api, la cual tiene como finalidad realizar consultas a EndPoints transformados para su legibilidad y entendimiento.
Fue realizado bajo la arquitectura de MicroServicios es decir; no es una Api Monolitica, si un servicio falla, seguirá funcionando con normalidad, esta prueba esta realizada con el lenguaje de programación Java en su versión Java 8 y su Framework SpringBoot, con su gestor de dependencias Gradle, haciendo uso de una base de datos H2.
Para poder correr este proyecto de manera local, es necesario contar con el JDK de Java, gestor de construcción y desempaquetamiento de librerias Gradle, variables de entorno y un compilador de código (Intellij fue usado para la creación de esta prueba).


Configurar base de datos DDL y DML
        
En el siguiente link te dejo la estructura de base de datos y un ejemplo para que esta funcione correctamete
Puerto Base de datos 3310
https://github.com/brayan2303/DataBaseCroydon

Instalación JDK

Es necesario, instalar el JDK para poder correr aplicaciones basadas en Java.
La instalación es la misma para equipos de 35 o 64bits, relaciono los links del instalador.

- Link Java Equipos 32 Bits
https://www.java.com/es/download/ie_manual.jsp

- Link Java Equipos 64 Bits
https://www.java.com/en/download/
1).  Una vez se haya descargado el archivo, lo abrimos y le damos en el botón instalar.
2).  Luego le damos en siguiente y en siguiente.
3).  Una vez terminado este proceso, ubicamos la ruta del archivo donde se descargó (Generalmente se encuentra en C:\Program Files\Java).
4).  Alli abrimos la carpeta la cual inicia con "JDK"
5).  Ingresamos a la carpeta y nos ubicamos en la carpeta llamada "BIN" (No cerrar la ventana)

Creación variable de entorno

La variable de entorno, nos permite abrir cualquier aplicación Java, ya que esta variable de entorno, la comprendera el sistema, como ejecutable para archivos con extencion .jar y/o aplicaciones Java.

1). Buscamos en el explorador de Windows "Variables de entorno" y nos aparecera como sugerencia "Editar las variables de entorno del sistema"
2). Seleccionamos "Editar las variables de entorno del sistema", alli se nos abrira una ventana con el nombre "Propiedades del sistema"
3). Dentro de esa ventana ubicamos el botón y/o opción con el nombre "Variables de entorno"
4). Una vez seleccionada esta opción, se nos abre otra ventana llamada Variables de entorno.
5). Nos ubicamos en "Variables del sistema" y le damos a la botón y/o opción "Nueva"
6). Se nos abrira una nueva ventana "Nueva variable del sistema", con dos campos "Nombre de variable" y "Valor de variable".
7). En el campo "Nombre de la Variable" pondremos "JAVA_HOME", en mayusculas y con barra al piso.
8). En el campo "Valor de la Variable" pondremos el link del archivo donde se instalo el JDK (Tomar como sugerencia el punto 5 de la insalación de JDK)"C:\Program Files\Java\jdk1.8.0_311\bin", esto la URL o ruta de instalación completa.
9). Le damos en todas las opciones de aceptar.

- Validación Instalación

1). Si todos los pasos anterior se hicieron de manera correcta, a continuación nos ubicamos en el Simbolo de sistema (CMD).
2). Para abrir el CMD podemos pulsar las teclas (Windows + R) y alli pondremos CMD.
3). Una vez abierto CMD, pondremos el siguiente comando:  java -version y pulsaremos enter.
4). Este comando una vez ejecutado, nos arrojara en pantalla la versión del Java Instalado.

Instalación Gradle 6.8

Gradle es un gestor de depencencias y desempaquetamiento de codigo, al igual que Maven, esto nos ayuda a compilar nuestras librerias y codigo con la ayuda del interpete de codigo.

- Link Gradle

https://gradle.org/releases/
1).  Una vez se haya descargado el archivo, lo abrimos y le damos en el botón instalar.
2).  Luego le damos en siguiente y en siguiente.
3).  Una vez terminado este proceso, ubicamos la ruta del archivo donde se descargo..
4).  Alli abrimos la carpeta la cual inicia con "gradle-6.8"
5).  Ingresamos a la carpeta y nos ubicamos en la carpeta llamada "BIN" (No cerrar la ventana)

Creación variable de entorno

La variable de entorno, nos permite abrir cualquier hacer la compilación de nuestras librerias y dependencias que se encuentran en nuestro proyecto.

1). Buscamos en el explorador de Windows "Variables de entorno" y nos aparecera como sugerencia "Editar las variables de entorno del sistema"
2). Seleccionamos "Editar las variables de entorno del sistema", alli se nos abrira una ventana con el nombre "Propiedades del sistema"
3). Dentro de esa ventana ubicamos el botón y/o opción con el nombre "Variables de entorno"
4). Una vez seleccionada esta opción, se nos abre otra ventana llamada Variables de entorno.
5). Nos ubicamos en "Variables del sistema" y le damos a la botón y/o opción "Nueva"
6). Se nos abrira una nueva ventana "Nueva variable del sistema", con dos campos "Nombre de variable" y "Valor de variable".
7). En el campo "Nombre de la Variable" pondremos "GRADLE_HOME", en mayusculas y con barra al piso.
8). En el campo "Valor de la Variable" pondremos el link del archivo donde se instalo el JDK (Tomar como sugerencia el punto 5 de la insalación de JDK)"C:\Program Files\gradle\gradle-6.8-all\gradle-6.8\bin", esto la URL o ruta de instalación completa.
9). Le damos en todas las opciones de aceptar.
Una instalado el JDK y Gradle, podemos descargar nuestro compilador de código de preferencia, recomendable (Intellij).

- Link de instalación
https://www.jetbrains.com/idea/download/#section=windows

- ¡ DESCARGAR LA VERSIÓN COMMUNITY EDITION !, es la versión gratuita.
Ya podremos, descargar el codigo fuente del repositorio (https://github.com/brayan2303/ApiCroydon) así lo abriremos y se instalar sin problema alguno.

- PETICIONES HTTP

Las peticiones de esta prueba, se encuentran en una colección de PostMan.

- Link de descarga POSTMAN

https://www.postman.com/downloads/?utm_source=postman-home

La colección de POSTMAN, se encuentran con la IP de dónde se encuentra desplegado el servicio actualmente en la nube.

Este es un ejemplo haciendo peticiones al servidor.

Ejemplo: localhost:8080/api/getCharacter/CAT
IP: localhost o (la ip de tu equipo)
PUERTO: :8080
PATH: 
NOMBRE SERVICIO: Characters
PETICIÓN: getCharacter



    
