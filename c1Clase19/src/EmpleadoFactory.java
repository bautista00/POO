


public class EmpleadoFactory {

    public static final String CODIGO_EMPDEP = "EMP-RD";
    public static final String CODIGO_EMPCON = "EMP-PH";
    private static EmpleadoFactory instance;

    private EmpleadoFactory() {
    }

    public static EmpleadoFactory getInstance() {
        if (instance == null) {
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo) throws EmpleadoFactoryException{
        switch (codigo){
            case CODIGO_EMPDEP :
                return new EmpleadoRelacionDependencia("Tomas","Perez",12345);
            case CODIGO_EMPCON :
                return new EmpleadoContratado("Juan","Gonzalez",34536);
        }
        throw new EmpleadoFactoryException(codigo + "codigo no valido");
    }
}

