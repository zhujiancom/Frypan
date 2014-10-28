/**
 * 
 */
package com.zj.frypan.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.zj.framework.core.config.GlobalSettings;
import org.zj.framework.core.entity.AccessoryEntity;

import com.zj.frypan.enums.FryPanTypes;

/**
 * @Description 业务订单类
 * @author zj
 * @Date 2014年10月24日
 *	
 */

@Entity
@Table(name="B_FRYPAN_ORDER",schema=GlobalSettings.MYSQL_DB_SCHEMA)
public class OrderEntity extends AccessoryEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -36987807480632995L;

	private Long oId;

	private Integer version;

	/**
	 * 送餐地址
	 */
	private String address;

	/**
	 * 订单状态
	 */
	private FryPanTypes.OrderStatus status;

	/**
	 * 下单时间
	 */
	private Date orderTime;

	/**
	 * 送达时间
	 */
	private Date arriveTime;

	/**
	 * 联系电话
	 */
	private String mphone;

	/**
	 * 下单人姓名
	 */
	private String bookingMan;

	/**
	 * @Function
	 * @return
	 * @author zj
	 * @Date 2014年10月24日
	 */
	@Override
	public Serializable getId(){
		// TODO Auto-generated method stub
		return oId;
	}

	/**
	 * @Function
	 * @return
	 * @author zj
	 * @Date 2014年10月24日
	 */
	@Override
	@Version
	public Integer getVersion(){
		return this.version;
	}

	/**
	 * @Function
	 * @param version
	 * @author zj
	 * @Date 2014年10月24日
	 */
	@Override
	public void setVersion(Integer version){
		this.version = version;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // MYSQL ID generator
	@Column(name="ID", nullable=false,updatable=false)
	public Long getoId(){
		return this.oId;
	}

	public void setoId(Long oId){
		this.oId = oId;
	}

	@Column(name="ADDRESS")
	public String getAddress(){
		return this.address;
	}

	public void setAddress(String address){
		this.address = address;
	}

	@Enumerated(EnumType.STRING)
	@Column(name="ORDER_STATUS")
	public FryPanTypes.OrderStatus getStatus(){
		return this.status;
	}

	public void setStatus(FryPanTypes.OrderStatus status){
		this.status = status;
	}

	@Column(name="ORDER_TIME")
	public Date getOrderTime(){
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime){
		this.orderTime = orderTime;
	}

	@Column(name="ARRIVE_TIME")
	public Date getArriveTime(){
		return this.arriveTime;
	}

	public void setArriveTime(Date arriveTime){
		this.arriveTime = arriveTime;
	}

	@Column(name="MPHONE")
	public String getMphone(){
		return this.mphone;
	}

	public void setMphone(String mphone){
		this.mphone = mphone;
	}

	@Column(name="BOOKINGMAN")
	public String getBookingMan(){
		return this.bookingMan;
	}

	public void setBookingMan(String bookingMan){
		this.bookingMan = bookingMan;
	}
}
