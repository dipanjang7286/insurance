package in.bank.insurance.repository;

import in.bank.insurance.model.Insurance;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InsuranceRepository extends CrudRepository<Insurance, Long> {
    List<Insurance> findByCustomerId(int customerId);
}
