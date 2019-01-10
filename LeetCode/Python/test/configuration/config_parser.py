#!/usr/bin/env python
# -*- coding: utf-8 -*-

import ConfigParser

# Define the parameters of each type of stoppage
config = ConfigParser.ConfigParser()
config.add_section("stoppage_parameter")
config.set("stoppage_parameter", "machine", "operation")
config.set("stoppage_parameter", "program", "operation,program_name,program_des")
config.set("stoppage_parameter", "service", "operation,service")
config.set("stoppage_parameter", "netem",
           "delay,jitter,jitter_pct,loss_pct,loss_relativity,duplicate_pct,duplicate_relativity,rate,burst,latency,operation,dst,dport")
config.set("stoppage_parameter", "netfilter", "operation,dst,dport")
config.set("stoppage_parameter", "cgroup",
           "program_name,program_des,class,write_bps,write_iops,read_bps,read_iops,dir,quota,mem_limit_byte,memsw_limit_byte,rate,burst,latency,operation")
config.set("stoppage_parameter", "resource_usage",
           "type,total_usage,usage_per_cpu,threads,memory_usage,progress,operation")
config.set("stoppage_parameter", "rawcommand", "command")

# Define the common configuration
config.add_section("configuration")
config.set("configuration", "reload_stored_jobs", "yes")
config.set("configuration", "reload_stored_groups", "yes")
config.set("configuration", "redis_host", "127.0.0.1")
config.set("configuration", "redis_port", "7683")
config.set("configuration", "redis_pw", "l0GFtC90eU8t")
config.set("configuration", "mail_addresses", "liyukun_sx@qiyi.com")
config.set("configuration", "mail_host", "smtp.qiyi.domain")
config.set("configuration", "mail_user", "tp_autosender")
config.set("configuration", "mail_pwd", "vAicn30-1knf@fkelndha218")
config.set("configuration", "mail_freq", "high")
# config.set("configuration", "ops_event_notify_url", "http://ads-backend-elasticsearch-online001-whdx.qiyi.virtual:9200/ads_event_flow/event/")
config.set("configuration", "ops_event_notify_url",
           "http://ads-backend-elasticsearch-online001-bjlt.qiyi.virtual:9200/ads_event_flow/_search")
config.set("configuration", "des_file",
           "./conf/adapter_group.des;/ads-backend/stoppage_drill/conf/dsp_group.des;/ads-backend/stoppage_drill/conf/nginx_proxy_group.des;/ads-backend/stoppage_drill/conf/show_group.des;/ads-backend/stoppage_drill/conf/dsp_tracking_group.des;/ads-backend/stoppage_drill/conf/qisheng_tracking_group.des;/ads-backend/stoppage_drill/conf/exchange_group.des;/ads-backend/stoppage_drill/conf/tracking_log_server_group.des;/ads-backend/stoppage_drill/conf/pingback_collector_group.des;/ads-backend/stoppage_drill/conf/exchange_tracking_group.des;/ads-backend/stoppage_drill/conf/cookie_mapping_group.des;/ads-backend/stoppage_drill/conf/qixiao_ranking_group.des;/ads-backend/stoppage_drill/conf/dsp_recall_group.des;/ads-backend/stoppage_drill/conf/dsp_exporter_group.des;/ads-backend/stoppage_drill/conf/cpc_exporter_group.des;/ads-backend/stoppage_drill/conf/cpc_ranking_group.des;/ads-backend/stoppage_drill/conf/acg_exporter_group.des;/ads-backend/stoppage_drill/conf/qihui_tracking_redis_proxy_group.des;/ads-backend/stoppage_drill/conf/qisheng_exporter_group.des;/ads-backend/stoppage_drill/conf/qisheng_ranking_group.des;/ads-backend/stoppage_drill/conf/creative_dispatcher_group.des;/ads-backend/stoppage_drill/conf/show_leaf_group.des")

# config.write(open("./conf/stoppage_drill.conf", "w"))

def GetConfigParser(file=''):
    g_config_parser = ConfigParser.ConfigParser()
    if file:
        g_config_parser.read(file)
    for option in g_config_parser.options('configuration'):
        if config.get('configuration', option):
            config.set("configuration", option, g_config_parser.get('configuration', option))

    return config


pass
