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


import com.dao.ZaixiankefuDao;
import com.entity.ZaixiankefuEntity;
import com.service.ZaixiankefuService;
import com.entity.vo.ZaixiankefuVO;
import com.entity.view.ZaixiankefuView;

@Service("zaixiankefuService")
public class ZaixiankefuServiceImpl extends ServiceImpl<ZaixiankefuDao, ZaixiankefuEntity> implements ZaixiankefuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixiankefuEntity> page = this.selectPage(
                new Query<ZaixiankefuEntity>(params).getPage(),
                new EntityWrapper<ZaixiankefuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixiankefuEntity> wrapper) {
		  Page<ZaixiankefuView> page =new Query<ZaixiankefuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixiankefuVO> selectListVO(Wrapper<ZaixiankefuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixiankefuVO selectVO(Wrapper<ZaixiankefuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixiankefuView> selectListView(Wrapper<ZaixiankefuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixiankefuView selectView(Wrapper<ZaixiankefuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
