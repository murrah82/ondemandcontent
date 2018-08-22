package com.murrah.com.murrah.engine;

import com.murrah.model.Book;
import de.neuland.jade4j.Jade4J;
import de.neuland.jade4j.JadeConfiguration;
import de.neuland.jade4j.template.FileTemplateLoader;
import de.neuland.jade4j.template.JadeTemplate;
import de.neuland.jade4j.template.TemplateLoader;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class htmlengine {
    private JadeConfiguration config;
    private TemplateLoader loader;
    private JadeTemplate template;

    public htmlengine(){
        config = new JadeConfiguration();
        loader = new FileTemplateLoader("/Users/Muralidharan-MAC/IdeaProjects/ondemandcontent/src/main/resources/templates/", "UTF-8");
        config.setTemplateLoader(loader);

    }

    public String generateHTML(Map<String, Object> model) {
        String html = null;
        try{
           template = config.getTemplate("index.jade");
           html = config.renderTemplate(template, model);
           System.out.println("HTML:" + html );
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return html;
    }

}
