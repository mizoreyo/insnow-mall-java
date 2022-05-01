package site.mizore.mall.dao;

import org.apache.ibatis.annotations.Param;
import site.mizore.mall.mbg.model.PmsProductCategoryAttributeRelation;

import java.util.List;

/**
 * 商品分类和属性关系自定义Dao
 */
public interface PmsProductCategoryAttributeRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}
