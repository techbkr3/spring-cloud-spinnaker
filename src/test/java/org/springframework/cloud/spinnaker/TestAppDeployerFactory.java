/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.spinnaker;

import org.springframework.cloud.deployer.spi.cloudfoundry.CloudFoundryAppDeployer;
import org.springframework.cloud.deployer.spi.cloudfoundry.CloudFoundryDeployerProperties;

/**
 * @author Greg Turnquist
 */
public class TestAppDeployerFactory implements CloudFoundryAppDeployerFactory {

	private CloudFoundryAppDeployer stub;

	public TestAppDeployerFactory() {
		this.stub = stub;
	}

	@Override
	public CloudFoundryAppDeployer getObject(String api, String org, String space, String email, String password, String namespace) {
		return this.stub;
	}

	@Override
	public CloudFoundryAppDeployer getObject(CloudFoundryDeployerProperties props, String api, String org, String space, String email, String password, String namespace) {
		return this.stub;
	}

	public CloudFoundryAppDeployer getStub() {
		return stub;
	}

	public void setStub(CloudFoundryAppDeployer stub) {
		this.stub = stub;
	}

}