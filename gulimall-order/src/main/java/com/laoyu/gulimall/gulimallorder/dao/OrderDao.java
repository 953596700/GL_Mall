package com.laoyu.gulimall.gulimallorder.dao;

import com.laoyu.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author laoyu
 * @email 953596700@qq.com
 * @date 2021-12-18 19:42:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
