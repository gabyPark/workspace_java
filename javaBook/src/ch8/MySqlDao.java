package ch8;

public class MySqlDao implements DataAccessObject {
	
	@Override
	public void select() {
		System.out.println("sql ��� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("sql ��� ����");
	}

	@Override
	public void update() {
		System.out.println("sql ��� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("sql ��� ����");		
		
	}
}
