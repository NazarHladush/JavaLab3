package ua.lviv.iot.athletics.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpingTest {

    @Test
    void jumpTypeGetterAndSetter() {
        Jumping jumping = new Jumping();
        jumping.setKindOfJump(JumpType.TRIPLEJUMP);
        assertEquals(JumpType.TRIPLEJUMP, jumping.getKindOfJump());
    }

    @Test
    void heightGetterAndSettrq() {
        Jumping jumping = new Jumping();
        jumping.setHeight(88);
        assertEquals(88, jumping.getHeight());
    }
}
