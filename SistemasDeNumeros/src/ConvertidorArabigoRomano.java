import java.util.Scanner;

public class ConvertidorArabigoRomano {

    public static void main(String[] args) {
    	
    	int numero;
        int valor[] = {0,1,5,10,50,100};//SE LE DA VALOR A LA LETRAS
        int ant = 0;
        int menu;
        int suma = 0;
        char letra = ' ';
        char Rom[]= {' ','I','V','X','L','C'}; //GUARDAN LETRAS A COMPARAR
        String centenas[]= {"", "C"};
		String decenas[]= {"","X","XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String unidades[] = {"","I", "II","III", "IV", "V", "VI", "VII", "VIII", "IX"} ;
  

        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s%n","1. Convertir de Arabigos a Romanos");
        System.out.printf("%n");
        System.out.printf("%s%n","2. Convertir de Romanos a Arabigos");
        System.out.printf("%s%n","Ingresa Opcion:");
        System.out.printf("%n");
        menu = entrada.nextInt();
        
        switch(menu) {
        case 1:
        	 //Arabigo A Romano
        	Scanner sc= new Scanner(System.in);
    		do
    		{
    		    System.out.println("Introduzca un Numero entre 1 a 100: ");
    		    numero=sc.nextInt();
    		}
    		while (numero<1 || numero>= 101);

    		System.out.println ("Numero: "+ numero + "en romano es "+ centenas[(numero/100)%10]
    		                                             +decenas [(numero/10)%10] //Evaluando las cifras
    		                                              +unidades[numero%10]);
           
        
        break;
       
        
        case 2:   
  //Romanos A Arabigos

             System.out.printf("%s%n","Convertir numeros Romanos a Arabigos");
             System.out.printf("=================================================================%n");
             Scanner leer = new Scanner(System.in);
             System.out.printf("Ingrese el numero Romano a convertir: ");
             String romano = leer.nextLine();
             for(int i = 0; i < romano.length(); i++){//Romano A Numero

                 letra = romano.charAt(i);

                 for(int j = 0; j < Rom.length; j++){//RECORRE ARREGLO ROM

                     if(letra == Rom[j]){//si letra recorrida = a letra contenida en rom

                                 suma = suma + valor [j]; //sumar el valor de la letra

                             if( ant < valor[j]){ //si el valor de letra anterior menor a valor letra   //actual

                                     suma = suma - ant*2 ; // restale el doble del menor de los dos

                                     ant = valor[j]; // valor anterior = valor letra actual

                             }else {//si no se cumple lo anterior

                         ant = valor[j];//el dato actual se guarda en anterior

                             	}

                     }

                 }

         }

         System.out.print(suma);
         break;
        }

}
}
