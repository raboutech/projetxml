package urouen.sepa.controller;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlElement;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import urouen.sepa.model.Dbtr;
import urouen.sepa.model.DbtrAcct;
import urouen.sepa.model.DbtrAgt;
import urouen.sepa.model.DrctDbtTx;
import urouen.sepa.model.FinInstnId;
import urouen.sepa.model.Id;
import urouen.sepa.model.MndtRltdInf;
import urouen.sepa.model.SEPA;

@Controller
@RequestMapping("/resume")
public class SepaController {
	
	 @RequestMapping(method = RequestMethod.GET)
	 public @ResponseBody SEPA getSEPAInXML() {
		 return new SEPA("REF OPE BBBB", 2150.08,
								 new DrctDbtTx(new MndtRltdInf("MANDAT NO 666666","1989-07-03")),
				 new DbtrAgt(new FinInstnId("BANKGBUL")), new Dbtr("Mr Debiteur N2"),
				 new DbtrAcct(new Id("GB29NWBK60161331926819")),"Facture reference ISO 654321"
				);
	 	}
	 
	 @RequestMapping(value="/id",method = RequestMethod.GET)
	 public @ResponseBody SEPA getSEPAInXML_id() {
		 return new SEPA("REF OPE BBBB", 2150.08, 
				
								 new DrctDbtTx(new MndtRltdInf("MANDAT NO 666666","1989-07-03")),
				 new DbtrAgt(new FinInstnId("BANKGBUL")), new Dbtr("Mr Debiteur N2"),
				 new DbtrAcct(new Id("GB29NWBK60161331926819")),"Facture reference ISO 654321"
				);
	 	}
	 @RequestMapping(value="/{Id}",method = RequestMethod.GET)
	 public @ResponseBody SEPA SEPAInXML_With_GetId(@PathVariable(value = "Id") String Id) {
		 SimpleDateFormat sdf = new SimpleDateFormat();
		 String date = sdf.format(new Date()).substring(0, 8);
		 return new SEPA(Id, 2150.08,
								 new DrctDbtTx(new MndtRltdInf("MANDAT NO 666666","1990-02-13")),
				 new DbtrAgt(new FinInstnId("BANKGBUL")), new Dbtr("Mr Debiteur N2"),
				 new DbtrAcct(new Id("GB29NWBK60161331926819")),"Facture reference ISO 654321"
				);
	 	}
	 @RequestMapping(value="/home",method = RequestMethod.GET)
	 public @ResponseBody ModelAndView SEPAInXML_With_POST(HttpServletRequest request, ModelAndView model) {
		model.setViewName("home");
		return model;
	 	}
	
	 
	
}

