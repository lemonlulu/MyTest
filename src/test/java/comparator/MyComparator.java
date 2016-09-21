package comparator;

import java.util.*;

/**
 * Created by lemon on 2016/9/21.
 */
public class MyComparator {

    private class PersonComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Person && o2 instanceof Person) {
                Person p1 = (Person)o1;
                Person p2 = (Person)o2;

                return p1.getAge() == p2.getAge() ? 0 : ((p1.getAge() > p1.getAge()) ? 1:-1);
            }
            else
                return 0;
        }
    }


    public static void main(String[] args) {
//        Arrays.sort(T[] t, Comparator<T> comparator);
//        Collections.sort(List<T> list, Comparator<T> comparator);

        //Integer
        Integer[] integers = new Integer[]{1, 3, 5, 7, 2, 4, 6, 8};
        System.out.println("before-int-array: ");
        for(Integer i : integers) {
            System.out.print(i + " ");
        }

        Arrays.sort(integers);
        System.out.println("\nafter-int-array: ");
        for(Integer i : integers) {
            System.out.print(i + " ");
        }

        List<Integer> integerList = Arrays.asList(1, 3, 5, 7, 2, 4, 6, 8);
        System.out.println("\nbefore-int-list: " + integerList);

        Collections.sort(integerList);
        System.out.println("\nafter-int-list: " + integerList);

        //Person
        MyComparator m = new MyComparator();
        Person p1 = new Person(50);
        Person p2 = new Person(5);
        Person p3 = new Person(10);

        Person[] persons = new Person[]{p1, p2, p3};
        System.out.println("\nbefore-person-array: ");
        for(Person p : persons) {
            System.out.print(p + " ");
        }
        Arrays.sort(persons, m.new PersonComparator());
        System.out.println("\nafter-person-array: ");
        for(Person p : persons) {
            System.out.print(p + " ");
        }


        List<Person> personList = Arrays.asList(p1, p2, p3);
        System.out.print("\nbefore-person-list: \n" + personList);

        Collections.sort(personList, m.new PersonComparator());
        System.out.print("\nafter-person-list: \n" + personList);
    }

//    public static void main(String[] args) {
//        MyComparator m = new MyComparator();
//
//        Person p1 = new Person(56);
//        Person p2 = new Person(55);
//
//        PersonComparator comparator = m.new PersonComparator();
//        System.out.println(comparator.compare(p1, p2));
//
//    }
}
