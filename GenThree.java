public class GenThree {
public static void main(String[] args) {
int a = Integer.parseInt(args[0]);
int b  = Integer.parseInt(args[1]);

if(a>b){
	int temp= b;
	b=a;
	a=temp;
}

int firstNum = (int)(Math.random()*(b-a))+a;
int secondNum =(int)(Math.random()*(b-a))+a;
int thirdNum =(int)(Math.random()*(b-a))+a;
int minNum= Math.min(firstNum,Math.min(secondNum,thirdNum));



System.out.println(firstNum);
System.out.println(secondNum);
System.out.println(thirdNum);

System.out.println("The minimal generated number was "+ minNum);





}}