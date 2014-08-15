package EventingContext;

public class Sample2 {
	private String message;
	public Sample2(){
		System.out.println("Sample2: constructor");
	}
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String string){
		this.message = string;
	}
}
