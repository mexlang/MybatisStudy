package com.echo.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.echo.mybatis.model.Key;
import com.echo.mybatis.model.Lock;
import com.echo.mybatis.model.Student;
import com.echo.mybatis.persistence.KeyMapper;
import com.echo.mybatis.persistence.LockMapper;
import com.echo.mybatis.persistence.StudentMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class mybatisUtil {

public static SqlSessionFactory  ssFactory=null;
public  static  SqlSessionFactory getSqlSessionFactory(){
	 if(ssFactory==null){
		   String source="mybatis-config.xml";
		   try {
			   /**
			    * 获取SessionFactory工厂
			    */
			ssFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(source),"echoDevel");
		   } catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 return ssFactory;
}


@Test
public   void addKey() {
	      SqlSession sqlSession = getSqlSessionFactory().openSession();
	     KeyMapper keyMapper = sqlSession.getMapper(KeyMapper.class);
	       try {
	    	   Key  key = new Key();
	    	   key.setKeyName("-测试key值钥匙-");
   	    	 System.out.println(keyMapper.addKey(key));
   	    	 sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 sqlSession.close();	
		}
} 

@Test
public   void updateKey() {
	      SqlSession sqlSession = getSqlSessionFactory().openSession();
	     KeyMapper keyMapper = sqlSession.getMapper(KeyMapper.class);
	       try {
	    	   Key  key = new Key();
	    	   key.setId(5);
	    	   key.setKeyName("锟斤拷锟斤拷锟斤拷锟叫筹拷锟斤拷锟斤拷强锟芥本");
   	    	 System.out.println(keyMapper.updateKey(key));
   	    	 sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 sqlSession.close();	
		}
} 
@Test
public   void selectKeyById() {
	      SqlSession sqlSession = getSqlSessionFactory().openSession();
	     KeyMapper keyMapper = sqlSession.getMapper(KeyMapper.class);
	       try {
	    	   Key  key = keyMapper.getKey(3);
   	    	   System.out.println(key.getKeyName()+"\t");
   	    	   
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 sqlSession.close();	
		}
}    
@Test
public   void selectKeyAll() {
	      SqlSession sqlSession = getSqlSessionFactory().openSession();
	     KeyMapper keyMapper = sqlSession.getMapper(KeyMapper.class);
	       try {
	    	  List<Key> userlist = keyMapper.getKeyAll();
	    	//锟斤拷PageInfo锟皆斤拷锟斤拷锟斤拷邪锟阶�
	    	  for (Key key : userlist ) {
  	    	   System.out.println(key.toString());
  	    	
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 sqlSession.close();	
		}
}  
 @Test
public   void selectKeyAlForPage() {
	      SqlSession sqlSession = getSqlSessionFactory().openSession();
	     KeyMapper keyMapper = sqlSession.getMapper(KeyMapper.class);
	       try {
	    	   	PageHelper.startPage(1,2,true);
	    	   	PageHelper.orderBy(" id desc");
	    	  List<Key> userlist = keyMapper.getKeyAll();
	    	//锟斤拷PageInfo锟皆斤拷锟斤拷锟斤拷邪锟阶�
	    	  PageInfo<Key> page = new PageInfo<Key>(userlist);
	    	  System.out.println("锟杰硷拷录锟斤拷为锟斤拷"+page.getTotal()); 
	    	  System.out.println("锟斤拷锟揭灰澄拷锟�"+page.getLastPage());
	    	  for (Key key : page.getList()) {
   	    	   System.out.println(key.toString());
   	    	
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 sqlSession.close();	
		}
}    

 @Test
public   void selectLockById() {
	      SqlSession sqlSession = getSqlSessionFactory().openSession();
	    LockMapper lockMapper = sqlSession.getMapper(LockMapper.class);
	       try {
	    	  Lock lock = lockMapper.getLock(1);
   	    	   System.out.println(lock.getLockName()+"\t");
   	    	   System.out.println("-------------------------");
   	    	   System.out.println(lock.getKeyId());
   	    	   System.out.println("-------------------------");
				System.out.println(lock.getKey().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 sqlSession.close();	
		}
} 
 
 
 
 @Test
 public   void addStudent() {
 	      SqlSession sqlSession = getSqlSessionFactory().openSession();
 	     StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
 	       try {
 	            Student student=new Student();
 	           student.setName("锟斤拷业锟狡硷拷");
 	          student.setAge(6);
 	               student.setSex("-");
 	               student.setBirthday(new Date());
    	    	 System.out.println(studentMapper.addStudent(student));
    	    	 sqlSession.commit();
 		} catch (Exception e) {
 			e.printStackTrace();
 		}finally {
 			 sqlSession.close();	
 		}
 }
 
 
 
 @Test
 public   void UpdateStudent() {
 	      SqlSession sqlSession = getSqlSessionFactory().openSession();
 	     StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
 	       try {
 	            Student student=new Student();
 	           student.setName("zoneyet");
 	          student.setAge(6);
 	          student.setId(5);
 	          student.setSex("F");
 	               student.setBirthday(new Date());
    	    	 System.out.println(studentMapper.updateStudent(student));
    	    	 sqlSession.commit();
 		} catch (Exception e) {
 			e.printStackTrace();
 		}finally {
 			 sqlSession.close();	
 		}
 }
 
 
 
 @Test
 public   void addStudentTrim() {
 	      SqlSession sqlSession = getSqlSessionFactory().openSession();
 	     StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
 	       try {
 	            Student student=new Student();
 	           student.setName("echoZZ");
 	          student.setAge(23);
 	               student.setSex("F");
 	            student.setBirthday(new Date());
    	    	 System.out.println(studentMapper.addStudentTrim(student));
    	    	 sqlSession.commit();
 		} catch (Exception e) {
 			e.printStackTrace();
 		}finally {
 			 sqlSession.close();	
 		}
 }
 
 @Test
 public   void UpdateStudentTrim() {
 	      SqlSession sqlSession = getSqlSessionFactory().openSession();
 	     StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
 	       try {
 	            Student student=new Student();
 	       //   student.setName("echoT");
 	          student.setAge(26);
 	          student.setId(7);
 	          student.setSex("F");
 	           student.setBirthday(new Date());
    	    	 System.out.println(studentMapper.updateStudentTrim(student));
    	    	 sqlSession.commit();
 		} catch (Exception e) {
 			e.printStackTrace();
 		}finally {
 			 sqlSession.close();	
 		}
 }
 
 @Test
 public   void SelectStudentForEach() {
 	      SqlSession sqlSession = getSqlSessionFactory().openSession();
 	     StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
 	       try {
 	    	   List<Integer> listStu=new ArrayList<>();
 	    	  listStu.add(2);  listStu.add(5);listStu.add(7);
 	    	       List<Student>   	listS= studentMapper.selectStudentbyId(listStu) ;
 	    	      for (Student student : listS) {
					System.out.println(student.getName());
				}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}finally {
 			 sqlSession.close();	
 		}
 }
 
 
/* public static void main(String[] args) {
	 SqlSession sqlSession = getSqlSessionFactory().openSession();
     KeyMapper keyMapper = sqlSession.getMapper(KeyMapper.class);
       try {
    	  List<Key> userlist = keyMapper.getKeyAll();
    	       for (Key key : userlist) {
    	    	   System.out.println(key.toString());
				
			}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		 sqlSession.close();	
	}
}*/
}
