/*
 * Copyright (c) 2016 咖枯 <kaku201313@163.com | 3772304@qq.com>
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
 *
 */
package com.basemoudle.sample.api;

public class ApiConstants {
public static final  String BASEURL="http://zhuoji.zhanyiwangluo.com/";



//    /**
//     * 新闻id获取类型
//     *
//     * @param id 新闻id
//     * @return 新闻类型
//     */
//    public static String getType(String id) {
//        switch (id) {
//            case HEADLINE_ID:
//                return HEADLINE_TYPE;
//            case HOUSE_ID:
//                return HOUSE_TYPE;
//            default:
//                break;
//        }
//        return OTHER_TYPE;
//    }

    /**
     * 获取对应的host
     *
     * @param hostType host类型
     * @return host
     */
    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case HostType.HOME_NEW_LIST:
                host = "";
                break;
            case HostType.PICTURE_NEW_LIST:
                host = "";
                break;

            default:
                host = "";
                break;
        }
        return host;
    }
}
