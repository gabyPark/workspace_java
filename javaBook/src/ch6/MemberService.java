package ch6;

public class MemberService {

	
	boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		} return false;
		
	}
	
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�");
	}
}
	
	
	
	 // ���׿����ڷ� Ǫ�� ��� 
// boolean login(String id, String password) { 
// boolean b =
// id.equals("hong")? (password.equals("12345"))? true : false : false;
//	  return b;

