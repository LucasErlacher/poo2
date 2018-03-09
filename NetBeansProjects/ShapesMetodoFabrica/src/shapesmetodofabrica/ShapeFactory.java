/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesmetodofabrica;

/**
 *
 * @author 20161bsi0187
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType){
        Shape shape = null;
        Object classReflection = null;
        
        try {
            classReflection = Class.forName(shapeType).newInstance();            
	    } catch (InstantiationException e) {
	    e.printStackTrace();
	} catch (IllegalAccessException e) {
            e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
        
        shape = (Shape) classReflection;
        
        return shape;
    }
}
