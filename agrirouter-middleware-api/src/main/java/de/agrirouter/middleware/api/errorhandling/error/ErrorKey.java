package de.agrirouter.middleware.api.errorhandling.error;

/**
 * Enumeration for all the error keys.
 */
public enum ErrorKey {

    ERR_("ERR_"),

    APPLICATION_NOT_FOUND(ERR_ + "00001"),
    ONBOARD_REQUEST_FAILED(ERR_ + "00002"),
    COULD_NOT_CONNECT_MQTT_CLIENT(ERR_ + "00003"),
    COULD_NOT_PARSE_ONBOARD_RESPONSE(ERR_ + "00004"),
    ENDPOINT_NOT_FOUND(ERR_ + "00005"),
    COULD_NOT_HANDLE_MQTT_MESSAGE(ERR_ + "00006"),
    COULD_NOT_FIND_MESSAGE_WAITING_FOR_ACKNOWLEDGEMENT(ERR_ + "00007"),
    MIDDLEWARE_DOES_NOT_SUPPORT_GATEWAY(ERR_ + "00008"),
    COULD_NOT_PARSE_PUSH_MESSAGE(ERR_ + "00009"),
    INVALID_PARAMETER_FOR_ACTION(ERR_ + "00010"),
    TENANT_ALREADY_EXISTS(ERR_ + "00011"),
    COULD_NOT_FIND_TENANT(ERR_ + "00012"),
    COULD_NOT_FIND_DESCRIPTOR_FOR_TIME_LOG(ERR_ + "00013"),
    COULD_NOT_PARSE_TASK_DATA(ERR_ + "00014"),
    SECURED_ONBOARD_PROCESS_NOT_SUPPORTED(ERR_ + "00015"),
    COULD_NOT_PARSE_DEVICE_DESCRIPTION(ERR_ + "00016"),
    COULD_NOT_FIND_DEVICE(ERR_ + "00017"),
    COULD_NOT_PARSE_TIME_LOG(ERR_ + "00018"),
    ENDPOINT_ALREADY_EXISTING(ERR_ + "00019"),
    APPLICATION_ALREADY_EXISTING(ERR_ + "00020"),
    COULD_NOT_FIND_TEAM_SET(ERR_ + "00021"),
    UNSUPPORTED_PROTOCOL(ERR_ + "00022"),
    COULD_NOT_DISCONNECT_MQTT_CLIENT(ERR_ + "00023"),
    SWITCHING_ACCOUNTS_WHEN_REONBOARDING_IS_NOT_ALLOWED(ERR_ + "00024"),
    MISSING_ROUTER_DEVICE_FOR_APPLICATION(ERR_ + "00025"),
    MISSING_FILTER_CRITERIA_FOR_TIME_LOG_SEARCH(ERR_ + "00026"),
    PARAMETER_VALIDATION_PROBLEM(ERR_ + "00027"),
    UNKNOWN_ERROR(ERR_ + "101010");

    private final String key;

    ErrorKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}
