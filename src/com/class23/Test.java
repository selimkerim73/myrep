package com.class23;

public class Test {
	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp = new Employee();
		System.out.println(Employee.department);

		// emp.work(); not preferred way
		Employee.work();
		emp.salary = 90000;
		emp.getPaid();

		System.out.println("---Creating SrumTeam object---");
		ScrumTeam st = new ScrumTeam();
		st.salary = 100000;
		st.getPaid();
		st.artifacts = "Product Backlog,Sprint Backlog, BurnDown chart";
		st.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();

		System.out.println("---Creating Developer object---");
		Developer dev = new Developer();
		dev.salary = 120000;
		dev.getPaid();
		dev.artifacts = "Sprit backlog";
		dev.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();

		System.out.println("---Creating Tester object---");
		Tester qa = new Tester();
		qa.salary = 100000;
		qa.getPaid();
		qa.artifacts = "Sprit backlog";
		qa.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();

		System.out.println("---Creating Bussiness Analyst object---");
		BussinessAnalyst ba = new BussinessAnalyst();
		ba.salary = 85000;
		ba.getPaid();
		ba.artifacts = "Sprit backlog, Product Backlog";
		ba.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();

		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm = new ScrumMaster();
		sm.salary = 90000;
		sm.getPaid();
		sm.artifacts = "Burn Down Chart";
		sm.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();

		System.out.println("---Creating Product Owner object---");
		ProductOwner po = new ProductOwner();
		po.salary = 150000;
		po.getPaid();
		po.artifacts = "Sprit backlog, Product Backlog";
		po.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();

		// Bundan sonrakiler kendi orneklerimiz
		System.out.println("--------Bundan sonrakiler kendi orneklerimiz----");

		System.out.println("---Creating Front end tester object---");
		FrontEndTester fet = new FrontEndTester();
		fet.salary = 80000;
		fet.getPaid();
		fet.artifacts = "Sprit backlog, Product Backlog";
		fet.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
		fet.workOnArtifacts();
		fet.attendScrumMeetings();
		fet.doHtml();

		System.out.println("---Creating back end tester object---");
		BackEndTester bet = new BackEndTester();
		bet.salary = 100000;
		bet.getPaid();
		bet.artifacts = "Sprit backlog, Product Backlog";
		bet.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
		bet.workOnArtifacts();
		bet.attendScrumMeetings();
		bet.doSql();

		System.out.println("---Creating manual tester object---");
		ManualTester mt = new ManualTester();
		mt.salary = 100000;
		mt.getPaid();
		mt.artifacts = "Sprit backlog, Product Backlog";
		mt.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.testManually();

		System.out.println("---Creating automation tester object---");
		AutomationTester at = new AutomationTester();
		at.salary = 100000;
		at.getPaid();
		at.artifacts = "Sprit backlog, Product Backlog";
		at.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.codeInJava();

	}

}
