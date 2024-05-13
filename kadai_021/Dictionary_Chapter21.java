package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public  void zisyo (String[] word) {
HashMap<String,String> foodMap = new HashMap<String,String>();
String result = "";

foodMap.put("apple", "りんご");
foodMap.put("peach","桃");
foodMap.put("banana","バナナ");
foodMap.put("lemon","レモン");
foodMap.put("pear", "梨");
foodMap.put("kiwi", "キウイ");
foodMap.put("strawberry", "いちご");
foodMap.put("grape", "ぶどう");
foodMap.put("muscat", "マスカット");
foodMap.put("cherry", "さくらんぼ");
	
for(int i = 0; i < word.length; i++) {
    //辞書に単語があるか調べる
    if(foodMap.containsKey(word[i])) {
        //単語があれば意味を取り出す
        result = foodMap.get(word[i]);
        System.out.println(word[i] + "の意味は" + result + "です。");
    } else {
        //単語がなければメッセージを表示する
        System.out.println(word[i] + "は辞書にありません。");
    }
}


}
}