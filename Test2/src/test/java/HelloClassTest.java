import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloClassTest {
    @Test
    void HelloTest() {
        HelloClass helloClass = new HelloClass();
        Assertions.assertEquals("Hello World!",
                helloClass.getMessage());

    }
    @DisplayName("test")




    @Test
    void HelloTest2() {
        final HelloClass helloClass = new HelloClass();
        Assertions.assertAll("Asercja do HW",
                () -> assertEquals("Hello World2!", helloClass.getMessage()),
                () -> assertEquals("Hello World3!", helloClass.getMessage()));
    }
}