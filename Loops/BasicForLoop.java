public class BasicForLoop{
	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			System.out.println(i);
		}
		System.out.println("------------------------------------");
		for(int i=20;i>=1;i--){
			System.out.println(i);
		}
		System.out.println("------------------------------------");
		for(int i=1;i<=20;i++){
			if(i%2==0){
				System.out.println(i);

			}
			
		}
		System.out.println("------------------------------------");

		for(int i=2;i<=20;i+=2){
			System.out.println(i);
		}
		
	}
}