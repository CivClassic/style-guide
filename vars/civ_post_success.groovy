#!/usr/bin/env groovy

def call() {
	if (env.BRANCH_NAME == 'master' && env.civ_dependent_plugins != null) {
		sh 'mvn deploy -P civ-jenkins'
		String [] subPlugins = env.civ_dependent_plugins.split(' ');
		for(String pluginName : subPlugins) {
			if (pluginName != '') {
				build job: '../' + pluginName + '/master', wait: false
			}
		}
	}
}
