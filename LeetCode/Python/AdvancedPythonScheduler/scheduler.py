from datetime import datetime
from datetime import date
import time
from apscheduler.schedulers.background import BackgroundScheduler


# def job_func(text):
#     print(text)

def job_func():
    print (time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time())))
    #print(datetime.datetime.utcnow().strftime("%Y-%m-%d %H:%M:%S.%f")[:-3])

scheduler = BackgroundScheduler()
# 在 2017-12-13 时刻运行一次 job_func 方法
#scheduler .add_job(job_func, 'date', run_date=date(2017, 12, 13), args=['text'])
# 在 2017-12-13 14:00:00 时刻运行一次 job_func 方法
#scheduler .add_job(job_func, 'date', run_date=datetime(2017, 12, 13, 14, 0, 0), args=['text'])
# 在 2017-12-13 14:00:01 时刻运行一次 job_func 方法
#scheduler .add_job(job_func, 'date', run_date='2019-1-3 18:24:01', args=['text'])

# 每隔两分钟执行一次 job_func 方法
scheduler .add_job(job_func, 'interval', seconds=5)
scheduler.start()