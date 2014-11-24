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
public class Vector3DTest {
    
    public Vector3DTest() {
    }

    @Test
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(2,3,4);
        double expResult = Math.sqrt(2*2+3*3+4*4);
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(2,3,4);
        Vector3D expResult = new Vector3D(4,6,8);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 0.0;
        Vector3D instance = new Vector3D(2,3,4);
        Vector3D expResult = new Vector3D(0,0,0);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(0,0,0);
        Vector3D instance = new Vector3D(2,3,4);
        double expResult = 0.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(0,4,4);
        Vector3D instance = new Vector3D();
        Vector3D expResult = new Vector3D(0,-4,4);
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(2,3,4);
        String expResult = "[2.0, 3.0, 4.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(2,3,4);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        
    }
    
}
