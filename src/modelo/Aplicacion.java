
package modelo;

//import java.util.ArrayList;


public class Aplicacion {
    
      //Atributos
    private String nombreAplicacion;
    private String versionAplicacion;
    private String nombrePrueba;
    private int pruebaEjecutada;
    private int pruebaExitosa;
    private int pruebaFallida;
    private int porcentajeCasoFallido;
    private int porcentajeCasoExito;

    public Aplicacion() {
    }
    

    public Aplicacion(String nombreAplicacion, String versionAplicacion, String nombrePrueba, int pruebaEjecutada, int pruebaExitosa, int pruebaFallida, int porcentajeCasoFallido, int porcentajeCasoExito) {
        this.nombreAplicacion = nombreAplicacion;
        this.versionAplicacion = versionAplicacion;
        this.nombrePrueba = nombrePrueba;
        this.pruebaEjecutada = pruebaEjecutada;
        this.pruebaExitosa = pruebaExitosa;
        this.pruebaFallida = pruebaFallida;
        this.porcentajeCasoFallido = porcentajeCasoFallido;
        this.porcentajeCasoExito = porcentajeCasoExito;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getVersionAplicacion() {
        return versionAplicacion;
    }

    public void setVersionAplicacion(String versionAplicacion) {
        this.versionAplicacion = versionAplicacion;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    public int getPruebaEjecutada() {
        return pruebaEjecutada;
    }

    public void setPruebaEjecutada(int pruebaEjecutada) {
        this.pruebaEjecutada = pruebaEjecutada;
    }

    public int getPruebaExitosa() {
        return pruebaExitosa;
    }

    public void setPruebaExitosa(int pruebaExitosa) {
        this.pruebaExitosa = pruebaExitosa;
    }

    public int getPruebaFallida() {
        return pruebaFallida;
    }

    public void setPruebaFallida(int pruebaFallida) {
        this.pruebaFallida = pruebaFallida;
    }

    public int getPorcentajeCasoFallido() {
        return porcentajeCasoFallido;
    }

    public void setPorcentajeCasoFallido(int porcentajeCasoFallido) {
        this.porcentajeCasoFallido = porcentajeCasoFallido;
    }

    public int getPorcentajeCasoExito() {
        return porcentajeCasoExito;
    }

    public void setPorcentajeCasoExito(int porcentajeCasoExito) {
        this.porcentajeCasoExito = porcentajeCasoExito;
    }
    
}