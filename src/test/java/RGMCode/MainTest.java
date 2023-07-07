package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void PasswordValidationTest(){
        //given
        String password = "neueFische2023";
        //when
        boolean actualBoolean = Main.pwCheck(password);
        //then
        assertTrue(actualBoolean);

    }

    @Test
    void PasswordValidationTestWeakPassword(){
        //given
        String password = "nF2023";
        //when
        //boolean actualBoolean = Main.pwCheck(password);
        boolean actualBoolean = Main.passwordIsWeakPassword(password);
        //then
        assertFalse(actualBoolean);

    }


}