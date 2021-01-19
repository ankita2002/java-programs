public class Volume {
    public void volume(int side) {
        int cube = side * side * side;
        System.out.println("Volume of the cube=" + cube);
    }

    public void volume(int l, int b, int h) {
        int cuboid = l * b * h;
        System.out.println("Volume of the cuboid =" + cuboid);
    }

    public void volume(double r) {
        double sp = 4.0 / 3 * 3.14 * r * r * r;
        System.out.println("Volume of the sphere=" + sp);
    }

    public static void main(String[] args) {
        Volume ob = new Volume();
        ob.volume(5);
        ob.volume(10, 5, 2);
        ob.volume(4.5);
    }
}

