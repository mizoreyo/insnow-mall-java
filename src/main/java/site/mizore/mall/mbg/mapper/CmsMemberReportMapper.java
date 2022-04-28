package site.mizore.mall.mbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import site.mizore.mall.mbg.model.CmsMemberReport;
import site.mizore.mall.mbg.model.CmsMemberReportExample;

public interface CmsMemberReportMapper {
    int countByExample(CmsMemberReportExample example);

    int deleteByExample(CmsMemberReportExample example);

    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);

    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    int updateByExampleSelective(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    int updateByExample(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);
}