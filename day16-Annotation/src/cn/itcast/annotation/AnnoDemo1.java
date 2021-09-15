package cn.itcast.annotation;

@SuppressWarnings("all")
public class AnnoDemo1 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {
        //有缺陷
    }

    public void show2() {
        //替换show1()方法
    }

    public void demo() {
        show1();
    }
}
