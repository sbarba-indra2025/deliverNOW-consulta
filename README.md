# deliverNOW - Backend Consulta de Pedidos

## Descripción

Este repositorio contiene el servicio backend encargado de la **consulta de pedidos**. Permite a los usuarios ver el estado de sus pedidos anteriores y activos, junto con la información relevante como el repartidor asignado, el estado del pago, y otros detalles.

### Funcionalidades principales:
- Consultar el estado de los pedidos del usuario.
- Ver información detallada sobre cada pedido, como el repartidor asignado y el estado del pago.
- Filtrar pedidos por fecha o estado.

## Flujo de usuario

1. El usuario accede al frontend y consulta su historial de pedidos.
2. El sistema muestra los detalles de cada pedido, incluyendo el estado y la asignación del repartidor.
3. El usuario puede revisar el estado de cada pedido.

## Cómo ejecutar el servicio de forma individual

Para ejecutar este backend de forma independiente en tu máquina, sigue estos pasos:

1. **Clona el repositorio**:

   ```bash
   git clone https://github.com/sbarba-indra2025/deliverNOW-consulta.git
   cd deliverNOW-consulta

2. **Construir la imagen Docker**:

   ```bash
   docker build -t deliverNOW-backend-consulta .

3. **Ejecuta el contenedor**:

   ```bash
   docker run -p 8084:8080 deliverNOW-backend-consulta

Esto expondrá el servicio en http://localhost:8084.

Nota: Para ejecutar todos los servicios de la aplicación (frontend + backend + base de datos) de forma conjunta, en el [repositorio de documentación](https://github.com/sbarba-indra2025/deliverNOW-docs/) se pueden encontrar instrucciones para usar docker-compose

---

## Compilación del JAR

Para compilar el archivo `JAR` de forma independiente (sin depender de otros servicios), puede hacerse con **Maven** de la siguiente forma:

1. **Instalar Maven** siguiendo las instrucciones en la [página oficial](https://maven.apache.org/install.html).

2. **Compilar el proyecto**: Desde la raíz del repositorio, ejecutar el siguiente comando para compilar el archivo `JAR`:

   ```bash
   mvn clean package

Este comando descargará las dependencias necesarias y generará el archivo JAR en el directorio target/. El nombre del archivo será algo similar a deliverNOW-backend-pedidos-1.0.0.jar (el nombre variará dependiendo de la configuración en el pom.xml).

3. **Ejecutar el archivo JAR**: Una vez que se haya generado el archivo JAR, puede ejecutarse con el siguiente comando:

   ```bash
   java -jar target/*.jar
   
Esto iniciará el backend en el puerto predeterminado (por defecto, Spring Boot suele usar el puerto 8080).
