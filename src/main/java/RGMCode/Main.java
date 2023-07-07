package RGMCode;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }

/*
Aufgabe: Passwortvalidierung
Schreibe eine Passwortvalidierung.
- Lege dir ein neues Java Github Projekt an.
- Lass mittels CI die Tests automatisch laufen.
- Überlege dir, wie die Methoden aussehen müssen.
- Schreibe jeweils erst einen Test und dann die Funktionalität.
- - Überprüfe erst die Länge des Passworts und
- - dann, ob Zahlen enthalten sind.
Bonus:
- Checke, ob kleine/große Buchstaben enthalten sind.
- Verbiete "schlechte" Passwörter wie "passwort" oder "123456".

Bonus Bonus
- Ein Sonderzeichen muss enthalten sein
*/

    public static boolean pwCheck(String password) {
        if (password.matches(".*[A-Z]+.*") && password.matches(".*[a-z]+.*") && password.matches(".*\\d+.*") && password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*") && password.length() >= 6 && password.length() <= 21 && !passwordIsWeakPassword(password)) {
            System.out.println("Alles gut");
            return true;
        } else {
            System.out.println("Alles kacke");
            return false;
        }
    }

    public static boolean passwordIsWeakPassword(String password) {
        // Die Liste kann belieb erweitert werden
        List<String> weakPasswords = Arrays.asList("passwort", "123456", "qwerty", "pass123", "ganzSicher567");
        return weakPasswords.contains(password);
    }

    /* *********************************************************************************************************** */

    public static boolean pwCheck2(String password){
        if (passwordLength(password) && upperChars(password) && lowerChars(password) && number(password) && specialChars(password)){
            System.out.println("geht");
            return true;
        } else {
            System.out.println("alle kacke");
            return false;
        }
    }

    public static boolean passwordLength(String password) {
        if (password.length() > 6 && password.length() < 21) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean upperChars(String password) {
        if (password.matches(".*[A-Z]+.*")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean lowerChars(String password) {
        if (password.matches(".*[a-z]+.*")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean number(String password) {
        if (password.matches(".*\\d+.*")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean specialChars(String password) {
        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*")) {
            return true;
        } else {
            return false;
        }
    }

}

