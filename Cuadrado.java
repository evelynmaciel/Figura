class Cuadrado extends Figuras{

    private String simetria;

    public Cuadrado(int noLados, int noVertices){

        super(noLados, noVertices);
    }


    public void mostrar(){

        System.out.println("Lados:" + getNoLados());
        System.out.println("Vertices:" + getNoVertices());
    }


    public String getSimetria() {
        return simetria;
    }


    public void setSimetria(String simetria) {
        this.simetria = simetria;
    }


    @Override
    public String toString() {
        return "Cuadrado [getNoVertices()=" + getNoVertices() + ", getSimetria()=" + getSimetria() + ", getNoLados()="
                + getNoLados() + "]";
    }


}