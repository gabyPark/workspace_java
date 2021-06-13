package ch8;

public class MySqlDao implements DataAccessObject {
	
	@Override
	public void select() {
		System.out.println("sql 디비 검색");
	}

	@Override
	public void insert() {
		System.out.println("sql 디비 삽입");
	}

	@Override
	public void update() {
		System.out.println("sql 디비 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("sql 디비 삭제");		
		
	}
}
