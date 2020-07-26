package com.cruds.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.cruds.anno.myanno;
import com.demo.Cat;
import com.demo.Demoanno;

public class Testannodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demoanno obj=new Demoanno();
		/*Cat cat =new Cat();
		Class c=cat.getClass();
		System.out.println(c.getName());
		Method[] methods =c.getMethods();
		for(Method m:methods)
		{
			System.out.println(m.getName());
		}*/
		
		Class c=obj.getClass();
		try{
			Method m=c.getMethod("test", null);
			Annotation[] annos=m.getAnnotations();
			for(Annotation a:annos)
			{
				System.out.println(((myanno)a).name());
				System.out.println(((myanno)a).version());

			}
		}

		catch(NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		catch(SecurityException e)
		{
			e.printStackTrace();
		}
	}

}
