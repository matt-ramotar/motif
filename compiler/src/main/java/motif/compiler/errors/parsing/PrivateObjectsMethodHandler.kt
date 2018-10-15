/*
 * Copyright (c) 2018 Uber Technologies, Inc.
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
package motif.compiler.errors.parsing

import motif.compiler.errors.ErrorHandler
import motif.compiler.ir.CompilerMethod
import motif.models.parsing.errors.PrivateObjectsMethod
import javax.lang.model.element.Element

class PrivateObjectsMethodHandler : ErrorHandler<PrivateObjectsMethod>() {

    override fun message(error: PrivateObjectsMethod): String {
        return "Invalid Motif Objects method."
    }

    override fun element(error: PrivateObjectsMethod): Element? {
        return (error.method as CompilerMethod).element
    }
}