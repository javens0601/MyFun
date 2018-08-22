/**
 * Created by jinweih on 2018/8/11.
 * @Description 代理模式
 * 代理设计及时一个代理主题来操作真实主题，真实主题执行具体的业务操作，而代理主题负责其他业务处理
 */
interface NetWork {
    void browse();
}

class Real implements NetWork {
    public void browse() {
        System.out.println("调用真实上网方法");
    }
}

class Proxy implements NetWork {
    private NetWork netWork;
    public Proxy (NetWork netWork) {
        this.netWork = netWork;
    }
    public void check () {
        System.out.println("检查方法");
    }
    public void browse () {
        this.check();
        this.netWork.browse();//调用真是上网操作
    }
}
public class ProxyDemo {
    public static void main(String args[]){
        NetWork netWork = new Proxy(new Real());
        netWork.browse();
    }
}
