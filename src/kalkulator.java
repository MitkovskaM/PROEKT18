import java.util.Scanner;
public class kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Scanner scan=new Scanner(System.in);
System.out.println("Vnesi ja posakuvanata operacija");
String operacija=scan.nextLine();
System.out.println("Vnesi ja vtorata operacija");
double a=input.nextDouble();
double b=input.nextDouble();
double c;
switch(operacija) {
case "+":
	c=a+b;
	System.out.println(a+operacija+b+"="+c);
	break;
case "-":
	c=a-b;
	System.out.println(a+operacija+b+"="+c);
	break;
case "*":
	c=a*b;
	System.out.println(a+operacija+b+"="+c);
	break;
case"/":
	c=a/b;
	System.out.println(a+operacija+b+"="+c);
	break;
	default:
		System.out.println("Proverete sto imate napisano");
		break;
}
}

	}

