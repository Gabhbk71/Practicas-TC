public class Run {

    // compartir por todas las instancias de la clase
    static int contador = 0;
    
    //valor fijo, compartir y NO es modificable
    static final String NOMBRE_EMPRESA = "Talent Care";
    //NOMBRE_EMPRESA = "Takent";

    //No se puede modificar despues de su inicializacion
    final int id=1;

    int IdPaciente;

    final void metodoBloqueado(){
        System.out.println("Este metodo no se puede sobreescribir");
    }

    public Run(String nombre){

    }

    public static void main(String[] args){
        
        
    }
}
