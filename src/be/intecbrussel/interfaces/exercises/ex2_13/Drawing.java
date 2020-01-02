package be.intecbrussel.interfaces.exercises.ex2_13;

public class Drawing implements Drawable {

    private int size;
    private Drawable[] drawables = new Drawable[20];


    Drawing() {

    }

    public void add(Drawable s) {
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] == null) {
                drawables[i] = s;
                break;
            }

        }
    }

    public void remove(Drawable s) {

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Square && s instanceof Square) {
                drawables[i] = null;
                break;
            }
            if (drawables[i] instanceof Rectangle && s instanceof Rectangle) {
                drawables[i] = null;
                break;
            }
            if (drawables[i] instanceof Triangle && s instanceof Triangle) {
                drawables[i] = null;
                break;
            }
            if (drawables[i] instanceof Circle && s instanceof Circle) {

                drawables[i] = null;
                break;
            }
            if (drawables[i] instanceof IsoscelesTriangle && s instanceof IsoscelesTriangle) {
                drawables[i] = null;
                break;
            }
        }
    }

    public void clear() {
        drawables = new Drawable[20];
    }

    public int getSize() {
        int count = 0;
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] != null) {
                count++;
            }
        }
        return count;
    }


    @Override
    public void draw(DrawingContext dc) {
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] != null) {
                drawables[i].draw(dc);
            }
        }
    }

    @Override
    public void scale(int s) {
       for(int i=0; i<drawables.length;i++){
           if (drawables[i]!=null){
               drawables[i].scale(s);
           }
        }
    }

    @Override
    public void scaleDouble() {

    }

    @Override
    public void scaleHalf() {

    }

    @Override
    public String toString() {
        return "Drawing{" +
                "size=" + size +
                '}';
    }
}
