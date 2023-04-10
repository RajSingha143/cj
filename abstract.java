import java.util.*;
abstract class figure
{
  int dim1, dim2;
  double area1;
  figure(int a, int b)
  {dim1=a; dim2=b;}
  abstract void area();
}

class triangle extends figure
{
  triangle(int a, int b)
  {super(a, b);}
  void area()
  {area1=0.5*dim1*dim2;}
  void show()
  {System.out.println("Area of triangle = " + area1);}
}
