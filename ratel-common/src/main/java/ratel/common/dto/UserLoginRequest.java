package ratel.common.dto;

import lombok.Data;

/**
 * @author ratel
 * @date 2020/3/16
 */
@Data
public class UserLoginRequest {
    private String username;
    private String password;
}
