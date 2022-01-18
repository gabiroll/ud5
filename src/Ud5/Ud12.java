package Ud5;
import java.util.Scanner;
public class Ud12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String contraseña="gabriel";
  
        final int INTENTOS = 3;
         
        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
        boolean acierto=false;
  
        String password;
        for (int i=0;i<INTENTOS && !acierto;i++){
            System.out.println("Introduce una contraseña");
            password = sc.next();
  
            //Comprobamos si coincide, no usamos ==, usamos el metodo equals
            if (password.equals(contraseña)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
                sc.close();
            }
        }
    }
}
