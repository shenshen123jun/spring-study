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

package com.howbuy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:(TODO 请在此添加描述)
 * @author shen.yan
 * @date 2018年3月2日 下午3:31:00
 * @since JDK 1.6
 */
public class MyHandler implements InvocationHandler {

	private RealSubject realSubject;

	public RealSubject getRealSubject() {
		return realSubject;
	}

	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object result = null;
		dazhe();
		result = method.invoke(realSubject, args);
		give();
		return result;

	}

	// 打折
	public void dazhe() {
		System.out.println("打折");
	}

	// 赠送代金券
	public void give() {
		System.out.println("赠送代金券");
	}

}
