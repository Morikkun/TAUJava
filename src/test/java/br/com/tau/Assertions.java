package br.com.tau;


import org.junit.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class Assertions {

    @Test
    public void numCheck() {
        assertEquals(1, 3);
    }

    @Test
    public void anotherNumCheck(){
        assertEquals(8,8);
    }
}
