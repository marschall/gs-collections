/*
 * Copyright 2013 Goldman Sachs.
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

package com.gs.collections.impl.map.immutable.primitive;

import com.gs.collections.impl.map.mutable.primitive.CharShortHashMap;
import com.gs.collections.impl.test.Verify;
import org.junit.Test;

public class ImmutableCharShortHashMapSerializationTest
{
    @Test
    public void serializedForm()
    {
        Verify.assertSerializedForm(
                1L,
                "rO0ABXNyAHFjb20uZ3MuY29sbGVjdGlvbnMuaW1wbC5tYXAuaW1tdXRhYmxlLnByaW1pdGl2ZS5J\n"
                        + "bW11dGFibGVDaGFyU2hvcnRIYXNoTWFwJEltbXV0YWJsZUNoYXJTaG9ydE1hcFNlcmlhbGl6YXRp\n"
                        + "b25Qcm94eQAAAAAAAAABDAAAeHB3DAAAAAIAAQABAAIAAng=",
                new ImmutableCharShortHashMap(CharShortHashMap.newWithKeysValues((char) 1, (short) 1, (char) 2, (short) 2)));
    }
}
