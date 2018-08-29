package cn.xiaojunyun.blog.provider.impl;

import cn.xiaojunyun.blog.api.domain.ArticleCategory;
import cn.xiaojunyun.blog.api.service.ArticleCategoryService;
import cn.xiaojunyun.blog.provider.dao.ArticleCategoryDao;
import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * TODO: 文章分类接口实现
 *
 * @author junyunxiao
 * @date 2018-8-27 16:41
 */

@Service(
        version = "${service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class ArticleCategoryServiceImpl  implements ArticleCategoryService {

    private static final Logger logger= LoggerFactory.getLogger(ArticleCategoryServiceImpl.class);

    @Autowired
    private ArticleCategoryDao articleCategoryDao;

    @Override
    public int addArticleCategory(ArticleCategory category) {
        return articleCategoryDao.insertSelective(category);
    }

    @Override
    public int modifyArticleCategory(ArticleCategory category) {
        return articleCategoryDao.updateByPrimaryKeySelective(category);
    }

    @Override
    public int deleteArticleCategory(int articleCategoryId) {
        return articleCategoryDao.deleteByPrimaryKey(articleCategoryId);
    }

    @Cacheable(value = "ArticleCategory", key = "#root.targetClass", unless = "#result eq null")
    @Override
    public List<ArticleCategory> queryArticleCategory() {
        logger.info("执行文章分类查询");
        List<ArticleCategory> articleCategoryList=articleCategoryDao.queryArticleCategory();
        return articleCategoryList;
    }
}
