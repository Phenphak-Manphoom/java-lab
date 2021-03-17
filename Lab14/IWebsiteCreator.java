package com.cmd.test.Lab14;

public interface IWebsiteCreator {
	public void createWebsite(String template, String titleName);
	public void orderWebsite(IWebsiteCreator creator);

}
