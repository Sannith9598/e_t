package mini.project.track_mate.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import mini.project.track_mate.Entity.Income;
import mini.project.track_mate.repository.IncomeRepository;

@Service
public class IncomeService {
     @Autowired
    private IncomeRepository incomeRepository;

    public Income saveIncome(Income income) {
        return incomeRepository.save(income);
    }

    public Income getIncomeById(Long id) {
        return incomeRepository.findById(id).orElse(null);
    }

    public List<Income> getAllIncome() {
        return incomeRepository.findAll();
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }
}
