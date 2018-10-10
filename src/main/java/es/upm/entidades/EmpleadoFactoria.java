package es.upm.entidades;

import java.util.HashMap;
import java.util.Map;

public class EmpleadoFactoria {

    private Map<String, Empleado> empleados;

    private static final EmpleadoFactoria instance = new EmpleadoFactoria();

    private EmpleadoFactoria() {
        this.empleados = new HashMap<String, Empleado>();
    }

    public static EmpleadoFactoria getInstance() {
        return instance;
    }

    public void put(Empleado empleado) {
        assert empleado != null;
        this.empleados.put(empleado.getId(), empleado);
    }

    public Empleado get(String id) {
        assert id != null;
        return this.empleados.get(id);
    }
}
