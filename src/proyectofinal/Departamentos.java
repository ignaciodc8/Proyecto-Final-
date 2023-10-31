
package proyectofinal;


public class Departamentos {
    private String id;
    private int piso;
    private String depto;
    private String propietario;
    private String inquilino;
    private int gastos;
    //private boolean disponible;
    
    public Departamentos (String id, int piso, String depto, String propietario, String inquilino, double gastos /*boolean disponible*/){
            this.id = id;
            this.piso = piso;
            this.depto = depto;
            this.propietario = propietario;
            this.inquilino = inquilino;
            this.gastos = (int) gastos;
            //this.disponible = disponible;
            
    }
    public Departamentos() {
    
    }
    
    public String getID() {
        return id;
    }
    public void setID(String id) {
    this.id = id;
    }
    
    public int getPiso() {
        return piso;
    }
    
    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    public String getDepto() {
        return depto;
    }
    
    public void setDepto(String depto) {
        this.depto = depto;
    }
    
    public String getPropietario() {
        return propietario;
    }
    
    public void setPropietario(String propietario) {
       this.propietario = propietario;
    }
    
    public String getInquilino(){
        return inquilino;
    }
    
    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }
    public double getGastos() {
        return gastos;
    }
    
    public void setGastos(double gastos) {
        this.gastos = (int) gastos;
    }
    
    //public boolean isDisponible() {
       // return disponible;
    //}
    
    //public void setDisponible(boolean disponible) {
      //  this.disponible = disponible;
    //}
}
