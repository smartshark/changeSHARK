/*
 * Copyright (C) 2017 University of Goettingen, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.ugoe.cs.smartshark;

import com.lexicalscope.jewel.cli.Option;

/**
 * @author Fabian Trautsch
 */
public interface CLIArguments {

    @Option
    String getInput();

    @Option(defaultToNull = true)
    String getUsername();

    @Option(defaultToNull = true)
    String getPassword();

    @Option(defaultValue = "localhost")
    String getHost();

    @Option(defaultValue = "27018")
    String getPort();

    @Option(defaultToNull = true, longName = "authentication-db")
    String getAuthenticationDB();

    @Option(defaultValue = "smartshark")
    String getDatabase();

    @Option(longName = "sslEnabled")
    boolean getSSLEnabled();

    @Option(longName = "vcsSystemURL")
    String getVCSSystemURL();

    @Option(longName = "strategy")
    String getStrategy();

    @Option(longName = "sha1", defaultToNull = true)
    String getSha1();

    @Option(longName = "sha2", defaultToNull = true)
    String getSha2();

    @Option(helpRequest = true)
    boolean getHelp();
}
