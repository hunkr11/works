package com.erp.campus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.erp.campus.packages.model.academic.master.MasterCommonModel;

@Controller
@RequestMapping(value = "/Campus/module/academic")
public class AcademicController {

	@Autowired
	private MasterCommonModel masterCommonModel;

	@RequestMapping(method = RequestMethod.GET)
	public String academic() {
		System.out.println("ACADEMICS MODULE");
		return "academic/homeAcademic";
	}

	@RequestMapping(value = "/admission", method = RequestMethod.GET)
	public ModelAndView admission() {
		System.out.println(" \n AcademicController ADMISSION ");
		ModelAndView mav = new ModelAndView("academic/admission");
		return mav;
	}

	@RequestMapping(value = "/master/admissionType", method = RequestMethod.GET)
	public ModelAndView admissionType() {
		System.out.println(" \n AcademicMasterController admissionType");
		ModelAndView mav = new ModelAndView(
				"academic/admissionType/insAdmissionType", "INS_ADMSN_TYP",
				masterCommonModel);
		return mav;
	}
}
