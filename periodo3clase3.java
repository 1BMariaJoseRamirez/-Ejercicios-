package periodo3Clase3;
import java.util.Scanner;
public class periodo3clase3 {
    public static void main(String[] args) {
    //se crear el objeto a la clase Scanner 
    Scanner ingresar=new Scanner(System.in);
    //DECLARAR VARIABLES
    double nota;
    
    System.out.println("Favor ingresar un valor desde 1 hasta 10");
    nota=ingresar.nextDouble();
    
    while (nota<1 | nota>10)
    {
    System.out.println("Lo siento mucho pero el valor proporcionado no es correcto");
    nota=ingresar.nextDouble();
    }   
        
    }

    
}
