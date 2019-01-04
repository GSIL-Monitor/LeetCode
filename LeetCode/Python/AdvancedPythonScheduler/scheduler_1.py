import time
from apscheduler.schedulers.blocking import BlockingScheduler
 
# def my_job():
#     while(True):
#         print (time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time())))
#         time.sleep(3)

def my_job():
    print (time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time())))

 
sched = BlockingScheduler()
sched.add_job(my_job, 'interval', seconds=5)
sched.start()