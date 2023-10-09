package co.ro.main;

import java.util.Locale;

public class Main2 {
	public static void main(String[] args) {
		String[]countryCode = Locale.getISOCountries();
		for(String cCode : countryCode) {
			Locale local = new Locale("", cCode);
			System.out.println(cCode+" -> "+local.getDisplayCountry());
		}
	}
}
