package org.ilopes.training.fridgeadventures.ep1.model;

public class Fridge {
    // <editor-fold desc="Specifications">

    public static final int MAXIMUM_CAPACITY = 5;
    public static final int NUMBER_OF_DOOR = 2;

    // </editor-fold>

    // <editor-fold desc="Behaviours">

    void openDoor(int doorIndex) {
        throw new RuntimeException("Not implemented yet");
    }

    void closeDoor(int doorIndex) {
        throw new RuntimeException("Not implemented yet");
    }

    void putItam(int doorIndex, Object item) {
        throw new RuntimeException("Not implemented yet");
    }

    Object getItem(int doorIndex) {
        throw new RuntimeException("Not implemented yet");
    }

    void plug() {
        throw new RuntimeException("Not implemented yet");
    }

    void unplugged() {
        throw new RuntimeException("Not implemented yet");
    }

    // </editor-fold>

    // <editor-fold desc="Outputs">

    public boolean isLampOn() {
        throw new RuntimeException("Not implemented yet");
    }

    // </editor-fold>
}
