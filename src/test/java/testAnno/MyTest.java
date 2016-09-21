package testAnno;

/**
 * Created by lemon on 2014/12/25.
 */
@MyAnnotation(hello = "beijing", world="shanghai",array={},
//        lamp=TrafficLamp.RED,
        style=int.class)
public class MyTest
{
    @MyAnnotation(lannotation=@TestAnnotation(value="baby"), world = "shanghai",
            array={1,2,3}
//            lamp=TrafficLamp.YELLOW
    )
    @Deprecated
    @SuppressWarnings("")
    public void output()
    {
        System.out.println("output something!");
    }
}
