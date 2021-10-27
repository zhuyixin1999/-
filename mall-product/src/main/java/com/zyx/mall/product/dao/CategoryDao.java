package com.zyx.mall.product.dao;

import com.zyx.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhuyixin
 * @email 982175121@qq.com
 * @date 2021-10-26 22:06:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
