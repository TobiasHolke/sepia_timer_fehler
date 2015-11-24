package com.trustpact.sepia;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

/**
 * @author Tobias Holke {@literal <tobias.holke@trustpact.com>}
 */
@ProcessApplication(name = "sepia")
public class Sepia extends ServletProcessApplication
{
}
