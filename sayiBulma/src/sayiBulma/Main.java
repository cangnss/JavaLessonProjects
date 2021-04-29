package sayiBulma;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();
	}
	//camel casing
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			mesajVer("Say� mevcuttur: "+aranacak);
		}else {
			mesajVer("Say� mevcut de�ildir: "+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {//parametreli method
		System.out.println(mesaj);
	}
}
