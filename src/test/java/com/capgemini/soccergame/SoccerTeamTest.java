package com.capgemini.soccergame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SoccerTeamTest {

    private SoccerTeam teamCoffee;

    @Before
    public void setUp() {
        this.teamCoffee = new SoccerTeam("Coffee");
    }

    @Test
    public void testSetAndGetForTeamName(){

        this.teamCoffee.setTeamname("Coffee");

        String actual = this.teamCoffee.getTeamname();
        Assert.assertEquals("Coffee", actual);

    }
}
