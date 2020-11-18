array={}
c=0
d=0
a=io.read("*n")
if(a<10000) then
    for i=1,a do
        array[i]=io.read("*n")
    end
    for i=1,a do
        if(array[i]>=10 and array[i]<=20)then
            c=c+1
        else
            d=d+1
        end
    end
end
print(c.." in")
print(d.." out")
