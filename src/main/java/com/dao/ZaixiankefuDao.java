package com.dao;

import com.entity.ZaixiankefuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixiankefuVO;
import com.entity.view.ZaixiankefuView;


/**
 * 在线客服
 * 
 * @author 
 * @email 
 * @date 2021-03-19 00:10:08
 */
public interface ZaixiankefuDao extends BaseMapper<ZaixiankefuEntity> {
	
	List<ZaixiankefuVO> selectListVO(@Param("ew") Wrapper<ZaixiankefuEntity> wrapper);
	
	ZaixiankefuVO selectVO(@Param("ew") Wrapper<ZaixiankefuEntity> wrapper);
	
	List<ZaixiankefuView> selectListView(@Param("ew") Wrapper<ZaixiankefuEntity> wrapper);

	List<ZaixiankefuView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixiankefuEntity> wrapper);
	
	ZaixiankefuView selectView(@Param("ew") Wrapper<ZaixiankefuEntity> wrapper);
	
}
