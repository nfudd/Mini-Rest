package cn.sinjinsong.sample.dao.mail;


import cn.sinjinsong.sample.domain.entity.mail.MailTextDO;

public interface MailTextDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int insert(MailTextDO record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    MailTextDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MailTextDO record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MailTextDO record);
}