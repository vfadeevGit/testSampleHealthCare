package com.company.testsamplehealthcare.screen.contacttype;

import io.jmix.ui.screen.*;
import com.company.testsamplehealthcare.entity.ContactType;

@UiController("ContactType.edit")
@UiDescriptor("contact-type-edit.xml")
@EditedEntityContainer("contactTypeDc")
public class ContactTypeEdit extends StandardEditor<ContactType> {
}