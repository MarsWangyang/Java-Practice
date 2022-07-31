package designpattern;

/**
 * 抽象類就是一種模板模式的設計，抽象類做為多個子類的通用模版，子類在抽象類的基礎上進行expand, reform, 但子類總體上會保留抽象類的行為方式
 * 解決的問題：
 * > 當功能內部一部分的實現是確定的，一部分實現是不確定的。這個時候可以把不確定的部分暴露出去，讓子類去時間。
 * > In other words, 開發當中實現一個算法的時候，整體步驟會是固定通用，並且這些步驟已經會在parent
 * class裡面實現好。但是某些部分容易改變，而這些部分可以抽象出來，讓不同的subclass去各自實踐
 */

public class TemplateMethod {
    public static void main(String[] args) {
        SubTemplate t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template {
    // 計算某段程式碼所需要的時間
    public void spendTime() {
        long start = System.currentTimeMillis();

        this.code(); // 不確定的部分、易變的部分

        long end = System.currentTimeMillis();
    }

    public abstract void code();
}

class SubTemplate extends Template {

    @Override
    public void code() {
        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(j); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }
    }
}