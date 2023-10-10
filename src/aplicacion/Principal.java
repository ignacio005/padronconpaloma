package aplicacion;
import presentacion.*;
import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean resultado;
        do{
            System.out.print("$");
        String linea = sc.nextLine();
        resultado = InterfazUsuario.ejecutar(linea.split(" "));
        }while(resultado);
        sc.close();
        }
}
