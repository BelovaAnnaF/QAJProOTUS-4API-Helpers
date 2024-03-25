package tests;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.testng.annotations.Test;

public class SOAPTest extends TestNGCitrusSpringSupport {
    @Test(description = "получение списка пользователей")
    @CitrusTest
    public void getUsersListSoap() {

    }
}
