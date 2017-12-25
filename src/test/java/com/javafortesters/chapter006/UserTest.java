package com.javafortesters.chapter006;

import domainentities.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
        assertEquals("Default 'username' expected", "username", user.getUserName());
        assertEquals("Default 'password' expected", "password", user.getPassword());
    }

    @Test
    public void canConstructNewUserWithUsernameAndPassword(){
        User adminUser = new User("admin", "pa$$w0rd");

        assertEquals("Given username expected", "admin", adminUser.getUserName());
        assertEquals("Given password expected", "pa$$w0rd", adminUser.getPassword());
    }

    @Test
    public void canChangeThePassword(){
        User user = new User();
        user.setPassword("Newpassword");
        assertEquals("New password is \"Newpassword\"", "Newpassword", user.getPassword());
    }

    @Test
    public void CharacterType(){
        char aChar = '\u0026';
        assertEquals('&', aChar);
    }

    @Test
    public void traditonalOperatorsExplored(){
        assertEquals(4, 2+2);
        assertEquals(5L, 10L-5L);
        assertEquals(25.0F, 50.0F / 2.0F, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcd", "abcd", "ab"+"cd");
        assertEquals(1, 9%2);
        int a = 20;
        assertEquals(21, ++a);
        boolean trully = true;
        assertTrue(trully == true);
        assertTrue(trully != false);
        assertTrue(!false);
        assertFalse(!trully);
    }

    @Test
    public void ternaryOperatorsExplored(){
        int x = 4;
         x = 7 > 6 ? 10 : 5;
         assertEquals(10, x);
         assertTrue(10>=4 ? true : false);
    }

    @Test
    public void bitwiseOperatorsExplored(){
        assertEquals(0b0001, 0b1001 & 0b0101);
        assertEquals(0b1101, 0b0101 | 0b1000);
        assertEquals(0b1100, 0b0100 ^ 0b1000);
        int x = 0b0001;
        assertEquals("11111111111111111111111111111110", Integer.toBinaryString(~x));
    }

    @Test
    public void bitwiseAssignmentOperatorsExplored(){
        byte x = 0b0001;

        x &= 0b1011;
        assertEquals(0b0001, x);

        x |= 0b1001;
        assertEquals(0b1001, x);

        x ^= 0b1110;
        assertEquals(0b0111, x);

    }

    @Test
    public void bitwiseShiftOperatorsExplored(){
        int a = 56;

        assertEquals(a*2, a<<1);
        System.out.println("a1 = " + a);
        assertEquals(a*4, a<<2);
        assertEquals(a*8,a<<3);
        System.out.println("a2 = " + a);
        a<<=3;
        System.out.println("a3 = " + a);

        a = Integer.MAX_VALUE;
        System.out.println("a4 = " + a);
        assertEquals(Integer.MAX_VALUE/2, a>>1);
        assertEquals(Integer.MAX_VALUE/4, a>>2);
        assertEquals(Integer.MAX_VALUE/8, a>>3);

        a = Integer.MIN_VALUE;
        System.out.println("a5 = " + a);
        assertEquals(Integer.MIN_VALUE*2, a<<1);
        assertEquals((Integer.MAX_VALUE/2)+1, a>>>1);
    }

    @Test
    public void stringsConacatinated(){
        assertEquals("12345", "12" + "34" + "5");
    }

    @Test
    public void someStringMethod(){
        String myString = "abcdef";

        assertEquals(myString.length(), 6);
        assertTrue(myString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(myString.contains("cd"));
        assertTrue(myString.startsWith("abc"));

        // string indexing starts at 0
        assertEquals(myString.charAt(2), 'c');
        assertEquals("def", myString.substring(3));
    }
}
