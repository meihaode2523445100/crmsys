package com.qfedu.util;


import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkFactory {

	public static Workbook createWorkbook(boolean flag,InputStream inputStream) throws Exception {
		if (flag == true) {
			return new HSSFWorkbook(inputStream);
		}else {
			return new XSSFWorkbook(inputStream);
		}
	}
	
}
