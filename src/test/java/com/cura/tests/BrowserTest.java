
package com.cura.tests;

import com.cura.base.BaseTest;
import org.testng.annotations.Test;

public class BrowserTest extends BaseTest {

    @Test
    public void verifyApplicationLaunch() {
        System.out.println("Website Title: " + driver.getTitle());
    }
}
