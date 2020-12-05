package top.djosimon.dao;

import top.djosimon.entity.Goods;

public interface GoodsDao {

    Goods selectOneGoodsById(Integer id);

    int updateOneGoods(Goods goods);

}
