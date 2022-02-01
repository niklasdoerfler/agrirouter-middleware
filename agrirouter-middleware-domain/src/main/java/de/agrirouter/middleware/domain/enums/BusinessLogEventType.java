package de.agrirouter.middleware.domain.enums;

/**
 * Event types for the business log.
 */
public enum BusinessLogEventType {

    TECHNICAL_MESSAGE_TYPES_UPDATED, ENDPOINT_DEACTIVATED, MESSAGE_WAITING_FOR_ACK_DELETED, UNKNOWN_MESSAGE, TENANT_CREATED, RESEND_CAPABILITIES, RESEND_SUBSCRIPTIONS, SEND_SUBSCRIPTIONS, SEND_CAPABILITIES, FETCH_AND_CONFIRM_MESSAGE, CONFIRM_MESSAGE, PERSIST_CONTENT_MESSAGE, ONBOARD_ENDPOINT_AGAIN, ONBOARD_ENDPOINT, ONBOARD_VIRTUAL_ENDPOINT, PUBLISH_MESSAGE, DELETE_MESSAGE, ENDPOINT_ACTIVATED, DEVICE_CREATED, DEVICE_ACTIVATED, DEVICE_UPDATED, ROUTER_DEVICE_ADDED, APPLICATION_CREATED
}
