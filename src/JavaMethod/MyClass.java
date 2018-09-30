package JavaMethod;

public class MyClass {

    /*
    * Point 1: Method is work like function of C programing.
    * Point 2: When we call any method it will pass implicitly data,
    * Point 3: But when we call any function it will pass explicitly data.
    * Point 4: Java method is also called procedure, it cant return any value.
    * Point 5: In C programing function return value
    * Point 6: Void can't Return anything
    * Point 7: we can use any data type replace in void which return this datatypes value
    * Point 8: Here Public static is called modifier
    * Point 9: In addition method which have a & b these are called parameter
    * Point 10: Here in every methord where available int,String. these are the return type
    * */

/////---------------This is the main method where program start execution when we run-----//
    public static void main(String[] args)
    {

        ///------calling method from additon method with parameter operation----//
        System.out.println("Addition Result from addtion method is: "+addition(10,20));

        ///--------Calling method for outside of main body operations-----///
        Name();

        //---------Calling method for String type data with concat function----//
        System.out.println(getpassword("Hello, Abir facebook password is: "));

    }


////-----This is a simple userdefine method-----//
//    public static void mymethod (parameter)
//    {
//          This is the method body
//
//    }

    ///-----here in () we use parameter list----//
    public static void mymethod()
    {

    }

    ////-------Example 1: Parameter & Return Type: Simple method for addition using int datatype----//
    public static int addition(int a, int b)
    {
        return a+b;
    }

    ////-------Example 2: void type: Simple method for call----//
    public static void Name()
    {
        System.out.println("My Name is Abir");
    }

    ////-------Example 3: String type: Dynamic return data with string by concat----//
    public static String getpassword(String sendpassword)
    {
        String abirpassword = "12345";
        return sendpassword+abirpassword;
    }


}
