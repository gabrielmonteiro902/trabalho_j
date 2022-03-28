package trabalho_j;

public class trabalho_java_b1 {
    public static void main (String [] args) {
     
        double r = 5.00;
        double x = 2;
    	double PI = 3.14159;
    	double A, C;
    	
    	
    	A = Math.pow(r,x);
    	C = A * PI;
    	
    	System.out.println("Valor do raio é: " + r );
    	System.out.println("Valor da area total é " + String.format("%.4f", C));
    	
        
    }
}
