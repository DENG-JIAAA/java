package top.djosimon.entity;

/**
 * @author : dj
 * @date : 2020/12/5
 */
public class Sale {
    private Integer id;
    private Integer gId;
    private Integer nums;

    public Sale() {
    }

    public Sale(Integer id, Integer gId, Integer nums) {
        this.id = id;
        this.gId = gId;
        this.nums = nums;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", gId=" + gId +
                ", sums=" + nums +
                '}';
    }
}
