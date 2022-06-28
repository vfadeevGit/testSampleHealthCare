package com.company.testsamplehealthcare.screen.plannedvisit;

import io.jmix.ui.screen.*;
import com.company.testsamplehealthcare.entity.PlannedVisit;

@UiController("PlannedVisit.edit")
@UiDescriptor("planned-visit-edit.xml")
@EditedEntityContainer("plannedVisitDc")
public class PlannedVisitEdit extends StandardEditor<PlannedVisit> {
}