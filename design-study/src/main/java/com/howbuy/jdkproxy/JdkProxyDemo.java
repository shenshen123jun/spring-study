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

import java.lang.reflect.Proxy;

/**
 * @description:jdk动态代理
 * @author shen.yan
 * @date 2018年3月2日 下午3:30:10
 * @since JDK 1.6
 */
public class JdkProxyDemo {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		MyHandler handler = new MyHandler();
		handler.setRealSubject(realSubject);

		Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), realSubject.getClass().getInterfaces(), handler);
		proxySubject.sailBook();
	}

}
