package ru.netology.javaqa;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void should(){
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = CashbackHackService.remain(amount);
        int expected = 100;

        assertEquals

    }

}