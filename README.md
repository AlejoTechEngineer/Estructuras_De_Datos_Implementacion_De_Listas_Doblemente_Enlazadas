<div align="center">

# 📌 Estructuras de Datos - Implementación de Listas Doblemente Enlazadas  

## 📖 Descripción

</div>

---

Este proyecto implementa estructuras de datos avanzadas, centrándose en listas doblemente enlazadas para manipulación eficiente de datos.

## 🛠️ Funcionalidades  
- Inserción y eliminación de nodos en tiempo constante.  
- Búsqueda y recorrido de la lista en ambas direcciones.  
- Implementación de métodos auxiliares para ordenamiento.  
- Aplicación en algoritmos de búsqueda y almacenamiento dinámico.  

## 🚀 Tecnologías utilizadas  
- C++ / Java / Python  
- Algoritmos y estructuras de datos  

## ▶️ Cómo ejecutar el proyecto  
1. Compilar y ejecutar el código fuente en el lenguaje correspondiente.  
2. Probar las operaciones de inserción, eliminación y búsqueda.  
3. Evaluar el rendimiento en comparación con otras estructuras.  

## 📌 Autor  
👨‍💻 **Alejandro De Mendoza**

---

## Arquitectura

```mermaid
flowchart TD
    A[Crear lista doblemente enlazada] --> B[Nodo: prev - data - next]
    B --> C{Operacion}
    C --> D[Insercion al frente - O-1]
    C --> E[Insercion al final - O-1]
    C --> F[Eliminacion de nodo - O-1]
    C --> G[Busqueda - O-n]
    C --> H[Recorrido adelante / atras]
    D & E & F --> I[Actualizar punteros prev y next]
    G --> J[Nodo encontrado o no encontrado]
    H --> K[Ordenamiento - algoritmos auxiliares]
    I & K --> L[Lista actualizada]
```

## Autor

**Alejandro De Mendoza**  
Ingeniero Informático · Especialista en IA · Especialista en Ingeniería de Software · Máster en Arquitectura de Software

[![GitHub](https://img.shields.io/badge/GitHub-AlejoTechEngineer-181717?style=for-the-badge&logo=github)](https://github.com/AlejoTechEngineer)
