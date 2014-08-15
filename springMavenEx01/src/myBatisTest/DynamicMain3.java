package myBatisTest;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class DynamicMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
		SqlMapClient sqlmapclient = null;
		MybatisTable mybatistable = null;
		List<MybatisTable> list = null;
		
		try {
			reader = Resources.getResourceAsReader("sqlMapConfig.xml");
			sqlmapclient = SqlMapClientBuilder.buildSqlMapClient(reader);
			
			mybatistable = new MybatisTable();
			mybatistable.setName("조용근");
			mybatistable.setAge(27);
			
			list = sqlmapclient.queryForList("findMyBatisIsPropertyAvailable", mybatistable);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
