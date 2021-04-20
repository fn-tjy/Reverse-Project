package tao.xxx.service.impl;

import tao.xxx.pojo.Users;
import tao.xxx.mapper.UsersMapper;
import tao.xxx.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author tjy
 * @since 2021-04-20
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
