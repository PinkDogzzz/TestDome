package com.ydog.quartz.main;

import com.ydog.quartz.job.JobCronTriggerDome;
import com.ydog.quartz.job.JobSimpleTriggerDome;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * @author TheRockDog
 * @DATE 2019/10/21-17:31
 */
public class SchedulerCronTriggerDome {
    public static void main(String[] args) throws SchedulerException {
        // 调度器，从工厂获取
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        // 设置任务的开始时间，推迟五秒
        Date startDate = new Date();
        startDate.setTime(startDate.getTime()+5000);

        // 任务实例
        JobDetail jobDetail = JobBuilder.newJob(JobCronTriggerDome.class)
                .withIdentity("job1", "group1")// name:任务名称 group：任务组名称
                .usingJobData("msg","jobDetail")
                .build();

        // 触发器
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger", "group1")// name:触发器名称 group：触发器组名称
                //.startNow()// 马上启动
                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * 22 10 ?"))// 在十月二十二号 每两秒执行一次
                .startAt(startDate)// 开始时间
                .build();

        // 将触发器和任务关联
        scheduler.scheduleJob(jobDetail,trigger);

        // 启动
        scheduler.start();
    }
}
