package demo.ssm.dao;

import demo.ssm.pojo.Cust;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustDao {
    List<Cust> findAll();

    List<Cust> findCustByNameOrType(@Param("cust_name") String cust_name, @Param("cust_type") String cust_type);

    List<Cust> findCustLinkUser();

    void addCust(Cust cust);

    void deleteCust(String cid);
}
