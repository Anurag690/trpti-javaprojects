class NewLoop4
{
public static void main(String[]args)
{
int n=5,space=0,star=9,i,j,k;

for(i=1;i<=5;i++)
{
for(j=1;j<=space;j++)
{
System.out.print(" ");
}
for(k=1;k<=star;k++)
{
System.out.print('*');
}
System.out.println();
space+=2;
star--;
}}}
