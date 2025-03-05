// WasteManagementSystem.java
public class WasteManagementSystem {
    public static void main(String[] args) {
        // Create Waste Collectors
        OrganicWasteCollector organicCollector = new OrganicWasteCollector();
        RecyclableWasteCollector recyclableCollector = new RecyclableWasteCollector();
        HazardousWasteCollector hazardousCollector = new HazardousWasteCollector();

        // Set the chain of responsibility
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        // Create waste containers
        WasteContainer organicWaste = new WasteContainer("organic", 10);
        WasteContainer recyclableWaste = new WasteContainer("recyclable", 15);
        WasteContainer hazardousWaste = new WasteContainer("hazardous", 20);
        WasteContainer unknownWaste = new WasteContainer("unknown", 9);

        // Process waste
        organicCollector.collectWaste(organicWaste);  // Should be handled by OrganicWasteCollector
        organicCollector.collectWaste(recyclableWaste);  // Should pass to RecyclableWasteCollector
        organicCollector.collectWaste(hazardousWaste);  // Should pass to HazardousWasteCollector
        organicCollector.collectWaste(unknownWaste);  // No collector found
    }
}
