package test.struts.action;

public class HelloAction {
	public String execute() {
		System.out.println("HelloAction-execute()");
		//return "success"; //MVCó�� view�ּҸ� ������ ���� �ƴ϶� success�� ����ó���Ǿ��ٴ� ���� �˷���
		return "ok"; // success�� �ƴ϶� �����߻�
	}
	
	public String add() {
		System.out.println("HelloAction-add()");
		return "success";
	}
}
