package misticc3.pkg07;


public class Empleado extends Empresa{
    
    private String nombreEmpleado;
    private String correo;
    private String rolEmpleado;

    public Empleado(String nombreEmpleado, String correo, String rolEmpleado, String nombreEmpresa, String direccion, int telefono, int NIT) {
        super(nombreEmpresa, direccion, telefono, NIT);
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.rolEmpleado = rolEmpleado;
    }

    public Empleado(String nombreEmpresa, String direccion, int telefono, int NIT) {
        super(nombreEmpresa, direccion, telefono, NIT);
    }
      
    public Empleado (){
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public void Informacion (){
        System.out.println("Empresa "+this.getNombreEmpresa()+
                "Direccion "+this.getDireccion()+
                "Telefono "+this.getTelefono()+
                "Nit "+this.getNIT()+
                "Nombre de Empleado "+this.nombreEmpleado+
                "Correo "+this.correo+
                "Rol de Empleado "+this.rolEmpleado
                );
    
}
}