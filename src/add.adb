with Interfaces.C; use Interfaces.C;

package body Add is
   function My_Add(a, b: Interfaces.C.int) return Interfaces.C.int is
      (a+b);
end Add;
