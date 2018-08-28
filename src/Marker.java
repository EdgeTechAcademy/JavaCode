public class Marker {
    private String color;
    private static String manufacturer = "Chisel";
    //private String manufacturer = "Chisel";

    public Marker(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String draw() {
        return "I'm drawing in this color: " + this.color;
    }

    public static void main(String[] args) {
        Marker redMarker = new Marker("red");
        Marker blueMarker = new Marker("blue");
        Marker greenMarker = new Marker("green");

        System.out.println(redMarker.draw());
        System.out.println(blueMarker.draw());
        System.out.println(greenMarker.draw());

        System.out.println(redMarker.getManufacturer());
        System.out.println(blueMarker.getManufacturer());
        System.out.println(greenMarker.getManufacturer());

        System.out.println("changing redMarker.manufacturer = \"New Manufacturer\"");
        redMarker.manufacturer = "New Manufacturer";

        System.out.println(redMarker.manufacturer);
        System.out.println(blueMarker.manufacturer);
        System.out.println(greenMarker.manufacturer);
    }
}
