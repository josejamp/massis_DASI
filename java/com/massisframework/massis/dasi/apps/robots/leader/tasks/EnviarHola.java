package com.massisframework.massis.dasi.apps.robots.leader.tasks;

import java.util.UUID;

import com.massisframework.massis.dasi.agents.tasks.AgentTask;
import com.massisframework.massis.dasi.agents.tasks.SimpleTasksFactory;
import com.massisframework.massis.dasi.apps.robots.RobotAgent;
import com.massisframework.massis.dasi.apps.robots.commontasks.MoveToTarget;
import com.massisframework.massis.dasi.apps.robots.commontasks.MoveToTarget.MoveToResult;
import com.massisframework.massis.dasi.apps.robots.messages.teamnegotiation.JoinTeamRequest;
import com.massisframework.massis.dasi.apps.robots.messages.teamnegotiation.TeamNegotiationInfo;

public class EnviarHola  implements AgentTask<TeamNegotiationInfo, MoveToTarget.MoveToResult, RobotAgent>{

	@Override
	public MoveToResult execute(RobotAgent rhlc, TeamNegotiationInfo taskParams) {
		String uuid=UUID.randomUUID().toString();
		SimpleTasksFactory.sendMessage(rhlc,new JoinTeamRequest(uuid));
		return null;
	}

}
