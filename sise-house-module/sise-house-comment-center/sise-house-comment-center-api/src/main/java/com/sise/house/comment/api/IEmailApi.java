package com.sise.house.comment.api;

import com.sise.common.rest.ServerResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description: 邮件服务 API
 * @Auther: 冲之
 * @Date: 2019/2/18 02:17
 */
@Api(tags = {"消息中心：邮件服务"})
@FeignClient(value = "sise-comment", path = "/email/")
@Validated
public interface IEmailApi {

    @GetMapping("/codeNotify/{email}")
    @ApiOperation(value = "发送验证码", notes = "发送验证码")
    ServerResponse codeNotify(@PathVariable("email") String email);
}
