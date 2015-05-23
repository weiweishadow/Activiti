/*
 * Based on JUEL 2.2.1 code, 2006-2009 Odysseus Software GmbH
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
package org.activiti5.engine.impl.juel;

import org.activiti5.engine.impl.javax.el.ELContext;

public final class AstNumber extends AstLiteral {
  private final Number value;

  public AstNumber(Number value) {
    this.value = value;
  }

  @Override
  public Object eval(Bindings bindings, ELContext context) {
    return value;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  @Override
  public void appendStructure(StringBuilder b, Bindings bindings) {
    b.append(value);
  }
}