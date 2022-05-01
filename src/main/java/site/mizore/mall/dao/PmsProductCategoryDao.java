package site.mizore.mall.dao;

import site.mizore.mall.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

public interface PmsProductCategoryDao {

    List<PmsProductCategoryWithChildrenItem> listWithChildren();

}
