/*
 *
 *  * ﻿Copyright 2017 Bait Inc
 *  * Licensed under the Apache License, Version 2.0 Jubilee 2017;
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *
 */

package inc.bait.jubilee.model.persistence.net.model;

import inc.bait.jubilee.model.appmodel.Account;
import inc.bait.jubilee.model.persistence.net.NetData;

/**
 * Created by yoctopus on 1/21/17.
 */

public class RegistrationData extends NetData {
    public final static String SUCCESS = "success";
    public final static String FAILED = "failed";
    public final static String ERROR = "error";
    private String message;
    private Account account;
    public RegistrationData(String dataName) {
        super(dataName);

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
