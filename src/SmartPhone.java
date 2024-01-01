
public class SmartPhone extends Mp3Player{
//	SmartPhone=子クラスの部分
//	extends　= 拡張（継承）機能
//	Mp3Playe　=親クラスの部分

//	オーバーライド  スーパークラス(親クラス)の機能をサブクラス(子クラス)で上書くこと。
//	今回の場合Mp3Player（親クラス）をSmartPhone（子クラス）で上書きする
	public void play(){
		System.out.println("再生(ハイレゾ機能)");
	}
	public void stop(){
		System.out.println("停止(ハイレゾ機能)");
	}
	public void next(){
		System.out.println("次へ(ハイレゾ機能)");
	}
	public void back(){
		System.out.println("戻る(ハイレゾ機能)");
	}
//	オーバーライドした plsy stop next backメソッド
//	 →Mp3Playerの同名メソッドは上書きされて、こちらが実行される
	public void call(){
		System.out.println("電話");
	}
	public void mail(){
		System.out.println("メール");
	}
	public void photo(){
		System.out.println("写真");
	}
	public void internet(){
		System.out.println("インターネット");
	}
}