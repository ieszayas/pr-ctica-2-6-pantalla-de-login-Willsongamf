| ID Caso Prueba | Descripción Caso de Prueba                     | Entrada                                 | Salida Esperada                                                           | Resultado   |
|----------------|-----------------------------------------------|-----------------------------------------|---------------------------------------------------------------------------|-------------|
| 01             | Validaciones del botón "Loguear"               | Escribir texto en los campos Usuario y Password     | Si falta alguno de los campos no podrá continuar                  | OK|
| 02             | Comprobación del checkbox 'Mostrar'           | Marcar/desmarcar checkbox     | Se muestra o no la contraseña con asteriscos                      | OK|
| 03             | Conexión con la BD de datos                          | Iniciar una consulta desde la ventana   | Se conecta correctamente a la BD elegida | OK|
| 04             | Gestión básica de la conexión con la BD de datos                          | Iniciar una consulta desde la ventana   | Se muestran y gestionan errores de conexión con la BD | OK|
| 05             | Validación del campo usuario y password    | Escribir texto en los campos Usuario y Password     | Se valida en la BD que el usuario y contraseña existen | No cumple|
| 06             | Ventana principal                     | Se abre la ventana principal al validarse el usuario/contraseña | Se muestra el nombre del usuario logueado en la ventana | OK|
| 07             | Ventana crear nuevos usuarios                        | Hacer clic en el botón/enlace crear cuenta nueva   | Se abre una ventana de nuevos usuarios que tiene todos los campos principales y opcionales requeridos | OK|
| 08             | Validación del campos usuario y password ventana nuevos usuarios   | Escribir texto en los campos Usuario y Password     | Se validan los campos introducidos y la contraseña duplicada | OK|
| 09             | Estructura del proyecto                        | N/D   | Se utiliza la división por paquetes MVC; VistaControlador y Modelo para organizar las clases | OK|
| 10             | Comprobación fichero jar                        | Proyecto a empaquetar   | Se genera y prueba el fichero jar empaquetado | OK|
| 11             | Creación de branches                        | Parte 1 y parte 2   | Se crean al menos dos branches en el repositorio github | OK|

### Parte 3

| ID Caso Prueba | Descripción Caso de Prueba                     | Entrada                                 | Salida Esperada                                                           | Resultado   |
|----------------|-----------------------------------------------|-----------------------------------------|---------------------------------------------------------------------------|-------------|
| 12             | Validaciones de los campos opcionales de la ventana nuevo usuario               | Texto de los diferentes campos     | Si falta texto en alguno de los campos obligatorios no podrá continuar                  | OK|
| 13             | Agregar un componente de calendario a través de una librería JAR         | N/D     | Se muestra un calendario al hacer clic en su icono                      | OK|
| 14             | Verificación de duplicados en la BD                          | Agregar un nuevo usuario   | Se verifica que el nombre de usuario no exista ya en la BD | OK|
| 15             | Leer datos de la BD de un fichero llamado config.properties                          | N/D   | Se leen los datos de conexión de la BD de dicho fichero y no del código fuente | OK|