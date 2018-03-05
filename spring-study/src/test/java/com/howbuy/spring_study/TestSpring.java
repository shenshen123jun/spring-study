/**
 *Copyright (c) 2018, ShangHai HOWBUY INVESTMENT MANAGEMENT Co., Ltd.
 *All right reserved.
 *
 *THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF HOWBUY INVESTMENT
 *MANAGEMENT CO., LTD.  THE CONTENTS OF THIS FILE MAY NOT BE DISCLOSED
 *TO THIRD PARTIES, COPIED OR DUPLICATED IN ANY FORM, IN WHOLE OR IN PART,
 *WITHOUT THE PRIOR WRITTEN PERMISSION OF HOWBUY INVESTMENT MANAGEMENT
 * CO., LTD.
 */

package com.howbuy.spring_study;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shen.yan
 * @date 2018年2月15日 上午11:30:34
 * @since JDK 1.6
 */
public class TestSpring {

	@Test
	public void test01() {
		// 1、创建Spring的IOC容器的对象
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2、从IOC的容器中获取Bean的实例
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");
		// 3、调用hello方法
		helloWorld.hello();

		ctx.close();
	}
}
