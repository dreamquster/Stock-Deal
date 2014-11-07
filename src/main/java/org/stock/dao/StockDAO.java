package org.stock.dao;

import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.SQL;

/**
 * Created by User: Administrator at Date: 2014/11/4 Time: 14:18
 */
@DAO(catalog="warehouse")
public interface StockDAO {

    @SQL("select * from app_api_dau where `date`='2014-11-3'")
    Integer getAppCount();
}
