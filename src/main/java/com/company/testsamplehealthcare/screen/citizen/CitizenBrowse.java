package com.company.testsamplehealthcare.screen.citizen;

import io.jmix.core.DataManager;
import io.jmix.ui.screen.*;
import com.company.testsamplehealthcare.entity.Citizen;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("Citizen.browse")
@UiDescriptor("citizen-browse.xml")
@LookupComponent("citizensTable")
public class CitizenBrowse extends StandardLookup<Citizen> {
    @Autowired
    private DataManager dataManager;

    @Subscribe
    public void onInit(InitEvent event) {

    }
}