# Doğrusal Şifreleme


public class cevir{
	int a,b;
	public void metincevir(String metin , int a , int b){
		this.a=a;
		this.b=b;
		
			siralama s = new siralama();
			char [] alfabe = new char [26];
			char harf = 97;
			for(int i=0; i<alfabe.length; i++){
				alfabe[i] = (char)(harf+i);
			}
			
				char[] char_metin = new char[metin.length()];
				for(int j=0; j<metin.length(); j++){
					char_metin[j] = metin.charAt(j);
				}
				
				char [] yeni_metin = new char[metin.length()]; 
				int dogrusal,gecici;
					for(int k=0; k<char_metin.length; k++){
						s.sirala(char_metin[k],a,b);
						gecici = s.indis_iste();
							dogrusal = gecici * a + b;
							if(dogrusal>=alfabe.length){
								dogrusal = dogrusal % alfabe.length;
							}
							yeni_metin[k] = alfabe[dogrusal];
					}
				System.out.println("Sifrelenmis Metin : " + String.valueOf(yeni_metin));
		}
}	

import java.util.*;
public class Dogrusal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		cevir c = new cevir();
		System.out.println("Sifreleme Kucuk Harfler Uzerine Yazilmistir  " + "F(x) = AX + B");
		System.out.println("\n");
		System.out.println("Sifrelenecek Metni Giriniz : " + "(Bosluk Kabul Edilemez)");
		String metin = scan.nextLine();
		System.out.println("A degerini giriniz : ");
		int a = scan.nextInt();
		System.out.println("B degerini giriniz : ");
		int b = scan.nextInt();
		c.metincevir(metin, a, b);
	}
}

public class siralama {
	int indis;
	public void sirala(char k , int a , int b){
		char [] alfabe = new char [26];
		char harf = 97;
		for(int i=0; i<alfabe.length; i++){
			alfabe[i] = (char)(harf+i);
		}
			for(int j=0; j<alfabe.length; j++){
				if(k == alfabe[j]){
					indis = j;
				}
			}
	}
	
	public int indis_iste(){
		return this.indis;
	}
}
