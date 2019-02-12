package State;

class StateContext {

    private State myState;

    StateContext() {
        // INITIAL STATE
        setState(new StateA());
    }

    void setState(State stateName) {
        myState = stateName;
    }

    void writeName(String name) {
        myState.writeName(this, name);
    }

}