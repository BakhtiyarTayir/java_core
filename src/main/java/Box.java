public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return  width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    public BoxWeight(Box ob, double weight) {
        super(ob);
        this.weight = weight;
    }

    public BoxWeight(double w, double h, double d, double weight) {
        super(w, h, d);
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}

class  DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}