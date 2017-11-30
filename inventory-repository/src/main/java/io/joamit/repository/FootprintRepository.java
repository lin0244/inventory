package io.joamit.repository;

import io.joamit.inventory.domain.footprint.Footprint;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FootprintRepository extends MongoRepository<Footprint, String> {
}
