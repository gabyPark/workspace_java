package ch5;

import java.util.Calendar;

public class Test5_3_p208 {

	public static void main(String[] args) {

//		Week today = Week.THURSDAY;
//
//		Calendar cal = Calendar.getInstance(); 
//		// �������� ���̺귯��. ������ LocalDate, LocalTime �� �� ���� ����
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1; // 0~11�� ���� ������ +1 ���� ��
//		int day = cal.get(Calendar.DAY_OF_MONTH);
////		int date = cal.get(Calendar.);
//		
//		
//		System.out.println(year+"�� "+month+"��"+day+"�� ");

 
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
	
	System.out.println("���� ���� : "+today);
	
	if(today == Week.SUNDAY) {
		System.out.println("�޽�");
	} else {
		System.out.println("����");
	}
	
	
	
	}
 

		
		
		
		
}
