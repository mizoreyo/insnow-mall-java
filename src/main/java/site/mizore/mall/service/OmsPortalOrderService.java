package site.mizore.mall.service;

import org.springframework.transaction.annotation.Transactional;
import site.mizore.mall.common.api.CommonResult;
import site.mizore.mall.dto.OrderParam;

/**
 * 前台订单管理Service
 */
public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
