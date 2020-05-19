package com.objis.springmvcdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.objis.springmvcdemo.dao.IEmployeDao;
import com.objis.springmvcdemo.domaine.Employe;
import com.objis.springmvcdemo.domaine.Formation;

public class JdbcFormationDaoSupport extends JdbcDaoSupport  {

	public void saveFormation(Formation formation) {

		final String FORMATION_INSERT = "insert into formation (id,theme, date) "
				+ "values (?,?,?)";

		getJdbcTemplate()
				.update(FORMATION_INSERT,
						new Object[] { formation.getId(),formation.getTheme(), formation.getDateFormation()});
	}

}
