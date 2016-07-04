package cn.com.hs.one.mapper;

import java.util.List;

import cn.com.hs.one.model.DcAccount;

public interface DcAccountMapper {

	/**
	 * 按主键进行查询，返回唯一一条记录
	 * <p>
	 * 
	 * @param String
	 *            accountId
	 * @return DcAccount
	 */
	public DcAccount findOne(String accountId);

	/**
	 * 按业务主键进行查询，返回唯一一条记录
	 * <p>
	 * 
	 * @param String
	 *            email
	 * @return DcAccount
	 */
	public DcAccount findDcAccountByEmail(String email);

	/**
	 * 按UserId主键进行查询，返回唯一一条记录
	 * <p>
	 * 
	 * @param String
	 *            userid
	 * @return DcAccount
	 */
	public DcAccount findDcAccountByUserId(String userid);

	/**
	 * 按account主键进行查询，返回唯一一条记录
	 * <p>
	 * 
	 * @param String
	 *            userid
	 * @return DcAccount
	 */
	public DcAccount findDcAccountByAccount(String account);

	/**
	 * 按mobile主键进行查询，返回唯一一条记录
	 * <p>
	 * 
	 * @param String
	 *            mobile
	 * @return DcAccount
	 */
	public DcAccount findDcAccountByCelphone(String celphone);

	/**
	 * 按业务主键进行查询，返回唯一一条记录
	 * <p>
	 * 
	 * @param String
	 *            openId
	 * @return DcAccount
	 */
	public DcAccount findDcAccountByOpenId(String openId);

	/**
	 * 获取新的用户序列ID
	 * 
	 * <p>
	 * 
	 * @return userId
	 */
	public String getSeqUserId();

	/**
	 * 无条件检索，返回实体集合
	 * <p>
	 * 
	 * @return List<DcAccount>
	 */
	public List<DcAccount> findAll();

	/**
	 * 插入一条新纪录，正确插入时返回值为 1
	 * <p>
	 * 
	 * @param DcAccount
	 *            dcAccount
	 * @return 插入成功标志
	 */
	public int insert(DcAccount dcAccount);

	/**
	 * 按主键进行动态更新，对Input数据对需要更新的字段进行设值
	 * <p>
	 * 
	 * @param DcAccount
	 *            dcAccount
	 * @return 更新成功标志
	 */
	public int dynamicUpdate(DcAccount dcAccount);

	/**
	 * 按主键进行更新，根据实体的实际属性值进行更新
	 * <p>
	 * 
	 * @param DcAccount
	 *            dcAccount
	 * @return 更新成功标志
	 */
	public int update(DcAccount dcAccount);

	/**
	 * 按主键把记录的删除flag设置为true，进行假删除
	 * <p>
	 * 
	 * @param accountId
	 * @return 假删除成功标志
	 */
	public int suspend(String accountId);

	/**
	 * 按主键进行删除，删除成功返回 1
	 * <p>
	 * 
	 * @param accountId
	 * @return 删除成功标志
	 */
	public int delete(String accountId);

}
