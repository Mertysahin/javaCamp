package stringsDemo;

public class Main {

	public static void main(String[] args)
	{
		String mesaj = "    Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		/*
		 * System.out.println("Eleman say�s� : " + mesaj.length());
		 * System.out.println("5.eleman : " + mesaj.charAt(4)); //0.indexten ba�l�yor
		 * System.out.println(mesaj.concat(" Ya�as�n!")); //birle�tirme
		 * System.out.println(mesaj.startsWith("A")); //B ile ba�l�yorsa true d�nd�r�r;
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char [5]; mesaj.getChars(0, 5, karakterler, 0);
		 * //karakterleri-al�r System.out.println(karakterler);
		 * 
		 * System.out.println(mesaj.indexOf('a')); //karekterin ilk bulundu�u yerdeki
		 * indexi verir System.out.println(mesaj.lastIndexOf('a')); //aramaya sa�dan
		 * ba�lar, ilk gelenin bilgisini verir
		 */		 
		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.replace(' ','-' ));
		System.out.println(mesaj.substring(2,4)); //4. indexi hesaba katmaz
		
		for(String kelime: mesaj.split(" "))
		{
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); //bosluk siler
	}

}
