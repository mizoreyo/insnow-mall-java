package site.mizore.mall.mbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import site.mizore.mall.mbg.model.SmsFlashPromotionLog;
import site.mizore.mall.mbg.model.SmsFlashPromotionLogExample;

public interface SmsFlashPromotionLogMapper {
    int countByExample(SmsFlashPromotionLogExample example);

    int deleteByExample(SmsFlashPromotionLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionLog record);

    int insertSelective(SmsFlashPromotionLog record);

    List<SmsFlashPromotionLog> selectByExample(SmsFlashPromotionLogExample example);

    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsFlashPromotionLog record, @Param("example") SmsFlashPromotionLogExample example);

    int updateByExample(@Param("record") SmsFlashPromotionLog record, @Param("example") SmsFlashPromotionLogExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    int updateByPrimaryKey(SmsFlashPromotionLog record);
}