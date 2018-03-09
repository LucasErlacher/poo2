package shapesmetodofabrica;

/**
 *
 * @author 20161bsi0187
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape;
        
        shape = ShapeFactory.getShape("shapesmetodofabrica.Circle");
        shape.draw();
        
        shape = ShapeFactory.getShape("shapesmetodofabrica.Triangle");
        shape.draw();
        
        shape = ShapeFactory.getShape("shapesmetodofabrica.Square");
        shape.draw();
    }   
}
