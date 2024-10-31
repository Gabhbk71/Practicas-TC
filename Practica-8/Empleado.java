public class Empleado{
    private String nombre;
    private int cedula;
    private boolean titulado;


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCedula(int c){
        this.cedula = c;
    }

    public int getCedula(){
        return this.cedula;
    }

    public void setTitulado(boolean titulado){
        this.titulado = titulado;
    }

    public boolean isTitulado(){
        return this.titulado;
    }

    @Override
    public String toString(){
        return this.getNombre()+ " "+this.getCedula();
    }
}