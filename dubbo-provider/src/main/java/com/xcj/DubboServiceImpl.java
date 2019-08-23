package com.xcj;

public class DubboServiceImpl implements DubboService
{
    @Override
    public String getMessage(String msg)
    {
        return "provider1 receiver you cell:" + msg;
    }
}
