public class Computer {
    private String manufacture;
    private String model;
    private String processorModel;
    private String mainBoardModel;
    private float amountOfRam = 8.0f;
    private boolean hasOperationSystem = false;
    private boolean hasSSD = false;

    public Computer(String manufacture, String model, String processorModel, String mainBoardModel) {
        this.manufacture = manufacture;
        this.model = model;
        this.processorModel = processorModel;
        this.mainBoardModel = mainBoardModel;
    }

    public Computer(String manufacture, String model, String processorModel, String mainBoardModel, int amountOfRam, boolean hasOperationSystem, boolean hasSSD) {
        this.manufacture = manufacture;
        this.model = model;
        this.processorModel = processorModel;
        this.mainBoardModel = mainBoardModel;
        this.amountOfRam = amountOfRam;
        this.hasOperationSystem = hasOperationSystem;
        this.hasSSD = hasSSD;
    }

    public String getManufactureAndModel() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer[producer=").append(manufacture).append(", model=").append(model).append("]");
        return sb.toString();
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public String getMainBoardModel() {
        return mainBoardModel;
    }

    public float getAmountOfRam() {
        return amountOfRam;
    }

    public void setAmountOfRam(float amountOfRam) {
        this.amountOfRam = amountOfRam;
    }

    public void installWindows() {
        this.hasOperationSystem = true;
    }

    public void uninstallWindows() {
        this.hasOperationSystem = false;
    }

    public void mountSSD() {
        this.hasSSD = true;
    }

    public void unmountSSD() {
        this.hasSSD = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer[producer=").append(manufacture).append(", model=").append(model).append(", processor=").append(processorModel).append(", mainBoard=").append(mainBoardModel).append(", ram=").append(amountOfRam).append(", ");
        if (hasOperationSystem == true)
            sb.append("WindowsInstalled");
        else
            sb.append("WithoutSystem");
        sb.append(", ");
        if (hasSSD == true)
            sb.append("WithSSD");
        else
            sb.append("WithoutSSD");
        sb.append("]");
        return sb.toString();
    }
}
