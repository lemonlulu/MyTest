package T_Test;

public class GenericTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		Generic generic = new Generic();		
		Object obj = generic.getObject(Class.forName("com.cnblogs.test.User"));
		System.out.println(obj instanceof User);
	}
}
