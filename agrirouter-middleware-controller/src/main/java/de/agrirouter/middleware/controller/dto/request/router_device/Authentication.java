package de.agrirouter.middleware.controller.dto.request.router_device;

import com.dke.data.agrirouter.api.enums.CertificationType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Authentication details for a router device.
 */
@Getter
@Setter
@ToString
@Schema(description = "The authentication details for a router device.")
public class Authentication {

    /**
     * The type of the certificate.
     */
    @NotNull
    @NotEmpty
    @Schema(description = "The type of the certificate.")
    private CertificationType type;

    /**
     * The secret for the certificate.
     */
    @NotNull
    @NotEmpty
    @Schema(description = "The secret for the certificate.")
    private String secret;

    /**
     * The certificate.
     */
    @NotNull
    @NotEmpty
    @Schema(description = "The certificate.")
    private String certificate;

}
