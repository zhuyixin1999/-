package com.zyx.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.common.utils.PageUtils;
import com.zyx.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhuyixin
 * @email 982175121@qq.com
 * @date 2021-10-27 15:08:52
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

