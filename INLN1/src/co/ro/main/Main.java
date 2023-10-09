package co.ro.main;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		System.out.println("Robin");
		Locale local = Locale.getDefault();
		System.out.println(local);
		System.out.println(local.getDisplayCountry());
		System.out.println(local.getDisplayLanguage());
		System.out.println(local.getCountry());
		
		
		System.out.println("-------------------------------");
		Locale local2 = new Locale("Hindi", "india");
		System.out.println(local2);
		System.out.println(local2.getDisplayCountry());
		System.out.println(local2.getDisplayLanguage());
		System.out.println(local2.getCountry());
	}
}
