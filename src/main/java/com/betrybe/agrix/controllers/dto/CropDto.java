package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;

/**
 * The type Crop dto.
 */
public record CropDto(Long id, String name, Double plantedArea, Long farmId) {
  public Crop toCrop() {
    return new Crop(id, name, plantedArea, null);
  }

  public static CropDto toDto(Crop crop) {
    return new CropDto(crop.getId(), crop.getName(), crop.getPlantedArea(), crop.getFarm().getId());
  }
}
