package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tele) {
		tv = tele;      //se "enlaza" el tv de control con el tv de TV, en el TestTv tenemos control1.enlazar(tv1) donde tv1 es de tipo TV (clase)
		tv.setControl(this);    //this sería el control
	}
	
	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void canalDown() {
		this.tv.canalDown();
	}
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	public void setTV(TV tv) {
		this.tv = tv;
	}
	public TV getTV() {
		return tv;
	}
}
