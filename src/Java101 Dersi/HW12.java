import java.util.Scanner;
public class HW12 {

	public static void main(String[] args) {
		// Bur� bulma
		String burc="";
		Boolean isError=false;
		Scanner inp= new Scanner(System.in);	
		int ay,gun;
		System.out.println("Ka��nc� ayda do�dunuz?: ");
		ay= inp.nextInt();
		
		
	if (ay<1 || ay>12) {

	System.out.println("Hatal� ay giri�i yapt�n�z");
	}
	else {
		System.out.println("Ka��nc� g�nde do�dunuz?: ");
		gun=inp.nextInt();
		if(ay==1) {
			if(gun>=1 && gun<=31) {
				if(gun<22) {
					burc="O�lak";
				}else {
					burc="Kova";
				}}else {
					isError=true ;
					}}
		
		if(ay==2) {
			if(gun>=1 && gun<=28) {
				if(gun<20) {
					burc="Kova";
				}else {
					burc="Bal�k";
				}}else {
					isError=true ;}}
		
	     if(ay==3) {
			if(gun>=1 && gun<=31) {
				if(gun<21) {
					burc="Bal�k";
				}else {
					burc="Ko�";
				}}else {
					isError=true ;}}
		
		if(ay==4) {
			if(gun>=1 && gun<=30) {
				if(gun<21) {
					burc="Ko�";
				}else {
					burc="Bo�a";
				}}else {
					isError=true ;
				}}
		
		if(ay==5) {
			if(gun>=1 && gun<=31) {
				if(gun<22) {
					burc="Bo�a";
				}else {
					burc="�kizler";
				}}else {
					isError=true ;}}
		
		if(ay==6) {
			if(gun>=1 && gun<=30) {
				if(gun<22) {
					burc="�kizler";
				}else {
					burc="Yenge�";
				}}else {
					isError=true ;}}
		if(ay==7) {
			if(gun>=1 && gun<=31) {
				if(gun<23) {
					burc="Yenge�";
				}else {
					burc="Aslan";
				}}else {
					isError=true ;}}
		
		if(ay==8) {
			if(gun>=1 && gun<=31) {
				if(gun<23) {
					burc="Aslan";
				}else {
					burc="Ba�ak";
				}}else {
					isError=true ;}}
		if(ay==9) {
			if(gun>=1 && gun<=30) {
				if(gun<23) {
					burc="Ba�ak";
				}else {
					burc="Terazi";
				}}else {
				isError=true ;}}
		if(ay==10) {
			if(gun>=1 && gun<=31) {
				if(gun<23) {
					burc="Terazi";
				}else {
					burc="Akrep";
				}}else {
					isError=true ;}}
		if(ay==11) {
			if(gun>=1 && gun<=30) {
				if(gun<22) {
					burc="Akrep";
				}else {
					burc="Yay";
				}}else {
					isError=true ;}}
		if(ay==12) {
			if(gun>=1 && gun<=31) {
				if(gun<22) {
					burc="Yay";
				}else {
					burc="O�lak";
				}}else {
					isError=true ;}
				}
		 
		if(isError) {
			System.out.println("Hatal� g�n giri� yapt�n�z");
		}else {
			System.out.println("Burcunuz: " + burc);
		}
	
	}


		
	}}
