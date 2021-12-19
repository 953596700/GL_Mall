package com.laoyu.gulimall.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laoyu.common.utils.PageUtils;
import com.laoyu.gulimall.gulimallproduct.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author laoyu
 * @email 953596700@qq.com
 * @date 2021-12-18 19:58:13
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

