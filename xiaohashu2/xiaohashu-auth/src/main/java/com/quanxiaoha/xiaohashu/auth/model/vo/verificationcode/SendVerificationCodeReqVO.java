package com.quanxiaoha.xiaohashu.auth.model.vo.verificationcode;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.Message;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SendVerificationCodeReqVO {
    @NotBlank(message = "手机号不能为空")
    private String phone;
}
