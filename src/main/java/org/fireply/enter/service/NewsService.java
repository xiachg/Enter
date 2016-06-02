package org.fireply.enter.service;

import java.io.Serializable;
import java.util.List;

import org.fireply.enter.model.News;

public interface NewsService {

    void persistNews(News news);
    
    News getNewsById(String id);
    
    List<News> getAllNews();
    
}
