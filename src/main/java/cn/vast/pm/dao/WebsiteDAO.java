package cn.vast.pm.dao;

import cn.vast.pm.entity.Website;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Website实体类对应DAO
 *
 * @author Lynnray
 * @version 1.0
 * @date 2019/9/23
 */
public interface WebsiteDAO {
    /**
     * 根据ID查询网站
     *
     * @param id 网站ID
     *
     * @return 对应网站，查询不到返回null
     */
    Website queryById(@Param("id") Long id);

    /**
     * 模糊查询，根据网站名称查询
     *
     * @param websiteName 网站名称
     *
     * @return 网站集合
     */
    List<Website> queryByName(@Param("websiteName") String websiteName);

    /**
     * 查询所有的网站
     *
     * @param offset 偏移值
     * @param limit  单次取的数量
     *
     * @return 区间范围的所有网站
     */
    List<Website> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 创建网站
     *
     * @param website 新的网站
     */
    void createWebsite(Website website);

    /**
     * 更新网站
     *
     * @param website 要更新的网站
     */
    void updateWebsite(Website website);

    /**
     * 删除网站
     *
     * @param id 要删除的网站 id
     */
    void deleteWebsite(@Param("id") Long id);
}
