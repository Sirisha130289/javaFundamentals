package be.intecbrussel.InheritanceChapter10.exercises.ex10_7;

public class IsoScelesTriangle extends Triangle {
    private static int isoTriangleCount;

    IsoScelesTriangle() {
        isoTriangleCount++;
    }

    public static int getIsoTriangleCount() {
        return isoTriangleCount;
    }

    IsoScelesTriangle(int w, int h) {
        this.setWidth(w);
        this.setHeight(h);
        isoTriangleCount++;
    }

    IsoScelesTriangle(int w, int h, int x, int y) {
        this.setWidth(w);
        this.setHeight(h);
        this.setX(x);
        this.setY(y);
        isoTriangleCount++;
    }

    IsoScelesTriangle(IsoScelesTriangle t) {
        this.setWidth(getWidth());
        this.setHeight(getHeight());
        this.setX(getX());
        this.setY(getY());
        isoTriangleCount++;
    }

    public void setWidth(int w) {
        super.setWidth(w);
    }

    public void setPerpendicular(int p) {
        this.setPerpendicular(p);
    }
}
