package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMainStation<M extends BaseMainStation<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}
	
	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}
	
	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}
	
	public void setShortName(java.lang.String shortName) {
		set("short_name", shortName);
	}
	
	public java.lang.String getShortName() {
		return getStr("short_name");
	}
	
	public void setDesc(java.lang.String desc) {
		set("desc", desc);
	}
	
	public java.lang.String getDesc() {
		return getStr("desc");
	}
	
}

