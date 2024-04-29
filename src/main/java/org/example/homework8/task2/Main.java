package org.example.homework8.task2;

public class Main {
    public static void main(String[] args) {
        Printer epson = new Printer(73, true);
        Printer hewlettPackard = new Printer(40, false);
        testPrinter(epson);
        testPrinter(hewlettPackard);
    }

    private static void testPrinter(Printer printer) {
        int tonerLevelAfterAdd = printer.addToner(20);
        int pagesPrintedInitial = printer.getPagesPrinted();
        int usedPages = printer.printPages(15);
        int pagesPrintedResult = printer.getPagesPrinted();

        System.out.println("tonerLevelAfterAdd = " + tonerLevelAfterAdd);
        System.out.println("pagesPrintedInitial = " + pagesPrintedInitial);
        System.out.println("usedPages = " + usedPages);
        System.out.println("pagesPrintedResult = " + pagesPrintedResult);
        System.out.println();
    }
}
