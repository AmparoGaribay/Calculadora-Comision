import java.util.Scanner;

public class CalculatorComission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe la de venta");
		Scanner in = new Scanner(System.in);
		  double ventas = in.nextDouble();
		  double comision=0;
		  String cantidadCom="";
		  
		if(ventas>=10000) {
			comision = ventas*0.30;
			cantidadCom="30";
		}else if ((ventas>=5000) && (ventas >=9999) ){
			comision = ventas *0.20;
			cantidadCom="20";
		} else if  ((ventas >=1000) && (ventas >=4999)) {
			comision = ventas *0.10;
			cantidadCom="10";
		}
		System.out.println((comision==0)?"NA":"Cantidad de comision "+comision +" Porcentaje de Comision % " +cantidadCom);
		in.close();
	}//main

}//class
