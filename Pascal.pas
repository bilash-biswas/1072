var
a,b,c,d:int64;
i:integer;
begin
   read(a);
   c:=0;
   d:=0;
   
   if (a < 10000)then
   begin
      for i:=1 to a do
      begin
         read(b);
         if ((b >= 10) and (b <= 20))then
         begin
            c := c + 1;
         end
         else
         begin
            d := d + 1;
         end
      end
   end;
        writeln(c,' in');
        writeln(d,' out')
end.
