package com.myapp.spring

class Test1 {
	
	// Docker
	// Docker Compose
	// Docker Swarm
	
	
	// docker container -d --name alpine-cont run alpine /bin/sh 
	
	// docker container ls -q or docker ps -a
}


// FROM python

// RUN yum install -y wget || apt-get update && apt-get install -y wget

// WORKDIR /app/bin

// COPY . /app  || /web /app/web

// ADD sample.tar.gz /app/bin/

// CMD ["-c","5","127.0.0.1"]

// ENTRYPOINT ["ping"]


// FROM python

// RUN mkdir -p /app

// WORKDIR /app

// COPY ./requirements.txt /app/

// RUN pip install -r requirements.txt

// ENTRYPOINT ["python"]

// CMD ["main.py"]


// RUN cd /app/bin
// RUN touch sample.txt


// WORKDIR /app/bin
// RUN touch sample.txt 


// Bridge - Docker -> Local
// Macvlan - Docker -> Local
// Overlay - Docker -> Global

// Task Of an orchestrator (Docker Swarm , Kubernetes and Apache Mesos)

// a. Reconciling the desired state
// b. Replicated and Global Services
// c. Service Discovery
// d. Routing
// e. Load Balancing
// f. Scaling
// g. SelfHealing
// h. ZeroDowntimeDeployment

// As a part of Kubernetes Master their are several daemon processes

// kube-apiserver
// kube-scheduler
// kube-controller-manager

// Kubernetes Resource or Objects


// Kubernetes Pods
// Kubernetes Replicaset
//Kubernetes Deployment
// Kubernetes Service

















