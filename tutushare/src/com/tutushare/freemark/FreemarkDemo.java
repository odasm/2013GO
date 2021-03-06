package com.tutushare.freemark;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreemarkDemo {
	
	public void init() throws IOException, TemplateException{
		Configuration cfg = new Configuration();
		cfg.setDirectoryForTemplateLoading(new File("/where/you/store/templates"));
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		
		Template temp = cfg.getTemplate("test.ftl");
		
		
		Map root = new HashMap();
		// Put string "user" into the root
		root.put("user", "Big Joe");
		// Create the hash for "latestProduct"
		Map latest = new HashMap();
		// and put it into the root
		root.put("latestProduct", latest);
		// put "url" and "name" into latest
		latest.put("url", "products/greenmouse.html");
		latest.put("name", "green mouse");
		
		
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush();
	}
	
	public static void main(String[] args) throws IOException {
		
	}
}
