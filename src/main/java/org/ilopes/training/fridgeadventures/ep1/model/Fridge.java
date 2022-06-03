package org.ilopes.training.fridgeadventures.ep1.model;

import java.util.List;

public class Fridge {
    public static final int MAXIMUM_CAPACITY = 5;
    public static final int NUMBER_OF_DOOR = 2;

    private boolean[] doorStates;
    private List<Object> content;
    private boolean isPlugged;
    private boolean isLampOn;

    public boolean[] getDoorStates() {
        return doorStates;
    }

    public void setDoorStates(boolean[] doorStates) {
        this.doorStates = doorStates;
    }

    public List<Object> getContent() {
        return content;
    }

    public void setContent(List<Object> content) {
        this.content = content;
    }

    void openDoor(int doorIndex) {
        doorStates[doorIndex] = true;
        isLampOn = true;
    }

    void closeDoor(int doorIndex) {
        doorStates[doorIndex] = false;
        isLampOn = false;
    }

    void putItam(int doorIndex, Object item) {
        if (!doorStates[doorIndex]) {
            throw new RuntimeException("Hey dude don't forget to open door");
        }
        if (content.size() == MAXIMUM_CAPACITY) {
            throw new RuntimeException("Hey dude fridge is full");
        }
        content.add(item);
    }

    Object getItem(int doorIndex) {
        if (!doorStates[doorIndex]) {
            throw new RuntimeException("Hey dude don't forget to open door");
        }
        return content.remove(0);
    }

    void plug() {
        if (isPlugged) {
            throw new RuntimeException("Hey dude fridge is already plugged");
        }
        isPlugged = true;
    }

    void unplugged() {
        if (!isPlugged) {
            throw new RuntimeException("Hey dude fridge is already unplugged");
        }
        isPlugged = false;
    }

    public boolean isLampOn() {
        return isLampOn;
    }
}
