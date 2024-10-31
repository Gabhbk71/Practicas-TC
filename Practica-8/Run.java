import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        ArrayList<Empleado> Empleados = new ArrayList<Empleado>();

        Empleado empleadosAux = new Empleado();

        empleadosAux.setCedula(10101010);
        empleadosAux.setNombre("Gabriel");
        empleadosAux.setTitulado(true);

        Empleados.add(empleadosAux);

        System.out.println(Empleados.get(0).toString());
    }
}



