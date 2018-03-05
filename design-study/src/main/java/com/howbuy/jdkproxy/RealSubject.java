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
/**
 * @description:真是角色类
 * @author shen.yan
 * @date 2018年3月2日 下午3:25:32
 * @since JDK 1.6
 */
public class RealSubject implements Subject {

	public void sailBook() {
		
		System.out.println("卖书");
	}

}

