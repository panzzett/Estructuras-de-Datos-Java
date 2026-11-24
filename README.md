# 📚 Estructuras de datos dinámicas en Java: pila y cola

Implementación propia de una **pila (LIFO)** y una **cola (FIFO)** dinámicas mediante **nodos enlazados**, sin usar las colecciones de Java, con una batería de pruebas en la clase principal.

> Proyecto académico de la asignatura *Estructura de Datos* (Grado en Ingeniería Informática).

## 📁 Contenido

| Fichero | Descripción |
|---|---|
| `src/integercontainers/Node.java` | Nodo enlazado (valor + referencia al siguiente) |
| `src/integercontainers/IntegerStack.java` | Pila: `push`, `pop`, `top`, `size`, `search`, `toString` |
| `src/integercontainers/IntegerQueue.java` | Cola: `insert`, `remove`, `seek`, `size`, `search`, `toString` |
| `src/integercontainers/Main.java` | Batería de pruebas por consola |
| `memoria_tecnica.pdf` | Diseño, código comentado, pruebas y documentación Javadoc |

## ▶️ Ejecución

```bash
javac -d bin src/integercontainers/*.java
java -cp bin integercontainers.Main
```

---
👤 Carlos Gálvez Reguera
