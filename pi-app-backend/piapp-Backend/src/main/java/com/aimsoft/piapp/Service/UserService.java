package com.aimsoft.piapp.Service;

import com.aimsoft.piapp.Dto.LoginDTO;
import com.aimsoft.piapp.Dto.UserDTO;
import com.aimsoft.piapp.Response.LoginMessage;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String addUser(UserDTO userDTO);
    LoginMessage loginUser(LoginDTO loginDTO);
}
