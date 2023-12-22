
package factoryMethod;

public class Factory {
  
    public Shape createShape(Shapes shape){
        
        if(shape == Shapes.CIRCLE){
            return new Circle();
        }
        else if (shape ==Shapes.SQUARE){
            return new Square();
            
        }
        else if (shape==Shapes.TRIANGLE){
            return new Triangle();
        }
        else{
            return null;
        }
        
    }
}
