import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class TestStack {
   private  Stack<Person> personSt=new Stack<Person>();
    private Person[] persons;
    Person  person1;
    Person  person2;
    Person  person3;
    Person  person4;
    @Before
    public void setUp(){

        person2=new Person("Test",1678);
        person1 = new Person("vandana", 1990);
        person3=new Person("Mike",2019);
        person4=new Person("Hiya",2013);

    }

    @Test
    public void pushTest(){
        personSt.push(new Person("Fifth",5555));

        System.out.println(personSt.peek());
       Assert.assertEquals(1,personSt.size());

    }

    @Test
    public void popTest(){
        //given
        personSt.push(person1);
        personSt.push(person2);

        //when
        personSt.pop();

        //then
        Assert.assertEquals(1,personSt.size());
    }

    @Test
    public void peekTest(){
        //given
        personSt.push(person1);
        personSt.push(person2);
        String expected="Fifth";

        //when
        Person peek=personSt.peek();
        System.out.println(peek);

        //given
        Assert.assertEquals(2,personSt.size());
    }


    @Test
    public void isEmptyTest() {
        //given
        personSt.push(person1);

        //when
      boolean actual=  personSt.isEmpty();
        System.out.println(actual);

      Assert.assertFalse(actual);

    }

    @Test
    public void isEmptyTest2() {
        //given
        personSt.push(person1);
        personSt.pop();

        //when
        boolean actual=  personSt.isEmpty();
        System.out.println(actual);

        Assert.assertTrue(actual);

    }
}
