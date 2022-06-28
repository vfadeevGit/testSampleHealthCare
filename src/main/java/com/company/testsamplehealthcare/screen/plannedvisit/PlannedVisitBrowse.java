package com.company.testsamplehealthcare.screen.plannedvisit;

import io.jmix.ui.screen.*;
import com.company.testsamplehealthcare.entity.PlannedVisit;

@UiController("PlannedVisit.browse")
@UiDescriptor("planned-visit-browse.xml")
@LookupComponent("plannedVisitsTable")
public class PlannedVisitBrowse extends StandardLookup<PlannedVisit> {
}