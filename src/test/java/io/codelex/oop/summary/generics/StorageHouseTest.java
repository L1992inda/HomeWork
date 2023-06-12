package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StorageHouseTest {
    @Test
    public void testGetMaybeFirstItem() {
        StorageHouse storageHouse = new StorageHouse("Cat");
        storageHouse.addMoreItems(123);

        Optional<Object> maybeFirstItem = storageHouse.getMaybeFirstItem();
        assertEquals("Cat", maybeFirstItem.get());
    }
}
