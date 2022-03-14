
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;

import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    private ArrayList<Person> person;
   private Person[] persons;
    Person  person1;
    Person  person2;
    Person  person3;
    Person  person4;

    @Before
    public void setup(){
      //  person.clear();

      person2=new Person("Test",1678);
       person1 = new Person("vandana", 1990);
       person3=new Person("Mike",2019);
           person4=new Person("Hiya",2013);
        persons=new Person[]{person1,person2,person3,person4};
    }


    @Test
    public void alAddTest(){
        person=new ArrayList<>(Arrays.asList(persons));  //convert Array to AL

        person.add(new Person("newPerson", 2012));

        System.out.println(person.get(person.size()-1));
        System.out.println(person.size()-1);
        Assert.assertEquals(5,person.size());

    }
    @Test
    public void sizeTest(){
        person=new ArrayList<>(Arrays.asList(persons));
        Assert.assertEquals(4,person.size());
    }

    @Test
    public void removeALTest(){
        person=new ArrayList<>(Arrays.asList(persons));  //convert Array to AL

        person.remove(person2);
        Assert.assertEquals(false, person.contains(person2));

    }

    @Test
    public void clearALTest(){
       person=new ArrayList<>(Arrays.asList(persons));
       person.clear();
   //     System.out.println(person.size());
       Assert.assertTrue(person.size()==0);
    }

    @Test
    public void addAllTest(){
        person=new ArrayList<>(Arrays.asList(persons)); //1st AL

        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("new", 1234));
        list.addAll(person);
       // System.out.println(list);
        Assert.assertEquals(5,list.size());
    }
}
