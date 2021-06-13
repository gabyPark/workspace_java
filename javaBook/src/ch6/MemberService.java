package ch6;

public class MemberService {

	
	boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		} return false;
		
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
}
	
	
	
	 // 삼항연산자로 푸는 방법 
// boolean login(String id, String password) { 
// boolean b =
// id.equals("hong")? (password.equals("12345"))? true : false : false;
//	  return b;

