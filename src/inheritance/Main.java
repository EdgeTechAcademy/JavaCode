package inheritance;

// filename inheritance.Main.java
class Grandparent {
    public void Print() {
        System.out.format("%nGrandparent %s%n", this.getClass());
    }
}

class Parent extends Grandparent {
    public void Print() {
        super.Print();
        System.out.format("inheritance.Parent %s%n", this.getClass());
    }
}

class Child extends Parent {
    public void Print() {
        super.Print();
        System.out.format("inheritance.Child %s%n", this.getClass());
    }
}

class Base {
     public void show() {           //final
        System.out.format("inheritance.Base%n");
    }
}

class Derived extends Base {
    public void show() {
        System.out.format("inheritance.Derived%n");
    }
}

public class Main {
    public static void doShow( Base o ) {
        o.show();
    }

    public static void main(String[] args) {
        System.out.format("%n#1%n");
        Base b = new Derived();
        b.show();

        System.out.format("%n#3%n");
        Derived d = new Derived();
        b.show();
        d.show();

        System.out.format("%n#4%n");
        Base    x = new Base();
        Base    y = new Derived();
        Derived z = new Derived();
        doShow(x);
        doShow(y);
        doShow(z);

        System.out.format("%n#6");
        Child c = new Child();
        c.Print();
        Parent p = new Parent();
        p.Print();
        Grandparent gp = new Grandparent();
        gp.Print();
    }
}