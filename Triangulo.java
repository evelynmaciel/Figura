class Triangulo extends Figuras{
    private String tipoTriangulo;
    public Triangulo(int noLados, int noVertices, String tipoTriangulo){

        super(noLados, noVertices);
        this.tipoTriangulo = tipoTriangulo;
    }




    public String getTipoTriangulo() {
        return tipoTriangulo;
    }


    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }

    public void mostrar(){

        System.out.println("Lados:" + getNoLados());
        System.out.println("Vertices:" + getNoVertices());
        System.out.println("Tipo: " + getTipoTriangulo());
    }

    @Override
    public String toString() {
        return "Triangulo [getnoVertices()=" + getNoVertices() + ", getTipoTriangulo()=" + getTipoTriangulo()
                + ", getNoLados()=" + getNoLados() + "]";
    }





}