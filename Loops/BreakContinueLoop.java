public class BreakContinueLoop{
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i==7){
				break;
			}
			System.out.println(i);

		}
					System.out.println("--------------------------------");

					for(int i=2;i<10;i++){
						if(i==6){
							continue;

						}
						System.out.println(i);

					}
					System.out.println("--------------------------------");

					for(int i=0;i<7;i++){
						if(i==3){
							continue;
						}
						if(i==5){
							break;
						}
						System.out.println(i);
					}

	}
}