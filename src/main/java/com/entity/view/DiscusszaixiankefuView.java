package com.entity.view;

import com.entity.DiscusszaixiankefuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线客服评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 00:10:09
 */
@TableName("discusszaixiankefu")
public class DiscusszaixiankefuView  extends DiscusszaixiankefuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszaixiankefuView(){
	}
 
 	public DiscusszaixiankefuView(DiscusszaixiankefuEntity discusszaixiankefuEntity){
 	try {
			BeanUtils.copyProperties(this, discusszaixiankefuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
