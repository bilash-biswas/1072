using System.IO;
using System;

class Program
{
    static void Main()
    {
    int a,i,b,c=0,d=0;
    a=Convert.ToInt32(Console.ReadLine());
    if(a<10000)
    {
       for(i=0;i<a;i++)
       {
           b=Convert.ToInt32(Console.ReadLine());
         if(b>=10 && b<=20)
       {
           c=c+1;
       }
       else
       {
           d=d+1;
       }
       }
    }
    Console.WriteLine(c+" in");
    Console.WriteLine(d+" out");
    }
}
