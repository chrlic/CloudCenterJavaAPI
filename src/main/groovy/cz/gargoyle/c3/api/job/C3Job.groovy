package cz.gargoyle.c3.api.job

import com.google.gson.Gson
import cz.gargoyle.c3.api.appl.Application
import cz.gargoyle.c3.api.session.C3Session
import groovy.json.JsonSlurper
import java.util.concurrent.Semaphore
import org.apache.http.HttpResponse

class C3Job {

	String url = "/v1/jobs.json"
	static int JOB_REFTRESH_INTERVAL_SEC = 5
	static int JOB_DEFAULT_TIMEOUT_SEC = 600
	
	static int JOB_STATUS_RUNNING = 0
	static int JOB_STATUS_SUCCESS = 1
	static int JOB_STATUS_FAILED = 2
	static int JOB_STATUS_OTHER = 3
	static int JOB_STATUS_UNKNOWN = 4
	static int JOB_STATUS_IN_PROGRESS = 5
	static int JOB_STATUS_STARTING = 6

	
	JobSubmittedResults submitWithGovernance(C3Session session, Application app, String deploymentName, 
							String cloudTag, String cloudTarget, String cloudInstance) {
							
		String serviceTierId = app.serviceTierId
		
		String body = """
		{
			"serviceTierId": "${serviceTierId}",
			"name": "${deploymentName}",
			"tags": [
				"${cloudTag}"
				],
			"parameters": {
				"cloudParams": {
					"cloud": "${cloudTarget}",
					"instance": "${cloudInstance}"
        		}
			}
		}
		"""
		
		HttpResponse response = session.post(url, body)
		
		int httpStatus = response.getStatusLine().getStatusCode();
		
		String responseSubmitText = session.streamToString( response.getEntity().getContent() )
		
		Gson gson = new Gson()
		JobSubmittedResults submissionResults = gson.fromJson(responseSubmitText, JobSubmittedResults.class)
		
		return submissionResults
	}
					
	JobSubmittedResults submitSimple(C3Session session, Application app, String deploymentName, 
							String environmentId, String cloudRegionId, String accountId) {
							
		String appId = app.id
		String appVersion = app.versions[0]
		String serviceTierId = app.serviceTierId
		
		String body = """
{
	"appId": "${appId}",
	"appVersion": "${appVersion}",
	"name": "${deploymentName}",
	"environmentId": "${environmentId}",
	"parameters": {
		"cloudParams": {
			"cloudRegionId": "${cloudRegionId}",
			"accountId": "${accountId}"
		}
	}
,
	"jobs": [
		{
			"tierId": "32",
			"policyIds": null,
			"tagIds": [
			],
			"securityProfileIds": [
			],
			"parameters": {
				"appParams": [
					{
						"name": "referredJob",
						"value": ""
					}
				],
				"cloudParams": {
					"cloudRegionId": "1",
					"accountId": "1",
					"volumes": [
					],
					"rootVolumeSize": "0",
					"cloudProperties": [
						{
							"name": "FullClone",
							"value": "true"
						},
						{
							"name": "RootDiskResizeConfig",
							"value": "false"
						},
						{
							"name": "UserDatastoreCluster",
							"value": "SSD_SMALL"
						},
						{
							"name": "UserDataCenterName",
							"value": "DC1"
						},
						{
							"name": "UserClusterName",
							"value": "Main"
						},
						{
							"name": "UserResourcePoolName",
							"value": ""
						},
						{
							"name": "UserTargetDeploymentFolder",
							"value": "/C3-Workloads"
						}
					],
					"nics": [
						{
							"order": 1,
							"id": "VM Network",
							"type": "NETWORK"
						}
					],
					"instance": "small"
				}
			},
			"numNodesToLaunch": 1
		},
		{
			"tierId": "33",
			"policyIds": null,
			"tagIds": [
			],
			"securityProfileIds": [
			],
			"parameters": {
				"appParams": [
					{
						"name": "referredJob",
						"value": ""
					}
				],
				"cloudParams": {
					"cloudRegionId": "1",
					"accountId": "1",
					"volumes": [
					],
					"rootVolumeSize": "0",
					"cloudProperties": [
						{
							"name": "FullClone",
							"value": "true"
						},
						{
							"name": "RootDiskResizeConfig",
							"value": "false"
						},
						{
							"name": "UserDatastoreCluster",
							"value": "SSD_SMALL"
						},
						{
							"name": "UserDataCenterName",
							"value": "DC1"
						},
						{
							"name": "UserClusterName",
							"value": "Main"
						},
						{
							"name": "UserResourcePoolName",
							"value": ""
						},
						{
							"name": "UserTargetDeploymentFolder",
							"value": "/C3-Workloads"
						}
					],
					"nics": [
						{
							"order": 1,
							"id": "VM Network",
							"type": "NETWORK"
						}
					],
					"instance": "small"
				}
			}
		},
		{
			"tierId": "34",
			"policyIds": null,
			"tagIds": [
			],
			"securityProfileIds": [
			],
			"parameters": {
				"appParams": [
					{
						"name": "referredJob",
						"value": ""
					}
				],
				"cloudParams": {
					"cloudRegionId": "1",
					"accountId": "1",
					"volumes": [
						{
							"name": "Volume1",
							"size": 10,
							"type": "min4g",
							"iops": null
						}
					],
					"rootVolumeSize": "0",
					"cloudProperties": [
						{
							"name": "FullClone",
							"value": "true"
						},
						{
							"name": "RootDiskResizeConfig",
							"value": "false"
						},
						{
							"name": "UserDatastoreCluster",
							"value": "SSD_SMALL"
						},
						{
							"name": "UserDataCenterName",
							"value": "DC1"
						},
						{
							"name": "UserClusterName",
							"value": "Main"
						},
						{
							"name": "UserResourcePoolName",
							"value": ""
						},
						{
							"name": "UserTargetDeploymentFolder",
							"value": "/C3-Workloads"
						}
					],
					"nics": [
						{
							"order": 1,
							"id": "VM Network",
							"type": "NETWORK"
						}
					],
					"instance": "small"
				}
			}
		}
	]
}
		"""
		String url = "/v2/jobs.json"
		HttpResponse response = session.post(url, body)
		
		int httpStatus = response.getStatusLine().getStatusCode();
		
		String responseSubmitText = session.streamToString( response.getEntity().getContent() )
		
		Gson gson = new Gson()
		JobSubmittedResults submissionResults = gson.fromJson(responseSubmitText, JobSubmittedResults.class)
		
		return submissionResults
	}
					
