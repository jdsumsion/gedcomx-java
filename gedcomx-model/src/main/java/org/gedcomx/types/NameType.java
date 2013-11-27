/**
 * Copyright Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.types;

import org.codehaus.enunciate.Facet;
import org.codehaus.enunciate.qname.XmlQNameEnum;
import org.codehaus.enunciate.qname.XmlUnknownQNameEnumValue;
import org.gedcomx.common.URI;
import org.gedcomx.rt.GedcomxConstants;

/**
 * Enumeration of standard name types.
 */
@XmlQNameEnum (
  base = XmlQNameEnum.BaseType.URI
)
public enum NameType {

  /**
   * Name given at birth.
   */
  BirthName,

  /**
   * Name used at the time of death.
   */
  @Facet ( name = GedcomxConstants.FACET_FS_FT_UNSUPPORTED )
  DeathName,

  /**
   * Name accepted at marriage.
   */
  MarriedName,

  /**
   * "Also known as" name.
   */
  AlsoKnownAs,

  /**
   * Nickname.
   */
  Nickname,

  /**
   * Name given at adoption.
   */
  @Facet ( name = GedcomxConstants.FACET_FS_FT_UNSUPPORTED )
  AdoptiveName,

  /**
   * A formal name, usually given to distinguish it from a name more commonly used.
   */
  @Facet ( name = GedcomxConstants.FACET_FS_FT_UNSUPPORTED )
  FormalName,

  /**
   * A name given at a religious rite or ceremony.
   */
  @Facet ( name = GedcomxConstants.FACET_FS_FT_UNSUPPORTED )
  ReligiousName,

  @XmlUnknownQNameEnumValue
  OTHER;

  /**
   * Return the QName value for this enum.
   *
   * @return The QName value for this enum.
   */
  public URI toQNameURI() {
    return URI.create(org.codehaus.enunciate.XmlQNameEnumUtil.toURIValue(this));
  }

  /**
   * Get the enumeration from the QName.
   *
   * @param qname The qname.
   * @return The enumeration.
   */
  public static NameType fromQNameURI(URI qname) {
    return org.codehaus.enunciate.XmlQNameEnumUtil.fromURIValue(qname.toString(), NameType.class);
  }

}
