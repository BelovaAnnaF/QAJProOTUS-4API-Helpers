package apiHelpersCitrus.Tests;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.testng.annotations.Test;

public class HttpTest extends TestNGCitrusSpringSupport {
    private TestContext context;
    @Test(description = "получение списка пользователей")
    @CitrusTest
    public void getUsersListHttp() {
        this.context = citrus.getCitrusContext().createTestContext();
    }
}
