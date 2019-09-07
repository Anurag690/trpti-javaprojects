class NewLoop2
{
public static void main(String[]args)
{
int n=4,space=3,star=1,i,j,k;

for(i=1;i<=4;i++)
{
for(j=1;j<=space;j++)
{
System.out.print(' ');
}
for(k=1;k<=star;k++)
{
System.out.print("*");
}
System.out.println();
star++;
space--;
}}
}