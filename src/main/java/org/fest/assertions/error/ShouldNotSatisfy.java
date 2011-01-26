/*
 * Created on Oct 18, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.error;

import org.fest.assertions.core.Condition;

/**
 * Creates an error message indicating that an assertion that verifies that a value does not satisfy a
 * <code>{@link Condition}</code> failed.
 *
 * @author Alex Ruiz
 */
public class ShouldNotSatisfy extends BasicErrorMessageFactory {

  /**
   * Creates a new </code>{@link ShouldNotSatisfy}</code>.
   * @param <T> guarantees that the type of the actual value and the generic type of the {@code Condition} are the same.
   * @param actual the actual value in the failed assertion.
   * @param condition the {@code Condition}.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static <T> ErrorMessageFactory shouldNotSatisfy(T actual, Condition<T> condition) {
    return new ShouldNotSatisfy(actual, condition);
  }

  private ShouldNotSatisfy(Object actual, Condition<?> condition) {
    super("actual value:<%s> should not satisfy condition:<%s>", actual, condition);
  }
}
