package com.user.usermanagement.dao;

import com.user.usermanagement.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDaoImpl extends CrudRepository<User ,Long> {77

    /*User findById(long id);
    @Transactional
    @Modifying
    @Query("select * from User where id=:id")
    User findById(@Param("id") Long id);*/

    /*@Transactional
    @Modifying
    @Query("select * from User where id=:id")
    Optional<String> findById(@Param("id") Long id);*/


    /*List<User> userList = new ArrayList<>();
    public List<User> getAllUsers() {
        return userList;
    }*/

    /*public User getUser(Long id) {
        Optional<User> first = userList.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
        if(first.isPresent()){
            return first.get();
        }else{
            return new User();
        }
    }*/
}
