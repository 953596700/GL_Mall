package com.laoyu.gulimall.gulimallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laoyu.gulimall.gulimallproduct.entity.BrandEntity;
import com.laoyu.gulimall.gulimallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        //修改
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(6L);
//        brandEntity.setDescript("这是华为手机");
//        brandService.updateById(brandEntity);
//        System.out.println("设置描述成功");

        //查询
        List<BrandEntity> res_list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 6L));
        res_list.forEach((item)->
                System.out.println(item));
    }

}
