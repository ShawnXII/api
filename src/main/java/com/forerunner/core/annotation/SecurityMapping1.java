package com.forerunner.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * uri资源
 * @author admin
 *
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SecurityMapping1 {
	/**
	 * 资源名称
	 * @return
	 */
	String name() default "";
	/**
	 * 资源值 URI
	 * @return
	 */
	String value();
	/**
	 * 资源类别
	 * user system all
	 * @return
	 */
	SecurityType1 type() default SecurityType1.USER;
	/**
	 * 说明
	 * @return
	 */
	String info() default "";
	
	
}
