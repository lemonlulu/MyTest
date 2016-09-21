package test_15Chapter;

import java.util.*;

/**
 * Created by lemon on 14-12-2.
 */
class Customer {
    private static int id;
    private final int count = id++;
    private Customer() {}

    @Override
    public String toString() {
        return "Customer{" +
                "count=" + count +
                '}';
    }

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static int id;
    private final int count = id++;
    private Teller() {}

    @Override
    public String toString() {
        return "Teller{" +
                "count=" + count +
                '}';
    }

    public static Generator<Teller> generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };
}

public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " servers " + c);
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Customer> customers = new ArrayList<>();
        Generators.fill(customers, Customer.generator(), 15);

        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers, Teller.generator, 4);

        for(Customer c:customers){
            serve(tellers.get(random.nextInt(tellers.size())), c);
        }

    }
}
