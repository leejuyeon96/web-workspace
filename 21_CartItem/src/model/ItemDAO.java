package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ServerInfo;

public class ItemDAO implements ItemDAOTemplate{

	private static ItemDAO dao = new ItemDAO();
	
	private ItemDAO() {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
		}
	}
	public static ItemDAO getInstance() {
		return dao;
	}
	
	public static void main(String[]args) {
		ItemDAO dao = new ItemDAO();
		
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL, Server)
		return conn;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		conn.close();
		
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps, conn);
		
	}

	@Override
	public ArrayList<Item> getAllItem() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item getItem(int itemId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRecordCount(int itemId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
