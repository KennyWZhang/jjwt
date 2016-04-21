/*
 * Copyright (C) 2016 jsonwebtoken.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.lang.Assert;

import java.security.SecureRandom;

public class DefaultDecryptionRequest extends AbstractCryptoRequest implements DecryptionRequest {

    private final byte[] ciphertext;

    public DefaultDecryptionRequest(SecureRandom secureRandom, byte[] key, byte[] iv, byte[] ciphertext) {
        super(secureRandom, key, iv);
        Assert.notEmpty(ciphertext, "ciphertext cannot be null or empty.");
        this.ciphertext = ciphertext;
    }

    @Override
    public byte[] getCiphertext() {
        return this.ciphertext;
    }
}
