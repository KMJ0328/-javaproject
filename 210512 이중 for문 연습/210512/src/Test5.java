/*			Çà(i)   ¿­(j)(ºóÄ­)   ¿­(k)º°
     *		1		1~4			5~5
    **		2		1~3			4~5
   ***		3		1~2			3~5
  ****		4		1~1			2~5
 *****		5		1~x			1~5
 */
public class Test5 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=5; i++){ //Çà Á¦¾î
			for(j=1; j<=5-i; j++){// ¿­ Á¦¾î (ºóÄ­)
				System.out.print(" ");
			}
			for(k=6-i ; k<=5; k++){ // ¿­ Á¦¾î (º°)
				System.out.print("*");
			}
			
			System.out.println();// °¢ Çà ³¡ ÁÙ¹Ù²Þ
		}
	}

}