	int getJobStatus(C3Session session, String jobId) {
		
		String url = "/v1/jobs/${jobId}"
		HttpResponse response = session.get(url)
		int httpStatus = response.getStatusLine().getStatusCode();
		
		String responseSubmitText = session.streamToString( response.getEntity().getContent() )
		println responseSubmitText

		Gson gson = new Gson()
		JobDetails jobDetails = gson.fromJson(responseSubmitText, JobDetails.class)
		
		String jobStatus = (jobDetails.status == null ? "NULL" : jobDetails.status)
		
		return statusToInt(jobStatus)

	}
									
	int waitForJob(C3Session session, String jobId, int timeoutSeconds) {
		
		int jobStatus
		Semaphore semaphore = new Semaphore(1)
		C3Job job = this
		
		println "Waiting setup"
		semaphore.acquire()
		Timer timer = new Timer()
		TimerTask task = new TimerTask() {
			void run() {
				jobStatus = job.getJobStatus(session, jobId)
				if ((jobStatus == JOB_STATUS_RUNNING) || (jobStatus == JOB_STATUS_FAILED)) {
					timer.cancel()
					semaphore.release()
				}
			}
		}
		timer.scheduleAtFixedRate(task, 0, timeoutSeconds * 1000)

		println "Waiting on semaphore"
		
		semaphore.acquire() //wait for released semaphore by the timer thread
		semaphore.release() //release what's acquired
		println "Waiting finished"
		
		return jobStatus
	}
		
	int statusToInt(String status) {
		switch (status) {
			case "RUNNING" : return JOB_STATUS_RUNNING
			case "SUCCESS" : return JOB_STATUS_SUCCESS
			case "FAILED" : return JOB_STATUS_FAILED
			case "NULL" : return JOB_STATUS_UNKNOWN
			case "JobInProgress" : return JOB_STATUS_IN_PROGRESS
			case "JobStaring" : return JOB_STATUS_STARTING
			case "JobRunning" : return JOB_STATUS_RUNNING
			default : return JOB_STATUS_OTHER
		}
	}					
}
