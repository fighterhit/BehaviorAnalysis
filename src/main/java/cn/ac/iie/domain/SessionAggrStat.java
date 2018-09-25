package cn.ac.iie.domain;

import java.io.Serializable;

/**
 * @author Fighter Created on 2018/9/25.
 */
public class SessionAggrStat implements Serializable {
    private static final long serialVersionUID = -4621254720556385118L;

    private int taskId;
    private int sessionCount;
    private double visitTime1s3sRatio;
    private double visitTime4s6sRatio;
    private double visitTime7s9sRatio;
    private double visitTime10s30sRatio;
    private double visitTime30s60sRatio;
    private double visitTime1m3mRatio;
    private double visitTime3m10mRatio;
    private double visitTime10m30mRatio;
    private double visitTime30mRatio;
    private double visitStep1_3Ratio;
    private double visitStep4_6Ratio;
    private double visitStep7_9Ratio;
    private double visitStep10_30Ratio;
    private double visitStep30_60Ratio;
    private double visitStep60Ratio;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(int sessionCount) {
        this.sessionCount = sessionCount;
    }

    public double getVisitTime1s3sRatio() {
        return visitTime1s3sRatio;
    }

    public void setVisitTime1s3sRatio(double visitTime1s3sRatio) {
        this.visitTime1s3sRatio = visitTime1s3sRatio;
    }

    public double getVisitTime4s6sRatio() {
        return visitTime4s6sRatio;
    }

    public void setVisitTime4s6sRatio(double visitTime4s6sRatio) {
        this.visitTime4s6sRatio = visitTime4s6sRatio;
    }

    public double getVisitTime7s9sRatio() {
        return visitTime7s9sRatio;
    }

    public void setVisitTime7s9sRatio(double visitTime7s9sRatio) {
        this.visitTime7s9sRatio = visitTime7s9sRatio;
    }

    public double getVisitTime10s30sRatio() {
        return visitTime10s30sRatio;
    }

    public void setVisitTime10s30sRatio(double visitTime10s30sRatio) {
        this.visitTime10s30sRatio = visitTime10s30sRatio;
    }

    public double getVisitTime1m3mRatio() {
        return visitTime1m3mRatio;
    }

    public void setVisitTime1m3mRatio(double visitTime1m3mRatio) {
        this.visitTime1m3mRatio = visitTime1m3mRatio;
    }

    public double getVisitTime3m10mRatio() {
        return visitTime3m10mRatio;
    }

    public void setVisitTime3m10mRatio(double visitTime3m10mRatio) {
        this.visitTime3m10mRatio = visitTime3m10mRatio;
    }

    public double getVisitTime10m30mRatio() {
        return visitTime10m30mRatio;
    }

    public void setVisitTime10m30mRatio(double visitTime10m30mRatio) {
        this.visitTime10m30mRatio = visitTime10m30mRatio;
    }

    public double getVisitTime30mRatio() {
        return visitTime30mRatio;
    }

    public void setVisitTime30mRatio(double visitTime30mRatio) {
        this.visitTime30mRatio = visitTime30mRatio;
    }

    public double getVisitStep1_3Ratio() {
        return visitStep1_3Ratio;
    }

    public void setVisitStep1_3Ratio(double visitStep1_3Ratio) {
        this.visitStep1_3Ratio = visitStep1_3Ratio;
    }

    public double getVisitStep4_6Ratio() {
        return visitStep4_6Ratio;
    }

    public void setVisitStep4_6Ratio(double visitStep4_6Ratio) {
        this.visitStep4_6Ratio = visitStep4_6Ratio;
    }

    public double getVisitStep7_9Ratio() {
        return visitStep7_9Ratio;
    }

    public void setVisitStep7_9Ratio(double visitStep7_9Ratio) {
        this.visitStep7_9Ratio = visitStep7_9Ratio;
    }

    public double getVisitStep10_30Ratio() {
        return visitStep10_30Ratio;
    }

    public void setVisitStep10_30Ratio(double visitStep10_30Ratio) {
        this.visitStep10_30Ratio = visitStep10_30Ratio;
    }

    public double getVisitStep30_60Ratio() {
        return visitStep30_60Ratio;
    }

    public void setVisitStep30_60Ratio(double visitStep30_60Ratio) {
        this.visitStep30_60Ratio = visitStep30_60Ratio;
    }

    public double getVisitStep60Ratio() {
        return visitStep60Ratio;
    }

    public void setVisitStep60Ratio(double visitStep60Ratio) {
        this.visitStep60Ratio = visitStep60Ratio;
    }

    public double getVisitTime30s60sRatio() {
        return visitTime30s60sRatio;
    }

    public void setVisitTime30s60sRatio(double visitTime30s60sRatio) {
        this.visitTime30s60sRatio = visitTime30s60sRatio;
    }
}
