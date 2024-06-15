package genericex;

public class PrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> printerPowder = new GenericPrinter<Powder>();
		printerPowder.setMaterial(new Powder());
		Powder powder = printerPowder.getMaterial();
		// 재료는 Powder 입니다.
		System.out.println(printerPowder);
		
		GenericPrinter<Plastic> printerPlastic = new GenericPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		// 재료는 Powder 입니다.
		System.out.println(printerPlastic);
		
		printerPlastic.printing();
		printerPowder.printing();
	}
}
