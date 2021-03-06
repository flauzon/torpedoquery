/**
 *   Copyright Xavier Jodoin xjodoin@torpedoquery.org
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.torpedoquery.jpa.internal.conditions;

import org.torpedoquery.jpa.internal.Selector;

public class NotEqualPolymorphicCondition<T> extends PolymorphicCondition<T> {

	public NotEqualPolymorphicCondition(Selector selector,
			Class<? extends T> condition) {
		super(selector, condition);
	}

	@Override
	protected String getComparator() {
		return NotEqualCondition.NOT_EQUAL;
	}

}
