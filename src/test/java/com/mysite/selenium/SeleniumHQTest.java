package com.mysite.selenium;

import io.ddavison.conductor.Browser;
import org.junit.Test;

import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;

@Config(
        browser = Browser.CHROME,
        url = "http://seleniumhq.org"
)

public class SeleniumHQTest extends Locomotive{
    @Test
    public void testDownloadLinkExists(){
        validatePresent(HomePage.LOC_LNK_DOWNLOADSELENIUM);
    }

    @Test
    public void testTabsExist()    {
        validatePresent(HomePage.LOC_LNK_ABOUTTAB)
        .validatePresent(HomePage.LOC_LNK_DOCUMENTATIONTAB)
        .validatePresent(HomePage.LOC_LNK_DOWNLOADTAB)
        .validatePresent(HomePage.LOC_LNK_PROJECTSTAB)
        .validatePresent(HomePage.LOC_LNK_SUPPORTTAB);
    }

}
