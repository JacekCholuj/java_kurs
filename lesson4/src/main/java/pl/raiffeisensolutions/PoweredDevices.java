package pl.raiffeisensolutions;

/**
 * Created by rb9310 on 2016-07-27.
 */
class PoweredDevices {
    int voltage =230;
    }

class Scanner extends PoweredDevices {
    String scanningResolution ="1200dpi";
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        System.out.println("Scanner voltage :" + scanner.voltage);
        System.out.println("Scanner scanningResolution :" + scanner.scanningResolution);
    }
}

class Printer extends PoweredDevices {
    int pagesPerMinute = 100;

    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println("Printer voltage :" + printer.voltage);
        System.out.println("Printer pagesperminute :" + printer.pagesPerMinute);
    }
}

interface iPrinter{
    Printer getPrinter();
}



abstract class  Photocopier extends Scanner implements iPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        Printer printer = new Printer();
        System.out.println("1 :" + scanner.scanningResolution);
        System.out.println("2 :" + printer.pagesPerMinute);
//        System.out.println("3 :" + iPrinter.getPrinter());
        public Printer getPrinter() {return printer;}

        /*class Bird extends Animal implements IFlier {
            Flier flier = new Flier();
            public Flier getFlier() { return flier; }*/

    }
}
