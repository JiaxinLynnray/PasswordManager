package cn.vast.pm.dao;

import cn.vast.pm.entity.Desktop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desktop实体类对应DAO
 *
 * @author Lynnray
 * @version 1.0
 * @date 2019/9/23
 */
public interface DesktopDAO {
    /**
     * 根据ID查询应用程序
     *
     * @param id Desktop ID
     *
     * @return 对应应用程序，查询不到返回null
     */
    Desktop queryById(@Param("id") long id);

    /**
     * 模糊查询，根据Desktop名称查询
     *
     * @param desktopName Desktop名称
     *
     * @return APP集合
     */
    List<Desktop> queryByName(@Param("desktopName") String desktopName);

    /**
     * 查询所有的应用程序
     *
     * @param offset 偏移值
     * @param limit  单次取的数量
     *
     * @return 区间范围的所有应用程序
     */
    List<Desktop> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 创建Desktop
     *
     * @param desktop 新的Desktop
     */
    void createDesktop(Desktop desktop);

    /**
     * 更新Desktop
     *
     * @param desktop 要更新的Desktop
     */
    void updateDesktop(Desktop desktop);

    /**
     * 删除Desktop
     *
     * @param id 要删除的Desktop id
     */
    void deleteDesktop(@Param("id") Long id);
}
