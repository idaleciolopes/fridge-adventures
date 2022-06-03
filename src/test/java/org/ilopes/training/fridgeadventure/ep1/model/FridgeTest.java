package org.ilopes.training.fridgeadventure.ep1.model;

import org.ilopes.training.fridgeadventures.ep1.model.Fridge;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FridgeTest {
    private Fridge sut = new Fridge();

    @Test @DisplayName("Given I have a fridge When I try to see if it is empty Then I can't as the door is closed")
    void testFridgeIsEmptyWithClosedDoor() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            sut.getContent().isEmpty();
        });
        assertThat(exception).isNotNull().hasNoCause().hasMessage("Hey dude don't forget to open door");
    }

    @Test @DisplayName("Given I have a fridge When I open the door to see if it is empty Then I can see its content")
    void testFridgeIsEmptyWithOpeningDoor() {
        sut.openDoor(0);
        assertThat(exception).isNotNull().hasNoCause().hasMessage("Hey dude don't forget to open door");
    }

    @Test @DisplayName("Given I have a fridge and and get back from shop with more items than fridge can accept When I try to put them in the frigde Then I can't")
    void testFridgeHasAMaximumSize() {
        List<Object> items = Arrays.asList("i1", "i2", "i3", "i4", "i5", "i6", "i7");
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            sut.getContent().addAll(items);
        });
        assertThat(exception).isNotNull().hasNoCause().hasMessage("Hey dude don't forget to open door");
    }
}
