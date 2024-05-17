package kadai_026;
import java.util.HashMap;
import java.util.Scanner;


public class Jyanken_Chapter26 {
	
	private Scanner jyan = new Scanner(System.in);
	
	public String getMyChoice() {
		
		
		while(true) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		
		String input= jyan.next();
		
		if(input.equals("r") || input.equals("s")|| input.equals("p")) {
			return input;
		}else {
		System.out.println("じゃんけんの手ではありません。");
		return getMyChoice();
		
	}
}
	}
	public String getRandom() {
		String[] jyanArray = {"r", "s", "p"};
		
		String jyanRsp = jyanArray[(int) Math.floor(Math.random() * (jyanArray.length))];
	 return jyanRsp;
	}
	
	public void playGame() {
		String choice = getMyChoice();
		String jyanRsp = getRandom();
		
		
		HashMap<String,String> rsp = new HashMap<String,String>();
		
		rsp.put("r", "グー");
		rsp.put("s", "チョキ");
		rsp.put("p","パー");
		
		
		System.out.println("自分の手は" + rsp.get(choice) + ",対戦相手の手は" + rsp.get(jyanRsp));
		
		if(choice.equals(jyanRsp)) {
			System.out.println("あいこです");
		}else if((choice.equals("r") && jyanRsp.equals("s")) || (choice.equals("p") && jyanRsp.equals("r")) || (choice.equals("s") && jyanRsp.equals("p"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
	
	
	public void closeScanner() {
		
		jyan.close();
	}
}
