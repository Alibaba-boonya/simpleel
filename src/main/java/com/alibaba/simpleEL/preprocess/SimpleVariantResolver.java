/**
 * Project: simple-el
 * 
 * File Created at 2010-12-2
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.simpleEL.preprocess;

/**
 * @author shaojin.wensj
 * 
 */
public class SimpleVariantResolver implements VariantResolver {
	@Override
	public String resolve(String variant) {
		return "ctx.get(\"" + variant + "\")";
	}
};
