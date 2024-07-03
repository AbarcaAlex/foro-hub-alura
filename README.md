<!--Título e imagen de portada-->
## Foro Hub - Alura

<!--insignias-->
<a href=''><img src='https://badgen.net/static/Version:/1.0/green'/></a>
<a href='./LICENSE.md'><img src='https://badgen.net/static/License/MIT/blue'/></a>
<a href='https://www.oracle.com/java/technologies/javase/jdk21-readme-downloads.html'><img src='https://badgen.net/badge/icon/java%20jdk%2021?icon=java&label'/></a>
<a href='https://code.visualstudio.com/'><img src='https://badgen.net/badge/icon/VSCode?icon=visualstudio&label'/></a>  
<a href='https://www.postgresql.org/'><img src='https://badgen.net/badge/icon/PostgreSql?icon=postgresql&label'/></a>  

<!--descripción-del-proyecto-->
API Rest que permite realizar algunas de las consultas basicas para el funcionamiento de un foro aplicando operaciones [CRUD](https://developer.mozilla.org/es/docs/Glossary/CRUD) para los diferentes endpoints, permitiendo tambien registrar y listar usuarios.

Proyecto realizado como parte de los challenge impartidos en el curso de Java Back-end en [Alura](https://aluracursos.com).

<!--Características de la aplicación y demostración-->
## EndPoints

* /topicos
    - [POST] Registrar un nuevo topico.
    - [GET] Mostrar todos los topicos.
    - /{id} [GET] Mostrar un topico buscandolo por su id.
    - [PUT] Actualizar un topico.
    - [DELETE] Borrar un topico.
* /usuarios
    - [POST] Registrar un usuario.
    - [GET] Mostrar todos los usuarios.
    - /{id} [GET] Mostrar un usuario buscandolo por su id.
* /login
    - [POST] Iniciar sesion.

## Detalles

- Desarrollado en [Java](https://www.oracle.com/java/technologies/javase/jdk21-readme-downloads.html) en su version 21.
- Uso del framework [Spring Boot 3.0](https://spring.io/blog/2022/11/24/spring-boot-3-0-goes-ga).
- Uso de [FlyWay](https://flywaydb.org/) para la migracion y versionamiento de la base de datos.
- Persistencia de datos utilizando [Postgresql](https://www.postgresql.org/).
- Implementacion de [Spring Security](https://spring.io/projects/spring-security) con uso de [JWT](https://jwt.io/).
- Hasheo de contraseñas de usuarios registrados usando [BCrypt](https://bcrypt-generator.com/).
- Documentacion utilizando Swagger [OpenApi Specification](https://swagger.io/specification/)

## Documentacion

La documentacion con OpenApi Specification estara disponible a traves de estos enlaces:
- Para su version con interfaz grafica: `http://server:port/swagger-ui.html`
- Para su version en JSON: `http://server:port/v3/api-docs`
<!--Personas Contribuyentes-->

<!--Personas-Desarrolladores del Proyecto-->
## Desarrollador
[@AbarcaAlex](https://github.com/AbarcaAlex/)
<!--Licencia-->
## Licencia
[MIT licensed](./LICENSE.md)
<!--Conclusión-->