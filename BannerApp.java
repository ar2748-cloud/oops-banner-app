public class BannerApp {

    public static void main(String[] args) {

        Banner banner = new Banner();
        banner.printBanner();

    }

    static class Banner {

        public void printBanner() {

            System.out.println(" *****   *****   ******   ***** ");
            System.out.println("*     * *     *  *     * *     *");
            System.out.println("*     * *     *  *     * *");
            System.out.println("*     * *     *  ******   ***** ");
            System.out.println("*     * *     *  *             *");
            System.out.println("*     * *     *  *       *     *");
            System.out.println(" *****   *****   *        ***** ");

        }
    }
}