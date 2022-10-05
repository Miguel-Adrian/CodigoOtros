import java.util.Scanner;//Añadimos java.util.Scanner.

public class Ejercicio5 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); //faltaba colocar el inputStream
	    System.out.print("Introduzca un número: "); //Faltaba una comilla doble
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni); //Conversión de String a int
	    
	    //Se eliminan variables afo y noAfo, ya que la única finalidad del programa es que si el residuo
	    //de dividir entre 10 es 3, 7, 8 o 9, da un mensaje de si el número ingresado es afortunado
	    //o no afortunado.
	    
	    if ( c > 0) { //Es mejor usar un 'if', aunque para este fin es lo mismo.
		  int digito = (c % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
	    	  System.out.println("El " + c + " es un número afortunado.");
	      } else {
	    	  System.out.println("El " + c + " no es un número afortunado.");
	    	  
	    	  
    	  //el ni /= 10 era redundante, además de que c es el que convertimos a int con parseInt, no 'ni'.
		  //Había una sentencia innecesaria (afo > noAfo), ya que no tiene sentido en el aspecto en que haya
    	  //más números afortunados o no afortunados, a final de cuentas, solamente cuenta el número ingresado.
	    
	      }//else
	    
	  }//while
	    
	}//main

} //classEjercicio5

