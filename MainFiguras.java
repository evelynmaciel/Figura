class MainFiguras{
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(3, 3, "Isosceles");
        Cuadrado cuadrado = new Cuadrado(4, 4);

        triangulo.mostrar();
        System.out.println(triangulo.toString());
        System.out.println("-----------------");
        cuadrado.mostrar();
        System.out.println(cuadrado.toString());
    }
}