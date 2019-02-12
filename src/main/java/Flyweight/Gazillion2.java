package Flyweight;

class Gazillion2 {

    private int row;

    public Gazillion2(int theRow) {
        row = theRow;
        System.out.println("Actual instance number: " + row);
    }

    void report(int theCol) {
        System.out.print(" " + row + theCol);
    }

}
