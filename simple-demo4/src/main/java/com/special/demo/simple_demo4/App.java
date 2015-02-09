package com.special.demo.simple_demo4;

import java.io.InputStream;

import org.apache.commons.lang.StringUtils;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		InputStream is = null;
		//		is = getClass().getClassLoader().getResourceAsStream("config");
		String s = "demo";
		if (StringUtils.isBlank(s))
		{
			System.out.println("Hello World!");
		} else
		{
			System.out.println("demo!");
		}
	}
}
