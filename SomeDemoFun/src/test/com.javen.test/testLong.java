import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Created by jinweih on 2018/7/3.
 */
public class testLong {
    @Test
    public void test(){
        Long sleep = 1000L;
        String staticParam = "200s";
        try {
            sleep = Long.parseLong(staticParam) * 1000L;
        }catch(NumberFormatException e){
            System.out.println("ERROR -->> " + e);
        }
    }
}
