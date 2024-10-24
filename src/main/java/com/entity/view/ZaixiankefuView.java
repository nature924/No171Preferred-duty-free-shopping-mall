package com.entity.view;

import com.entity.ZaixiankefuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线客服
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 00:10:08
 */
@TableName("zaixiankefu")
public class ZaixiankefuView  extends ZaixiankefuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixiankefuView(){
	}
 
 	public ZaixiankefuView(ZaixiankefuEntity zaixiankefuEntity){
 	try {
			BeanUtils.copyProperties(this, zaixiankefuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
