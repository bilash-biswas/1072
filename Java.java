import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int i,c=0,d=0;
    int[] b=new int[10001];
    int a=input.nextInt();
    if(a<10000)
    {
       for(i=0;i<a;i++)
       {
           b[i]=input.nextInt();
       }
    }
    for(i=0;i<a;i++)
    {
       if(b[i]>=10 && b[i]<=20)
       {
           c=c+1;
       }
       else
       {
           d=d+1;
       }
    }
        System.out.println(c+" in");
        System.out.println(d+" out");
}
}
