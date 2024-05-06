package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	
	public String getGivenName() {
		return this.GivenName;
		
	}
	private String GivenName = "太郎";
	public void setGivenName(String GivenName){
		this.GivenName = GivenName;
		
	}
	
	
	void eachIntroduce () {
		super.commonIntoroduce();
		System.out.println("Javaが得意です");
	}
}
