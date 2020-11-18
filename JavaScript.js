var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var a=parseInt(lines.shift());
var a,i,c=0,d=0;
var b=[];
if(a<10000)
{
  for(i=0;i<a;i++)
  {
    b.push(parseInt(lines.shift()));
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
console.log(c+" in");
console.log(d+" out");
