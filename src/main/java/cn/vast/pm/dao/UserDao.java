package cn.vast.pm.dao;

import cn.vast.pm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : Lynnray
 * @date: 2019/9/23 00:15
 * @description:
 */
public interface UserDao {
    /**
     * 根据ID查询用户
     *
     * @param id 用户ID
     * @return 对应用户，查询不到返回null
     */
    User queryById(@Param("id") long id);

    /**
     * 查询所有的用户
     *
     * @param offset 偏移值
     * @param limit  单次取的数量
     * @return 区间范围的所有用户
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
