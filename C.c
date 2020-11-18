#include<stdio.h>
int main()
{
    int a,i,b[10000],c=0,d=0;
    scanf("%d",&a);
    if(a<10000)
    {
       for(i=0;i<a;i++)
       {
           scanf("%d",&b[i]);
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
    printf("%d in\n",c);
    printf("%d out\n",d);
    return 0;
}
