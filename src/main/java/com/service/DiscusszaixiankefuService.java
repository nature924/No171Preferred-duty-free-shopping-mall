package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszaixiankefuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszaixiankefuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszaixiankefuView;


/**
 * 在线客服评论表
 *
 * @author 
 * @email 
 * @date 2021-03-19 00:10:09
 */
public interface DiscusszaixiankefuService extends IService<DiscusszaixiankefuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszaixiankefuVO> selectListVO(Wrapper<DiscusszaixiankefuEntity> wrapper);
   	
   	DiscusszaixiankefuVO selectVO(@Param("ew") Wrapper<DiscusszaixiankefuEntity> wrapper);
   	
   	List<DiscusszaixiankefuView> selectListView(Wrapper<DiscusszaixiankefuEntity> wrapper);
   	
   	DiscusszaixiankefuView selectView(@Param("ew") Wrapper<DiscusszaixiankefuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszaixiankefuEntity> wrapper);
   	
}

