package urouen.sepa.dao.impl;

import java.util.Collection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import urouen.sepa.dao.SepaDAO;
import urouen.sepa.model.Dbtr;
import urouen.sepa.model.DbtrAcct;
import urouen.sepa.model.DbtrAgt;
import urouen.sepa.model.DrctDbtTx;
import urouen.sepa.model.FinInstnId;
import urouen.sepa.model.Id;
import urouen.sepa.model.MndtRltdInf;
import urouen.sepa.model.SEPA;

public class SepaDAOImpl implements SepaDAO{

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void add(SEPA sepa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<SEPA> getAll() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public SEPA getSepa(int TransId) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM db_sepa WHERE ID = ?";

		Connection conn = null;

		try {
			Collection <SEPA> res;
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, TransId);
			SEPA sepa = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				sepa = new SEPA(
					rs.getString("IDENTIFIER"),
					rs.getDouble("INSTRUCTED_AMOUNT_MONEY "),
					new DrctDbtTx(new MndtRltdInf(rs.getString("MANDATE_ID"),rs.getString("DATE_OF_SIGNATURE"))),
					new DbtrAgt(new FinInstnId(rs.getString("BIC"))),
					new Dbtr(rs.getString("NAME")),
					new DbtrAcct(new Id(rs.getString("IBAN"))),
					rs.getString(" REMITTANCE_INFORMATION ")  );
					
				
			}
			rs.close();
			ps.close();
			return sepa;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		String sql = "SELECT count(*) FROM db_sepa ";
		int nbr=0;
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				nbr = rs.getInt(0);
					
				
			}
			rs.close();
			ps.close();
			return nbr;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	}
	
	

