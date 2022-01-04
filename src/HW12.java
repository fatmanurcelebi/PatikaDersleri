import java.util.Scanner;
public class HW12 {

	public static void main(String[] args) {
		// Burç bulma
		String burc="";
		Boolean isError=false;
		Scanner inp= new Scanner(System.in);	
		int ay,gun;
		System.out.println("Kaçýncý ayda doðdunuz?: ");
		ay= inp.nextInt();
		
		
	if (ay<1 || ay>12) {

	System.out.println("Hatalý ay giriþi yaptýnýz");
	}
	else {
		System.out.println("Kaçýncý günde doðdunuz?: ");
		gun=inp.nextInt();
		if(ay==1) {
			if(gun>=1 && gun<=31) {
				if(gun<22) {
					burc="Oðlak";
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
					burc="Balýk";
				}}else {
					isError=true ;}}
		
	     if(ay==3) {
			if(gun>=1 && gun<=31) {
				if(gun<21) {
					burc="Balýk";
				}else {
					burc="Koç";
				}}else {
					isError=true ;}}
		
		if(ay==4) {
			if(gun>=1 && gun<=30) {
				if(gun<21) {
					burc="Koç";
				}else {
					burc="Boða";
				}}else {
					isError=true ;
				}}
		
		if(ay==5) {
			if(gun>=1 && gun<=31) {
				if(gun<22) {
					burc="Boða";
				}else {
					burc="Ýkizler";
				}}else {
					isError=true ;}}
		
		if(ay==6) {
			if(gun>=1 && gun<=30) {
				if(gun<22) {
					burc="Ýkizler";
				}else {
					burc="Yengeç";
				}}else {
					isError=true ;}}
		if(ay==7) {
			if(gun>=1 && gun<=31) {
				if(gun<23) {
					burc="Yengeç";
				}else {
					burc="Aslan";
				}}else {
					isError=true ;}}
		
		if(ay==8) {
			if(gun>=1 && gun<=31) {
				if(gun<23) {
					burc="Aslan";
				}else {
					burc="Baþak";
				}}else {
					isError=true ;}}
		if(ay==9) {
			if(gun>=1 && gun<=30) {
				if(gun<23) {
					burc="Baþak";
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
					burc="Oðlak";
				}}else {
					isError=true ;}
				}
		 
		if(isError) {
			System.out.println("Hatalý gün giriþ yaptýnýz");
		}else {
			System.out.println("Burcunuz: " + burc);
		}
	
	}


		
	}}
