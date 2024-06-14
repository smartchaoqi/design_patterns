package com.aqiu.pattern.responsibility;

public class GeneralManager extends Handler{
    public GeneralManager(){
        super(NUM_THREE,NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假,"+leave.getNum()+"天,"+leave.getContent());
        System.out.println("总经理审批");
    }
}
