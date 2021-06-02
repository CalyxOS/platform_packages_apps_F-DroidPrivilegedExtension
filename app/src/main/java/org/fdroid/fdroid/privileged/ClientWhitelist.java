/*
 * Copyright (C) 2016 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http//www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fdroid.fdroid.privileged;

import android.util.Pair;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Only apps signed using a certificate with a SHA-256 hash listed here
 * can access the Privileged Extension!
 * <ol>
 * <li>Get SHA-256 of certificate as lowercase without colons with
 * <code>keytool -printcert -jarfile com.example.apk | sed -n 's,SHA256:\s*\([A-F0-9:]*\),\1,p' | sed 's,:,,g'
 * | tr A-f a-f</code></li>
 * <li>Add here with Application ID</li>
 * </ol>
 */
public class ClientWhitelist {

    public static HashSet<Pair<String, String>> whitelist = new HashSet<>(Arrays.asList(
            // certificate SHA-256 of https//f-droid.org/F-Droid.apk
            new Pair<>("org.fdroid.fdroid", "43238d512c1e5eb2d6569f4a3afbf5523418b82e0a3ed1552770abb9a9c9ccab"),
            // aosp testkey
            new Pair<>("org.fdroid.fdroid", "a40da80a59d170caa950cf15c18c454d47a39b26989d8b640ecd745ba71bf5dc"),
            // walleye releasekey
            new Pair<>("org.fdroid.fdroid", "3bb5073980761a42bf81375d033d74dba544d7e05a143c1b6cb5fea0c5e1b4f8"),
            // sunfish releasekey
            new Pair<>("org.fdroid.fdroid", "c872439e078c479cce57a488bd3d9edc9d56d08422d37e4698ad22b49f2d75b5"),
            // redfin releasekey
            new Pair<>("org.fdroid.fdroid", "624d9a996ce057ba6303e887ef28766d9be9834f5e2a624080630735a07348fc"),
            // bramble releasekey
            new Pair<>("org.fdroid.fdroid", "13af9bff733cd2e4d79f5ad2f5fd84ca0a5b15d19658f82f10fc15889c47a9ba")
    ));

}
