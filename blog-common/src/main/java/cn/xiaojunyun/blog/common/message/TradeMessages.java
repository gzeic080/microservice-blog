package cn.xiaojunyun.blog.common.message;

import java.io.Serializable;

/**
 * TODO: 消息实体
 *
 * @author 萧竣匀
 * @date 2018/7/5 16:33
 */
public class TradeMessages<T> implements Serializable {

    private static final long serialVersionUID = -2352663152701894912L;

    /**
     * 返回码 1成功，其它为异常码
     */
    private String resultCode;
    /**
     * 返回消息
     */
    private String resultMessage;
    /**
     * 请求的唯一编号，接口处理完业务后，将返回客户请求时传入的唯一编号
     */
    private String requestUniqeld="d64b1cac9c3b4c4e811072a715533c96";
    /**
     * 流水号
     */
    private String serial="60221b989daa4e32aea59cc0ef6e1542";
    /**
     * 返回数据 JSON格式
     */
    private T data;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getRequestUniqeld() {
        return requestUniqeld;
    }

    public void setRequestUniqeld(String requestUniqeld) {
        this.requestUniqeld = requestUniqeld;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
