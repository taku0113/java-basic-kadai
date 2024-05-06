package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{


	public String getGivenName3() {
		return this.GivenName3;
	}
	private String GivenName3 = "花子";
	public void setGivenName3(String GivenName3){
		this.GivenName3 = GivenName3;
		
	}
	
	void eachIntroduce () {
		super.commonIntoroduce();
		System.out.println("趣味は読書です");
	}
}
