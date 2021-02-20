package edu.grcy.patterns.behavioral.chainOfResponsibility;

public class DepartamentCheck extends AccessCheck {
    @Override
    public boolean doCheck(String username) {

        //sprawdzenie czy człowiek pracuje w odpowiednim dziale
        return checkNextElement(username);
    }
}
