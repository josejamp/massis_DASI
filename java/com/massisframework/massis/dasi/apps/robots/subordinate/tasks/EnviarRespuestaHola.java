package com.massisframework.massis.dasi.apps.robots.subordinate.tasks;

import java.util.UUID;

import com.massisframework.massis.dasi.agents.tasks.AgentTask;
import com.massisframework.massis.dasi.agents.tasks.SimpleTasksFactory;
import com.massisframework.massis.dasi.apps.robots.RobotAgent;
import com.massisframework.massis.dasi.apps.robots.commontasks.MoveToTarget;
import com.massisframework.massis.dasi.apps.robots.commontasks.MoveToTarget.MoveToResult;
import com.massisframework.massis.dasi.apps.robots.messages.teamnegotiation.JoinTeamResponse;
import com.massisframework.massis.dasi.apps.robots.messages.teamnegotiation.TeamNegotiationInfo;

public class EnviarRespuestaHola implements AgentTask<TeamNegotiationInfo, MoveToTarget.MoveToResult, RobotAgent>{

	@Override
	public MoveToResult execute(RobotAgent rhlc, TeamNegotiationInfo taskParams) {
		String uuid=UUID.randomUUID().toString();
		SimpleTasksFactory.sendMessage(rhlc,new JoinTeamResponse(taskParams, uuid));
		return null;
	}

}
