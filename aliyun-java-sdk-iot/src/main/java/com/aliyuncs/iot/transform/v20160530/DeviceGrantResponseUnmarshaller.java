/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.transform.v20160530;

import com.aliyuncs.iot.model.v20160530.DeviceGrantResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeviceGrantResponseUnmarshaller {

	public static DeviceGrantResponse unmarshall(DeviceGrantResponse deviceGrantResponse, UnmarshallerContext context) {
		
		deviceGrantResponse.setRequestId(context.stringValue("DeviceGrantResponse.RequestId"));
		deviceGrantResponse.setSuccess(context.booleanValue("DeviceGrantResponse.Success"));
		deviceGrantResponse.setid(context.longValue("DeviceGrantResponse.id"));
		deviceGrantResponse.setErrorMessage(context.stringValue("DeviceGrantResponse.ErrorMessage"));
	 
	 	return deviceGrantResponse;
	}
}