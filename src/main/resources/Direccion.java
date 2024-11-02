public enum Direccion {
    NORESTE("Noreste"),
    SURESTE("Sureste"),
    SUROESTE("Suroeste"),
    NOROESTE("Noroeste");

    private String cadenaAMostrar;

    @Override
    public String toString() {
        return "Direccion{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }
}
