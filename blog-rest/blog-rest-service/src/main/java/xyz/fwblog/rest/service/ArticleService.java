package xyz.fwblog.rest.service;

import xyz.fwblog.commons.pojo.PortalArticleDetail;
import xyz.fwblog.commons.pojo.PortalArticleListResponse;

public interface ArticleService {

	PortalArticleListResponse getLatestArticle();

	PortalArticleDetail getArticleById(Long articleId);

}
