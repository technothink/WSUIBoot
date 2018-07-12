import com.google.gson.Gson;
import com.technothink.wsui.pojo.Project;


public class Test {

	public static void main(String[] args) {
		Gson gson=new Gson();
		Project project=new Project();
		project.setProjectName("CustomerProfileInquiery");
		project.setServiceType("rest");
		project.setWsdl("cust.wsdl");
		project.setEndPoint("https://dog.ceo/api/breeds/image/random");
		System.out.println(gson.toJson(project));
	}
}
