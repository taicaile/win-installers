/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.groovy.groovysh.completion.antlr4

import org.antlr.v4.runtime.Token
import org.apache.groovy.groovysh.Groovysh

/**
 * Completer completing classes defined in the shell
 */
class CustomClassSyntaxCompleter implements IdentifierCompleter {

    private final Groovysh shell

    CustomClassSyntaxCompleter(final Groovysh shell) {
        this.shell = shell
    }

    @Override
    boolean complete(final List<Token> tokens, final List<CharSequence> candidates) {
        String prefix = tokens.last().text
        boolean foundMatch = false
        Class[] classes = shell.interp.classLoader.loadedClasses
        if (classes.size() > 0) {
            List<String> classnames = classes*.name
            for (String varName in classnames) {
                if (varName.startsWith(prefix)) {
                    candidates << varName
                    foundMatch = true
                }
            }
        }
        return foundMatch
    }
}
