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


package com.howbuy.adapter;
/**
 * @description:适配器模式
 * @author shen.yan
 * @date 2018年3月2日 下午2:21:08
 * @since JDK 1.6
 */
public class AdapterDemo {

	public static void main(String[] args) {
		Adapter1 a1 = new Adapter1();
		a1.use18v();
		
		System.out.println("----------");
		
		Adapter2 a2 = new Adapter2(new Current());
		a2.user18v();
	}
}

