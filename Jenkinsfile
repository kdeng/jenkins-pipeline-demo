podTemplate(label: "app-tester",
      containers: [
        containerTemplate(
          name: "tester",
          image: "alpine",
          alwaysPullImage: true,
          ttyEnabled: true,
          command: 'cat',
          resourceRequestCpu: '.6',
          resourceRequestMemory: '1024Mi'
        )
      ],
      volumes: [
        hostPathVolume(mountPath: '/var/run/docker.sock', hostPath: '/var/run/docker.sock'),
      ]
    ) {
      node("app-tester") {
        container("tester") {
              stage("init") {
                    
                 println "hello world"
              }
        }
      }

    }
