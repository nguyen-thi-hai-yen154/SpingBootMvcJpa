package service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.MRole;
import repository.MRoleRepository;


@Service
@Transactional
public class MRoleService {

	@Autowired
	MRoleRepository mRoleRepo;

	public List<MRole> listAll() {
        return mRoleRepo.findAll();
    }

    public void save(MRole mRole) {
    	mRoleRepo.save(mRole);
    }

    public MRole get(long id) {
        return mRoleRepo.findById(id).get();
    }

    public void delete(long id) {
    	mRoleRepo.deleteById(id);
    }
}
