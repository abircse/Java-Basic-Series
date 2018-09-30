package ExceptionHandleing;

public class ExceptionHandle {

    public static void main (String[] args)
    {


        try
        {
            int a = 10;
            int b = 0;

            int result = a/b;

            System.out.println("Result is: "+result);

        }
        catch (Exception e)
        {
            System.out.println("Error is: "+e);
        }




    }



}
