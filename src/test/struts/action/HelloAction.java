package test.struts.action;

public class HelloAction {
	public String execute() {
		System.out.println("HelloAction-execute()");
		//return "success"; //MVC처럼 view주소를 보내는 것이 아니라 success로 정상처리되었다는 것을 알려줌
		return "ok"; // success가 아니라서 에러발생
	}
	
	public String add() {
		System.out.println("HelloAction-add()");
		return "success";
	}
}
