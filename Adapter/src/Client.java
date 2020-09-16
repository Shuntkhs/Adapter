
public class Client {
public static void main(String[] args) {
Dengen dengen;
dengen = new AcAdapter();
int denatsu = dengen.kyuuden();
System.out.println( denatsu + "V で給電されています" );
}
}class Dengen { // Targetクラス
	public int kyuuden(); // request()メソッド
	}
class JapaneseConsent  {



}
class AcAdapter {


}