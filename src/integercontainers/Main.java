package integercontainers;
/**
 * @author Carlos Galvez
 * @version 1.0.0
 * @category Estructura De Datos
 * ACTIVIDAD 1 - ESTRUCTURA DE DATOS - CARLOS GALVEZ REGUERA
 * Clase principal para probar el correcto funcionamiento de las estructuras IntegerStack e IntegerQueue.
 */
public class Main {
    /**
     * Método principal para ejecutar las pruebas.*/
	public static void main(String[] args) {
		IntegerStack stack = new IntegerStack();
		System.out.println("--------------------Pruebas de IntegerStack--------------------");
		System.out.println("simulacion de historial de navegacion Web");
		System.out.println("------------------------------------------------------------");
		System.out.println("Comprobamos la pila: " + stack);
		System.out.println("Accedemos a la pagina 1");
		stack.push(1);
		System.out.println("Accedemos a la pagina 2");
		stack.push(2);
		System.out.println("Accedemos a la pagina 3");
		stack.push(3);
		System.out.println("Numero de webs totales en historial: " + stack.size());
		System.out.println("Check la pila: " + stack);
		System.out.println("Check existencia de pagina 0 " + stack.search(0));
		System.out.println("Check existencia de pagina 2 " + stack.search(2));
		System.out.println("pagina anterior " + stack.top());
		System.out.println("check pila: " + stack);
		System.out.println("Volvemos a la pagina anterior, quitamos pagina " + stack.pop());
		System.out.println("check pila:" + stack);
		System.out.println("Accedemos a la pagina 4");
		stack.push(4);
		System.out.println("check pila: " + stack);
		System.out.println("Volvemos a la pagina anterior, por lo que quitamos la pagina numero " + stack.pop());
		System.out.println("check pila: " + stack);
		System.out.println("Volvemos a la pagina anterior, por lo que quitamos la pagina numero " + stack.pop());
		System.out.println("check pila: " + stack);
		System.out.println("Volvemos a la pagina anterior, quitamos la pagina numero " + stack.pop());
		System.out.println("Volvemos a la pagina anterior, por lo que quitamos la pagina " + stack.pop() + ". No hay mas historial.");
		System.out.println("Accedemos a la pagina 5");
		stack.push(5);
		System.out.println("Revisamos la pagina anterior " + stack.top());
		System.out.println("Check existencia de pagina 5 " + stack.search(5));
		System.out.println("Volvemos a la pagina anterior, eliminacion de pagina numero " + stack.pop());
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------Pruebas de IntegerQueue--------------------");
		System.out.println("simulacion de pedidos de una fabrica");
		System.out.println("las inserciones en la cola son nuevos pedidos y si se sacan es porque se entregan a clientes");
		System.out.println("------------------------------------------------------------");
		IntegerQueue queue = new IntegerQueue();
		System.out.println("Check cola: " + queue);
		System.out.println("Se realiza el pedido numero 1");
		queue.insert(1);
		System.out.println("Se realiza el pedido numero 2");
		queue.insert(2);
		System.out.println("Se realiza el pedido numero 3");
		queue.insert(3);
		System.out.println("Check de numero de pedidos pendientes: " + queue.size());
		System.out.println("Check cola: " + queue);
		System.out.println("Existe el pedido 0? " + queue.search(0));
		System.out.println("Existe el pedido 2? " + queue.search(2));
		System.out.println("Revisamos el siguiente pedido: " + queue.seek());
		System.out.println("Check cola: " + queue);
		System.out.println("Vamos a procesar el pedido numero " + queue.remove());
		System.out.println("Check cola: " + queue);
		System.out.println("Se realiza un pedido con numero 4");
		queue.insert(4);
		System.out.println("Check cola : " + queue);
		System.out.println("Se procesa el pedido numero " + queue.remove());
		System.out.println("Check cola: " + queue);
		System.out.println("se procesa el pedido numero " + queue.remove());
		System.out.println("check cola: " + queue);
		System.out.println("Se procesa el pedido numero " + queue.remove());
		System.out.println("Se procesa el pedido numero " + queue.remove() + ". Parece que no hay pedidos pendientes");
		System.out.println("un cliente realiza un pedido numero 5");
		queue.insert(5);
		System.out.println("revision del siguiente pedido: " + queue.seek());
		System.out.println("Existe el pedido 5?: " + queue.search(5));
		System.out.println("Se procesar el pedido numero " + queue.remove());

	}
}
