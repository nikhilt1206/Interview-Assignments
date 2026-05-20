package DeutscheBankAG;

public class TaskPOJO {
    private String name;
    private String memory;
    private String cpu;
    private String network;
    private String disk;

    public TaskPOJO(String name, String memory, String cpu, String network, String disk) {
        this.name = name;
        this.memory = memory;
        this.cpu = cpu;
        this.network = network;
        this.disk = disk;
    }

    public String getName() {
        return name;
    }

    public String getMemory() {
        return memory;
    }

    public String getCpu() {
        return cpu;
    }

    public String getNetwork() {
        return network;
    }

    public String getDisk() {
        return disk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "TaskPOJO{" +
                "name='" + name + '\'' +
                ", memory='" + memory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", network='" + network + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }
}
