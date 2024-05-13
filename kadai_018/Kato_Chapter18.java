package kadai_018;

abstract public class Kato_Chapter18 {
	String familyName = "加藤";
	String givenName;
	String address = "住所は東京都中野区〇×です";
	
	
	
	 abstract  void eachIntroduce();
	 
	 public void exeIntorduce() {
		 
	 }
	 public void commonIntoroduce() {
			System.out.println("名前は" + familyName + givenName + "です");
			System.out.println(address);
		}
}
