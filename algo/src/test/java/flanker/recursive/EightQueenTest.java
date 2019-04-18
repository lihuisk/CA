package flanker.recursive;

import org.junit.Test;

public class EightQueenTest {

    @Test
    public void findOne() {

        EightQueen eightQueen = EightQueen.findOne();
        EightQueen.print(eightQueen);
    }


    @Test
    public void findByLine() {
        EightQueen eightQueen = new EightQueen();
        EightQueen.findInLine(eightQueen, 0);
        EightQueen.print(eightQueen);
    }

    @Test
    public void isValid() {
        EightQueen eightQueen = new EightQueen();
        EightQueen.putFlag(eightQueen, 0, 0);
        EightQueen.print(eightQueen);
        System.out.println(EightQueen.isValid(eightQueen, 1, 0));
        System.out.println(EightQueen.isValid(eightQueen, 1, 1));
        System.out.println(EightQueen.isValid(eightQueen, 0, 1));


        System.out.println(EightQueen.isValid(eightQueen, 2, 1));
        System.out.println(EightQueen.isValid(eightQueen, 3, 1));
        System.out.println(EightQueen.isValid(eightQueen, 2, 1));
    }

    @Test
    public void isValid2() {
        EightQueen eightQueen = new EightQueen();
        EightQueen.putFlag(eightQueen, 1, 1);
        EightQueen.print(eightQueen);
        System.out.println(EightQueen.isValid(eightQueen, 1, 0));
        System.out.println(EightQueen.isValid(eightQueen, 1, 1));
        System.out.println(EightQueen.isValid(eightQueen, 0, 1));
    }
}