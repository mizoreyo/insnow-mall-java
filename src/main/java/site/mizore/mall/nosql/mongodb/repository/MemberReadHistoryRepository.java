package site.mizore.mall.nosql.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import site.mizore.mall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * 会员商品浏览历史Repository
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {

    /**
     * 根据会员id按时间倒序获取浏览记录
     * @param memberId
     * @return
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);

}
