package pl.kozak.lks.beans;

import java.util.ArrayList;
import java.util.Collection;

import pl.kozak.lks.models.Team;

public class TableBean {

	Collection<Team> teams;

	public TableBean() {
		teams = new ArrayList<Team>();
	}

	public Collection<Team> getTeams() {
		return teams;
	}

	public void setTeams(Collection<Team> teams) {
		this.teams = teams;
	}

}
