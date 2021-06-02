package test.struts.action;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class FormProAction implements Preparable, ModelDriven{
	// �Ķ���͸� set �޼���� ����
	// request.getParameter("id"); ===> setId(String id)
	// request.setAttribute("id",id); ===> getId;
	/*private String id;
	private String name;
	public void setId(String id) {this.id = id;}
	public void setName(String name) {this.name = name;}
	
	public String getId() {return id;}
	public String getName() {return name;}
	public int getNum() {return 888;} 
	
	public String execute() {
		System.out.println("id=="+id);
		System.out.println("name=="+name);
		return "success"; }*/
		
	private DTO dto = null;//����� DTO ����
	
	public String execute() {
		System.out.println("execute()--id-"+dto.getId());
		return "success";
	}
	@Override
	public void prepare() throws Exception { // ��ü ����
		System.out.println("prepare()");
		dto = new DTO();
	}
	@Override
	public Object getModel() { //��ü�� ����
		System.out.println("getModel()");
		return dto;
	}
}