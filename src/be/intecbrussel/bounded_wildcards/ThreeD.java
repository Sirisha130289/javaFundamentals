package be.intecbrussel.bounded_wildcards;

public class ThreeD extends TwoD{

    private int z;

    public ThreeD() {

    }


    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
