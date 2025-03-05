public class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Collecting and recycling recyclable waste.");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}
