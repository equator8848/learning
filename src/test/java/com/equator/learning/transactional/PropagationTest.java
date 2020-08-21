package com.equator.learning.transactional;

import com.equator.learning.BaseTest;
import com.equator.learning.service.PropagationRequiresNewTestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PropagationTest extends BaseTest {
    @Autowired
    private PropagationRequiresNewTestService propagationRequiresNewTestService;

    @Test
    public void test1() {
        propagationRequiresNewTestService.testPropagationRequiresNewWithoutSubError();
    }

    @Test
    public void test2() {
        propagationRequiresNewTestService.testPropagationRequiresNewWithSubError();
    }

    @Test
    public void test3() {
        propagationRequiresNewTestService.testPropagationRequiresNewInvalid();
    }
}
