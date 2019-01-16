package demo.ssm.web;

import demo.ssm.pojo.Cust;
import demo.ssm.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/cust")
public class CustController {
    @Autowired
    private CustService custService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Cust> custs = custService.findAll();
        model.addAttribute("custs", custs);
        return "center";
    }

    @RequestMapping("/findCustByNameOrType")
    public String findCustByNameOrType(Model model, Cust cust) {
        List<Cust> custs = custService.findCustByNameOrType(cust.getCust_name(), cust.getCust_type());
        model.addAttribute("custs", custs);
        return "center";
    }

    @RequestMapping("/findCustLinkUser")
    public @ResponseBody List<Cust> findCustLinkUser() {
        return custService.findCustLinkUser();
    }

    @RequestMapping("/addCust")
    public String addCust(Cust cust) {
        custService.addCust(cust);
        return "redirect:findAll";
    }

    @RequestMapping("/deleteCust")
    public String deleteCust(String cid) {
        custService.deleteCust(cid);
        return "redirect:findAll";
    }
}
