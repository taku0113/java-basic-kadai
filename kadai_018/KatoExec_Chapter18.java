package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.setGivenName("太郎");
		String name = taro.getGivenName();
		System.out.println("名前は加藤" + name + "です");
		taro.eachIntroduce ();
		
		
		KatoIchiro_Chapter18 ichoro = new KatoIchiro_Chapter18();
		ichoro.setGivenName2("一郎");
		String name2 = ichoro.getGivenName2();
		System.out.println("名前は加藤" + name2 + "です");
		ichoro.eachIntroduce ();
		
		
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.setGivenName3("花子");
		String name3 = hanako.getGivenName3();
		System.out.println("名前は加藤" + name3 + "です");
		hanako.eachIntroduce ();
	}

}
