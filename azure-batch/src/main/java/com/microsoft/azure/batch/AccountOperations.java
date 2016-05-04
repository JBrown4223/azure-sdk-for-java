/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.batch.protocol.implementation.api.AccountListNodeAgentSkusHeadersInner;
import com.microsoft.azure.batch.protocol.implementation.api.AccountListNodeAgentSkusOptionsInner;
import com.microsoft.azure.batch.protocol.implementation.api.BatchErrorException;
import com.microsoft.azure.batch.protocol.implementation.api.NodeAgentSkuInner;
import com.microsoft.rest.ServiceResponseWithHeaders;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class AccountOperations implements IInheritedBehaviors {

    AccountOperations(BatchClient batchClient, Collection<BatchClientBehavior> customBehaviors) {
        _parentBatchClient = batchClient;

        // inherit from instantiating parent
        InternalHelper.InheritClientBehaviorsAndSetPublicProperty(this, customBehaviors);
    }

    private Collection<BatchClientBehavior> _customBehaviors;

    private BatchClient _parentBatchClient;

    @Override
    public Collection<BatchClientBehavior> getCustomBehaviors() {
        return _customBehaviors;
    }

    @Override
    public void setCustomBehaviors(Collection<BatchClientBehavior> behaviors) {
        _customBehaviors = behaviors;
    }

    public List<NodeAgentSkuInner> listNodeAgentSkus() throws BatchErrorException, IOException {
        return listNodeAgentSkus(null, null);
    }

    public List<NodeAgentSkuInner> listNodeAgentSkus(DetailLevel detailLevel) throws BatchErrorException, IOException {
        return listNodeAgentSkus(detailLevel, null);
    }

    public List<NodeAgentSkuInner> listNodeAgentSkus(DetailLevel detailLevel, Iterable<BatchClientBehavior> additionalBehaviors) throws BatchErrorException, IOException {
        AccountListNodeAgentSkusOptionsInner options = new AccountListNodeAgentSkusOptionsInner();
        BehaviorManager bhMgr = new BehaviorManager(this.getCustomBehaviors(), additionalBehaviors);
        bhMgr.appendDetailLevelToPerCallBehaviors(detailLevel);
        bhMgr.applyRequestBehaviors(options);

        ServiceResponseWithHeaders<PagedList<NodeAgentSkuInner>, AccountListNodeAgentSkusHeadersInner> response = this._parentBatchClient.getProtocolLayer().accounts().listNodeAgentSkus(options);

        return response.getBody();
    }
}