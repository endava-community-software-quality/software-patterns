package Flyweight;

/**
 * Flyweight Pattern
 *
 * Definition:
 *
 * The Flyweight pattern provides a mechanism by which you can avoid creating a large number of 'expensive' objects
 * and instead reuse existing instances to represent new ones.
 *
 * Where to use:
 *
 * •When there is a very large number of objects that may not fit in memory.
 * •When most of an object's state can be stored on disk or calculated at runtime.
 * •When there are groups of objects that share state.
 * •When the remaining state can be factored into a much smaller number of objects with shared state.
 *
 * Benefits:
 *
 * Reduce the number of objects created, decrease memory footprint and increase performance.
 *
 * Drawbacks/consequences:
 *
 * Designing objects down to the lowest levels of system "granularity" provides optimal flexibility,
 * but can be unacceptably expensive in terms of performance and memory usage.
 */

public class Gazillion1 {

    private static int num = 0;
    private int row, col;

    public Gazillion1(int maxPerRow) {
        row = num / maxPerRow;
        col = num % maxPerRow;
        num++;
    }

    void report() {
        System.out.print(" " + row + col);
    }

}