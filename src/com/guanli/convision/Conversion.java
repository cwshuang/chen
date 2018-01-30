package com.guanli.convision;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class Conversion implements Converter<String,Date>{

	@Override
	public Date convert(String dateString) {
		// TODO Auto-generated method stub
		try {
			if (dateString!=null) {//
				DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm");
				return df.parse(dateString);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

}
