
public class Date {
	int month;
	int day;
	int year;

	public Date(int newMonth, int newDay, int newYear) {
		month = newMonth;
		day   = newDay;
		year = 	newYear;
	}
	public void setMonth(int newMonth) {
		month = newMonth;
	}
	public int getMonth() {
		return month;
	}
	public void setDay(int newDay) {
		day = newDay;
	}
	public int getDay() {
		return day;
	}
	public void setYear(int newYear) {
		year = newYear;
	}
	public int getYear() {
		return year;
	}
}
