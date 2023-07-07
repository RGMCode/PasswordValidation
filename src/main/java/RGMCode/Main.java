package RGMCode;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //pwCheck();
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
*/

    public static boolean pwCheck(String password){
        if (password.matches(".*[A-Z]+.*") && password.matches(".*[a-z]+.*") && password.matches(".*\\d+.*" ) && password.length() >= 8 && password.length() <= 21 && !passwordIsWeakPassword(password)) {
            System.out.println("Alles gut");
            return true;
        } else {
            System.out.println("Alles kacke");
            return false;
        }
    }

    public static boolean passwordIsWeakPassword(String password) {
        List<String> weakPasswords = Arrays.asList("passwort", "123456", "qwerty");
        return weakPasswords.contains(password);
    }

}

