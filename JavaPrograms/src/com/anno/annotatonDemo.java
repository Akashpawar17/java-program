package com.anno;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//marker interface ->doesn't have any value inside it known as marker interface
//single value annotation
//multi value annotation
//meta annotation
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
	String os() default "jelly";
	int version() default 6;
	
}

@SmartPhone(os="Android", version=10) 
class onePlus{
	String name;
	int id;
	public onePlus(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}

public class annotatonDemo {
	
	

	public static void main(String[] args) {
		
		
		onePlus one = new onePlus("camers", 2);
		Class a =one.getClass();
		
		Annotation an = a.getAnnotation(SmartPhone.class);
		
		
		
		SmartPhone s = (SmartPhone) an;
		
		System.out.println(s.os());
		
	}
	
	

}
