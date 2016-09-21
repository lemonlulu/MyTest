package T_Test;

import java.util.Objects;

/**
 * Created by lemon on 14-11-5.
 */
public class Main {
//    public <TReq extends SpecificRecord, TResp extends SpecificRecord> TResp invoke(String operation, TReq request,
//                                                                                    Class<TResp> responseClass)
//            throws Exception {
//        Span span = null;
//        if (_tracer.isTracing()) {
//            span = _tracer.startSpan(operation, getClass().getSimpleName(), SpanType.WEB_SERVICE);
//        }
//        return invokeInternal(operation, request, responseClass, span);
//    }

//    public static void main(String args[]){
//        Class<T>
//        Class<?>
//        Class<Ttype extend Base>
//    }
    public static void main(String[] args) throws Exception{
        System.out.println(Integer.class);
        System.out.println(Class.forName("java.lang.Integer"));
        Integer i = new Integer(5);
        System.out.println(i.getClass());

        print1(Integer.class);
        print1(Class.forName("java.lang.Integer"));
        User user = new User();
        print1(user.getClass());

        print2(User.class);
        print2(Class.forName("T_Test.User"));
        print2(user.getClass());

    }


    public static void print1(Class<?> c) {
        System.out.println(c);

    }


    public static <T> T print2 (Class<T> c) throws Exception{
        System.out.println(c);
        //传进来了之后怎么用呢？
        System.out.println(c instanceof Object);
        T t = c.newInstance();//new Instance调用的是无参数的构造方法，如果传入的类型没有无参的构造方法，会抛错~
        return t;
    }


}
