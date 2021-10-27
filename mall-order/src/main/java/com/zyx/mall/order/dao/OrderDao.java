package com.zyx.mall.order.dao;

import com.zyx.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhuyixin
 * @email 982175121@qq.com
 * @date 2021-10-27 15:46:00
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
