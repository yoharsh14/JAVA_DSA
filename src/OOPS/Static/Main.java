package OOPS.Static;

enum Color {
    RED, GREEN, BLUE;

    // Static main method inside the enum
    public static void main(String[] args) {
        // Using the values() method to get all constants of the enum
        Color[] colors = Color.values();
        for (Color color : colors) {
            System.out.println(color);
        }

        // Demonstrating ordinal() method
        System.out.println("Ordinal of RED: " + Color.RED.ordinal());
        System.out.println("Ordinal of GREEN: " + Color.GREEN.ordinal());
        System.out.println("Ordinal of BLUE: " + Color.BLUE.ordinal());

        // Demonstrating valueOf() method
        Color color = Color.valueOf("GREEN");
        System.out.println("Color from valueOf: " + color);
    }
}

