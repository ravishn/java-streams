package prog.fizzbuzz.impl;

import com.sun.deploy.security.BlockedException;
import prog.fizzbuzz.exception.BlokeException;
import prog.fizzbuzz.interfaces.CorporateBloke;

import java.util.Optional;

public class CorporateBlokeImpl implements CorporateBloke {

    String blokeId;
    String blokeName;
    int blokeSalary;
    boolean isHappy;

    public void setBlokeId(String blokeId) {

        this.blokeId = blokeId;
    }

    public String getBlokeId() {

        return this.blokeId;
    }

    public void setBlokeName(String blokeName) {

        this.blokeName = blokeName;
    }

    public String getBlokeName() {

        return this.blokeName;
    }

    public void setBlokeSalary(int blokeSalary) {

        this.blokeSalary = blokeSalary;
    }

    public int getBlokeSalary() {

        return this.blokeSalary;
    }

    public void setBlokeHappy(boolean isHappy) {

        this.isHappy = isHappy;
    }

    public boolean isBlokeHappy() {

        return this.isHappy;
    }

    public CorporateBlokeImpl setAllBlokeData() {

        CorporateBlokeImpl corporateBloke = new CorporateBlokeImpl();

        // Play around with values to give Optional some work to do
        corporateBloke.setBlokeId("EMP666");
        corporateBloke.setBlokeName("Some Bloke");
        corporateBloke.setBlokeSalary(100000);
        corporateBloke.setBlokeHappy(false);

        return corporateBloke;
    }

    public void howIsTheBlokeDoing(CorporateBlokeImpl corporateBloke) throws BlokeException {

        System.out.println("Bloke's ID " +Optional.ofNullable(corporateBloke.getBlokeId()).orElseThrow(() -> new BlokeException("Bloke doesn't exist")));
        System.out.println("Bloke's name " +Optional.ofNullable(corporateBloke.getBlokeName()).orElse("New Bloke"));
        System.out.println("Bloke's salary " +Optional.of(corporateBloke.getBlokeSalary()).orElseThrow(() -> new BlokeException("Bloke don't be working for free freaks!")));

        if (corporateBloke.getBlokeSalary() < 200000) {

            corporateBloke.setBlokeHappy(false);
        } else {

            corporateBloke.setBlokeHappy(true);
        }

        System.out.println("Is bloke happy? " +Optional.of(corporateBloke.isBlokeHappy()).orElse(false));

        if (!corporateBloke.isBlokeHappy()) {

            System.out.println("Show bloke the monies freaks!");
        }
        else {

            System.out.println("Keep 'em coming more of them monies!");
        }
    }
}
