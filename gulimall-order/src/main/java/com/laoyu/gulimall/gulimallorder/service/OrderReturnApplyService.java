package com.laoyu.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laoyu.common.utils.PageUtils;
import com.laoyu.gulimall.gulimallorder.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author laoyu
 * @email 953596700@qq.com
 * @date 2021-12-18 19:42:44
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

