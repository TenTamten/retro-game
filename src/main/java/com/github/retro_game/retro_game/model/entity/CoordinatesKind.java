package com.github.retro_game.retro_game.model.entity;

public enum CoordinatesKind {
  PLANET,
  MOON,
  DEBRIS_FIELD;

  public String getShortcut() {
    switch (this) {
      case PLANET:
        return "P";
      case MOON:
        return "M";
      case DEBRIS_FIELD:
        return "DF";
      default:
        throw new IllegalArgumentException("getShortcut() not implemented for this value");
    }
  }
}
