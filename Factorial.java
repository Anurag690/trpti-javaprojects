class Factorial
{
public static void main(String[]args)
{
int i=1;
int num=5;
int fact=1;

//5*4*3*2*1
while(i<=num)
{
  fact=fact*i;
i++;
}
System.out.println(fact);
}
}
