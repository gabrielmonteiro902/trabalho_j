package trabalho_j;

public class trabalho_q3 {
	 public static void main (String [] args) {
		 double A = 3;
		 double B = 15;
		 double C = 12;
		 
		 
         double delta = Math.pow(B, 2) - 4*A*C;
         
         double x1 = (-B + Math.sqrt(delta)) / (2 * A);
         double x2 = (-B - Math.sqrt(delta)) / (2 * A);
         
         System.out.println("Valor 1 " + x1);
         System.out.println("Valor 2 " + x2);
   }    
	 
}
