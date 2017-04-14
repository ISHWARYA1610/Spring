package org.crescent;

import org.crescent.dao.JdbcDaoImpl;
import org.crescent.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		//Circle circle=new JdbcDaoImpl().getCircle(1);
		try{
		//Circle circle=dao.getCircle(1);
		//System.out.println(circle.getName());
			
			//System.out.println(dao.getCircleCount());   
			
			//System.out.println(dao.getCircleName(1));
			
			
			//getting circle object
			System.out.println(dao.getCircleforId(1).getName());
			
			//dao.insertCircle(new Circle(2,"Second circle"));
			// get all circles
			//System.out.println(dao.getAllCircles().size());
			
			
			//dao.createTriangleTable();
			
		}catch(Exception obj){
			System.out.println(obj.getMessage());
		}
		
		
	}

}
