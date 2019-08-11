package com.ns.Service.Impl;

import com.ns.Service.IUserService;
import com.ns.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper iUserMapper;

}
