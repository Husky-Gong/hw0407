package com.zx.service;

public interface IFlowerService {
    public Result list(FlowerQuery query);

    public Result add(FlowerQuery query);
}
