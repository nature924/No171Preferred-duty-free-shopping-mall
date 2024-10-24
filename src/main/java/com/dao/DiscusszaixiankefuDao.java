package com.dao;

import com.entity.DiscusszaixiankefuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszaixiankefuVO;
import com.entity.view.DiscusszaixiankefuView;


/**
 * 在线客服评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-19 00:10:09
 */
public interface DiscusszaixiankefuDao extends BaseMapper<DiscusszaixiankefuEntity> {
	
	List<DiscusszaixiankefuVO> selectListVO(@Param("ew") Wrapper<DiscusszaixiankefuEntity> wrapper);
	
	DiscusszaixiankefuVO selectVO(@Param("ew") Wrapper<DiscusszaixiankefuEntity> wrapper);
	
	List<DiscusszaixiankefuView> selectListView(@Param("ew") Wrapper<DiscusszaixiankefuEntity> wrapper);

	List<DiscusszaixiankefuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszaixiankefuEntity> wrapper);
	
	DiscusszaixiankefuView selectView(@Param("ew") Wrapper<DiscusszaixiankefuEntity> wrapper);
	
}
