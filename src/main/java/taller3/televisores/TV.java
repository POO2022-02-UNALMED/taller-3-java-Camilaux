package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado){
		this.setMarca(marca);
		this.estado = estado;
		TV.numTV ++;
		
	}
	public void setMarca(Marca marca) {
		this.marca = marca; 
	}
	public Marca getMarca() {
		return marca;
	}
	public void setControl(Control control) {
		this.control = control; 
	}
	public Control getControl() {
		return control;
	}
	public void setPrecio(int precio) {
		this.precio = precio; 
	}
	public int getPrecio() {
		return precio;
	}
	public void setVolumen(int volumen) {
		if(estado == true && volumen >= 1 && volumen <= 120) {
			this.volumen = volumen;
		}
	}
	public int getVolumen() {
		return volumen;
	}
	public void setCanal(int canal) {
		if(estado==true && canal >= 1 && canal <= 120) {
			this.canal = canal;
		} 
	}
	public int getCanal() {
		return canal;
	}
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int num) {
		numTV = num;
	}
	public void canalUp() {    
		if(getCanal() < 120 && getEstado() == true) {
			this.canal ++;
		}
		setCanal(this.canal);
	}
	public void canalDown() {
		if(getCanal() <= 120 && getEstado() == true) {
			this.canal --;
			}
		setCanal(this.canal);
	}
	public void volumenUp() {
		if(getVolumen() < 7 && getEstado() == true) {
			this.volumen ++;
		}
		setVolumen(this.volumen);
	}
	public void volumenDown() {
		if(getVolumen() <= 7 && getEstado() == true) {
			this.volumen --;
		}
		setVolumen(this.volumen);
	}
}
