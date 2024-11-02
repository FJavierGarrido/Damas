public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro");

    private String cadenaAMostrar;

    //Constructor
    Color(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;

    public String toString() {
        return "Color{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }
}
