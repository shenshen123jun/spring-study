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

/**
 * @description:(TODO 请在此添加描述)
 * @author shen.yan
 * @date 2018年2月15日 上午11:29:33
 * @since JDK 1.6
 */
public class HelloWorld {

	private String name;

	public void setName(String name) {
		System.out.println("调用了设置属性");
		this.name = name;
	}

	public HelloWorld() {
		System.out.println("初始化构造器");
	}

	public void hello() {
		System.out.println("Hello: " + name);
	}
}
