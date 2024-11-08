import java.util.Scanner;

public class descuentosPeliculas {

	public static void main(String[] args) {
		System.out.println("Escribe tu edad");
		Scanner in = new Scanner(System.in);
		  int edad = in.nextInt();
	
		  double ticket=7;
		  
		  
		  if (edad<5 ) {
			  ticket = ticket-(ticket*0.60);	
		  }else if(edad >=60){
			   ticket = ticket-(ticket*0.55);				  
		  }else {
			  System.out.print("cuantos voletos deseas");
			  short cantidad = in.nextShort();
			  if (cantidad>=2) {
				  ticket=(float)(cantidad *ticket)*0.70;
			  }//if 
		  }//else
		  
		  System.out.println("el costo de los boletos es "+ ticket);
		  
		  in.close();
	}//main

}//class
