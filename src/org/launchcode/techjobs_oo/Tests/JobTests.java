package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.assertFalse;

public class JobTests {

    Job jobOneEmpty;
    Job jobTwoEmpty;

    @Before
    public void createJobObjects() {
         jobOneEmpty = new Job();
         jobTwoEmpty = new Job();
    }

    @Test
    public void testEmptyConstructor() {
        assertFalse(jobOneEmpty.getId() == jobTwoEmpty.getId());
    }

}
