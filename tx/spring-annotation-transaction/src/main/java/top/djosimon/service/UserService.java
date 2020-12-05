package top.djosimon.service;

import top.djosimon.entity.Goods;

public interface UserService {

    Goods getOneGoodsInfoById(Integer id);

    void buyGoodsByIdAndNums(Integer goodsId, Integer goodsNums);

}
