/**
 * 
 */
package com.zj.frypan.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.zj.framework.core.config.GlobalSettings;
import org.zj.framework.core.entity.AccessoryEntity;

/**
 * @Description 业务客户实体类
 * @author zj
 * @Date 2014年10月24日
 *	
 */
@Entity
@Table(name="B_FRYPAN_CUS",uniqueConstraints={@UniqueConstraint(columnNames={"EMAIL","MPHONE"})},schema=GlobalSettings.MYSQL_DB_SCHEMA)
public class CustomerEntity extends AccessoryEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1035695905435997322L;

	private Long cusId;

	private Integer version;

	/**
	 * 电子邮箱
	 */
	private String email;

	/**
	 * 联系电话
	 */
	private String mphone;

	/**
	 * 客户名称
	 */
	private String name;

	/**
	 * 客户下单次数
	 */
	private Integer orderCount;

	/**
	 * 客户历史订单
	 */
	private List<OrderEntity> orders;

	/**
	 * @Function
	 * @return
	 * @author zj
	 * @Date 2014年10月24日
	 */
	@Override
	@Transient
	public Serializable getId(){
		// TODO Auto-generated method stub
		return cusId;
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
	public Long getCusId(){
		return this.cusId;
	}

	public void setCusId(Long cusId){
		this.cusId = cusId;
	}

	@Column(name="EMAIL")
	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	@Column(name="MPHONE")
	public String getMphone(){
		return this.mphone;
	}

	public void setMphone(String mphone){
		this.mphone = mphone;
	}

	@Column(name="NAME")
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	@Column(name="ORDER_COUNT")
	public Integer getOrderCount(){
		return this.orderCount;
	}

	public void setOrderCount(Integer orderCount){
		this.orderCount = orderCount;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="cusId")
	public List<OrderEntity> getOrders(){
		return this.orders;
	}

	public void setOrders(List<OrderEntity> orders){
		this.orders = orders;
	}
}
