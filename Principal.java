import java.util.Scanner;

public class Principal{
   public static void main(String [] args){
      Estudiante estudiante= new Estudiante("Daniel","Rodriguez","Software",5,20221,"Tagaste");
      estudiante.mostrarDatos();

      Scanner entrada=new Scanner(System.in);

      System.out.print("Digita la base: ");
      int base=entrada.nextInt();

      System.out.print("Digita el exponente: ");
      int exponente=entrada.nextInt();

      int resultado = Potencia(base,exponente);
      System.out.println(resultado);

   }

      public static int Potencia(int base, int exponente){
         if(exponente==0){
            return 1;
         }else{
            return base*Potencia(base,exponente-1);
         }
      }
   }
