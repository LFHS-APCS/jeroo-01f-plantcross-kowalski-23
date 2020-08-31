/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() 
    {
     this.side();
     this.side();
     this.side();
     this.side();
    }
    // Put any helpermethods here
    
    public void plantHop()
    {
      this.plant();
      this.hop();
    }

    public void side()
    {
     this.corner();
     this.shortLine();
    }

    public void corner()
    {
     this.line();
     this.turn(LEFT);
     this.line();
    }

    public void line()
    {
     this.plantHop();
     this.plantHop();
     this.plantHop();
    }

    public void shortLine()
    {
     this.turn(RIGHT);
     this.plantHop();
     this.plantHop();
     this.turn(RIGHT);
    }
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
