
package calculadorarm;
import java.util.Scanner;
/**
 *
 * @author Nicolas
 */

public class CalculadoraRM {

static Scanner tec = new Scanner(System.in);
static int Respuesta , Peso , Rep = 0;
static double RM , Lbs , Kg = 0;
static double ECU = 0.0333;

public static void Menu(){
    
    System.out.println("\033[33mMENU PRINCIPAL.");
    System.out.println("1-CALCULAR RM.");
    System.out.println("2-PASAJE DE LIBRAS A KILOS.");
    System.out.println("0-SALIR.");
    Respuesta = tec.nextInt();
    
    if (Respuesta == 1){
        Calcular();
    }else if (Respuesta == 2){
        PasajeLbKg();
    }else{
        System.exit(0);
    }
}

public static void Calcular(){
    while (true){
    System.out.println("0-VOLVER");
    System.out.println("\033[31mCALCULAR RM :");
    System.out.println("\033[32mINGRESE PESO :");
    Peso = tec.nextInt();
    
    if(Peso == 0){
        Menu();
    }
    
    System.out.println("\033[32mINGRESE CANTIDAD DE REPETICIONES [MAYOR A 5 MENOR A 20] :");
    Rep = tec.nextInt();
    
    if(Rep < 5){
        System.out.println("\033[31mLA CANTIDAD DE REPETICIONES DEBE SER MAYOR O IGUAL A 5");
        Calcular();
    }else if(Rep > 20){
        System.out.println("\033[31mLA CANTIDAD DE REPETICIONES DEBE SER MENOR O IGUAL A 20");
        Calcular();
    }else{ 
        
        RM = Peso * ECU * Rep + Peso;
        System.out.println("\033[33mSU REPETICION MAXIMA (%100) ES = "+ RM);
        System.out.println("\033[31mDESEA CALCULAR PORCENTAJES DEL %100 AL %5 ? " + "\033[32mSI = 1 / NO = 0");
        Respuesta = tec.nextInt();
        
        if (Respuesta == 1){
            for (int x = 100; x > 0; x-- , x-- , x-- , x-- , x-- ){
            System.out.println("RM A " + "%" + x + "= " + (x * RM / 100));
        }
        }
    }

    }
}
//FALTA IF 1 E IF 2 DE RESPUESTA EN MENU PASAJE.
public static void PasajeLbKg(){
    
    System.out.println("1-PASAJE DE LIBRAS A KILOS ");
    System.out.println("2-PASAJE DE KILOS A LIBRAS ");
    System.out.println("0-VOLVER ");
    Respuesta = tec.nextInt();
    if(Respuesta == 1){
        
        while (true){
           
           System.out.println("0-VOLVER ");
           System.out.println("INGRESAR LIBRAS : ");
           
           Lbs = tec.nextInt();
           Kg = Lbs / 2.2046;
           
           System.out.println("KG = " + Kg);
           
           if (Lbs == 0){
            PasajeLbKg();
           }
        }
    
    }else if(Respuesta == 2){
        
        while (true){
           
            System.out.println("0-VOLVER ");
            System.out.println("INGRESE KG : ");
            
            Kg = tec.nextInt();
            Lbs = Kg * 2.2046;
            
            System.out.println("LBS = " + Lbs);
            if (Kg == 0){
                PasajeLbKg();
            }
        }
    }else{
        Menu();
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }
    
}
