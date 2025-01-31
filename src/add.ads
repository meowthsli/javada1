with Interfaces.C;

package Add is
   function My_Add(a, b: Interfaces.C.int) return Interfaces.C.int
      with
         Export => True,
         Convention => C,
         External_Name => "my_add";

end Add;
