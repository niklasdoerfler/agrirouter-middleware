package de.agrirouter.middleware.persistence;

import de.agrirouter.middleware.domain.DeviceDescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * Repository to access the time logs within the MongoDB.
 */
public interface DeviceDescriptionRepository extends MongoRepository<DeviceDescription, String> {

    /**
     * Search for an existing device description by its ID.
     *
     * @param teamSetContextId The ID of the device description to search for.
     * @return -
     */
    Optional<DeviceDescription> findByTeamSetContextId(String teamSetContextId);

    /**
     * Find all team set context IDs.
     */
    @Query(value = "{}", fields = "{'teamSetContextId': 1}")
    List<String> findAllTeamSetContextIds();

    /**
     * Delete all device descriptions by agrirouter© ID.
     *
     * @param agrirouterEndpointId The agrirouter© endpoint ID.
     */
    void deleteAllByAgrirouterEndpointId(String agrirouterEndpointId);

    /**
     * Remove all device descriptions by team set context ID.
     *
     * @param duplicateTeamSetContextIds The team set context IDs to remove.
     */
    void deleteAllByTeamSetContextIdIn(List<String> duplicateTeamSetContextIds);
}
