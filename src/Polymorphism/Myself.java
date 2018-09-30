package Polymorphism;

public class Myself {

    public static void main (String[] args)
    {
        ///------This is a my main class----//

        /*
        * Point1: Poly meance more & morphism meance Situation
        * Point1: If Any Object of super class truly inherited & turn different face/situation is called inheritance
        * Point2:
        *
        * */

        MyFather myFather1 = new MyFather();
        MyFather myFather2 = new MyBrother();
        MyFather myFather3 = new MyOtherBrother();

        myFather1.Pocketmoney();
        myFather2.Pocketmoney();
        myFather3.Pocketmoney();


    }

}
