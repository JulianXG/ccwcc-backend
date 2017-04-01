package cn.kalyter.ccwcc.service;

import cn.kalyter.ccwcc.model.Bird;

import java.util.List;

/**
 * Created by Kalyter on 1/16/2017.
 */
public interface BirdService {
    List<Bird> briefInfo();

    int saveBird(Bird bird);
}
