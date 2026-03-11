public class BannerApp {

    public static void main(String[] args) {

        String[] line1 = {" ***** ", " ***** ", " ****** ", " ***** "};
        String[] line2 = {"*     *", "*     *", "*     *", "*     *"};
        String[] line3 = {"*     *", "*     *", "*     *", "*"};
        String[] line4 = {"*     *", "*     *", "******", " ***** "};
        String[] line5 = {"*     *", "*     *", "*", "*"};
        String[] line6 = {"*     *", "*     *", "*", "*     *"};
        String[] line7 = {" ***** ", " ***** ", "*", " ***** "};

        printLine(line1);
        printLine(line2);
        printLine(line3);
        printLine(line4);
        printLine(line5);
        printLine(line6);
        printLine(line7);
    }

    public static void printLine(String[] line) {
        for (String part : line) {
            System.out.print(part + " ");
        }
        System.out.println();
    }
}