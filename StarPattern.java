class StarPattern
{
public static void main(String[]args)
{
int i,j;
for (i=1;i<=6;i++)
{
if(i==3||i==4)
continue;
for(j=1;j<=6;j++)
{
if(j>=i&& i!=4&& i!=3)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}

}}