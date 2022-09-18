package zavrsni.util;

import java.text.SimpleDateFormat;

public class DatumUtil {

	private static String formatZaDatum = "dd.MM.yyyy.";
	private static SimpleDateFormat simpleDateFormat;
	
	public static String getFormatZaDatum() {
		return formatZaDatum;
	}
	public static void setFormatZaDatum(String formatZaDatum) {
		DatumUtil.formatZaDatum = formatZaDatum;
	}
	
	public static SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}
	public static void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		DatumUtil.simpleDateFormat = simpleDateFormat;
	}

	
	
}
