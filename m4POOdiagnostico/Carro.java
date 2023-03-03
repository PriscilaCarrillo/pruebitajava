package m4POOdiagnostico;

import java.util.ArrayList;

public class Carro {
    int cantOcupantes;
    String fechaIngreso;
    String ubicacionTablero;
    static ArrayList<int[][]> coordenadas;
    
    public ArrayList<int[][]> getCoordenadas(){
        return coordenadas;
    }
    
    public void setCoordenadas(ArrayList<int[][]> coordenadas) {
        this.coordenadas = coordenadas;
    }

    //CONSTRUCTOR VACIO
    public Carro(){}

    //CONSTRUCTOR LLENO CON ATRIBUTOS COMO PARAMETROS 
    
    public Carro(int cantOcupantes, String fechaIngreso, String ubicacionTablero) {
    	this.cantOcupantes = cantOcupantes;
    	this.fechaIngreso = fechaIngreso;
    	this.ubicacionTablero = ubicacionTablero;
    }
    
    public int getCantOcupantes(){
        return cantOcupantes;
    }
    public void setCantOcupantes(int cantOcupantes){
        this.cantOcupantes = cantOcupantes;
    }
    public String getFechaIngreso(){
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    public String getUbicacionTablero() {
    	return ubicacionTablero;
    }
    public void setUbicacionTablero(String ubicacionTablero) {
    	this.ubicacionTablero = ubicacionTablero;
    }
    
    
    //METODO MOSTRAR DATOS
    public void mostrarDatos() {
    	System.out.println("Cantidad de ocupantes" + cantOcupantes + "Fecha de ingreso" + fechaIngreso + "Ubicacion en el tablero" + ubicacionTablero);
    }
    
    @Override
    public String toString() {
    	return "Carro [cantOcupantes=" + cantOcupantes + ", fechaIngreso=" + fechaIngreso + ", ubicacionTablero="
    			+ ubicacionTablero + "]";
    }   
        
    }
