a=gets().chomp().to_i
b=Array.new()
c=0
d=0
if a<10000
       for i in 1..a
           b[i]=gets().chomp().to_i
       end
end
for i in 1..a
  if b[i]>=10 && b[i]<=20
    c=c+1
  else
    d=d+1
  end
end
printf("%d in\n",c);
printf("%d out\n",d);
