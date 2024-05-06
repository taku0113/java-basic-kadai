package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	

	public String getGivenName2() {
		return this.GivenName2;
		
	}
	
	private String GivenName2 = "一郎";
	public void setGivenName2(String GivenName2){
		this.GivenName2 = GivenName2;
		
	}
	void eachIntroduce () {
		super.commonIntoroduce();
		System.out.println("好きな食べ物はリンゴです");
	}

}