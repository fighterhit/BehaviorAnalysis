package cn.ac.iie.domain;

import java.io.Serializable;

/**
 * @author Fighter Created on 2018/9/25.
 */
public class SessionDetail implements Serializable {

    private static final long serialVersionUID = 3250981161911915306L;

    private int taskId;
    private int userId;
    private String sessionId;
    private int pageId;
    private String actionTime;
    private String searchKeyword;
    private int clickCategotyId;
    private int clickProductId;
    private String orderCategoryIds;
    private String orderProductIds;
    private String payCategoryIds;
    private String payProductIds;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public int getClickCategotyId() {
        return clickCategotyId;
    }

    public void setClickCategotyId(int clickCategotyId) {
        this.clickCategotyId = clickCategotyId;
    }

    public int getClickProductId() {
        return clickProductId;
    }

    public void setClickProductId(int clickProductId) {
        this.clickProductId = clickProductId;
    }

    public String getOrderCategoryIds() {
        return orderCategoryIds;
    }

    public void setOrderCategoryIds(String orderCategoryIds) {
        this.orderCategoryIds = orderCategoryIds;
    }

    public String getOrderProductIds() {
        return orderProductIds;
    }

    public void setOrderProductIds(String orderProductIds) {
        this.orderProductIds = orderProductIds;
    }

    public String getPayCategoryIds() {
        return payCategoryIds;
    }

    public void setPayCategoryIds(String payCategoryIds) {
        this.payCategoryIds = payCategoryIds;
    }

    public String getPayProductIds() {
        return payProductIds;
    }

    public void setPayProductIds(String payProductIds) {
        this.payProductIds = payProductIds;
    }
}
