package cn.vast.pm.dao;

import cn.vast.pm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User实体类对应DAO
 *
 * @author Lynnray
 * @version 1.0
 * @date 2019/9/25 21:30
 */
public interface UserDAO {
    /**
     * 根据登录信息获取用户
     *
     * @param username 用户名
     * @param password 密码
     *
     * @return 对应用户，查询不到返回null
     */
    User getUser(String username, String password);

    /**
     * 根据ID查询用户
     *
     * @param id 用户ID
     *
     * @return 对应用户，查询不到返回null
     */
    User queryById(@Param("id") Long id);

    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     *
     * @return 对应用户，查询不到返回null
     */
    List<User> queryByName(@Param("username") String username);

    /**
     * 查询所有的用户
     *
     * @param offset 偏移值
     * @param limit  单次取的数量
     *
     * @return 区间范围的所有用户
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 创建新用户
     *
     * @param user 新用户
     */
    void createUser(User user);

    /**
     * 更新用户
     *
     * @param user 用户
     */
    void updateUser(User user);

    /**
     * 删除指定用户
     *
     * @param id 要删除的用户ID
     */
    void deleteUser(@Param("id") Long id);
}
