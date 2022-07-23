package test;

public class MonitorInfoBean {

    /** 线程总数. */
    private int totalThread;

    /** cpu使用率. */
    private double cpuRatio;

    public int getTotalThread() {
        return totalThread;
    }

    public void setTotalThread(int totalThread) {
        this.totalThread = totalThread;
    }

    public double getCpuRatio() {
        return cpuRatio;
    }

    public void setCpuRatio(double cpuRatio) {
        this.cpuRatio = cpuRatio;
    }
}
