package mid_study.middle2.set.member;

import java.util.Objects;

public class MemberOnlyHash {
    
    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }

    // id값 기반으로 해시코드 생성
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
