public class OrganicWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Organic")) {
            System.out.println("Collecting and disposing of organic waste.");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}
