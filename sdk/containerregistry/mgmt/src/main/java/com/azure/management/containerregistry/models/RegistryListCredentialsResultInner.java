// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.containerregistry.RegistryPassword;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The RegistryListCredentialsResult model.
 */
@Fluent
public final class RegistryListCredentialsResultInner {
    /*
     * The username for a container registry.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * The list of passwords for a container registry.
     */
    @JsonProperty(value = "passwords")
    private List<RegistryPassword> passwords;

    /**
     * Get the username property: The username for a container registry.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The username for a container registry.
     * 
     * @param username the username value to set.
     * @return the RegistryListCredentialsResultInner object itself.
     */
    public RegistryListCredentialsResultInner withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the passwords property: The list of passwords for a container
     * registry.
     * 
     * @return the passwords value.
     */
    public List<RegistryPassword> passwords() {
        return this.passwords;
    }

    /**
     * Set the passwords property: The list of passwords for a container
     * registry.
     * 
     * @param passwords the passwords value to set.
     * @return the RegistryListCredentialsResultInner object itself.
     */
    public RegistryListCredentialsResultInner withPasswords(List<RegistryPassword> passwords) {
        this.passwords = passwords;
        return this;
    }
}
