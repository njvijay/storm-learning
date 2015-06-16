package com.data2o.learningstorm.storm_example;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;

public class LearningStormBolt extends BaseBasicBolt {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void execute(Tuple input, BasicOutputCollector collector) {
		// TODO Auto-generated method stub
		String test = input.getStringByField("site");
		System.out.println("Name of the input site is :"+test);
		
	}

	public void declareOutputFields(OutputFieldsDeclarer arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
