package trabalho_j;

public class trabalho_q2 {
	 public static void main (String [] args) {
		 double A = 3.0;
		 double B = 6.00;
		 double C = 12.00;
		 double TR= A * C / 2;
		 double PI = 3.14159;
		 double elevado = 2.00;
		 
		 //Triangulo Retangulo
		 System.out.println("A area do triangulo retangulo é " + TR);
		 
		 //Circulo 
		 double ce = Math.pow(C, elevado) * PI;
		 System.out.println("Valor do circulo é " + ce);
		 
		 //Trapezio
		 double tra = A + B * C / 2;
		 System.out.println("A area do trapezio é " + tra);
		 
		 //Quadrado
		 double qua = Math.pow(B, elevado);
		 System.out.println("A área do quadro é " + qua);
		 
		 //Retângulo
		 double re = A * B;
		 System.out.println("A área do retângulo é " + re);
		 
	 }
}
