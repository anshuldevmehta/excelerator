/*
 * code  
 */
package com.excelservice.excelerator.excel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Anshul D Mehta
 * @author Anshul D Mehta 
 * 
 *         set <b>name</b> of column like <code>@Column(name = "abcd")</code> or
 *         <b>index</b> of column like <code>@Column(index = 0)</code> based on
 *         requirement. <b>Be careful, order of name is higher than
 *         index.</b>
 */
@Target(ElementType.FIELD)
@Retention(RUNTIME)
public @interface Column {

	String name() default "";

	int index() default 0;

	String pattern() default "";

}
