package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFaultRecorder<M extends BaseFaultRecorder<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}
	
	public void setStationName(java.lang.String stationName) {
		set("station_name", stationName);
	}
	
	public java.lang.String getStationName() {
		return getStr("station_name");
	}
	
	public void setDeviceName(java.lang.String deviceName) {
		set("device_name", deviceName);
	}
	
	public java.lang.String getDeviceName() {
		return getStr("device_name");
	}
	
	public void setRecordTime(java.sql.Time recordTime) {
		set("record_time", recordTime);
	}
	
	public java.sql.Time getRecordTime() {
		return get("record_time");
	}
	
	public void setULevel(java.lang.String uLevel) {
		set("u_level", uLevel);
	}
	
	public java.lang.String getULevel() {
		return getStr("u_level");
	}
	
	public void setFaultDistance(java.lang.String faultDistance) {
		set("fault_distance", faultDistance);
	}
	
	public java.lang.String getFaultDistance() {
		return getStr("fault_distance");
	}
	
	public void setPhase(java.lang.String phase) {
		set("phase", phase);
	}
	
	public java.lang.String getPhase() {
		return getStr("phase");
	}
	
	public void setFileLocation(java.lang.String fileLocation) {
		set("file_location", fileLocation);
	}
	
	public java.lang.String getFileLocation() {
		return getStr("file_location");
	}
	
}

