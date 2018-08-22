/*
import java.util.ArrayList;
import java.util.Stack;

*/
/**
 * Created by jinweih on 2018/6/21.
 *//*

public class makeOfferTest {
    //@Test
    public static void main(String args[]){
        */
/*int[][] array = new int[][]{{1,2,3},{3,4,5}};
        System.out.println(Find(7, array));*//*

    }

    */
/**
     * @see 二维数组中的查找
     * @param target
     * @param array
     * @return
     *//*

    public static boolean Find(int target, int[][] array) {
        int row = array.length;
        int cloumn = array[0].length;
        int i = row - 1;
        int j = 0;
        while (i >= 0 && j < cloumn){
            if (target == array[i][j]) {
                return true;
            }
            if (target > array[i][j]) {
                j++;
                continue;
            }
            if (target < array[i][j]) {
                i--;
                continue;
            }
        }
        return false;
    }

    */
/**
     * @see 字符串替换
     * @TODO 不是很完美
     * @param str
     * @return
     *//*

    public static String replace(StringBuffer str){
        String str2 = str.toString();
        char array[] = str2.toCharArray();
        int i = 0;
        StringBuffer out = new StringBuffer();
        for ( char elumn:array) {
            if(elumn == ' '){
                out.append("%20");
            }else{
                out.append(elumn);
            }
        }
        return out.toString();
    }

    */
/**
     * @see 输入一个链表,从尾到头打印链表每个节点的值。
     * @see 利用栈来实现
     * @param listNode
     * @return
     *//*

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ListNode t = listNode;
        while (t != null){
            stack.push(t.val);
            t = t.next;
        }
        while(!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    */
/**
     * @see 给出前序遍历和中序遍历,前序遍历和中序遍历不含重复数字,重建二叉树
     * @param pre
     * @param in
     * @return
     *//*

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {

    }
}

*/
