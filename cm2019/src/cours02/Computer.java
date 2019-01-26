package cours02;

public class Computer {
	private Cpu cpu;
	private Manufacturer manufacturer;
	private double price;

	public Computer(Cpu cpu, Manufacturer manufacturer, double price) {
		this.cpu = cpu;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public Computer() {
	}

	public String toString() {
		return "cpu=" + cpu + ", manufacturer=" + manufacturer + ", price=" + price + " Euros";		
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}