import com.revature.tourofheroes.exceptions.InvalidHealthValueException;
import com.revature.tourofheroes.menu.MainMenu;
import com.revature.tourofheroes.models.Hero;

// Driver class
public class Main {
//Class scope
    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        // new allocates space for the object

        MainMenu menu = new MainMenu();

        //How many objects are created? 2
        //Object that is deleted by garbage collection is Object b
        //Since it is no longer being referenced
        Object a = new Object();
        Object b = new Object();
        // c is a reference to object a
        Object c = a;
        b = a;
        //Which is up for GC
        // original object b





    }


}
