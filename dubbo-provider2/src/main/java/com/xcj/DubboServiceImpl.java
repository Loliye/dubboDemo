package com.xcj;

public class DubboServiceImpl implements DubboService
{
    @Override
    public String getMessage(String msg)
    {
        return new String("provider2 receive you call:"+msg);
    }
}
