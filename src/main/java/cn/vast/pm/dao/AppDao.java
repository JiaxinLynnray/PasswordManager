package cn.vast.pm.dao;

import cn.vast.pm.entity.App;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>Description: </p>
 * <p>Company: www.vast.cn</p>
 *
 * @author Lynnray
 * @version 1.0
 * @date 2019/9/23
 */
public interface AppDao {
    /**
     * 根据ID查询APP
     *
     * @param id 用户ID
     * @return 对应APP，查询不到返回null
     */
    App queryById(@Param("id")long id);

    /**
     * 查询所有的APP
     *
     * @param offset 偏移值
     * @param limit  单次取的数量
     * @return 区间范围的所有APP
     */
    List<App> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
