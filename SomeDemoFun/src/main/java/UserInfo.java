import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jinweih on 2018/6/9.
 */
public interface UserInfo {
    public List<User> findUserByUserName(@Param("value") String name);
}
