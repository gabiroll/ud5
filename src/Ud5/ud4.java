package Ud5;
import javax.swing.JOptionPane;
public class ud4 {

	 public static void main(String[] args) {
		 
	        String texto=JOptionPane.showInputDialog("radio");
	        //Pasamos el String a double
	        double radio=Double.parseDouble(texto);
	 
	        //Formula area circulo, usamos algunos de los metodos de Math
	        double area=Math.PI*Math.pow(radio, 2);
	 
	        System.out.println("El area del circulo es "+area);
	    }
}