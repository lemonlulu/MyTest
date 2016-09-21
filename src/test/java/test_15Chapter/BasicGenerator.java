package test_15Chapter;

/**
 * Created by lemon on 14-12-2.
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException();
        }
    }

    public static <T> Generator<T> creat(Class<T> c) {
        return new BasicGenerator<>(c);
    }
}
