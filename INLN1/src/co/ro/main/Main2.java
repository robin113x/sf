package co.ro.main;

import java.util.Locale;

public class Main2 {
	public static void main(String[] args) {
		String[] countryCode = Locale.getISOCountries();
		for (String cCode : countryCode) {
			Locale local = new Locale("", cCode);
			System.out.println(cCode + " -> " + local.getDisplayCountry());
		}
		String[] langArr = Locale.getISOLanguages();
		for (String lan : langArr) {
			Locale local = new Locale(lan);
			
			System.out.println(lan+" -> "+local.getDisplayLanguage());
		}
	}
}
