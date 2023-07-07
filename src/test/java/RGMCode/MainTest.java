package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void PasswordValidationTest(){
        //given
        String password = "neue#Fische2023";
        //when
        boolean actualBoolean = Main.pwCheck(password);
        //then
        assertTrue(actualBoolean);

    }

    @Test
    void PasswordValidationTestWeakPassword(){
        //given
        String password = "nf!2023";
        //when
        boolean actualBoolean = Main.passwordIsWeakPassword(password);
        //then
        assertFalse(actualBoolean);

    }

    @Test
    void checkAll(){
        //given
        String password = "neueFische#2023";
        //when
        boolean actualBool = Main.pwCheck2(password);
        //then
        assertTrue(actualBool);
    }

    @Test
    void checkPasswordLength(){
        //given
        String password = "neueFische2023";
        //when
        boolean actBoolLentgh = Main.passwordLength(password);
        //then
        assertTrue(actBoolLentgh);
    }

    @Test
    void checkUpperChars(){
        //given
        String password = "neueFische2023";
        //when
        boolean actBoolLentgh = Main.upperChars(password);
        //then
        assertTrue(actBoolLentgh);
    }

    @Test
    void checkLowerChars(){
        //given
        String password = "FFFnnnn2023";
        //when
        boolean actBoolLentgh = Main.lowerChars(password);
        //then
        assertTrue(actBoolLentgh);
    }

    @Test
    void checkPasswordNumber(){
        //given
        String password = "FFFsgba1";
        //when
        boolean actBoolLentgh = Main.number(password);
        //then
        assertTrue(actBoolLentgh);
    }

    @Test
    void checkSpecialChars(){
        //given
        String password = "#neueFische2023";
        //when
        boolean actBoolLentgh = Main.specialChars(password);
        //then
        assertTrue(actBoolLentgh);
    }


}