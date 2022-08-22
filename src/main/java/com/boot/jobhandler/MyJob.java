package com.boot.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j //日志注解
@Component //标记为SpringBoot组件
public class MyJob {

    /**
     * 1:Hello World任务
     */
    @XxlJob("helloWorldJob") //指定任务名为helloWorldJob（这个值也就是JobHandler的值）
    public void helloWorldJob(){
        XxlJobHelper.log("Hello World XXL-JOB");
        log.warn("这是我的第一个XXL-JOB程序");
    }

    /**
     * 2:手动控制执行结果显示成功或者失败
     */
    @XxlJob("controlJob")
    public void controlJob(){

        log.warn("controlJob start......");

//        XxlJobHelper.handleSuccess("执行成功了666"); //控制显示执行成功。

        XxlJobHelper.handleFail("执行失败了-.-"); //控制显示执行失败。

    }


}
