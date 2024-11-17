# Implementación de un Sistema de Monitoreo Reactivo en Jurassic Park(Trabajo realizado por Pablo ALonso y francisco carlos lopez soto)

## Resumen

Este proyecto tiene como objetivo desarrollar un sistema avanzado para monitorear la actividad de los dinosaurios en Jurassic Park utilizando programación reactiva con **Spring WebFlux**. El sistema procesará flujos de datos en tiempo real provenientes de sensores de movimiento, temperatura y frecuencia cardíaca, garantizando eficiencia, escalabilidad y capacidad de respuesta ante cualquier eventualidad en el parque.

## Reto

El principal desafío del proyecto consiste en:
- Gestionar eficientemente flujos de datos de múltiples sensores en tiempo real.
- Procesar grandes volúmenes de datos sin comprometer el rendimiento del sistema.
- Implementar mecanismos de *backpressure* para evitar la sobrecarga de consumidores.
- Asegurar la comunicación y consistencia entre flujos de datos reactivos.

## Objetivo

Desarrollar un sistema de monitoreo reactivo capaz de:
1. Procesar y gestionar datos de múltiples sensores en tiempo real.
2. Enviar alertas inmediatas ante eventos críticos.
3. Visualizar datos procesados de manera efectiva.
4. Mantener un alto rendimiento y confiabilidad utilizando **Spring WebFlux**.

## Solución Propuesta

### 1. Configuración del Proyecto
- Crear un proyecto **Spring Boot**.
- Incluir dependencias de **Spring WebFlux** y bibliotecas necesarias para manejar datos reactivos.

### 2. Gestión de Sensores
- Implementar beans para cada tipo de sensor siguiendo el principio de **Inversión de Control (IoC)**.
- Configurar **Flux** y **Mono** para manejar flujos de datos en tiempo real.

### 3. Procesamiento Concurrente
- Utilizar **Flux** y **Mono** para manejar el procesamiento concurrente.
- Diseñar servicios para procesar datos utilizando **Schedulers** para optimizar la concurrencia.

### 4. Backpressure y Comunicación
- Implementar técnicas de *backpressure* como `onBackpressureDrop` y `onBackpressureBuffer`.
- Garantizar la capacidad de los consumidores de manejar flujos de datos sin interrupciones.

### 5. Monitorización y Logs
- Configurar **Spring Actuator** para monitorizar el estado y el rendimiento del sistema.
- Implementar un sistema de logging para rastrear eventos y detectar errores en el procesamiento de datos.

## Equipo

- **Desarrollador Backend**: Responsable de la implementación de la lógica de procesamiento reactivo y servicios.
- **Ingeniero de Datos**: Encargado de la configuración e integración de flujos de datos de sensores.
- **Administrador de Sistemas**: Responsable de la configuración, despliegue y monitorización del sistema.

## Resultados

- **Métricas de rendimiento**:
  - Tiempo de respuesta medio.
  - Tasa de procesamiento de datos por segundo.
- **Criterios de éxito**:
  - Sistema funcionando en tiempo real sin caídas.
  - Datos procesados correctamente.
  - Manejo efectivo de *backpressure*.

## Elementos Visuales

### Tablas
| Tipo de Sensor  | Eventos Procesados | Tasa de Procesamiento (eventos/seg) |
|-----------------|--------------------|------------------------------------|
| Movimiento      | 1,500             | 250                                |
| Temperatura     | 2,000             | 400                                |
| Frecuencia Cardíaca | 1,200         | 200                                |

### Gráficos
- **Gráfico de rendimiento**: Tasa de procesamiento de datos por segundo en tiempo real.

### Imágenes
- **Diagrama de arquitectura**: Representación de la infraestructura reactiva, flujos de datos y procesamiento concurrente.

## Referencias

- [Spring WebFlux Documentation](https://spring.io/projects/spring-webflux)
- [Reactor Reference Guide](https://projectreactor.io/docs)
- [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
