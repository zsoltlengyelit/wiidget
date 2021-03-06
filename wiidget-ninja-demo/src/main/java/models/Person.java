/**
 * Copyright (C) 2013 the original author or authors.
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

package models;

public class Person {

	public Person() {

	}

	public Person(final String string, final String string2) {
		this.name = string;
		this.phone = string2;
	}

	public String name;

	public String phone;

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}

}
