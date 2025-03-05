public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        // Setting up the chain
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        // Test cases
        WasteContainer organicWaste = new WasteContainer("Organic", 50);
        WasteContainer recyclableWaste = new WasteContainer("Recyclable", 30);
        WasteContainer hazardousWaste = new WasteContainer("Hazardous", 20);
        WasteContainer unknownWaste = new WasteContainer("Metal", 40);

        System.out.println("Processing waste collection...");
        organicCollector.collectWaste(organicWaste);
        organicCollector.collectWaste(recyclableWaste);
        organicCollector.collectWaste(hazardousWaste);
        organicCollector.collectWaste(unknownWaste);
    }
}
