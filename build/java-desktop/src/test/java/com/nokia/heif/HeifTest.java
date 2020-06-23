package com.nokia.heif;

import org.junit.Test;
import static org.junit.Assert.*;


public class HeifTest {
    @Test
    public void loadLibrary() {
        HEIF heif = new HEIF();

        assertNotNull(heif);
    }
}
