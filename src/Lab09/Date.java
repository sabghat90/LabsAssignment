package Lab09;
public class Date{

	private int day, month, year;

	public Date (int day, int month, int year){
		if(day <= 31 && day >=1){
			this.day = day;
		}
		if(month <= 12 && month >=1){
			this.month = month;
		}
		if(year <= 2020){
			this.year = year;
		}
	}

	public String toString(){
		return day+"/"+month+"/"+year;
	}


}