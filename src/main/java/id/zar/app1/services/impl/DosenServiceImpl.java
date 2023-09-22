package id.zar.app1.services.impl;

import id.zar.app1.DbModel.Dosen;
import id.zar.app1.repository.DosenRepository;
import id.zar.app1.services.DosenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DosenServiceImpl implements DosenService {
    private DosenRepository repo;

    @Autowired
    public DosenServiceImpl(DosenRepository repo){
        this.repo=repo;
    }

    @Override
    public List<Dosen> findAllDosen() {
        List<Dosen> listDosen = repo.findAll();

        return listDosen;
    }

    @Override
    public Dosen addDosen(Dosen dosenBaru)
    {
        dosenBaru.setId( UUID.randomUUID().toString());
        var result = repo.save(dosenBaru);
        return result;
    }
}
