/**
 * Aplicación que, usando la clase Combinatoria suministrada, genera el triángulo de Tartaglia
 * de n filas, siendo n un parámetro de entrada dado por el usuario.
 * @author Rafael Sánchez Sánchez y Sergio Galán Martín: rafael.sanchez@estudiante.uam.es y sergio.galanm@estudiante.uam.es
 *
 */
public class Tartaglia {
	private Combinatoria c;
	private int n;
  public Tartaglia(Combinatoria c, int n) {
    this.c = c;
    this.n = n;
  }
	/**
   * Sustitución del toString estándar en la clase Tartaglia
   *
   * <p>Genera el árbol de Tartaglia del objeto en basea a sus atributos como una única string.</p>
   *
   * @return String que representa el triángulo de Tartaglia de tantas filas como indique su atributo n.
   */
  public String toString(){
    String s = "";
    int i, j;
    for (i = 0; i < n ; i++) {
      for (j = 0; j <= i; j++) {
        s = s + c.combinaciones(i, j) + " ";
      }
      s = s + "\n";
    }
    return s;
  }
  /**
   * Punto de entrada a la aplicación.
   *
   * <p>Este método imprime el triángulo de Tartaglia de tantas filas como el argumento de entrada.</p>
   *
   * @param args Los argumentos de la línea de comando. Se espera un único entero, el número de filas del triángulo deseadas.
   */
  public static void main(String[] args) {
    if (args.length!=1) {
      System.out.println("Se espera un número como parámetro:");
      System.out.println("  n = Número de filas deseadas ");
      System.out.println("Devuelve las n primeras filas del triángulo de Tartaglia");
    }
    else {
      int n  = Integer.parseInt(args[0]);   // convertimos String a int
      Combinatoria c = new Combinatoria();  // Creamos un objeto c de tipo Combinatoria
      System.out.println(new Tartaglia(c, n)); // Imprimimos el triángulo por salida estándar
    }
	}
}
