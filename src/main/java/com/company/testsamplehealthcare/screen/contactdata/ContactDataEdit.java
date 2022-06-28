package com.company.testsamplehealthcare.screen.contactdata;

import io.jmix.ui.screen.*;
import com.company.testsamplehealthcare.entity.ContactData;

@UiController("ContactData.edit")
@UiDescriptor("contact-data-edit.xml")
@EditedEntityContainer("contactDataDc")
public class ContactDataEdit extends StandardEditor<ContactData> {
}