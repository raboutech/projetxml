package urouen.sepa.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import urouen.sepa.dao.impl.SepaDAOImpl;
import urouen.sepa.model.Dbtr;
import urouen.sepa.model.DbtrAcct;
import urouen.sepa.model.DbtrAgt;
import urouen.sepa.model.DrctDbtTx;
import urouen.sepa.model.FinInstnId;
import urouen.sepa.model.Id;
import urouen.sepa.model.MndtRltdInf;
import urouen.sepa.model.SEPA;

@Controller
public class StatsController {
	
@RequestMapping(value="/stats", method=RequestMethod.GET)
	
	public @ResponseBody String home() {
	SepaDAOImpl s = new SepaDAOImpl();
	int count = s.getCount();
	    return "<html><head><head><body><h1>hello world</h1><body></html>";
	}
	
}
