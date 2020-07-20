package org.dolphinemu.dolphinemu.features.settings.model.view;

import org.dolphinemu.dolphinemu.features.settings.model.AbstractFloatSetting;
import org.dolphinemu.dolphinemu.features.settings.model.Settings;

public class FloatSliderSetting extends SliderSetting
{
  protected AbstractFloatSetting mSetting;

  public FloatSliderSetting(AbstractFloatSetting setting, int titleId, int descriptionId, int max,
          String units)
  {
    super(titleId, descriptionId, max, units);
    mSetting = setting;
  }

  public int getSelectedValue(Settings settings)
  {
    return Math.round(mSetting.getFloat(settings));
  }

  public void setSelectedValue(Settings settings, float selection)
  {
    mSetting.setFloat(settings, selection);
  }
}
