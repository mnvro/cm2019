package cours02;

public class Cpu {
	private Manufacturer manufacturer;
	private String description;

	public Cpu() {
	}

	public Cpu(Manufacturer manufacturer, String description) {
		this.manufacturer = manufacturer;
		this.description = description;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "manufacturer=" + manufacturer + ", description=" + description;
	}

}