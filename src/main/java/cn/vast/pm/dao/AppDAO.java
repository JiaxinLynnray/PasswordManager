package cn.vast.pm.dao;

import cn.vast.pm.entity.App;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * App实体类对应DAO
 *
 * @author Lynnray
 * @version 1.0
 * @date 2019/9/23
 */
public interface AppDAO {
    /**
     * 根据ID查询APP
     *
     * @param id 用户ID
     *
     * @return 对应APP，查询不到返回null
     */
    App queryById(@Param("id") Long id);

    /**
     * 模糊查询，根据APP名称查询
     *
     * @param appName APP名称
     *
     * @return APP集合
     */
    List<App> queryByName(@Param("appName") String appName);

    /**
     * 查询所有的APP
     *
     * @param offset 偏移值
     * @param limit  单次取的数量
     *
     * @return 区间范围的所有APP
     */
    List<App> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 创建APP
     *
     * @param app 新的APP
     */
    void createApp(App app);

    /**
     * 更新APP
     *
     * @param app 要更新的APP
     */
    void updateApp(App app);

    /**
     * 删除APP
     *
     * @param id 要删除的APPid
     */
    void deleteApp(@Param("id") Long id);
}
