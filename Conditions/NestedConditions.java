public class NestedConditions{
public static void main(String[] args){
	int age = 20;
	Boolean isCitizen = true;
	if(age>=18){
		if(isCitizen==true){
			System.out.println("eligible to vote");
		}
	    else{
			System.out.println("not eligible to vote");
		}
	}
	else{
		System.out.println("not eligible");
	}


}
}