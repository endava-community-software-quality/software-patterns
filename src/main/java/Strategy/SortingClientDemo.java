package Strategy;

/**
 * Strategy Pattern
 *
 * Definition:
 *
 * Use strategy when you need to define a family of algorithms, encapsulate
 * each one, and make them interchangeable. Strategy lets the algorithm vary
 * independently from clients that use it. Related patterns include State,
 * Flyweight, Decorator, Composite.
 *
 * Where to use:
 *
 * •When you need to use one of several algorithms dynamically.
 * •When you want to configure a class with one of many related classes (behaviors).
 * •When an algorithm uses data that clients shouldn't know about.
 *
 * Benefits:
 *
 * •Reduces multiple conditional statements in a client.
 * •Hides complex, algorithmic-specific data from the client.
 * •Provides an alternative to subclassing.
 * •Can be used to hide data that an algorithm uses that clients shouldn't know about.
 *
 * Drawbacks/consequences:
 *
 * •Clients must be aware of different strategies. A client must understand how strategies differ before it can
 * select the appropriate one.
 * •Increases the number of objects in an application.
 *
 * Usage example:
 *
 * The strategy pattern is used in the implementation of the LayoutManager in Java.
 * The LayoutManager can be configured to work with different layout objects, such as FlowLayout, CardLayout,
 * GridLayout, etc. These classes encapsulate the actual algorithms for laying out visual components that the
 * LayoutManager uses to render the interface on the screen. By changing the Layout (algorithm) we can dynamically
 * change how the interface is rendered.
 */

public class SortingClientDemo {

    public static void main(String[] args) {

        SortingContext context = new SortingContext();
        context.setSorter(new QuickSort());

        double[] list = { 1, 2.4, 7.9, 3.2, 1.2, 0.2, 10.2, 22.5, 19.6, 14, 12, 16, 17 };
        context.sortDouble(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}