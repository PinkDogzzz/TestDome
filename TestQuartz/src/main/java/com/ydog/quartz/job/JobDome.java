package com.ydog.quartz.job;

import org.quartz.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author TheRockDog
 * @DATE 2019/10/21-15:24
 */
public class JobDome implements Job{


    public JobDome(){
        System.out.println("访问到JobName");
    }

    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 输出当前时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringDate = dateFormat.format(date);

        // 获取jobDetail的信息
        JobKey jobKey = context.getJobDetail().getKey();
        // System.out.println("工作任务名称："+jobKey.getName()+"工作任务组："+jobKey.getGroup());

        // 获取JobDataMap的数据
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        System.out.println(jobDataMap.getString("msg"));
        JobDataMap triggerJobDataMap = context.getTrigger().getJobDataMap();
        System.out.println(triggerJobDataMap.getString("msg"));

        // 输出一行内容
        System.out.println("今晚的月亮真圆a"+stringDate);

    }
}
