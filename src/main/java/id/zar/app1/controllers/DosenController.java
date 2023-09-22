package id.zar.app1.controllers;

import id.zar.app1.DbModel.Dosen;
import id.zar.app1.services.DosenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DosenController {
    private DosenService dosenService;

    @Autowired
    public DosenController(DosenService dosenService){
        this.dosenService=dosenService;
    }

    @GetMapping("/dosen")
    public String listDosen(Model model)
    {
        var listDosen = dosenService.findAllDosen();
        model.addAttribute("list_dosen", listDosen);
        return "dosen/list";
    }

    @GetMapping("/dosen/baru")
    public String pageBaru(Model model)
    {
        var dosenBaru = new Dosen();
        model.addAttribute("dosen",dosenBaru );
        return "dosen/baru";
    }

    @PostMapping("/dosen/baru")
    public String simpan(@ModelAttribute("dosen") Dosen dosenBaru)
    {
        dosenService.addDosen(dosenBaru);
        return "redirect:/dosen";
    }
}
