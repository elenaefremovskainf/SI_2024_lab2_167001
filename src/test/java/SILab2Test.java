import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void testCheckCart_NullItems_ThrowsException() {
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
    }

    @Test
    void testCheckCart_EmptyName_SetsUnknownName() {
        Item item = new Item(null, "12345", 200, 0.1f);
        SILab2.checkCart(List.of(item), 300);
        assertEquals("unknown", item.getName());
    }

    //
}

//Every Branch 

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void testCheckCart_NullItems_ThrowsException() {
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
    }

    @Test
    void testCheckCart_EmptyName_SetsUnknownName() {
        Item item = new Item(null, "12345", 200, 0.1f);
        SILab2.checkCart(List.of(item), 300);
        assertEquals("unknown", item.getName());
    }

    //test  for branch  if (allItems == null)


	@Test
void testCheckCart_NullItems_ThrowsException() {
    assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
}


//test for branch if (item.getName() == null || item.getName().length() == 0)

@Test
void testCheckCart_EmptyName_SetsUnknownName() {
    Item item = new Item(null, "12345", 200, 0.1f);
    SILab2.checkCart(List.of(item), 300);
    assertEquals("unknown", item.getName());
}

//test za if (item.getBarcode() != null)

@Test
void testCheckCart_ValidBarcode_NoException() {
    Item item = new Item("Item3", "987654", 150, 0.05f);
    assertDoesNotThrow(() -> SILab2.checkCart(List.of(item), 200));
}


 
}

//Multiple Condition

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void testCheckCart_Condition1_CalculatesDiscountedSum() {
        Item item = new Item("Item1", "012345", 400, 0.2f);
        assertTrue(SILab2.checkCart(List.of(item), 500));
    }

    @Test
    void testCheckCart_Condition2_DoesNotApplyDiscount() {
        Item item = new Item("Item2", "123456", 250, 0.0f);
        assertTrue(SILab2.checkCart(List.of(item), 300));
    }

    // test slucai

@Test
void testCheckCart_Condition1_CalculatesDiscountedSum() {
    Item item = new Item("Item1", "012345", 400, 0.2f);
    assertTrue(SILab2.checkCart(List.of(item), 500));
}

@Test
void testCheckCart_Condition2_DoesNotApplyDiscount() {
    Item item = new Item("Item2", "123456", 250, 0.0f);
    assertTrue(SILab2.checkCart(List.of(item), 300));
}

@Test
void testCheckCart_Condition3_DiscountedSumWithSpecialBarcode() {
    Item item = new Item("Item3", "012345", 350, 0.1f);
    assertTrue(SILab2.checkCart(List.of(item), 400));
}



}

