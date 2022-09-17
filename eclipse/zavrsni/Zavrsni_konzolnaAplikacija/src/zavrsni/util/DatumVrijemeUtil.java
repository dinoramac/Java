package zavrsni.util;

import java.text.SimpleDateFormat;

public class DatumVrijemeUtil {

	private static String formatZaDatum = "dd.MM.yyyy.";
	private static String formatZaVrijeme = "HH:mm";
	private static SimpleDateFormat simpleDateFormat;
	private static SimpleDateFormat simpleTimeFormat;
	
	public static String getFormatZaDatum() {
		return formatZaDatum;
	}
	public static void setFormatZaDatum(String formatZaDatum) {
		DatumVrijemeUtil.formatZaDatum = formatZaDatum;
	}
	public static String getFormatZaVrijeme() {
		return formatZaVrijeme;
	}
	public static void setFormatZaVrijeme(String formatZaVrijeme) {
		DatumVrijemeUtil.formatZaVrijeme = formatZaVrijeme;
	}
	public static SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}
	public static void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		DatumVrijemeUtil.simpleDateFormat = simpleDateFormat;
	}
	public static SimpleDateFormat getSimpleTimeFormat() {
		return simpleTimeFormat;
	}
	public static void setSimpleTimeFormat(SimpleDateFormat simpleTimeFormat) {
		DatumVrijemeUtil.simpleTimeFormat = simpleTimeFormat;
	}

	
	
}
