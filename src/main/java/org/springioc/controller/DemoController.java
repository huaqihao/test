package org.springioc.controller;

import java.io.IOException;

import org.springioc.service.DemoService;
import org.springioc.type.GZSArchivesLog;
import org.springioc.type.GZSAutowired;
import org.springioc.type.GZSController;
import org.springioc.type.GZSRequestMapping;


@GZSRequestMapping("demo")
@GZSController
public class DemoController {

	@GZSAutowired
	private DemoService demoService;

	@GZSRequestMapping(value = "go")
	@GZSArchivesLog(operationType="请求",operationName="员工薪资页面")
	public void selectaccountinguserJSP() throws IOException{
		
	}
}
