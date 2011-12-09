/*
 * Copyright 2009 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.codec.frame;

import io.netty.buffer.ChannelBuffer;
import io.netty.buffer.ChannelBuffers;

/**
 * A set of commonly used delimiters for {@link DelimiterBasedFrameDecoder}.
 */
public class Delimiters {

    /**
     * Returns a {@code NUL (0x00)} delimiter, which could be used for
     * Flash XML socket or any similar protocols.
     */
    public static ChannelBuffer[] nulDelimiter() {
        return new ChannelBuffer[] {
                ChannelBuffers.wrappedBuffer(new byte[] { 0 }) };
    }

    /**
     * Returns {@code CR ('\r')} and {@code LF ('\n')} delimiters, which could
     * be used for text-based line protocols.
     */
    public static ChannelBuffer[] lineDelimiter() {
        return new ChannelBuffer[] {
                ChannelBuffers.wrappedBuffer(new byte[] { '\r', '\n' }),
                ChannelBuffers.wrappedBuffer(new byte[] { '\n' }),
        };
    }

    private Delimiters() {
        // Unused
    }
}