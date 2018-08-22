import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinweih on 2018/8/21.
 */
public class MapDemo {
    public static void main(String args[]) {
        Map<String, String> mapc = new HashMap<String, String>();
        mapc.put("SZSBANK", "00000001");
        mapc.put("DWBANK", "00000002");
        mapc.put("LXBANK", "00000003");
        mapc.put("JJBANK", "00000004");
        mapc.put("NCBANK", "00000005");
        mapc.put("FXBANK", "00000006");
        mapc.put("BHBANK", "00000007");
        mapc.put("ZZBANK", "00000008");

        String company = "SZSBANK";
        String branch = mapc.get(company);
        System.out.println(branch);
    }
}
