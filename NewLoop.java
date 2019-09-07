class NewLoop
{
public static void main(String[]args)
{
int n=4,space=3,star=1,i,j,k;

for(i=1;i<=4;i++)
{
for(j=1;j<=star;j++)
{
System.out.print("*");
}
for(k=1;k<=space;k++)
{
System.out.print(" ");
}
System.out.println();
star++;
space++;
}}
}