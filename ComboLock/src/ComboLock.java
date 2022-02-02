public class ComboLock {

    private int secret1, secret2,secret3;
    private int num1, num2, num3;
    private int dial = 40;
    private int count = 0;


    public ComboLock(int secret1, int secret2, int secret3) {

        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;

    }

    public void reset() {

        dial = 0;
        num1 = 0;
        num2 = 0;
        num3 = 0;

    }


    public void turnLeft(int ticks) {

        int tempdial = dial + ticks;
        if (tempdial >= 40) {

            tempdial = tempdial - 40;
        }

        dial = tempdial;

        if (count == 1) {

            num2 = dial;
        }

        count++;

    }

    public void turnRight(int ticks) {

        int tempdial = dial - ticks;
        if (tempdial < 0) {

            tempdial = 40 + tempdial;

        }

        dial = tempdial;

        if (count == 0) {
            num1 = dial;

        }

        if (count == 2) {

            num3 = dial;
        }
        count++;

    }

    public boolean open() {

        return num1 == secret1 && num2 == secret2 && num3 == secret3;

    }

}
