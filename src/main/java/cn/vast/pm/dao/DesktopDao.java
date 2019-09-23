package cn.vast.pm.dao;

import cn.vast.pm.entity.Desktop;
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
public interface DesktopDao {
    /**
     * 根据ID查询应用程序
     *
     * @param id 用户ID
     * @return 对应应用程序，查询不到返回null
     */
    Desktop queryById(@Param("id")long id);

    /**
     * 查询所有的应用程序
     *
     * @param offset 偏移值
     * @param limit  单次取的数量
     * @return 区间范围的所有应用程序
     */
    List<Desktop> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
