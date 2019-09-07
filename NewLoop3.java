class NewLoop3
{
public static void main(String[]args)
{
int n=5,space=0,star=5,i,j,k;

for(i=1;i<=5;i++)
{
for(j=1;j<=space;j++)
{
System.out.print(" ");
}
for(k=1;k<=star;k++)
{
System.out.print("*");
}

space++;
star--;
System.out.println();


}
}
}
