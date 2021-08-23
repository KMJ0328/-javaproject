/*			Çà(i)   ¿­(j)(ºóÄ­)   ¿­(k)º°
*****		1		1~x			5~5
 ****		2		1~1			4~5
  ***		3		1~2			3~5
   **		4		1~3			2~5
    *		5		1~4 		1~5
 */
import java.util.*;
public class Test8 {
	public static void main(String[] args) {
		int i,j,k,n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Çà ÀÔ·Â: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++){
			for(j=1;j<i;j++){ // ¿­ Á¦¾î ºóÄ­
				System.out.print(" ");
			}for(k=i;k<=n;k++){
				System.out.print("*");
			}System.out.println();
		}
	}
	}


