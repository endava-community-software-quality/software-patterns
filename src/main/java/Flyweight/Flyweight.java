package Flyweight;

public final class Flyweight {

    private static final int ROWS = 6;
    private static final int COLS = 10;

    public static void main(String[] args) {

        FlyweightFactory theFactory = new FlyweightFactory(ROWS);

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                theFactory.getFlyweight(i).report(j);
            }

            System.out.println();
        }
    }

}
