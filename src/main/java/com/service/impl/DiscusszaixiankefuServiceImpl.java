package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusszaixiankefuDao;
import com.entity.DiscusszaixiankefuEntity;
import com.service.DiscusszaixiankefuService;
import com.entity.vo.DiscusszaixiankefuVO;
import com.entity.view.DiscusszaixiankefuView;

@Service("discusszaixiankefuService")
public class DiscusszaixiankefuServiceImpl extends ServiceImpl<DiscusszaixiankefuDao, DiscusszaixiankefuEntity> implements DiscusszaixiankefuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszaixiankefuEntity> page = this.selectPage(
                new Query<DiscusszaixiankefuEntity>(params).getPage(),
                new EntityWrapper<DiscusszaixiankefuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszaixiankefuEntity> wrapper) {
		  Page<DiscusszaixiankefuView> page =new Query<DiscusszaixiankefuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszaixiankefuVO> selectListVO(Wrapper<DiscusszaixiankefuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszaixiankefuVO selectVO(Wrapper<DiscusszaixiankefuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszaixiankefuView> selectListView(Wrapper<DiscusszaixiankefuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszaixiankefuView selectView(Wrapper<DiscusszaixiankefuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
