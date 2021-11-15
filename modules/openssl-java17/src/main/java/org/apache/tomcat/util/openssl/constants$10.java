/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$10 {

    static final FunctionDescriptor SSL_CTX_get_options$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_get_options$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_get_options",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$10.SSL_CTX_get_options$FUNC, false
    );
    static final FunctionDescriptor SSL_get_options$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle SSL_get_options$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_get_options",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$10.SSL_get_options$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_clear_options$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SSL_CTX_clear_options$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_clear_options",
        "(Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$10.SSL_CTX_clear_options$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_set_options$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SSL_CTX_set_options$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_set_options",
        "(Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$10.SSL_CTX_set_options$FUNC, false
    );
    static final FunctionDescriptor SSL_set_options$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SSL_set_options$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_set_options",
        "(Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$10.SSL_set_options$FUNC, false
    );
    static final FunctionDescriptor SSL_get0_next_proto_negotiated$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_get0_next_proto_negotiated$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_get0_next_proto_negotiated",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$10.SSL_get0_next_proto_negotiated$FUNC, false
    );
}

