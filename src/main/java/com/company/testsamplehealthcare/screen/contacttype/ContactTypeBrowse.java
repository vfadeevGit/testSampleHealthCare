package com.company.testsamplehealthcare.screen.contacttype;

import io.jmix.ui.screen.*;
import com.company.testsamplehealthcare.entity.ContactType;

@UiController("ContactType.browse")
@UiDescriptor("contact-type-browse.xml")
@LookupComponent("contactTypesTable")
public class ContactTypeBrowse extends StandardLookup<ContactType> {
}