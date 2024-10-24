package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixiankefuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixiankefuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixiankefuView;


/**
 * 在线客服
 *
 * @author 
 * @email 
 * @date 2021-03-19 00:10:08
 */
public interface ZaixiankefuService extends IService<ZaixiankefuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixiankefuVO> selectListVO(Wrapper<ZaixiankefuEntity> wrapper);
   	
   	ZaixiankefuVO selectVO(@Param("ew") Wrapper<ZaixiankefuEntity> wrapper);
   	
   	List<ZaixiankefuView> selectListView(Wrapper<ZaixiankefuEntity> wrapper);
   	
   	ZaixiankefuView selectView(@Param("ew") Wrapper<ZaixiankefuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixiankefuEntity> wrapper);
   	
}

