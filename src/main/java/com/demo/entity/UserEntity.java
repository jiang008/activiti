package com.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @version 1.0
 * @Author JY
 * @Date 2020/12/11 16:28
 */
@Data
@TableName("user")
public class UserEntity {
	private Integer id;
}
