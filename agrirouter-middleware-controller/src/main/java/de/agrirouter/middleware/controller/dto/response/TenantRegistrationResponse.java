package de.agrirouter.middleware.controller.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

/**
 * Result of the tenant registration.
 */
@Value
@ToString
@EqualsAndHashCode(callSuper = true)
@Schema(description = "The response after the tenant was registered.")
public class TenantRegistrationResponse extends Response {

    /**
     * Internal ID of the tenant.
     */
    @Schema(description = "Internal ID of the tenant.")
    String tenantId;

    /**
     * Access token for API usage.
     */
    @Schema(description = "Access token for API usage. Will be shown only once, therefore better save this one.")
    String accessToken;

}
