package EventingContext;

public class SampleBean {

	private String message;
	public SampleBean(){
		System.out.println("SampleBean: constructor");
	}
public String getMessage(){
	return this.message;
}
public void setMessage(String string){
	this.message = string;
}
}
