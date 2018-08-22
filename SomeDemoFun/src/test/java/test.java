import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by jinweih on 2018/6/3.
 */
public class test {
    @Test
    /**
     * 查询单个user对象
     */
    public void test1() throws IOException {
        // 核心配置文件
        String resource = "config/SqlMapConfig.xml";
        // 通过流将核心配置文件加载进来
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 通过配置文件创建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 通过会话工厂获取会话
        SqlSession openSession = factory.openSession();
        // 通过会话执行sql 第一个参数是名称空间+SqlID 第二个参数表示sql执行需要的参数
        User user = openSession.selectOne("UserInfo.findUserById", 1);
        if (user != null) {
            System.out.println(user.toString());
        }

        // 关闭会话
        openSession.close();
    }

    /**
     * 通过username进行模糊查询
     * @throws IOException
     */
    @Test
    public void test2() throws IOException {
        // 核心配置文件
        String resource = "config/SqlMapConfig.xml";
        // 通过流将核心配置文件加载进来
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 通过配置文件创建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 通过会话工厂获取会话
        //factory.getConfiguration().addMapper(UserInfo.class);
        SqlSession openSession = factory.openSession();
        UserInfo userInfo = openSession.getMapper(UserInfo.class);
        // 调用User.xml中的魔化查询方法 返回集合
        List<User> selectList = userInfo.findUserByUserName("靳");
        // 循环结果
        System.out.println(selectList.size());
        for (User user : selectList) {
            System.out.println(user.toString());
        }
        // 关闭会话
        openSession.close();
    }

}