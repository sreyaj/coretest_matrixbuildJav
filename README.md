[![Coverage Badge](https://rcapi.shippable.com/projects/58931fae59ff230f005a7d34/coverageBadge?branch=master)](https://rc.shippable.com/projects/58931fae59ff230f005a7d34)
[![Run Status](https://rcapi.shippable.com/projects/58931fae59ff230f005a7d34/badge?branch=master)](https://rc.shippable.com/projects/58931fae59ff230f005a7d34)


Sample Jacoco
 
 Test Sample to test some test cases with sample jacoco project
 Here we have language java for testing jacoco along wi
 1st cases tests when we hit on build button we can verify following cases
1. Matrix build    
     -  when we trigger sample_jacocomatrix project,it will have 3 matrix build 

2. User specified env variable in env tag    
     -  In this project there is one userspecified env( - env=test1 )  mentioned in env tag
   
3. Matrix.include version + user specified env vars     
     - jdk: openjdk7  have included one more version openjdk7 along with the env : foo=fubu in matrix. include tag
       env: foo=fubu
4. Matrix.exclude version + user specified env vars 
      - Here we exclude version - jdk: oraclejdk8 with envenv=test1

5. Matrix.allow_failure version     
   - version oraclejdk7 fails in build ci because of this - if [ "$SHIPPABLE_JDK_VERSION" == "oraclejdk7" ]; then foobar; fi
     so we allow filure for this version and the build will mark unstable 

6. Submodule public    
   - Added public submodule sampleNod which is there in shiptest-rc-ow 
     so whenever sample_jacocomatrix  completes triggering in gitsync we should able to see the submodules sampleNod

7. event trigger project webhook(see payload shows correctly in all cases )    
    - we have set on_start : always where when sample_jacoccomatrix starts  triggering the project webhhook (sampleNod project will  trigger) check payload given in sample_jacoccomatrix is shown in the sampleNod  on_start build 
same as when build complets for on_success also it will trigger webhook of sampleNod with payload

8. event trigger issue creation(check payload shows correctly)    
    - on_start: always on_success: always , when sample_jacocomatrix builds starts and completes triggering in project(sampleNod) will have issue get created on (on_success and on_start) with the payload given in the sample_jacocomatrix
9. download job consoles(verify there is no build script and secure envs)    
     - when build completes triggering click on download job console from runs page
10. coverage reports    
    - check wheather the coverage report is showing properly 
11. coverage badge
    - check coverage bdge shows properly in github project page properly    , when we click on covergae badge it should take us to project dashboard page
12. download coverage report    
     - from coverage tab details click on download  
     
13. Unstable status    
     - status of the build will be unstable because we have set low coverage alert with unstable status
14. Low coverage alert    
     - set low coverage alert below some range with unstable status from project setting->runsConfig, then when coverage report goes below that range we will receive notification based on the notification we have configured in yml
     
     
 
2nd cases that need to be verified when we hit rebuild button

1. rebuild   
2. cache: true    
3. cache container    
    - cache container it cache a particular folder or file. Here we cache  - $SHIPPABLE_BUILD_DIR/shippable.yml




3rd case- go to project setting and clear cache and then trigger a build

1. clear cache/reset minion    
   - After completing build with cache: true clear cache from project settings-options page and then trigger the project again 
     it should not cache the build which cached before     
     
     
     
4th case- tag and release build 
     
1. Tag build from ui 
    - create a tag build , when we create a tag  from github ui (even if dont give release name )it will trigger          both tag and release build with tag name given    
2. Release build from github ui
    

