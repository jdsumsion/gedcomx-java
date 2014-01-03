package org.familysearch.platform.ct;

import org.testng.annotations.Test;

import java.util.Collection;
import java.util.LinkedList;

import static org.testng.AssertJUnit.*;

public class ChangeTypeTest {

  private Collection<ChangeType> typesTested;

  @Test
  public void testIt() {
    typesTested = new LinkedList<ChangeType>();

    // test the contract that the @XmlEnumValue is unique and does not change its value
    testChangeType( "Person Created", ChangeType.CREATE_PERSON );
    testChangeType( "Couple Relationship Created", ChangeType.CREATE_COUPLE_RELATIONSHIP );
    testChangeType( "Child and Parents Relationship Created", ChangeType.CREATE_COUPLE_CHILD_RELATIONSHIP );
    testChangeType( "Person Removed", ChangeType.DELETE_PERSON );
    testChangeType( "Couple Relationship Removed", ChangeType.DELETE_COUPLE_RELATIONSHIP );
    testChangeType( "Child and Parents Relationship Removed", ChangeType.DELETE_COUPLE_CHILD_RELATIONSHIP );
    testChangeType( "Man Added", ChangeType.ADD_MAN );
    testChangeType( "Woman Added", ChangeType.ADD_WOMAN );
    testChangeType( "Father Added", ChangeType.ADD_FATHER );
    testChangeType( "Mother Added", ChangeType.ADD_MOTHER );
    testChangeType( "Child Added", ChangeType.ADD_CHILD );
    testChangeType( "Man Changed", ChangeType.EDIT_MAN );
    testChangeType( "Woman Changed", ChangeType.EDIT_WOMAN );
    testChangeType( "Father Changed", ChangeType.EDIT_FATHER );
    testChangeType( "Mother Changed", ChangeType.EDIT_MOTHER );
    testChangeType( "Child Changed", ChangeType.EDIT_CHILD );
    testChangeType( "Father Removed", ChangeType.REMOVE_FATHER );
    testChangeType( "Mother Removed", ChangeType.REMOVE_MOTHER );
    testChangeType( "Person Merged", ChangeType.MERGE_PERSON );
    testChangeType( "Couple Relationship Merged", ChangeType.MERGE_COUPLE_RELATIONSHIP );
    testChangeType( "Child and Parents Relationship Merged", ChangeType.MERGE_COUPLE_CHILD_RELATIONSHIP );
    testChangeType( "Person Unmerged", ChangeType.UNMERGE_PERSON );
    testChangeType( "Couple Relationship Unmerged", ChangeType.UNMERGE_COUPLE_RELATIONSHIP );
    testChangeType( "Child and Parents Relationship Unmerged", ChangeType.UNMERGE_COUPLE_CHILD_RELATIONSHIP );
    testChangeType( "Person Restored", ChangeType.UNTOMBSTONE_PERSON );
    testChangeType( "Couple Relationship Restored", ChangeType.UNTOMBSTONE_COUPLE_RELATIONSHIP );
    testChangeType( "Child and Parents Relationship Restored", ChangeType.UNTOMBSTONE_COUPLE_CHILD_RELATIONSHIP );
    /* Not currently supported
    testChangeType( "PersonAccessControl Changed", ChangeType.EDIT_PERSON_ACCESS_CONTROL );
    testChangeType( "Couple Relationship AccessControl Changed", ChangeType.EDIT_COUPLE_RELATIONSHIP_ACCESS_CONTROL );
    testChangeType( "Parent-Child Relationship AccessControl Changed", ChangeType.EDIT_PARENT_CHILD_RELATIONSHIP_ACCESS_CONTROL );
    testChangeType( "Change Removed", ChangeType.DELETE_CHANGE );
    testChangeType( "Admin Label Set", ChangeType.SET_ADMIN_LABEL );
    testChangeType( "Admin Label Cleared", ChangeType.CLEAR_ADMIN_LABEL );
    testChangeType( "Not A Match Declaration Set", ChangeType.SET_NOT_A_MATCH_DECLARATION );
    testChangeType( "Not A Match Declaration Cleared", ChangeType.CLEAR_NOT_A_MATCH_DECLARATION );
    */
    testChangeType( "Person Source Reference Added", ChangeType.ADD_PERSON_SOURCE_REFERENCE);
    testChangeType( "Set Person Not a Match", ChangeType.ADD_PERSON_NOT_A_MATCH);
    testChangeType( "Remove Person Not a Match", ChangeType.REMOVE_PERSON_NOT_A_MATCH);
    testChangeType( "Person Source Reference Changed", ChangeType.EDIT_PERSON_SOURCE_REFERENCE);
    testChangeType( "Person Source Reference Removed", ChangeType.DELETE_PERSON_SOURCE_REFERENCE);
    testChangeType( "Couple Source Reference Added", ChangeType.ADD_COUPLE_SOURCE_REFERENCE);
    testChangeType( "Couple Source Reference Changed", ChangeType.EDIT_COUPLE_SOURCE_REFERENCE);
    testChangeType( "Couple Source Reference Removed", ChangeType.DELETE_COUPLE_SOURCE_REFERENCE);
    testChangeType( "Child and Parents Source Reference Added", ChangeType.ADD_CHILD_PARENTS_SOURCE_REFERENCE);
    testChangeType( "Child and Parents Source Reference Changed", ChangeType.EDIT_CHILD_PARENTS_SOURCE_REFERENCE);
    testChangeType( "Child and Parents Source Reference Removed", ChangeType.DELETE_CHILD_PARENTS_SOURCE_REFERENCE);
    testChangeType( "Affiliation Added", ChangeType.ADD_AFFILIATION );
    testChangeType( "Affiliation Changed", ChangeType.EDIT_AFFILIATION );
    testChangeType( "Affiliation Removed", ChangeType.DELETE_AFFILIATION );
    testChangeType( "Bar Mitzvah Added", ChangeType.ADD_BAR_MITZVAH );
    testChangeType( "Bar Mitzvah Changed", ChangeType.EDIT_BAR_MITZVAH );
    testChangeType( "Bar Mitzvah Removed", ChangeType.DELETE_BAR_MITZVAH );
    testChangeType( "Bat Mitzvah Added", ChangeType.ADD_BAS_MITZVAH);
    testChangeType( "Bat Mitzvah Changed", ChangeType.EDIT_BAS_MITZVAH);
    testChangeType( "Bat Mitzvah Removed", ChangeType.DELETE_BAS_MITZVAH);
    testChangeType( "Birth Added", ChangeType.ADD_BIRTH );
    testChangeType( "Birth Changed", ChangeType.EDIT_BIRTH );
    testChangeType( "Birth Removed", ChangeType.DELETE_BIRTH );
    testChangeType( "Burial Added", ChangeType.ADD_BURIAL );
    testChangeType( "Burial Changed", ChangeType.EDIT_BURIAL );
    testChangeType( "Burial Removed", ChangeType.DELETE_BURIAL );
    testChangeType( "Christening Added", ChangeType.ADD_CHRISTENING );
    testChangeType( "Christening Changed", ChangeType.EDIT_CHRISTENING );
    testChangeType( "Christening Removed", ChangeType.DELETE_CHRISTENING );
    testChangeType( "Cremation Added", ChangeType.ADD_CREMATION );
    testChangeType( "Cremation Changed", ChangeType.EDIT_CREMATION );
    testChangeType( "Cremation Removed", ChangeType.DELETE_CREMATION );
    testChangeType( "Death Added", ChangeType.ADD_DEATH );
    testChangeType( "Death Changed", ChangeType.EDIT_DEATH );
    testChangeType( "Death Removed", ChangeType.DELETE_DEATH );
    testChangeType( "Military Service Added", ChangeType.ADD_MILITARY_SERVICE );
    testChangeType( "Military Service Changed", ChangeType.EDIT_MILITARY_SERVICE );
    testChangeType( "Military Service Removed", ChangeType.DELETE_MILITARY_SERVICE );
    testChangeType( "Naturalization Added", ChangeType.ADD_NATURALIZATION );
    testChangeType( "Naturalization Changed", ChangeType.EDIT_NATURALIZATION );
    testChangeType( "Naturalization Removed", ChangeType.DELETE_NATURALIZATION );
    testChangeType( "Title of Nobility Added", ChangeType.ADD_NOBILITY_TYPE );
    testChangeType( "Title of Nobility Changed", ChangeType.EDIT_NOBILITY_TYPE );
    testChangeType( "Title of Nobility Removed", ChangeType.DELETE_NOBILITY_TYPE );
    testChangeType( "Occupation Added", ChangeType.ADD_OCCUPATION );
    testChangeType( "Occupation Changed", ChangeType.EDIT_OCCUPATION );
    testChangeType( "Occupation Removed", ChangeType.DELETE_OCCUPATION );
    testChangeType( "Religion Added", ChangeType.ADD_RELIGIOUS_AFFILIATION );
    testChangeType( "Religion Changed", ChangeType.EDIT_RELIGIOUS_AFFILIATION );
    testChangeType( "Religion Removed", ChangeType.DELETE_RELIGIOUS_AFFILIATION );
    testChangeType( "Residence Added", ChangeType.ADD_RESIDENCE );
    testChangeType( "Residence Changed", ChangeType.EDIT_RESIDENCE );
    testChangeType( "Residence Removed", ChangeType.DELETE_RESIDENCE );
    testChangeType( "Stillbirth Added", ChangeType.ADD_STILLBORN );
    testChangeType( "Stillbirth Changed", ChangeType.EDIT_STILLBORN );
    testChangeType( "Stillbirth Removed", ChangeType.DELETE_STILLBORN );
    testChangeType( "Couple Event Added", ChangeType.ADD_COUPLE_EVENT );
    testChangeType( "Couple Event Changed", ChangeType.EDIT_COUPLE_EVENT );
    testChangeType( "Couple Event Removed", ChangeType.DELETE_COUPLE_EVENT );
    testChangeType( "Other Event Added", ChangeType.ADD_OTHER_EVENT );
    testChangeType( "Other Event Changed", ChangeType.EDIT_OTHER_EVENT );
    testChangeType( "Other Event Removed", ChangeType.DELETE_OTHER_EVENT );
    testChangeType( "Caste Added", ChangeType.ADD_CASTE_NAME );
    testChangeType( "Caste Changed", ChangeType.EDIT_CASTE_NAME );
    testChangeType( "Caste Removed", ChangeType.DELETE_CASTE_NAME );
    testChangeType( "Clan Added", ChangeType.ADD_CLAN_NAME );
    testChangeType( "Clan Changed", ChangeType.EDIT_CLAN_NAME );
    testChangeType( "Clan Removed", ChangeType.DELETE_CLAN_NAME );
    testChangeType( "Died Before Eight Added", ChangeType.ADD_DIED_BEFORE_EIGHT );
    testChangeType( "Died Before Eight Changed", ChangeType.EDIT_DIED_BEFORE_EIGHT );
    testChangeType( "Died Before Eight Removed", ChangeType.DELETE_DIED_BEFORE_EIGHT );
    testChangeType( "Life Sketch Added", ChangeType.ADD_LIFE_SKETCH );
    testChangeType( "Life Sketch Changed", ChangeType.EDIT_LIFE_SKETCH );
    testChangeType( "Life Sketch Removed", ChangeType.DELETE_LIFE_SKETCH );
    testChangeType( "National Id Added", ChangeType.ADD_NATIONAL_ID );
    testChangeType( "National Id Changed", ChangeType.EDIT_NATIONAL_ID );
    testChangeType( "National Id Removed", ChangeType.DELETE_NATIONAL_ID );
    testChangeType( "Nationality Added", ChangeType.ADD_NATIONAL_ORIGIN );
    testChangeType( "Nationality Changed", ChangeType.EDIT_NATIONAL_ORIGIN );
    testChangeType( "Nationality Removed", ChangeType.DELETE_NATIONAL_ORIGIN );
    testChangeType( "Physical Description Added", ChangeType.ADD_PHYSICAL_DESCRIPTION );
    testChangeType( "Physical Description Changed", ChangeType.EDIT_PHYSICAL_DESCRIPTION );
    testChangeType( "Physical Description Removed", ChangeType.DELETE_PHYSICAL_DESCRIPTION );
    testChangeType( "Ethnicity Added", ChangeType.ADD_RACE );
    testChangeType( "Ethnicity Changed", ChangeType.EDIT_RACE );
    testChangeType( "Ethnicity Removed", ChangeType.DELETE_RACE );
    testChangeType( "Tribe Name Added", ChangeType.ADD_TRIBE_NAME );
    testChangeType( "Tribe Name Changed", ChangeType.EDIT_TRIBE_NAME );
    testChangeType( "Tribe Name Removed", ChangeType.DELETE_TRIBE_NAME );
    testChangeType( "Other Fact Added", ChangeType.ADD_OTHER_FACT );
    testChangeType( "Other Fact Changed", ChangeType.EDIT_OTHER_FACT );
    testChangeType( "Other Fact Removed", ChangeType.DELETE_OTHER_FACT );
    testChangeType( "Gender Added", ChangeType.ADD_GENDER );
    testChangeType( "Gender Changed", ChangeType.EDIT_GENDER );
    testChangeType( "Gender Removed", ChangeType.DELETE_GENDER );
    testChangeType( "Birth Name Added", ChangeType.ADD_BIRTH_NAME);
    testChangeType( "Birth Name Changed", ChangeType.EDIT_BIRTH_NAME);
    testChangeType( "Birth Name Removed", ChangeType.DELETE_BIRTH_NAME);
    testChangeType( "Aka Name Added", ChangeType.ADD_ALTERNATE_NAME );
    testChangeType( "Aka Name Changed", ChangeType.EDIT_ALTERNATE_NAME );
    testChangeType( "Aka Name Removed", ChangeType.DELETE_ALTERNATE_NAME );
    testChangeType( "Aka Name Added", ChangeType.ADD_AKA_NAME );
    testChangeType( "Aka Name Changed", ChangeType.EDIT_AKA_NAME );
    testChangeType( "Aka Name Removed", ChangeType.DELETE_AKA_NAME );
    testChangeType( "Married Name Added", ChangeType.ADD_MARRIED_NAME );
    testChangeType( "Married Name Changed", ChangeType.EDIT_MARRIED_NAME );
    testChangeType( "Married Name Removed", ChangeType.DELETE_MARRIED_NAME );
    testChangeType( "Other Name Added", ChangeType.ADD_OTHER_NAME );
    testChangeType( "Other Name Changed", ChangeType.EDIT_OTHER_NAME );
    testChangeType( "Other Name Removed", ChangeType.DELETE_OTHER_NAME );
    testChangeType( "Nickname Added", ChangeType.ADD_NICK_NAME );
    testChangeType( "Nickname Changed", ChangeType.EDIT_NICK_NAME );
    testChangeType( "Nickname Removed", ChangeType.DELETE_NICK_NAME );
    testChangeType( "Lineage Added", ChangeType.ADD_LINEAGE );
    testChangeType( "Lineage Changed", ChangeType.EDIT_LINEAGE );
    testChangeType( "Lineage Removed", ChangeType.DELETE_LINEAGE );
    testChangeType( "Person Note Added", ChangeType.ADD_PERSON_NOTE);
    testChangeType( "Person Note Changed", ChangeType.EDIT_PERSON_NOTE);
    testChangeType( "Person Note Removed", ChangeType.DELETE_PERSON_NOTE);
    testChangeType( "Couple Note Added", ChangeType.ADD_COUPLE_NOTE);
    testChangeType( "Couple Note Changed", ChangeType.EDIT_COUPLE_NOTE);
    testChangeType( "Couple Note Removed", ChangeType.DELETE_COUPLE_NOTE);
    testChangeType( "Child and Parents Note Added", ChangeType.ADD_CHILD_PARENTS_NOTE);
    testChangeType( "Child and Parents Note Changed", ChangeType.EDIT_CHILD_PARENTS_NOTE);
    testChangeType( "Child and Parents Note Removed", ChangeType.DELETE_CHILD_PARENTS_NOTE);

    // make sure all are tested
    for (ChangeType changeType : ChangeType.values()) {
      if (!typesTested.contains(changeType)) {
        assertTrue("Untested ChangeType: " + changeType.name(), false);
      }
    }
  }
  
  private void testChangeType( String enumStr, ChangeType changeType ) {
    String typeString = changeType.toString();
    assertEquals( enumStr, typeString );
    typesTested.add( changeType );
  }
}