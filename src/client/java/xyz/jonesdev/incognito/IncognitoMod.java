/*
 * Copyright (C) 2025 Jones Development
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package xyz.jonesdev.incognito;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import xyz.jonesdev.incognito.config.ConfigFile;
import xyz.jonesdev.incognito.config.Options;

public final class IncognitoMod implements ClientModInitializer {
  public static final Logger LOGGER = LogManager.getLogger("incognito");

  private static Options sessionOptions = new Options();
  public static boolean shouldReinitCpuInfo;

  public static Options getOptions() {
    return sessionOptions;
  }

  public static void updateOptions(final @NotNull Options options) {
    sessionOptions = options;
  }

  @Override
  public void onInitializeClient() {
    ConfigFile.loadConfig();
  }
}
