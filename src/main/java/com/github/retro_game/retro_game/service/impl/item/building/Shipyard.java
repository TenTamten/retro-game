package com.github.retro_game.retro_game.service.impl.item.building;

import com.github.retro_game.retro_game.model.entity.BuildingKind;
import com.github.retro_game.retro_game.model.entity.Resources;

import java.util.Collections;
import java.util.Map;

public class Shipyard extends BuildingItem {
  private static final Map<BuildingKind, Integer> buildingsRequirements =
      Collections.singletonMap(BuildingKind.ROBOTICS_FACTORY, 2);

  @Override
  public Map<BuildingKind, Integer> getBuildingsRequirements() {
    return buildingsRequirements;
  }

  @Override
  public Resources getBaseCost() {
    return new Resources(400.0, 200.0, 100.0);
  }
}
