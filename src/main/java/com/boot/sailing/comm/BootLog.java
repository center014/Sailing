package com.boot.sailing.comm;

import com.boot.sailing.v2.dao.MenuDaoV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional(propagation = Propagation.REQUIRES_NEW)
public class BootLog {

    @Autowired
    MenuDaoV2 menuDaoV2;

    public int doBootLog(String strClass) {
        int int1 = menuDaoV2.doBootLog(strClass);
        return int1;
    }

}
