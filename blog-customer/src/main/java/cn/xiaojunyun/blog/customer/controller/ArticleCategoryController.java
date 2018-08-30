package cn.xiaojunyun.blog.customer.controller;

import cn.xiaojunyun.blog.api.domain.ArticleCategory;
import cn.xiaojunyun.blog.api.service.ArticleCategoryService;
import cn.xiaojunyun.blog.common.message.TradeMessages;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO: 文章分类控制层
 *
 * @author junyunxiao
 * @date 2018-8-28 9:54
 */
@RestController
@RequestMapping("/articleCategory")
public class ArticleCategoryController {

    @Reference(version = "${service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880"
    )
    private ArticleCategoryService articleCategoryService;

    @GetMapping("/queryArticleCategory")
    public TradeMessages<List<ArticleCategory>> queryArticleCategory(){
        TradeMessages<List<ArticleCategory>> messages=new TradeMessages<>();
        List<ArticleCategory> categoryList=articleCategoryService.queryArticleCategory();
        messages.setResultCode("1");
        messages.setResultMessage("数据请求成功");
        messages.setData(categoryList);
        return messages;
    }

}
