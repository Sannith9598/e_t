package mini.project.track_mate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mini.project.track_mate.Entity.Alert;
import mini.project.track_mate.repository.AlertRepository;

@Service
public class AlertService {
    @Autowired
    private AlertRepository alertRepository;

    public Alert saveAlert(Alert alert) {
        return alertRepository.save(alert);
    }

    public Alert getAlertById(Long id) {
        return alertRepository.findById(id).orElse(null);
    }

    public List<Alert> getAllAlerts() {
        return alertRepository.findAll();
    }

    public void deleteAlert(Long id) {
        alertRepository.deleteById(id);
    }
    
}
