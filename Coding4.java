/**
 * Es el clasico juego de piedra papel o tijera con 2 
 * jugadores a distinto tiempo de recopilacion
 * que podria funcionar como un remoto dando la respuesta de quien gano
 * justo despues de la desicion del jugador 2
 */

package codigo4;
// Importacion de a Scanner
import java.util.Scanner;

public class Codigo4 {
    //  coloque public estatic void
    public static void main(String[] args) {

    //System.in dentro de Scanner
    Scanner s = new Scanner(System.in);

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
   // Cambio de jugadores 1 a 2 
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //Sysitem.in en new Scanner
     

    Scanner s2 = new Scanner(System.in);
    String j2 = s.nextLine();{

    // Parentesis extra
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }//Cierre de los corchetes
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }

}
}
}

