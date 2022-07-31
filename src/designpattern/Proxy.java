package designpattern;

/**
 * 
 * 概述：Proxy pattern是Java開發當中使用較多的一種設計模式。
 * 代理設計主要就是為了其他object提供一種代理，來控制對這個Object的訪問。
 * -> 有一個interface會被 被代理類 跟 代理類去實現，但是代理類可以代替被代理類去完成它原本該做的動作
 * -> 就像是明星以及經紀人的關係，接通告通知是一個interface，super star
 * class要去實行，但被代理類也同時去實行，由經紀人(代理類)來去幫被代理類完成 -> 查看designpattern/StarProxy.java
 * 
 * 應用場景：
 * 1. 安全代理：屏蔽對真實角色的直接訪問 (此example)
 * 2. 遠程代理：通過代理類處理遠程方法的調用(RMI)
 * 3. 延遲加載：先加載輕量級的代理對象，真正需要再加載真實對象。
 * example:
 * 假設要開發一個大文件查看軟體，大圖片可能有100MB，不可能將所有圖片同時顯示出來，那麼這時候就可以使用代理模式，當需要查看到圖片的時候，用proxy的方式來將大圖片打開
 * 
 * 分類：
 * > 靜態代理：已經寫好的代理類以及被代理類
 * > 動態代理：沒有寫好，會在程式碼跑的時候，動態的生成代理
 * 
 */
public class Proxy {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);

        proxyServer.browser(); // 雖然像是proxy server在對network做訪問，但實際上傳入進去的是真實server
        // 為什麼不讓server自己browse? 因為proxy server還可以替我們做其他事情，例如check() etc.
    }
}

interface Network {
    public abstract void browser();

}

// 被代理類
class Server implements Network {
    @Override
    public void browser() {
        System.out.println("真實的服務器訪問網路");
    }
}

// 代理類
class ProxyServer implements Network {

    private Network work;

    public ProxyServer(Network work) {
        this.work = work;
    }

    public void check() {
        System.out.println("連上網路前的檢查");
    }

    @Override
    public void browser() {
        check();
        work.browser();
    }
}