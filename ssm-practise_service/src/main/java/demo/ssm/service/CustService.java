package demo.ssm.service;

import demo.ssm.pojo.Cust;

import java.util.List;

public interface CustService {
    List<Cust> findAll();

    List<Cust> findCustByNameOrType(String cust_name, String cust_type);

    List<Cust> findCustLinkUser();

    void addCust(Cust cust);

    void deleteCust(String cid);
}
