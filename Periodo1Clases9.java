package periodo1clases9;
import java.util.Scanner; //el programa usa la clase Scanner
public class Periodo1Clases9 {
    public static void main(String[] args) {
        // TODO code application logic here
        //crea objeto Scanner para obtener la entrada de la ventana de comandos 
        Scanner entrada = new Scanner ( System.in );
        
        int numerol ; // primer número a comparar 
        int numero2 ; // segundo número a comparar
        
        System.out.print ( " Escriba el primer entero : " ) ; // indicador 
        numerol = entrada.nextInt ( ) ; // lee el primer número del usuario
        
        System.out.print ( " Escriba el segundo entero : " ) ; // indicador 
        numero2 = entrada.nextInt ( ) ; // lee el segundo número del usuario
        
        if ( numerol == numero2 )
        System.out.println ( " El numero " + numerol + " es igual a " + numero2 ) ;
        
        if ( numerol != numero2)
        System.out.println ( " El numero " + numerol + " es distinto a " + numero2 ) ;
        
        if (numero1 < numero2)
        System.out.println ( " El numero " + numerol + " es menor a " + numero2 ) ;
        
        if (numero1 > numero2)
        System.out.println ( " El numero " + numerol + " es mayor a " + numero2 ) ;
        
        if (numero1 <= numero2)
        System.out.println ( " El numero " + numerol + " es menor o igual a " + numero2 ) ;
        
        if (numero >= numero2)
        System.out.println ( " El numero " + numerol + " es mayor o igual a " + numero2 ) ;
        
        
            
        
        
            
            
            
    }

    
}
