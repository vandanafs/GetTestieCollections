package rocks.zipcode;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ListIterator;
import java.util.Stack;

public class TestStack {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void  popStackTest(){

        //given
        Stack<String> stack=new Stack<>();
        stack.push("Hello Vandana");
       // System.out.println(stack);

        //when
        stack.pop();
       // System.out.println(stack);

        //then
        assertEquals(true, stack.isEmpty());

    }
    @Test
    public void pushStackTest(){

      //given
        Stack<String> stack=new Stack<>();
        String expected="vandu";
        //when
           stack.push("vandu");
        System.out.println(stack);

        //given
        Assert.assertEquals(expected,stack.peek());

    }

    @Test
    public void peekStackTest(){
//given
        Stack<String> stack=new Stack<>();
        String expected="Test";
        //when
        stack.push("Test");
        String actual =stack.peek();

        //then
        assertEquals(expected,actual);
    }
    @Test
    public void isEmptyStackTest(){
        //given
        Stack<String> stack=new Stack<>();
        stack.push("vandu");
        //when
       boolean flag= stack.isEmpty();

     //then
        assertFalse(flag);
    }

    @Test
    public void setTest(){
        //given
      Stack<String> stack=new Stack<>();
      stack.push("first");
      stack.push("three");
      String expected="second";
       // System.out.println(stack);

       //when
        stack.set(1, "second");
       // System.out.println(stack);
        String actual=stack.peek();

        //then
          Assert.assertEquals(expected,actual);
    }
    @Test
    public void listTest(){
     //given
        Stack<String> stack=new Stack<>();
        stack.push("first");
        stack.push("three");

        //when
        ListIterator<String> list = stack.listIterator();
         stack.forEach( n ->{
             String actual=n;
            // System.out.println(n);
         });
        System.out.println(stack);
           }
        //then




    @Test
    public void mapTest(){


    }
    @Test
    public void queueTest(){}

    @Test
    public void dequeTest(){

    }

    // Make a bigger test exercising more Stack methods.....
}
