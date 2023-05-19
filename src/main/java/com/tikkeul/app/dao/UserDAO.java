package com.tikkeul.app.dao;

import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;






//    홍윤기의 작업공간
    //    아이디 중복검사
    public Optional<UserVO> selectByUserId(String identification){
        return userMapper.selectByUserId(identification);
    };

    //    회원가입
    public void insert(UserVO userVO){
        userMapper.insert(userVO);
    };

    //    로그인
    public Optional<Long> selectByUserIdAndUserPassword(@Param("id") String id, @Param("password") String password){
        return userMapper.selectByUserIdAndUserPassword(id,password);
    };<select id="adminSelectUserAll" resultType="userVO">
        SELECT ID, NAME , IDENTIFICATION, ADDRESS, PHONENUMBER
        FROM USERS
    </select>

    <select id="selectByUserId" resultType="UserVO">
    SELECT ID, IDENTIFICATION, PASSWORD, NAME, PHONENUMBER, ADDRESS, STATUS, ROLL, CREATEDDATE, PROFILEIMAGENAME, PROFILEIMAGESIZE, PROFILEIMAGEUUID, SAVINGLEVEL_ID
    FROM USERS

    </select>

<!--회원가입-->
    <insert id="insert">
    INSERT INTO USERS
    (ID, IDENTIFICATION, PASSWORD, NAME, PHONENUMBER, ADDRESS, STATUS, ROLL, CREATEDDATE, PROFILEIMAGENAME, PROFILEIMAGESIZE, PROFILEIMAGEUUID, SAVINGLEVEL_ID)
    VALUES(SEQ_USER.NEXTVAL, #{identification},#{password},#{name},#{phoneNumber},#{address},1,normal, SYSDATE,#{profileImageName},#{profileImageSize},#{profileImageUuid},#{levelId});
    </insert>

}
