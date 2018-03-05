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
 * @description:适配器2 
 * @author shen.yan
 * @date 2018年3月2日 下午2:45:55
 * @since JDK 1.6
 */
public class Adapter2 {

	private Current current;
	
	public Adapter2(Current current){
		this.current = current;
	}
	
	
	public void user18v(){
		System.out.println("使用适配器");
		this.current.use220V();
	}
}

