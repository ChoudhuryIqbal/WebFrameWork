package Login;

import base.CommonApi;
import org.testng.annotations.Test;

/**
 * Created by a on 6/27/2016.
 */
public class HotelAppLogin  extends CommonApi {

    @Test
    public void testLogin()  throws InterruptedException{
        typeById("username","adactin123");
        Thread.sleep(2000);
        typeById("password","adactin123");
        clickById("login");
        Thread.sleep(3000);

    }
}
