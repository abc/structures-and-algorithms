/**
 * Created by Alastair on 3/6/14.
 */
public class Debug
{
    static boolean status = false;

    public static void print(String message)
    {
        if (Debug.status)
        {
            System.out.println("Debug: " + message);
        }
    }
}
