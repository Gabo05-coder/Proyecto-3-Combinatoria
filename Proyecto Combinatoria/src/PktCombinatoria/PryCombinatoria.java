package PktCombinatoria;
import javax.swing.JOptionPane;


public class PryCombinatoria {
static int numObj=0,numCif=0, n=0, i, a; 
static long num1=0, num2=0, num3=0, numCom=0, factorialP=0, fact=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

 while(n!=7)
 		{
	 		n=Integer.parseInt(JOptionPane.showInputDialog("Elije el tipo de combinatoria: \n1.Combinatoria sin Repeticion "
	 				+ "\n2.Combinacion con Repeticion \n3.Variacion sin Repeticion \n4.Variacion con Repeticion "
	 				+ "\n5.Permutacion sin Repeticion \n6.Permutacion con Repeticion \n7.Salir"));
	 		switch(n)
	 		{
	 		case 1: 
	 				numObj=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de objetos"));
	 				numCif=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de expresion"));
	 				num1=factorial(numObj);
	 				num2=factorial(numCif);
	 				num3=factorial(numObj-numCif);
	 				numCom=num1/num2*num3;
	 				JOptionPane.showMessageDialog(null,"-Usando el Metodo de Combinatoria sin repeticion- "
	 						+ "\nel resultado es:"+numCom);
	 				continue;
	 		case 2: numObj=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de objetos"));
 					numCif=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de expresion"));
 					num1=factorial(numObj+numCif-1)/factorial(numCif)*(factorial(numObj-1));
 					JOptionPane.showMessageDialog(null,"-Usando el Metodo de Combinatoria con repeticion-\n"
 							+ "el resultado es:"+num1);
 					continue;
	 		case 3: numObj=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de objetos"));
					numCif=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de expresion"));
					num1= factorial(numObj)/factorial(numObj-numCif);
					JOptionPane.showMessageDialog(null,"-Usando el Metodo de Variacion sin repeticion-\n "
							+ "el resultado es: "+num1);
					continue;
	 		case 4: numObj=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de objetos"));
	 				numCif=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de expresion"));
	 				num1 =numObj^numCif;
	 				JOptionPane.showMessageDialog(null,"-Usando el Metodo de Variacion con repeticion-\n "
							+ "el resultado es: "+num1);
	 				continue;
	 		case 5: numObj=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de objetos"));
					num1= factorial(numObj);
					JOptionPane.showMessageDialog(null,"-Usando el Metodo de Permutacion sin repeticion-\n "
							+ "el resultado es: "+num1);
					continue;
	 		case 6: numObj=Integer.parseInt(JOptionPane.showInputDialog("cantidad de cifras piden"));
					numCif=Integer.parseInt(JOptionPane.showInputDialog("cantidad de numeros"));
					do {
	                    int mult2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantas veces se repite el elemento "+i));
	                    factorialP=factorial(mult2); 
	                    fact=factorialP*fact;
	                    i++;
	                    a++;
	                }while(a < numCif);
	                i=1;a=0;
	                long calculo2 = factorial(numObj);
	                long calculofinal=calculo2/fact;
	                JOptionPane.showMessageDialog(null, "El resultado es: "+calculofinal);
	                fact=1;
	                continue;
	 		case 7: break;
	 		default:JOptionPane.showMessageDialog(null,"La opcion es Incorrecta");
			continue;
	 		}
 		}
	}
	public static long factorial(int n) {
        long productoria = 1;
        int i = 1;
        do {
            productoria *= i;
            i++;
        } while (i <= n);
        return productoria;
    }
}

