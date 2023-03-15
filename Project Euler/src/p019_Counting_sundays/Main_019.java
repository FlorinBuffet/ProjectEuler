package p019_Counting_sundays;

public class Main_019 {

	public static void main(String[] args) {
		int weekday = 1;

		int sundays = 0;

		int day = 1;
		int month = 1;
		int year = 1901;

		while (year <= 2000) {
			day++;
			weekday++;
			if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12)) {
				day = 1;
				month++;
			} else if (day == 30 & (month == 4 || month == 6 || month == 9 || month == 11)) {
				day = 1;
				month++;
			} else if (day >= 28 && month == 2) {
				if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
					if (day == 29) {
						day = 1;
						month++;
					}
				} else {
					day = 1;
					month++;
				}
			}
			if (month == 13) {
				year++;
				month = 1;
			}
			if (weekday == 7) {
				if (day == 1)
					sundays++;
				weekday = 0;
			}
		}
		System.out.println(sundays);
	}
}
