package com.ydog.quartz.main;

import com.ydog.quartz.job.JobDome;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author TheRockDog
 * @DATE 2019/10/21-17:31
 */
public class SchedulerDome {
    public static void main(String[] args) throws SchedulerException {
        // 调度器，从工厂获取
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        // 任务实例
        JobDetail jobDetail = JobBuilder.newJob(JobDome.class)
                .withIdentity("job1", "group1")//name:任务名称 group：任务组名称
                .usingJobData("msg","jobDetail")
                .build();

        // 获取一些信息
        // 任务名必须指定
        System.out.println("名称："+jobDetail.getKey().getName());

        // 组名不指定 默认组名为default
        System.out.println("组名称："+jobDetail.getKey().getGroup());
        System.out.println("任务类："+jobDetail.getJobClass().getName());

        // 触发器
        SimpleTrigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger", "group1")// name:触发器名称 group：触发器组名称
                .startNow()//马上启动
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())//每五秒重复执行一次
                .usingJobData("msg","trigger")
                .build();

        // 将触发器和任务关联
        scheduler.scheduleJob(jobDetail,trigger);

        // 启动
        scheduler.start();
    }
}
