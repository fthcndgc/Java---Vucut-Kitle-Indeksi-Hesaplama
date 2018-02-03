package vucutkitleindeksi;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		VKI();
		System.out.println("--------------------------------");
		double kilo,boy;
		kilo = Kilo();
		boy = Boy();
		double vki = VKI_DEGERI(kilo, boy);
		System.out.println("Vücut kitle indeksini = " + vki);
		System.out.println("--------------------------------");
		double istenenvki1 = IstenenVKI();
		double idealkilo = IdealKilo(istenenvki1, boy);
		System.out.println("Ideal kilonuz = " + idealkilo);

	}
	public static void VKI(){
		System.out.println("18.5 ve altý ---> Dusuk kilolu\n"+
				"18.5-24.9 ---> Normal kilolu\n"+
				"25-29.9 ---> Fazla kilolu\n"+
				"30-40 ---> Obez\n"+
				"40 ve uzeri ---> Asiri Obez");
	}
	public static double Kilo(){
		Scanner veri = new Scanner(System.in);
		int kilo;
		System.out.println("Kilonuzu yaziniz : ");
		return kilo=veri.nextInt();
	}
	public static double Boy(){
		Scanner veri = new Scanner(System.in);
		int boy;
		System.out.println("Boyunuzu giriniz : ");
		return boy = veri.nextInt();
	}
	public static double VKI_DEGERI(double num1 , double num2){
		num2 = num2/100;
		return num1/(num2*num2);
	}
	public static double IstenenVKI(){
		Scanner veri = new Scanner(System.in);
		double istenenvki;
		System.out.println("Istediginiz VKI yi giriniz : ");
		istenenvki = veri.nextDouble();
		return istenenvki;
	}
	public static double IdealKilo(double num1 , double num2){
		num2 = num2/100;
		return num1*(num2*num2);
	}

}
