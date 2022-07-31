package designpattern;

public class StartProxy {
    public static void main(String[] args) {
        ProxyManger s = new ProxyManger(new RealStar());
        s.confer();
        s.signContract();
        s.bookTicket();
        s.sing();
        s.collectMoney();
    }
}

interface Star {

    public abstract void confer();

    public abstract void signContract();

    public abstract void bookTicket();

    public abstract void sing();

    public abstract void collectMoney();

}

// 被代理類
class RealStar implements Star {

    @Override
    public void confer() {
    }

    @Override
    public void signContract() {
    }

    @Override
    public void bookTicket() {
    }

    // 只有明星會唱歌
    @Override
    public void sing() {
        System.out.println("Star: Singing...");
    }

    @Override
    public void collectMoney() {

    }
}

// 代理類 （在這邊也就是經紀人的角色）
class ProxyManger implements Star {
    private Star real;

    public ProxyManger(Star real) {
        this.real = real;
    }

    public void confer() {
        System.out.println("Manager: confer...");
    }

    public void signContract() {
        System.out.println("Manager: sign contract...");
    }

    public void bookTicket() {
        System.out.println("Manager: book ticket");
    }

    public void sing() {
        real.sing(); // 因為經紀人不會唱歌，所以調用真正的star來去唱歌
    }

    public void collectMoney() {
        System.out.println("Manger: collect all money...");
    }
}