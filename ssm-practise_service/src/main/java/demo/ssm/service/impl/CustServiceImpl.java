package demo.ssm.service.impl;

import demo.ssm.dao.CustDao;
import demo.ssm.pojo.Cust;
import demo.ssm.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustServiceImpl implements CustService {
    @Autowired
    private CustDao custDao;

    @Override
    public List<Cust> findAll() {
        return custDao.findAll();
    }

    @Override
    public List<Cust> findCustByNameOrType(String cust_name, String cust_type) {
        return custDao.findCustByNameOrType("%" + cust_name + "%", "%" + cust_type + "%");
    }

    @Override
    public List<Cust> findCustLinkUser() {
        return custDao.findCustLinkUser();
    }

    @Override
    public void addCust(Cust cust) {
        custDao.addCust(cust);
    }

    @Override
    public void deleteCust(String cid) {
        custDao.deleteCust(cid);
    }
}
