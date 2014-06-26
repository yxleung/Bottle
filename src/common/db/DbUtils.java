package common.db;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
/**
 * 
 * @Description 数据库操作具体实现类
 * @author liangyx
 * @date 2013-6-29
 * @version V1.0
 */
public class DbUtils extends DbBase{
	public static DbUtils dbUtils=null;
	
	static {
		dbUtils=new DbUtils();
		dbUtils.setQueryRunner();
	}
	@Override
	protected void setQueryRunner(){
		// TODO Auto-generated method stub
		this.runner=new QueryRunner(C3P0Utils.getDataSource());
	}

	@Override
	protected Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return C3P0Utils.getConnection();
	}

	@Override
	protected void closeConnection(Connection conn) {
		// TODO Auto-generated method stub
		C3P0Utils.closeConnection();
	}

}
