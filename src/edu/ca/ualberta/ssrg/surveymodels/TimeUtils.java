package edu.ca.ualberta.ssrg.surveymodels;

public class TimeUtils {

	// Get string display for a given time
	public static String getTimeAsString(long miliSecs) {
		long h, m, s, ms;
		
		ms = miliSecs % 1000;
		s = (miliSecs/1000) % 60;
		m = (miliSecs/(60 * 1000)) % 60;
		h = miliSecs/(60 * 60 * 1000);
		
		String time = h + ":" + m + ":" + s + ":" + ms;
		
		return time;
	}
}
