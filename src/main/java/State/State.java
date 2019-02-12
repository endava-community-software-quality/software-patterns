package State;

/**
 * State Pattern
 *
 * Definition:
 *
 * The State pattern allows an object to alter its behavior when its internal state changes.
 * By using inheritance and letting subclasses represent different states and functionality we can switch
 * during runtime.
 * This is a clean way for an object to partially change its type at runtime.
 *
 * Where to use:
 *
 * • When we need to define a "context" class to present a single interface to the outside world.
 *   By defining a State abstract base class.
 *
 * • When we want to represent different "states" of a state machine as derived classes of the State base class.
 *
 * Benefits:
 *
 * • Cleaner code when each state is a class instead.
 * • Use a class to represent a state, not a constant.
 *
 * Drawbacks/consequences:
 *
 * • Generates a number of small class objects, but in the process, simplifies and clarifies the program.
 * • Eliminates the necessity for a set of long, look-alike conditional statements scattered throughout the code.
 *
 */

public interface State {
    public void writeName(StateContext stateContext, String name);
}