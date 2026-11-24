package integercontainers;
/**
 * Clase que implementa una pila dinámica de números enteros.
 * Utiliza nodos enlazados para gestionar la estructura LIFO (Last In, First Out).
 */
public class IntegerStack {
    /**
     * Nodo que representa la cima de la pila.
     */
    private Node first;
    /**
     * Número de elementos en la pila.
     */
    private int size;

    /**
     * Constructor que inicializa una pila vacía.
     */
    public IntegerStack() {
        this.first = null;
        this.size = 0;
    }

    /**
     * Apila un elemento en la pila.
     *
     * @param value el elemento a apilar.
     */
    public void push(Integer value) {
        Node newNode = new Node(value);       
        if (first == null) {
			first = newNode;
		} else {
			newNode.setNext(first);
			first = newNode;
		}
        size++;
    }

    /**
     * Desapila el elemento situado en la cima de la pila.
     *
     * @return el elemento desapilado, o {@code null} si la pila está vacía.
     */
    public Integer pop() {
        if (first == null) {
            return null;
        }
        Node node = first;
		Node aux = first.next;
		first = aux;

		size--;

		return node.getValue();
    }
    /**
     * Obtiene el elemento situado en la cima de la pila sin extraerlo.
     *
     * @return el elemento en la cima, o {@code null} si la pila está vacía.
     */
    public Integer top() {
		if (size == 0) {
			return null;
		}
		return first.getValue();
	}
    
    /**
     * Cuenta el número de elementos en la pila.
     *
     * @return el número de elementos en la pila.
     */
    public int size() {
        return size;
    }

    /**
     * Comprueba si un elemento está en la pila.
     *
     * @param value el elemento a buscar.
     * @return {@code true} si el elemento está en la pila, {@code false} en caso contrario.
     */
    public boolean search(Integer i) {
        Node current = first;
        while (current != null) {
            if (current.getValue().equals(i)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /**
     * Muestra el contenido de la pila en formato de texto.
     *
     * @return una cadena que representa los elementos de la pila, o "Empty stack" si está vacía.
     */
    @Override
    public String toString() {
        if (first == null) {
            return "Empty stack";
        }
        StringBuilder sb = new StringBuilder("(");
        Node current = first;
        while (current != null) {
            sb.append(current.getValue()).append(",");
            current = current.getNext();
        }
        sb.append(")");
        return sb.toString().trim();
    }
}
