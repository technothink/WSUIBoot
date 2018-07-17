import com.google.gson.Gson;
import com.technothink.wsui.pojo.Project;


public class Test {

	public static void main(String[] args) {
		
		int a = 60;	/* 60 = 0011 1100 */
	      int b = 13;	/* 13 = 0000 1101 */
	      int c = 0;
	      System.out.println(a&b);
		 final int MAXIMUM_CAPACITY = 16>>>2;
		int h=1;
		System.out.println(MAXIMUM_CAPACITY);
		Gson gson=new Gson();
		Project project=new Project();
		project.setProjectName("CustomerProfileInquiery");
		project.setServiceType("rest");
		project.setWsdl("cust.wsdl");
		project.setEndPoint("https://dog.ceo/api/breeds/image/random");
		System.out.println(gson.toJson(project));
	}
}
