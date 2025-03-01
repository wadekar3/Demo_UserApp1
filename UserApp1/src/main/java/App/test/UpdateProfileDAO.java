package App.test;

import java.sql.*;

public class UpdateProfileDAO {
	public int k = 0;

	public int update(UserBean ub) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con
					.prepareStatement("update UserReg set city=?,mid=?,phno=? where uname=? and pword=?");
			ps.setString(1, ub.getCity());
			ps.setString(2, ub.getmId());
			ps.setLong(3, ub.getPhNo());
			ps.setString(4, ub.getuName());
			ps.setString(5, ub.getpWord());
			k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
