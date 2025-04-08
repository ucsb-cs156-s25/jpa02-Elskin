package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void testEquals_sameObject() {
        assertEquals(team, team);  // Same object, should be true
    }

    @Test
    public void testEquals_differentType() {
        String notATeam = "I am not a Team object";
        assertEquals(false, team.equals(notATeam));  // Different type, should be false
    }

    @Test
    public void testEquals_differentMembers() {
        Team other = new Team("test-team");
        other.addMember("DifferentMember");
        assertEquals(false, team.equals(other));  // Different members, should be false
    }

    @Test
    public void testEquals_differentName() {
        Team other = new Team("different-name");
        assertEquals(false, team.equals(other));  // Different name, should be false
    }

    @Test
    public void testEquals_sameNameAndMembers() {
        Team other = new Team("test-team");
        assertEquals(team, other);  // Same name, same members, should be true
    }

    @Test
    public void testEquals_sameName_differentMembers() {
        Team other = new Team("test-team");
        other.addMember("AnotherMember");
        assertEquals(false, team.equals(other));  // Same name, different members, should be false
    }

    @Test
    public void testEquals_differentName_sameMembers() {
        Team other = new Team("another-team");
        assertEquals(false, team.equals(other));  // Different name, same members, should be false
    }


    @Test
    public void testHashCode_sameContent_sameHashCode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");

        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testHashCode_differentContent_differentHashCode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("baz");

        assertEquals(false, t1.hashCode() == t2.hashCode());  
    }


    @Test
    public void hashCode_returnsExpectedValue() {
        Team t = new Team();
        t.setName("test-team");
        int expectedResult = t.hashCode();
        assertEquals(expectedResult, t.hashCode());
    }

}



