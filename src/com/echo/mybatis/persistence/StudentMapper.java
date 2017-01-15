package com.echo.mybatis.persistence;

import java.util.List;

import com.echo.mybatis.model.Student;

/**
 * 定义一个接口
 * @author tangsixiang
 *
 */
public interface StudentMapper {
	
  public  Student  getStudent(int id)throws Exception;
  public  List<Student> getStudentAll()throws Exception;
  public int   addStudent(Student student) throws Exception;
  public int   addStudentTrim(Student student) throws Exception;
  public int  updateStudent(Student student) throws Exception;
  public int  updateStudentTrim(Student student) throws Exception;
   public  List<Student>  selectStudentbyId(List<Integer> list) throws Exception; 
   
}
