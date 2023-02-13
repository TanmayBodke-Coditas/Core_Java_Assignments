public class Additions{
	public int add(int num1,int num2){
		int sum;
		sum=num1+num2;
		return sum;
	}
	public static void main(String args[]){
		Additions objectss=new Additions();
		System.out.println("Addition is: "objectss.add(675,785));
	}
}