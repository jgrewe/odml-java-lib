package odml.core;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SectionTest {
    @Test
    public void testCheckTypeStyle() throws Exception {
        String type = "section type";
        String type2 = "1st section";
        String type3 = "3rd Section";
        String type4 = "secondSection";
        String type5 = "SecondSection";

        Assert.assertFalse(Section.checkTypeStyle(type).contains(" "));
        Assert.assertEquals(Section.checkTypeStyle(type2), "s_1st_section");
        Assert.assertEquals(Section.checkTypeStyle(type3), "s_3rd_section");
        Assert.assertEquals(Section.checkTypeStyle(type4), type4);
        Assert.assertEquals(Section.checkTypeStyle(type5), type5);
    }

    @Test
    public void testCheckNameStyle() throws Exception {
        String valid = "valid_section_name";
        String temp = Section.checkNameStyle(valid);
        Assert.assertEquals(valid, temp);

        String invalid = "invalid/section/name";
        temp = Section.checkNameStyle(invalid);
        Assert.assertNotEquals(invalid, temp);
        Assert.assertFalse(temp.contains("/"));
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(this.section.propertyCount(), 0);
        Property p = new Property("a property", 10);
        int idx1 = this.section.add(p);
        Assert.assertEquals(this.section.propertyCount(), 1);
        Assert.assertEquals(this.section.indexOfProperty(p.getName()), idx1);

        Property p2 = new Property("another property", "a value");
        int idx2 = this.section.add(p2);
        Assert.assertEquals(this.section.propertyCount(), 2);
        Assert.assertEquals(this.section.indexOfProperty(p2.getName()), idx2);
    }

    @Test
    public void testSectionCount() throws Exception {
    }

    @Test
    public void testSubsectionsNames() throws Exception {
    }

    @Test
    public void testGetSection() throws Exception {
    }

    @Test
    public void testGetSection1() throws Exception {
    }

    @Test
    public void testGetSections() throws Exception {
    }

    @Test
    public void testGetSectionByType() throws Exception {
    }

    @Test
    public void testGetSectionsByType() throws Exception {
    }

    @Test
    public void testFindSection() throws Exception {
    }

    @Test
    public void testFindSectionByType() throws Exception {
    }

    @Test
    public void testFindSectionsByType() throws Exception {
    }

    @Test
    public void testGetRelatedSection() throws Exception {
    }

    @Test
    public void testGetRelatedSections() throws Exception {
    }

    @Test
    public void testIsRoot() throws Exception {
    }

    @Test
    public void testGetLevel() throws Exception {
    }

    @Test
    public void testRemoveSection() throws Exception {
    }

    @Test
    public void testRemoveSection1() throws Exception {
    }

    @Test
    public void testRemoveSection2() throws Exception {
    }

    @Test
    public void testSetType() throws Exception {
    }

    @Test
    public void testSetName() throws Exception {
    }

    @Test
    public void testSetReference() throws Exception {
    }

    @Test
    public void testGetReference() throws Exception {
    }

    @Test
    public void testSetDefinition() throws Exception {
    }

    @Test
    public void testSetRepository() throws Exception {
    }

    @Test
    public void testSetRepository1() throws Exception {
    }

    @Test
    public void testGetDefinition() throws Exception {
    }

    @Test
    public void testGetType() throws Exception {
    }

    @Test
    public void testGetName() throws Exception {
    }

    @Test
    public void testGetParent() throws Exception {
    }

    @Test
    public void testGetLinkingSections() throws Exception {
    }

    @Test
    public void testIsLinked() throws Exception {
    }

    @Test
    public void testGetLinkedSection() throws Exception {
    }

    @Test
    public void testResolveLink() throws Exception {
    }

    @Test
    public void testResolveAllLinks() throws Exception {
    }

    @Test
    public void testAdd1() throws Exception {
    }

    @Test
    public void testAdd2() throws Exception {
    }

    @Test
    public void testAddProperty() throws Exception {
    }

    @Test
    public void testRemoveProperty() throws Exception {
    }

    @Test
    public void testRemoveProperty1() throws Exception {
    }

    @Test
    public void testGetPropertyNames() throws Exception {
    }

    @Test
    public void testGetProperty() throws Exception {
    }

    @Test
    public void testGetProperty1() throws Exception {
    }

    @Test
    public void testGetDate() throws Exception {
    }

    @Test
    public void testGetDate1() throws Exception {
    }

    @Test
    public void testGetTime() throws Exception {
    }

    @Test
    public void testGetTime1() throws Exception {
    }

    @Test
    public void testGetText() throws Exception {
    }

    @Test
    public void testGetText1() throws Exception {
    }

    @Test
    public void testGetNumber() throws Exception {
    }

    @Test
    public void testGetNumber1() throws Exception {
    }

    @Test
    public void testGetProperties() throws Exception {
    }

    @Test
    public void testHasTerminology() throws Exception {
    }

    @Test
    public void testGetRepository() throws Exception {
    }

    @Test
    public void testMerge() throws Exception {
    }

    @Test
    public void testContainsProperty() throws Exception {
    }

    @Test
    public void testContainsSection() throws Exception {
    }

    @Test
    public void testContainsSection1() throws Exception {
    }

    @Test
    public void testContains() throws Exception {
    }

    @Test
    public void testIndexOfProperty() throws Exception {
    }

    @Test
    public void testIndexOfSection() throws Exception {
    }

    @Test
    public void testIndexOfSection1() throws Exception {
    }

    @Test
    public void testIndexOfSection2() throws Exception {
    }

    @Test
    public void testContains1() throws Exception {
    }

    @Test
    public void testCopy() throws Exception {
    }

    @Test
    public void testFindRepositoryURL() throws Exception {
    }

    @Test
    public void testValidateTree() throws Exception {
    }

    @Test
    public void testValidate() throws Exception {
    }

    @Test
    public void testOptimizeTree() throws Exception {
    }

    @Test
    public void testIsEmpty() throws Exception {
    }

    @Test
    public void testToString() throws Exception {
    }

    @Test
    public void testToStringExtended() throws Exception {
    }

    @Test
    public void testToStringAllDetails() throws Exception {
    }

    @Test
    public void testGetPath() throws Exception {
    }

    @Test
    public void testChildren() throws Exception {
    }

    @Test
    public void testGetAllowsChildren() throws Exception {
    }

    @Test
    public void testGetChildAt() throws Exception {
    }

    @Test
    public void testGetChildCount() throws Exception {
    }

    @Test
    public void testGetIndex() throws Exception {
    }

    @Test
    public void testIsLeaf() throws Exception {
    }

    @Test
    public void testDisplayTree() throws Exception {
    }

    @Test
    public void testSetLink() throws Exception {
    }

    @Test
    public void testSetLink1() throws Exception {
    }

    @Test
    public void testGetLink() throws Exception {
    }

    @Test
    public void testSetInclude() throws Exception {
    }

    @Test
    public void testGetInclude() throws Exception {
    }

    @Test
    public void testSetDocumentAuthor() throws Exception {
    }

    @Test
    public void testGetDocumentAuthor() throws Exception {
    }

    @Test
    public void testSetDocumentVersion() throws Exception {
    }

    @Test
    public void testGetDocumentVersion() throws Exception {
    }

    @Test
    public void testSetDocumentDate() throws Exception {
    }

    @Test
    public void testGetDocumentDate() throws Exception {
    }

    @Test
    public void testLoadInclude() throws Exception {
    }

    @Test
    public void testLoadAllIncludes() throws Exception {
    }

    @Test
    public void testSetFileUrl() throws Exception {
    }

    @Test
    public void testGetFileUrl() throws Exception {
    }

    @Test
    public void testGetRootSection() throws Exception {
    }

    @Test
    public void testContainsIncludes() throws Exception {
    }

    @Test
    public void testContainsLinks() throws Exception {
    }

    @Test
    public void testIsTerminology() throws Exception {
    }

    @Test
    public void testSetAsTerminology() throws Exception {
    }


    @Test
    public void testEquals() throws Exception {
    }

    @Test
    public void testGetMap() throws Exception {
    }

    private Section section;

    @BeforeMethod
    public void setUp() throws Exception {
        this.section = new Section("test", "test");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        this.section = null;
    }

    @Test
    public void testRemovePropertyName() throws Exception {
        for (int i = 0; i < 10; i++)
            this.section.addProperty("test_" + i, 100.0);
        Assert.assertEquals(this.section.propertyCount(), 10);

        for (int i = 0; i < 10; i++)
            this.section.removeProperty("test_" + i);
        Assert.assertEquals(this.section.propertyCount(), 0);
    }

    @Test
    public void testRemovePropertyIndex() throws Exception {
        for (int i = 0; i < 10; i++)
            this.section.addProperty("test_" + i, 100.0);
        Assert.assertEquals(this.section.propertyCount(), 10);

        for (int i = this.section.propertyCount() - 1; i >= 0; i--)
            this.section.removeProperty(i);
        Assert.assertEquals(this.section.propertyCount(),0);
    }

    @Test
    public void testPropertyCount() throws Exception {
        Assert.assertEquals(this.section.propertyCount(), 0);

        this.section.addProperty("testnumber", 100.0);
        Assert.assertEquals(this.section.propertyCount(), 1);
    }

}