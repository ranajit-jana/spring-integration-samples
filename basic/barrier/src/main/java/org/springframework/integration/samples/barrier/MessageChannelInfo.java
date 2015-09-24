/*
 * Copyright 2015 the original author or authors.
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
package org.springframework.integration.samples.barrier;

import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.integration.support.management.Statistics;

/**
 * @author Gary Russell
 * @since 4.2
 *
 */
public class MessageChannelInfo {

	private final AbstractMessageChannel channel;

	public MessageChannelInfo(AbstractMessageChannel channel) {
		this.channel = channel;
	}

	public final String getComponentName() {
		return this.channel.getComponentName();
	}

	public String getComponentType() {
		return this.channel.getComponentType();
	}

	public boolean isCountsEnabled() {
		return this.channel.isCountsEnabled();
	}

	public boolean isLoggingEnabled() {
		return this.channel.isLoggingEnabled();
	}

	public long getSendCount() {
		return this.channel.getSendCountLong();
	}

	public long getSendErrorCount() {
		return this.channel.getSendErrorCountLong();
	}

	public double getTimeSinceLastSend() {
		return this.channel.getTimeSinceLastSend();
	}

	public double getMeanSendRate() {
		return this.channel.getMeanSendRate();
	}

	public double getMeanErrorRate() {
		return this.channel.getMeanErrorRate();
	}

	public double getMeanErrorRatio() {
		return this.channel.getMeanErrorRatio();
	}

	public double getMeanSendDuration() {
		return this.channel.getMeanSendDuration();
	}

	public double getMinSendDuration() {
		return this.channel.getMinSendDuration();
	}

	public double getMaxSendDuration() {
		return this.channel.getMaxSendDuration();
	}

	public double getStandardDeviationSendDuration() {
		return this.channel.getStandardDeviationSendDuration();
	}

	public Statistics getSendDuration() {
		return this.channel.getSendDuration();
	}

	public Statistics getSendRate() {
		return this.channel.getSendRate();
	}

	public Statistics getErrorRate() {
		return this.channel.getErrorRate();
	}

	public boolean isStatsEnabled() {
		return this.channel.isStatsEnabled();
	}

}
