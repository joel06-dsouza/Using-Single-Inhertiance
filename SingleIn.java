class P{
  protected  int a;
  protected  int b;

  P(int a,int b){
  this.a = a;
  this.b = b;
 }

  void displayP(){
    System.out.println("a="+a+" b="+b);
  }
}


class C extends P{
 int x=5;
 int y=9;

  C(int a,int b,int x,int y){
    super(a,b);
    this.x = x;
    this.y = y;
   }

void displayC(){
  System.out.println("x="+x+" y="+y);
 }

}


class SingleIn{
  public static void main(String[] args) {
  C c = new C(1,2,3,4);
  c.displayP(); //parent
  c.displayC(); //child
  }
}
