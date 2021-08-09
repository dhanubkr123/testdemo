package casting1;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  classA.demo();
  classA a=new classA();
  a.demo();
  a.demotest();
  a.test();
  
  
  //sub class
  classB.demo();
  classB b=new classB();
		  b.demo();
  b.test();
  b.demotest();
  b.xyz();
  
  //up cating
  classA c=new classB();
  c.demo();
  c.test();
  c.demotest();
 // c.xyz();
	}

}
