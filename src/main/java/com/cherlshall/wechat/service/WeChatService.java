package com.cherlshall.wechat.service;

import javax.servlet.http.HttpServletRequest;

public interface WeChatService {
    String processRequest(HttpServletRequest request);
}
