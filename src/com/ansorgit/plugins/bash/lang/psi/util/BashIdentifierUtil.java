/*
 * Copyright (c) Joachim Ansorg, mail@ansorg-it.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ansorgit.plugins.bash.lang.psi.util;

import org.apache.commons.lang.StringUtils;

/**
 * @author jansorg
 */
public final class BashIdentifierUtil {
    private BashIdentifierUtil() {
    }

    public static boolean isValidIdentifier(String name) {
        return StringUtils.stripToNull(name) != null && !name.contains(" ");
    }
}
