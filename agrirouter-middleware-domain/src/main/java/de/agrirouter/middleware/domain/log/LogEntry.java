package de.agrirouter.middleware.domain.log;

import de.agrirouter.middleware.domain.BaseEntity;
import de.agrirouter.middleware.domain.Endpoint;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * An error.
 */
@Data
@ToString
@MappedSuperclass
@EqualsAndHashCode(callSuper = true)
abstract class LogEntry extends BaseEntity {

    /**
     * The response code.
     */
    @Column(nullable = false)
    private int responseCode;

    /**
     * The message of the error.
     */
    private String message;

    /**
     * The timestamp
     */
    private long timestamp;

    /**
     * The type of the response.
     */
    private String responseType;

    /**
     * The ID of the message.
     */
    private String messageId;

    /**
     * The belonging endpoint.
     */
    @ManyToOne
    @JoinColumn(name = "endpoint_id")
    private Endpoint endpoint;
}
