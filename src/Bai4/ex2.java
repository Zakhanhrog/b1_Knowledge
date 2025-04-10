package Bai4;

class StopWatch {
    private long startTime;
    private long endTime;

    // Constructor không tham số
    public StopWatch() {
        this.startTime = System.currentTimeMillis(); // Thời gian hiện tại khi tạo đối tượng
    }

    // Phương thức start()
    public void start() {
        this.startTime = System.currentTimeMillis(); // Đặt lại startTime
    }

    // Phương thức stop()
    public void stop() {
        this.endTime = System.currentTimeMillis(); // Đặt endTime
    }

    // Phương thức getter cho startTime
    public long getStartTime() {
        return startTime;
    }

    // Phương thức getter cho endTime
    public long getEndTime() {
        return endTime;
    }

    // Phương thức getElapsedTime()
    public long getElapsedTime() {
        return endTime - startTime; // Tính thời gian đã trôi qua
    }
}
public class ex2 {
    // Ví dụ sử dụng (main method để kiểm tra)
    public static void main(String[] args) throws InterruptedException { // Cần throws InterruptedException
        StopWatch stopWatch = new StopWatch();

        // Giả sử làm một việc gì đó mất thời gian
        System.out.println("Starting...");
        Thread.sleep(2000); // Chờ 2 giây (ví dụ)
        System.out.println("Stopping...");

        stopWatch.stop();

        long elapsedTime = stopWatch.getElapsedTime();

        System.out.println("Start time: " + stopWatch.getStartTime());
        System.out.println("End time: " + stopWatch.getEndTime());
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}