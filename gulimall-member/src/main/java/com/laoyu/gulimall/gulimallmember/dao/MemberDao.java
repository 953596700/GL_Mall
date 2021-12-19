package com.laoyu.gulimall.gulimallmember.dao;

import com.laoyu.gulimall.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author laoyu
 * @email 953596700@qq.com
 * @date 2021-12-18 20:02:38
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
