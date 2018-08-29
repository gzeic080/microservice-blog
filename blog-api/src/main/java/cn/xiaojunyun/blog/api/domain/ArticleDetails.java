package cn.xiaojunyun.blog.api.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * TODO: 文章详情实体
 *
 * @author 萧竣匀
 * @date 2018-7-15 14:23
 */
public class ArticleDetails implements Serializable {


    private static final long serialVersionUID = -4471672176160142205L;
    /**
     * 文章id
     */
    private Integer id;

    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 所属分类id
     */
    private Integer articleTypeId;

    /**
     * 创作者id
     */
    private Integer articleUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否原创(1：是，0：否)
     */
    private Boolean isOriginal;

    /**
     * 是否公开(1：是，0：否)
     */
    private Boolean isOpen;

    /**
     * 是否置顶(1：是，0：否)
     */
    private Boolean isTop;

    /**
     * 是否为博主推荐(1：是，0：否)
     */
    private Boolean articleSupport;

    /**
     * 文章内容
     */
    private String articleContent;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public Integer getArticleUserId() {
        return articleUserId;
    }

    public void setArticleUserId(Integer articleUserId) {
        this.articleUserId = articleUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(Boolean isOriginal) {
        this.isOriginal = isOriginal;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public Boolean getArticleSupport() {
        return articleSupport;
    }

    public void setArticleSupport(Boolean articleSupport) {
        this.articleSupport = articleSupport;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleTypeId=").append(articleTypeId);
        sb.append(", articleUserId=").append(articleUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isOriginal=").append(isOriginal);
        sb.append(", isOpen=").append(isOpen);
        sb.append(", isTop=").append(isTop);
        sb.append(", articleSupport=").append(articleSupport);
        sb.append(", articleContent=").append(articleContent);
        sb.append("]");
        return sb.toString();
    }
}