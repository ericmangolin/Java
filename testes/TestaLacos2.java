
public class TestaLacos2 {
	public static void main(String[] args) {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col <= 10; col++) {
				if (col > lin) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
