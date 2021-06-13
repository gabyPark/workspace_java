package ch5;

import java.util.Calendar;

public class Test5_3_p208 {

	public static void main(String[] args) {

//		Week today = Week.THURSDAY;
//
//		Calendar cal = Calendar.getInstance(); 
//		// 고전적인 라이브러리. 요즘은 LocalDate, LocalTime 을 더 많이 쓴다
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1; // 0~11로 세기 때문에 +1 해줄 것
//		int day = cal.get(Calendar.DAY_OF_MONTH);
////		int date = cal.get(Calendar.);
//		
//		
//		System.out.println(year+"년 "+month+"월"+day+"일 ");

 
	Week today = null;
	Calendar cal = Calendar.getInstance(); 
	int week = cal.get(Calendar.DAY_OF_WEEK);
	
	switch (week) {
	case 1:
		today = Week.SUNDAY; break;
	case 2:
		today = Week.MONDAY; break;
	case 3:
		today = Week.TUESDAY; break;
	case 4:
		today = Week.WEDNESDAY; break;
	case 5:
		today = Week.THURSDAY; break;
	case 6:
		today = Week.SATURDAY; break;
	case 7:
		today = Week.SUNDAY; break;

	default:
		break;
	}	
	
	System.out.println("오늘 요일 : "+today);
	
	if(today == Week.SUNDAY) {
		System.out.println("휴식");
	} else {
		System.out.println("공부");
	}
	
	
	
	}
 

		
		
		
		
}
