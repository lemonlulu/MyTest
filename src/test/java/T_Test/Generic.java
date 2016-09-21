package T_Test;

public class Generic {
	public <T> T getObject(Class<T> c) throws InstantiationException, IllegalAccessException{

        T t = c.newInstance();
		return t;
	}
}
