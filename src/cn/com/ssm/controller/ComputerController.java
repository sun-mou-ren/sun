package cn.com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cn.com.ssm.service.ComputerService;

/**
 * @remark
 * @author SN
 * @createTime 2019年10月9日
 * @version 1.0
 */
@Controller
@RequestMapping("/computer")
public class ComputerController extends MultiActionController{
	private ComputerService computerService;
	public ComputerService getComputerService() {
		return computerService;
	}
	
	public void setComputerService(ComputerService computerService) {
		this.computerService = computerService;
	}
	@RequestMapping(value = "/selectEmp",method = RequestMethod.GET)
	public ModelAndView query(HttpServletRequest request, HttpServletResponse response){
	        return new ModelAndView("index","ComputerList",computerService.query());
	}
 }

