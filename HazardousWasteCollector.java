public class HazardousWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Handling and disposing of hazardous waste safely.");
        } else {
            System.out.println("Waste type not recognized. Cannot process.");
        }
    }
}
