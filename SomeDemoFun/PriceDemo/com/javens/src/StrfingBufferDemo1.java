/**
 * Created by jinweih on 2018/8/19.
 */
public class StrfingBufferDemo1 {
    public static void main (String args[]) {
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            sf.append(c);
        }
        System.out.println(sf);
        sf.reverse();
        System.out.println(sf);
    }
}
