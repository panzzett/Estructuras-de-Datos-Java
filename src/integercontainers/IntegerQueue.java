package integercontainers;

/**
 * Clase que implementa una cola dinámica de números enteros.
 * Utiliza nodos enlazados para gestionar la estructura FIFO (First In, First Out).
 */
public class IntegerQueue {
    /**
     * Nodo que representa el inicio de la cola (cabecera).
     */
    private Node first;

    /**
     * Nodo que representa el final de la cola.
     */
    private Node last;

    /**
     * Número de elementos en la cola.
     */
    private int size;

    /**
     * Constructor que inicializa una cola vacía.
     */
    public IntegerQueue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /**
     * Inserta un elemento en la cola.
     *
     * @param value el elemento a insertar.
     */
    public void insert(Integer i) {
        Node newNode = new Node(i);
        if (first == null) {
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }       
        size++;
    }

    /**
     * Elimina y devuelve el elemento situado en la cabecera de la cola.
     *
     * @return el elemento eliminado, o {@code null} si la cola está vacía.
     */
    public Integer remove() {
        if (size == 0) {
            return null;
        }
        Node node = first;
		Node aux = first.next;
		first = aux;
        if (--size== 0) {
            first = null;
        	last = null;
            
        }
        return node.getValue();
    }

    /**
     * Obtiene el elemento situado en la cabecera de la cola sin extraerlo.
     *
     * @return el elemento en la cabecera, o {@code null} si la cola está vacía.
     */
    public Integer seek() {
    	if (size == 0) {
			return null;
		}

		return first.getValue();
    }
    /**
	 * Muestra el tamaño de la cola
	 * 
	 * @return el número de elementos en la cola
	 */
	public int size() {
		return size;
	}

    /**
     * Comprueba si un elemento está en la cola.
     *
     * @param value el elemento a buscar.
     * @return {@code true} si el elemento está en la cola, {@code false} en caso contrario.
     */
    public boolean search(Integer i) {
    	boolean exists = false;
		Node aux = first;

		while (!exists && aux != null) {
			if (aux.getValue().equals(i)) {
				exists = true;
			} else {
				aux = aux.next;
			}
		}

		return exists;
    }

    /**
     * Muestra el contenido de la cola en formato de texto.
     *
     * @return una cadena que representa los elementos de la cola, o "Empty queue" si está vacía.
     */
    @Override
    public String toString() {
		if (size == 0) {
			return "Empty queue";
		}
		StringBuilder sb = new StringBuilder("(");
		Node aux = first;

		while (aux != null) {
			sb.append(aux.getValue());
			aux = aux.next;
			if (aux != null) {
				sb.append(",");
			}
		}
		sb.append(")");
		return sb.toString();
	}
}


