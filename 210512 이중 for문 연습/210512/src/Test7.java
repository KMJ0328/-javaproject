/*			Çà(i)   ¿­(j)(ºóÄ­)   ¿­(k)º°
*****		1		1~x			1~5
 ****		2		1~1			2~5
  ***		3		1~2			3~5
   **		4		1~3			4~5
    *		5		1~4 		5~5
 */
public class Test7 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++){
			for(j=1;j<i;j++){ // ¿­ Á¦¾î ºóÄ­
				System.out.print(" ");
			}for(k=i;k<=5;k++){
				System.out.print("*");
			}System.out.println();
		}
	}

}
