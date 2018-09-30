package service;

import org.apache.ibatis.session.SqlSession;
import util.MybatisSessionFactory;

public class ServiceBase {
    private SqlSession sqlSession = MybatisSessionFactory.getSession();
}
