#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Copyright (C) 2017 iQIYI.COM - All Rights Reserved

Drill stoppages defined in file 'stoppage.drill.des'
under path /etc/sysconfig. The file is serialized in
protobuf format.

Author(s): Cai Daojin <caidaojin@qiyi.com>
Date: 2017/11
'''

import logging
import os
import sys
from ConfigParser import ConfigParser

from config_parser import GetConfigParser

g_des_file = ''
g_max_instances = 3
g_reload_stored_jobs = g_reload_stored_groups = 'no'
g_mail_addresses = g_mail_host = g_mail_user = g_mail_pwd = g_mail_freq = ''
g_redis_host = 'localhost'
g_redis_port = '6379'
g_redis_pw = ''
g_redis_connect = {}
g_stoppage_sub_channel = 'stoppage_channel'
g_stoppage_stored_jobs = 'stoppage_stored_jobs'
g_stoppage_stored_groups = 'stoppage_stored_groups'
g_stoppage_filter = ['filter_all', 'filter_objects', 'filter_groups']

mail_notifier = None


def ParseConfiguration(config_parser):
    global g_redis_connect, g_redis_host, g_redis_port, g_redis_pw
    global_vars = globals()
    for option in config_parser.options('configuration'):
        if global_vars.has_key('g_' + option):
            global_vars['g_' + option] = config_parser.get('configuration', option)
    g_redis_connect['host'] = g_redis_host
    g_redis_connect['port'] = int(g_redis_port)
    g_redis_connect['password'] = g_redis_pw
    print(g_redis_connect)


def main():
    print("exit")


if __name__ == "__main__":

    logging.warning('Good luck!!!')
    ParseConfiguration(GetConfigParser("./conf/stoppage_drill.conf"))
    sys.exit(main())
