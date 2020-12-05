package top.djosimon.service.impl;

import top.djosimon.dao.GoodsDao;
import top.djosimon.dao.SaleDao;
import top.djosimon.entity.Goods;
import top.djosimon.entity.Sale;
import top.djosimon.excep.NotEnoughException;
import top.djosimon.service.UserService;

/**
 * @author : dj
 * @date : 2020/12/5
 */
public class UserServiceImpl implements UserService {

    private SaleDao saleDao;
    private GoodsDao goodsDao;

    // 通过id来查询一个货物的详细信息
    public Goods getOneGoodsInfoById(Integer id) {
        return goodsDao.selectOneGoodsById(id);
    }

    // 通过货物id和购买数量来买商品（1、完成销售记录；2、完成货物库存更新）
    public void buyGoodsByIdAndNums(Integer goodsId, Integer goodsNums) {
        System.out.println("====================== 进店 ======================");
        // 添加销售记录
        Sale newSale = new Sale();
        newSale.setgId(goodsId);
        newSale.setNums(goodsNums);
        saleDao.insertOneSale(newSale);

        // 用户买的商品不存在或者是商品库存不足（将抛出异常）
        Goods hasGoods = goodsDao.selectOneGoodsById(goodsId);
        if (hasGoods == null) {
            throw new NullPointerException("抱歉，无商品id为：【" + goodsId + "】的货源");
        } else if (hasGoods.getCount() < goodsNums) {
            throw new NotEnoughException("抱歉，商品id为：【" + goodsId + "】的库存不不足");
        }

        // 用户完成商品的购买，更新商品库存信息
        Goods updateGoods = new Goods();
        updateGoods.setId(goodsId);
        updateGoods.setCount(goodsNums);
        goodsDao.updateOneGoods(updateGoods);
        System.out.println("购置完毕");
        System.out.println("====================== 出店 ======================");
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
