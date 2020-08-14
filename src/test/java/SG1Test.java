import static org.junit.Assert.*;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class SG1Test {

    @Test
    public void testNoSolution() {
        String existingWires = "SX.\n" +
                "XX.\n" +
                "..G";

        String solution = "Oh for crying out loud...";

        assertEquals(solution, SG1.wireDHD(existingWires));
    }

    @Test
    public void test3x3() {
        String existingWires = "SX.\n" +
                "X..\n" +
                "XXG";

        String solution = "SX.\n" +
                "XP.\n" +
                "XXG";

        assertEquals(solution, SG1.wireDHD(existingWires));
    }

    @Test
    public void test3x32() {

        String existingWires = ".S.\n" +
                "...\n" +
                ".G.";

        String solution = ".S.\n" +
                ".P.\n" +
                ".G.";

        assertEquals(solution, SG1.wireDHD(existingWires));
    }

    @Test
    public void test3x33() {

        String existingWires = "...\n" +
                "S.G\n" +
                "...";

        String solution = "...\n" +
                "SPG\n" +
                "...";

        assertEquals(solution, SG1.wireDHD(existingWires));
    }

    @Test
    public void test3x34() {

        String existingWires = "...\n" +
                "SG.\n" +
                "...";

        String solution = "...\n" +
                "SG.\n" +
                "...";

        assertEquals(solution, SG1.wireDHD(existingWires));
    }

    @Test
    public void test5x5() {
        String existingWires = ".S...\n" +
                "XXX..\n" +
                ".X.XX\n" +
                "..X..\n" +
                "G...X";

        String solution = ".SP..\n" +
                "XXXP.\n" +
                ".XPXX\n" +
                ".PX..\n" +
                "G...X";

        assertEquals(solution, SG1.wireDHD(existingWires));
    }

    @Test
    public void test10x10() {
        String existingWires = "XX.S.XXX..\n" +
                "XXXX.X..XX\n" +
                "...X.XX...\n" +
                "XX...XXX.X\n" +
                "....XXX...\n" +
                "XXXX...XXX\n" +
                "X...XX...X\n" +
                "X...X...XX\n" +
                "XXXXXXXX.X\n" +
                "G........X";

        Set<String> solutionsSet = new HashSet<String>(Arrays.asList(
                "XX.S.XXX..\n" +
                        "XXXXPX..XX\n" +
                        "...XPXX...\n" +
                        "XX.P.XXX.X\n" +
                        "...PXXX...\n" +
                        "XXXXPP.XXX\n" +
                        "X...XXP..X\n" +
                        "X...X..PXX\n" +
                        "XXXXXXXXPX\n" +
                        "GPPPPPPP.X",

                "XX.S.XXX..\n" +
                        "XXXXPX..XX\n" +
                        "...XPXX...\n" +
                        "XX..PXXX.X\n" +
                        "...PXXX...\n" +
                        "XXXXPP.XXX\n" +
                        "X...XXP..X\n" +
                        "X...X..PXX\n" +
                        "XXXXXXXXPX\n" +
                        "GPPPPPPP.X"
        ));

        String actual = SG1.wireDHD(existingWires);

        assertTrue(String.format("Your solution:\n%s\n\nShould be:%s", actual, solutionsSet), solutionsSet.contains(actual));
    }
}
