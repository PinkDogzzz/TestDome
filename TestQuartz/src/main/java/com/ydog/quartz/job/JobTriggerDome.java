package com.ydog.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author TheRockDog
 * @DATE 2019/10/21-23:28
 */
public class JobTriggerDome implements Job{

    public JobTriggerDome(){
        System.out.println("访问到JobTriggerDome");
    }


    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 输出当前时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringDate = dateFormat.format(date);

        // 输出一行内容
        System.out.println("今晚的月亮真圆a"+stringDate);

        // 获取jobKey startTime endTime
        Trigger trigger = context.getTrigger();
        System.out.println("jobKey的名称："+trigger.getJobKey().getName());
        System.out.println("任务开始时间："+dateFormat.format(trigger.getStartTime()));
        System.out.println("任务开始时间："+dateFormat.format(trigger.getEndTime()));


    }
}
