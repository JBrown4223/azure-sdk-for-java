/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.UUID;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity properties of the Api Management service resource.
 */
public class ApiManagementServiceIdentity {
    /**
     * The type of identity used for the resource. The type 'SystemAssigned,
     * UserAssigned' includes both an implicitly created identity and a set of
     * user assigned identities. The type 'None' will remove any identities
     * from the service. Possible values include: 'SystemAssigned',
     * 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     */
    @JsonProperty(value = "type", required = true)
    private ApimIdentityType type;

    /**
     * The principal id of the identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /**
     * The client tenant id of the identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /**
     * The list of user identities associated with the resource. The user
     * identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     * providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, UserIdentityProperties> userAssignedIdentities;

    /**
     * Get the type of identity used for the resource. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the service. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     *
     * @return the type value
     */
    public ApimIdentityType type() {
        return this.type;
    }

    /**
     * Set the type of identity used for the resource. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the service. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     *
     * @param type the type value to set
     * @return the ApiManagementServiceIdentity object itself.
     */
    public ApiManagementServiceIdentity withType(ApimIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principal id of the identity.
     *
     * @return the principalId value
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the client tenant id of the identity.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the list of user identities associated with the resource. The user identity
     dictionary key references will be ARM resource ids in the form:
     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
         providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value
     */
    public Map<String, UserIdentityProperties> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the list of user identities associated with the resource. The user identity
     dictionary key references will be ARM resource ids in the form:
     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
         providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set
     * @return the ApiManagementServiceIdentity object itself.
     */
    public ApiManagementServiceIdentity withUserAssignedIdentities(Map<String, UserIdentityProperties> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

}
