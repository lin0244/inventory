package io.joamit.inventory.repository.footprint;

import io.joamit.inventory.domain.footprint.FootprintCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FootprintCategoryRepository extends MongoRepository<FootprintCategory, String> {
}