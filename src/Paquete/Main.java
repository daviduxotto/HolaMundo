package Paquete;
import java.util.Scanner;
import  javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hola mundo java \n netbenas hizo q no me gustara java :)");
		Scanner leer = new Scanner(System.in);
		System.out.print("escriba su nomre en modo consola");
		String nombre = leer.nextLine();
		leer.close();
		JOptionPane.showMessageDialog(null, "su nombre es: "+nombre);
	}

}
