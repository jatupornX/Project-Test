package Action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TbCustomerData {
		DBcon agent = new DBcon();
		Connection conn = null;
		PreparedStatement Pstmt = null;
		Statement Stmt = null;
		ResultSet rs = null;
		
	public void insertCustomer(CustomerModel cusModel) throws IOException, Exception {
		
		String SQL = " Insert into customer(csid,csname,csaddr) "
				+ "Values ('"+cusModel.getCsid()+"','"+cusModel.getCsname()+"','"+cusModel.getCsaddr()+"') ";
		
		conn = agent.getConnectMYSql();
		Pstmt = conn.prepareStatement(SQL);
		Pstmt.executeUpdate();
		if(!Pstmt.isClosed()) Pstmt.close();
		if(!conn.isClosed()) conn.close();
		
	}
		
}
