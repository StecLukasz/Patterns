package edu.grcy.patterns.behavioral.chainOfResponsibility;

//company employee
public class CompanyInsiderCheck extends AccessCheck {


    @Override
    public boolean doCheck(String username) {

        System.out.println("CompanyInsiderCheck start for " + username);
        if(!Employees.checkEmployee(username)){
            // ten sprawdzany nie pracuje
            System.out.println(getClass().getCanonicalName() + " do_Check FAILED");
            return false;
        }
        System.out.println(getClass().getCanonicalName() + " do_Check PASSED");
        // ten pracuje w tej firmie, i sprawdza kolejnego
        return checkNextElement(username);
    }
}
