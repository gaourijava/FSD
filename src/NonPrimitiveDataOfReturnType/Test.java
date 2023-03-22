package NonPrimitiveDataOfReturnType;

public class Test 
{
	public static void main(String args[])
{
		Collage c=new Collage();
		Student ss=c.data();
		System.out.println(ss);
		System.out.println(ss.getName());
		System.out.println(ss.getRollno());

}
		
}
