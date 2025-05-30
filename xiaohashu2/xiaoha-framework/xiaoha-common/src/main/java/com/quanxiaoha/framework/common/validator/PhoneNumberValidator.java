package com.quanxiaoha.framework.common.validator;

import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.ConstraintValidator;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {
    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
        // 这里进行一些初始化操作
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        // 校验逻辑
        return phoneNumber != null && phoneNumber.matches("\\d{11}");
    }
}
