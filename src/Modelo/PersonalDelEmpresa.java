package Modelo;

public class PersonalDelEmpresa {
    String codigo,nombre,apellido,sexo;
    int edad;
    String estadoCivil,area;
    String FechaIngreso;

    public PersonalDelEmpresa() {
    }

    public PersonalDelEmpresa(String codigo, String nombre, String apellido, String sexo, int edad, String estadoCivil, String area, String FechaIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.area = area;
        this.FechaIngreso = FechaIngreso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getArea() {
        return area;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    
    
}
