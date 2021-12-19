package com.laoyu.gulimall.gulimallproduct.dao;

import com.laoyu.gulimall.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author laoyu
 * @email 953596700@qq.com
 * @date 2021-12-18 19:58:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
