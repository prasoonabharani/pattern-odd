import java.util.*;
class Patternodd
{
public static void main(String args[])
{
Scanner sc =new Scanner (System.in);
int n= sc.nextInt();
for(int i=1;i<=n;i++)
{
for( int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++)
{
System.out.print(" *");
}
System.out.println();
}
for (int i=n-1;i>0;i--)
{
for (int j=i;j<n;j++)
{
System.out.print(" ");
}
for (int k=2*i;k>1;k--)
{
System.out.print(" *");
}System.out.println();
}}}