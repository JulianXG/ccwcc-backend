package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.dao.BirdMapper;
import cn.kalyter.ccwcc.model.Bird;
import cn.kalyter.ccwcc.model.BirdExample;
import cn.kalyter.ccwcc.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kalyter on 1/16/2017.
 */
@Service
public class BirdServiceImpl implements BirdService {
    @Autowired
    private BirdMapper birdMapper;

    @Override
    public List<Bird> briefInfo() {
        BirdExample example = new BirdExample();
        example.or().andIsDeletedEqualTo(false);
        return birdMapper.selectByExample(example);
    }

    @Override
    public int saveBird(Bird bird) {
        return birdMapper.insertSelective(bird);
    }
}
