package com.company.testsamplehealthcare.screen.citizen;

import io.jmix.core.DataManager;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.TextField;
import io.jmix.ui.screen.*;
import com.company.testsamplehealthcare.entity.Citizen;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("Citizen.edit")
@UiDescriptor("citizen-edit.xml")
@EditedEntityContainer("citizenDc")
public class CitizenEdit extends StandardEditor<Citizen> {
    @Autowired
    private TextField<String> firstNameField;
    @Autowired
    private DataManager dataManager;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        /*List<Citizen> myEntityList = dataManager.load(Citizen.class)
                .query("select c from Citizen c where c.firstName = :firstName1")
                .parameter("firstName1", paramValue)
                .list();*/
    }

    @Subscribe("abort")
    public void onAbortClick(Button.ClickEvent event) {
/*        List<Citizen> myEntityList = dataManager.load(Citizen.class)
                .query("select c from Citizen c where c.firstName = :firstName1")
                .parameter("firstName1", paramValue)
                .list();
*/
    }

}