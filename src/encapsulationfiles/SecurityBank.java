package encapsulationfiles;

public class SecurityBank {

    private int user1pin = 12345;

    public void withdrawmoney(int pinbyuser)
    {
        if (user1pin == pinbyuser)
        {
            System.out.print("Your pin is Correct, You can Withdraw Money");
        }
        else
        {
            System.out.print("Invalid pin,, Please use correct pin no");
        }
    }
}
