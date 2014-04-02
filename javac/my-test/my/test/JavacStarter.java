/*
 * Copyright 2011 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package my.test;

//在VM arguments中加上-Xbootclasspath/p:target\classes
//这样优先使用javac1.8这个项目中自带的javax包，否则会出现如下错误:
/////////////////////////////////////////////////////////////////
//编译器 ((版本信息不可用)) 中出现异常错误。 如果在 Bug Parade 中没有找到该错误, 
//请在 Java Developer Connection (http://java.sun.com/webapps/bugreport) 中建立 Bug。请在报告中附上您的程序和以下诊断信息。谢谢。
//java.lang.NoSuchFieldError: NATIVE_HEADER_OUTPUT
//
public class JavacStarter {
    public static void main(String[] args) throws Exception {
        //在args.txt中加入要编译的Java文件
        com.sun.tools.javac.Main.main(new String[] { "@args.txt" });
    }
}
