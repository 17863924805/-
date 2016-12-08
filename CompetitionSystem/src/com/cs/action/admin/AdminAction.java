package com.cs.action.admin;

import java.util.List;

import com.cs.entity.Article;
import com.cs.entity.Awards;
import com.cs.entity.FileUpload;
import com.cs.entity.Level;
import com.cs.entity.Production;
import com.cs.entity.Project;
import com.cs.service.admin.AdminService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {

	//private ProductionService proService = new ProductionService();
	//private ProjectService projectService=new ProjectService();
	
	private AdminService adminService =new AdminService();
	
	
	// 加载的时候的作品列表
	private List<Production> productions;
	
	//加载时竞赛项目列表
	private List<Project> projects;
	//加载时竞赛项目列表
	private List<Awards> awards;
	
	//加载文章时用到的文章列表
	private List<Article> articles;
	
	//加载上传文件页面获取所有文件
	private List<FileUpload> files;
	
	//文章类型
	private int type;
	//竞赛筛选的条件
	private String level;
	private String isPub;
	
	/**
	 * 跳转到管理员首页
	 * @return
	 */
	public String toIndex() {
		return SUCCESS;
	}
	
	//获取所欲的近期比赛资料
	public String toRecCom(){
		projects=adminService.SignableProject("","");
		return SUCCESS;
	}
	/**
	 * 查询符合条件的近期竞赛
	 * @return
	 */
	public String selectCom(){
		System.out.println(level+"--"+isPub);
		projects=adminService.SignableProject(level,isPub);
		for (Project p : projects) {
			System.out.println(p.getLevel().getLevelName()+"-----");
		}
		return SUCCESS;
	}
	//获取所欲的近期比赛资料
	public String toRecAwards(){
		awards=adminService.AllAwards();
		return SUCCESS;
	}
	/**
	 * 跳转到作品首页
	 * @return
	 */
	public String toPro() {
		productions = adminService.allPro();
		return SUCCESS;
	}
	/***
	 * 跳转到发布获奖
	 * @return
	 */
	public String toAwards() {
		articles=adminService.allArticle(3);
		return SUCCESS;
	}
	
	/***
	 * 跳转到发布动态 
	 * @return
	 */
	public String toNew() {
		articles=adminService.allArticle(2);
		return SUCCESS;
	}
	
	/**
	 * 跳转到竞赛首页
	 * @return
	 */
	public String toCom() {
		projects=adminService.needPub();
		articles=adminService.allArticle(1);
		return SUCCESS;
	}
	
	
	/**
	 * 查询全部的作品
	 * @return
	 */
	public String searchAll(){
		productions=adminService.allPro();
		return SUCCESS;
	}

	/**
	 * 跳转到文件上传页面
	 * @return
	 */
	public String fileUpload(){
		//获取所有的文件列表
		files=adminService.allFile();
		return SUCCESS;
	}
	

	public List<Production> getProductions() {
		return productions;
	}



	public void setProductions(List<Production> productions) {
		this.productions = productions;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Awards> getAwards() {
		return awards;
	}

	public void setAwards(List<Awards> awards) {
		this.awards = awards;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getIsPub() {
		return isPub;
	}

	public void setIsPub(String isPub) {
		this.isPub = isPub;
	}

	public List<FileUpload> getFiles() {
		return files;
	}

	public void setFiles(List<FileUpload> files) {
		this.files = files;
	}


	
	

	
}
