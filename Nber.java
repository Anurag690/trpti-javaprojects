class NberSm
{
public static void main(String []args)
{
int num1=13;
int num2=14;
int num3=15;
int result;

 result=num1<num2?num1:num2;
result=result<num3?result:num3;
System.out.println(result);
}
}