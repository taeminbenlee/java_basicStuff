package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


import cls.printAllClass;

import db.DBClose;
import db.DBConnection;
import dto.accountDto;






// Singleton 
public class AccountDao {	// DB와 대화하는 클래스
		private static AccountDao dao = null;
		
		private AccountDao() {
			DBConnection.initConnection();
		}
		
		public static AccountDao getInstance() {
			if(dao==null) {
				dao = new AccountDao();
			}
			return dao;
		}
		Scanner sc = new Scanner (System.in);
		
		
		
		//===================================================================================================================//
		
		
		public boolean insert(accountDto dto) {
			String sql = " INSERT INTO AccountBook(dateTime, title, classify, money, memo) "
					+ " Values( Sysdate, ?, ?, ?, ?)";
			System.out.println(sql);
			
			Connection conn = DBConnection.getConnection();
	        PreparedStatement psmt = null;
	       int count = 0;
			
			
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, dto.gettitle());
				psmt.setString(2, dto.getClassify());
				psmt.setInt(3, dto.getMoney());
				psmt.setString(4, dto.getMemo());
				
				count = psmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count>0?true:false;
		
			
	}
		public boolean delete(String title) {
			String sql = " DELETE FROM AccountBook WHERE title = '" + title + "'";
			System.out.println(sql);
			
			Connection conn = DBConnection.getConnection();
			Statement stmt = null;
			//리턴값이 불린 이여도 변수는 있어야한다..
			int count = 0;
			
			try {
				stmt = conn.createStatement();
				
				count = stmt.executeUpdate(sql);
				System.out.println("정상적으로 삭제되었습니다.");
			} catch (SQLException e) {
				
				e.printStackTrace();
			} finally {
				DBClose.close(conn, stmt, null);
			}
			
			return count > 0 ? true:false;
		}
		public int Update(String title, int money) {
			//1. query 생성
			String sql = " UPDATE AccountBook "
							+ " SET money = " + money + " "
							+ " WHERE title = '" + title + "'";
			System.out.println(sql);
			
			Connection conn = DBConnection.getConnection();
			Statement stmt = null;
			
			int count = 0;
			
			//2. db connect
			try {
				stmt = conn.createStatement();
			//3. db process	
				count = stmt.executeUpdate(sql);
				
				System.out.println("성공적으로 수정됨");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} finally {
			//4. db close	
				try {
					if(stmt != null) {
						stmt.close();
					}
					if(conn != null) {
						conn.close();
					}
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			return count;
			
		}
		
		public ArrayList<accountDto> searchDate(String dateTime) {
			String sql = " SELECT dateTime, title, classify, money, memo "
					+ " FROM AccountBook "
					+ " WHERE dateTime LIKE ? "
					+ " ORDER BY dateTime DESC ";
			System.out.println(sql);
			//2. connection
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstm = null;
			ResultSet rs = null;
			ArrayList<accountDto> list = new ArrayList<accountDto>();
			
			//3. processing
			
			try {
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, dateTime);
				rs = pstm.executeQuery();
				
				while(rs.next()) {
					dateTime = rs.getString("dateTime");
					String title = rs.getString("title");
					String classify = rs.getString("classify");
					int money = rs.getInt("money");
					String memo = rs.getString("memo");
					
					accountDto dto = new accountDto(dateTime, title, classify, money, memo);
					list.add(dto);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} finally {
			//4. close	
				DBClose.close(conn, pstm, rs);
			}
			return list;
		}
		
		
	
		public ArrayList<accountDto> getTitle(String title){
			
			//1. 쿼리
			String sql = " SELECT dateTime, title, classify, money, memo "
					+ " FROM AccountBook "
					+ " WHERE title = ? ";
			System.out.println(sql);
			//2. connection
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstm = null;
			ResultSet rs = null;
			ArrayList<accountDto> list = new ArrayList<accountDto>();
			
			//3. processing
			
			try {
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, title);
				rs = pstm.executeQuery();
				
				while(rs.next()) {
					String dateTime = rs.getString("dateTime");
					title = rs.getString("title");
					String classify = rs.getString("classify");
					int money = rs.getInt("money");
					String memo = rs.getString("memo");
					
					accountDto dto = new accountDto(dateTime, title, classify, money, memo);
					list.add(dto);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} finally {
			//4. close	
				DBClose.close(conn, pstm, rs);
			}
			return list;
		}
		public ArrayList<accountDto> print(){
			
			//1. 쿼리
			String sql = " SELECT dateTime, title, classify, money, memo "
					+ " FROM AccountBook ";
			System.out.println(sql);
			//2. connection
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstm = null;
			ResultSet rs = null;
			ArrayList<accountDto> list = new ArrayList<accountDto>();
			
			//3. processing
			
			try {
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				
				
				while(rs.next()) {
					String dateTime = rs.getString("dateTime");
					String title = rs.getString("title");
					String classify = rs.getString("classify");
					int money = rs.getInt("money");
					String memo = rs.getString("memo");
					
					accountDto dto = new accountDto(dateTime, title, classify, money, memo);
					list.add(dto);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} finally {
			//4. close	
				DBClose.close(conn, pstm, rs);
			}
			return list;
		}
		

		

		public void accountBalance() {
			String sql = " SELECT classify, sum(money) "
					+ " FROM AccountBook "
					+ "	group by classify ";
			System.out.println(sql);
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try {
				pstm = conn.prepareStatement(sql);
			
				rs = pstm.executeQuery();
				
				System.out.println("성공적으로 실행됨");
				
				while(rs.next()) {
					String classify = rs.getString("classify");
					int sum = rs.getInt("sum");
					
					System.out.printf(classify, sum);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} finally {
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			
		}
}