// This is an first flintbit tutorial

log.info("Send data to Queue"+input.get("queue_name"));
util.sendToQueue(input.get("queue_name"),input.get("queue_body").toString());
log.trace("Data send successfully");
