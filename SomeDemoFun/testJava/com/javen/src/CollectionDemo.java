/**
 * Created by jinweih on 2018/8/23.
 *
 */

import java.util.LinkedList;
import java.util.List;

/**
 * Collection接口的定义
 * public interface Collection<E> extends Iterable<E>
 */
public interface Collection<E> extends Iterable<E>

/**
 * Collection接口的方法定义
 */
public boolean add (E o) //向集合中插入对象
public boolean addAll (Collection<? extends E> c) //将一个集合的内容插入进来
public void clear() //清楚此集合中的所有元素
public class CollectionDemo {
    List<String> list = new LinkedList<String>();
    Object
}
