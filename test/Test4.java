/**
 * @author zth
 * @date 2019/10/20 23:39
 */
//初始化顺序
public class Test4 {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

class Fu {
    static {
        System.out.println("静态代码块Fu");
    }
    public Fu() {
        System.out.println("构造方法Fu");
    }
    {
        System.out.println("构造代码块Fu");
    }


}

class Zi extends Fu {
    static {
        System.out.println("静态代码块Zi");
    }

    {
        System.out.println("构造代码块Zi");
    }

    public Zi() {
        System.out.println("构造方法Zi");
    }
}
