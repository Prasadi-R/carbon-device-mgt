/*
 *   Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */
package org.wso2.carbon.device.application.mgt.core.dao;

import org.wso2.carbon.device.application.mgt.common.LifecycleState;
import org.wso2.carbon.device.application.mgt.core.exception.ApplicationManagementDAOException;
import org.wso2.carbon.device.application.mgt.core.exception.LifeCycleManagementDAOException;

import java.util.List;

/**
 * This is responsible for all the DAO operations related to Lifecycle state.
 */
public interface LifecycleStateDAO {

    LifecycleState getLatestLifeCycleStateByReleaseID(int applicationReleaseId) throws ApplicationManagementDAOException;

    List<LifecycleState> getLifecycleStates(int appReleaseId) throws LifeCycleManagementDAOException;

    void addLifecycleState(LifecycleState state) throws LifeCycleManagementDAOException;

    void deleteLifecycleState(int identifier) throws LifeCycleManagementDAOException;

}
