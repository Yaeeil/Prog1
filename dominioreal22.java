import java.io.BufferedReader;
import java.io.InputStreamReader;
public class dominioreal22 {
   public static void main (String args[]){
      BufferedReader input= new BufferedReader (new InputStreamReader(System.in));
      try{
    	  String martes="martes";
    	  String jueves="jueves";
    	  String viernes="viernes";
    	  String sabado="sabado";
         System.out.println("Ingrese el dia de la semana:");
         String dia=String.valueOf(input.readLine());
         System.out.println("ingrese el importe a pagar:");
         double importe=Double.valueOf(input.readLine());
         
         if(dia.equals(martes)){ //equals se usa para comparar cadenas de strings entre si NO funciona==
            if(importe>13000 && importe<=20000){
               double descuento1=(importe*5)/100;
               importe=importe-descuento1;
               System.out.println("el importe es: $"+ importe);
            }
            else if(importe<20000){
               double descuento2=(importe*7.5)/100;
               importe=importe-descuento2;
               System.out.println("el importe es: $"+ importe);
            }
         }
         else if(dia.equals(jueves)){
            if(importe<25000){
               double descuento3=(importe*10)/100;
               if(descuento3<=3000){
                  importe=importe- descuento3;
                  System.out.println("el importe es: $"+ importe);
               }
               else{
                  importe=importe-3000;
                  System.out.println("el importe es: $"+ importe);
               }
            }
         }
         else if(dia.equals(viernes)|| dia.equals(sabado)){
            System.out.println("ingrese el numero de ticket:");
            int ticket=Integer.valueOf(input.readLine());
            System.out.println("ingrese el numero de DNI:");
            int dni=Integer.valueOf(input.readLine());
            int particket=ticket%2;
            int dnipar=dni%2;
            if (particket==0 || dnipar==0 || importe<=15000){
               double descuento4=(importe*8)/100;
               importe=importe-descuento4;
               System.out.println("el importe es: $"+ importe);
            }
         }
         else{
            System.out.println("No hay descuentos disponibles");
         }
      }
      catch(Exception e){
         System.out.println("error");
      }
   }
}


