/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Senyama
 */
public class Vector2DTest {
    
    public Vector2DTest() {
    }

    @Test
    public void testLength() {
        System.out.println("length");
        Vector2D instance = new Vector2D(4,3); 
        double expResult = Math.sqrt(4*4+3*3); 
        double result = instance.length();
        assertEquals(expResult, result , 0.0);
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector2D anotherVector = new Vector2D(4,1);
        Vector2D instance = new Vector2D(2,3);
        Vector2D expResult = new Vector2D(6,4);
        Vector2D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 0.0;
        Vector2D instance = new Vector2D(2,3);
        Vector2D expResult = new Vector2D(0,0);
        Vector2D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);       
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector2D anotherVector = new Vector2D(0,0);
        Vector2D instance = new Vector2D(2,3);
        double expResult = 0.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector2D instance = new Vector2D(2,3);
        String expResult = "[2.0, 3.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector2D(2,3);
        Vector2D instance = new Vector2D(2,3);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
       
    }
    
}
