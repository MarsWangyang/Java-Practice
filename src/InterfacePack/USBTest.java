package InterfacePack;

/**
 * Interface的使用：
 * 1. Interface使用上也滿足多態性
 * 2. interface實際上就是定義了一個規範
 * 3. interface-oriented programming
 */

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        // 1. 創建interface的非匿名implements class的非匿名對象
        Flash flash = new Flash();
        com.transferData(flash);

        // 2. 創建了接口的非匿名實現類的匿名對象
        com.transferData(new Printer());

        // 3. 創建了接口的匿名實現類的非匿名對象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("phone start");
            }

            @Override
            public void stop() {
                System.out.println("phone stop");

            }
        };
        com.transferData(phone);

        // 4. 創建了接口的匿名實現類的匿名對象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp4 start");
            }

            @Override
            public void stop() {
                System.out.println("mp4 stop");

            }
        });
    }
}

class Computer {
    public void transferData(USB usb) { // USB usb = new Flash();
        usb.start();

        System.out.println("傳輸數據");

        usb.stop();
    }
}

// 像是定義了一個規範，如果今天誰想要去跟computer實現usb接口的應用，那麼就一定要符合USB這個interface的規範
interface USB {
    public abstract void start();

    public abstract void stop();
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("Flash start");
    }

    @Override
    public void stop() {
        System.out.println("Flash stop");

    }

}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("Printer start");
    }

    @Override
    public void stop() {
        System.out.println("Printer stop");

    }

}