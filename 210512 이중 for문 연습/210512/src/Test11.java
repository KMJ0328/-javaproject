/*			Çà(i)	     ¿­(j,¼ıÀÚ)	 ¿­(k,ºóÄ­)
 54321 		1			5~5		  1~x
  4321 		2			5~4		  1~1
   321		3			5~3		  1~2
    21		4			5~2		  1~3
     1	 	5			5~1		  1~4
 */
public class Test11 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=5; i++){
			for(k=1;k<i;k++){ //¿­ Á¦¾î ºóÄ­
				System.out.print(" ");
			}for(j=6-i; j>=1; j--){
				System.out.print(j);// ¼ıÀÚ°¨¼Ò
			}
			System.out.println();
		}

	}

}
