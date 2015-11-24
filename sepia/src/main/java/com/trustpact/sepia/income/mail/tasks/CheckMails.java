package com.trustpact.sepia.income.mail.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * @author Tobias Holke {@literal <tobias.holke@trustpact.com>}
 */
public class CheckMails implements JavaDelegate
{
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception
    {
       // Mail Konten auslesen
        System.out.println("Eventuell automatisch angelaufen...");
    }
}

