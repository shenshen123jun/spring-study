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


package com.howbuy.proxy;
/**
 * @description:代理对象
 * @author shen.yan
 * @date 2018年3月2日 下午3:26:21
 * @since JDK 1.6
 */
public class ProxySubject implements Subject {
	
	
	private RealSubject realSubject;

	public void sailBook() {
		System.out.println("打折");
		realSubject.sailBook();
		System.out.println("送代金券");
	}

	public RealSubject getRealSubject() {
		return realSubject;
	}

	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
	

}

