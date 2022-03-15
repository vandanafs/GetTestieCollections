import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TestHashSet {

  private HashSet<Person> hSet;
    private ArrayList<Person> person;
    private Person[] persons;
    Person  person1;
    Person  person2;
    Person  person3;
    Person  person4;
    Person person5;

    @Before
    public void setUp(){
        person2=new Person("Test",1678);
        person1 = new Person("vandana", 1990);
        person3=new Person("Mike",2019);
        person4=new Person("Hiya",2013);

        person5=new Person("Hiya",2013);
        persons=new Person[]{person1,person2,person3,person4,person5};
        System.out.println("mem address p4 -->"+persons[3].hashCode());
        System.out.println("mem address p5 -->"+persons[4].hashCode());
    }

    @Test
    public void removeDuplicateTest(){
        //given
        person=new ArrayList<>(Arrays.asList(persons));
        System.out.println("true-->"+person.get(3).equals(person.get(4)));
        //System.out.println(person);
        hSet=new HashSet<>(person);

        //when
          int actual=hSet.size();
       System.out.println(hSet.add(new Person("Hiya", 2013)));
        System.out.println("Set removed duplicates  :"+hSet);

        //then
        Assert.assertEquals(person.size()-1,actual);


    }

    @Test
    public void isEmptyTest(){
        //given
        person=new ArrayList<>(Arrays.asList(persons));
        hSet=new HashSet<>(person);

        //when
       boolean actual= hSet.isEmpty();

       //then
        Assert.assertFalse(actual);
    }

    @Test
    public void isStreamTest() {
        //given
        person = new ArrayList<>(Arrays.asList(persons));
        hSet = new HashSet<>(person);

        //when
        System.out.println(hSet.parallelStream().distinct().findFirst());
    }
}
