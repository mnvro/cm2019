package cours02;

import javax.xml.parsers.FactoryConfigurationError;

public class MainPC {

	public static void main(String[] args) {
		Computer tabPC[] = new Computer[3];
		
//		Le premier est un ordinateur du fabricant Dell avec un CPU Intel « Core i3 ». Il coûte 485,23 euros
		tabPC[0] = new Computer(new Cpu(new Manufacturer("Intel"), "Core i3"), new Manufacturer("Dell"), 485.23);
		System.out.println(tabPC[0]);
		
//		Le second est un ordinateur du fabricant Microsoft avec un CPU Intel « Core i5 ». Il coûte 1501,92 euros
		Manufacturer fabricantCpu = new Manufacturer("Intel");
		Manufacturer fabricantOrdinateur = new Manufacturer("Microsoft");
		Cpu cpu = new Cpu(fabricantCpu,"Core i5");
		tabPC[1] = new Computer(cpu, fabricantOrdinateur, 1501.92);
		System.out.println(tabPC[1]);
		
//		Le dernier est un ordinateur du fabricant Medion avec un processeur Intel Celeron N3160. Il coûte 269,99 euros
		tabPC[2] = new Computer(new Cpu(new Manufacturer("Intel"), "Celeron N3160"), new Manufacturer("Medion"), 269.99);
		System.out.println(tabPC[2]);
	}

}