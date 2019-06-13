package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.service.MovieService;
import com.bawei.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MovieController {
	@Resource
	private MovieService service;
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue="1")int pageNum
			/*@RequestParam(defaultValue="")String mname,
			@RequestParam(defaultValue="")String dname,
			@RequestParam(defaultValue="0")int dida,
			@RequestParam(defaultValue="1989-07-01")String startTime,
			@RequestParam(defaultValue="2090-07-01")String endTime,
			@RequestParam(defaultValue="1")int minPrice,
			@RequestParam(defaultValue="9999")int maxPrice,
			@RequestParam(defaultValue="1")int shotTime,
			@RequestParam(defaultValue="600")int longTime*/) {
		PageHelper.startPage(pageNum, 3);
		List list = service.getList(/*mname,dname,dida,startTime,endTime,minPrice,maxPrice,shotTime,longTime*/);
		PageInfo info = new PageInfo(list);
		String url = "" /*"&mname"+mname+"&dname"+dname+"&dida"+dida+"&startTime"+startTime+"&endTime"+endTime+"&minPrice"+minPrice+"&maxPrice"+maxPrice+"&shotTime"+shotTime+"&longTime"+longTime*/;
		PageUtils.page(model, info, url);
		model.addAttribute("list", list);
		return "list";
	}
	//删除
	@RequestMapping("delete")
	@ResponseBody
	public boolean delete(int id) {
		try {
			service.delete(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception3
			e.printStackTrace();
			return false;
		}
		
	}
}
