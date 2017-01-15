package com.echo.mybatis.persistence;

import java.util.List;

import com.echo.mybatis.model.Key;

/**
 * 定义一个接口
 * @author tangsixiang
 *
 */
public interface KeyMapper {
	
  public  Key  getKey(int id)throws Exception;
  public  List<Key> getKeyAll()throws Exception;
  public int   addKey(Key key) throws Exception;
  public int  updateKey(Key key) throws Exception;
}
