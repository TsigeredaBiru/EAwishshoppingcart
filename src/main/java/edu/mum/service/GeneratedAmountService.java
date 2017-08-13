package edu.mum.service;

import edu.mum.entity.GeneratedAmount;
import edu.mum.repository.GeneratedAmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GeneratedAmountService {

    @Autowired
    GeneratedAmountRepository generatedAmountRepository;

    //create
    public void saveGeneratedAmount(GeneratedAmount generatedAmount) {
        generatedAmountRepository.save(generatedAmount);
    }

    //delete
    public void deleteGeneratedAmount(int genId) {
        generatedAmountRepository.delete(genId);
    }

    //read
    public List<GeneratedAmount> getAllGeneratedAmount() {
        List<GeneratedAmount> generatedAmountes = generatedAmountRepository.findAll();
        return generatedAmountes;
    }

    public GeneratedAmount getGeneratedAmount(int genId) {
        return generatedAmountRepository.findOne(genId);
    }

    //update
    public void updateGeneratedAmount(int genId, GeneratedAmount generatedAmount) {
        generatedAmountRepository.save(generatedAmount);
    }
}
