package org.dolphinemu.dolphinemu.features.settings.model;

public class AbstractLegacySetting implements AbstractSetting
{
  protected final String mFile;
  protected final String mSection;
  protected final String mKey;

  public AbstractLegacySetting(String file, String section, String key)
  {
    mFile = file;
    mSection = section;
    mKey = key;
  }

  @Override
  public boolean delete(Settings settings)
  {
    return settings.getSection(mFile, mSection).delete(mKey);
  }
}
