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

package xyz.jonesdev.incognito.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import xyz.jonesdev.incognito.IncognitoMod;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public final class ConfigFile {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File CONFIG_FOLDER = new File("config");
    private static final File CONFIG_FILE = new File(CONFIG_FOLDER, "incognito.json");

    public final static Runnable SAVE_CONFIG = () -> {
        if (!CONFIG_FOLDER.exists() && !CONFIG_FOLDER.mkdirs()) {
            IncognitoMod.LOGGER.error("Could not create configuration folder");
            return;
        }
        try {
            if (!CONFIG_FILE.exists() && !CONFIG_FILE.createNewFile()) {
                IncognitoMod.LOGGER.error("Could not create configuration file");
                return;
            }
            final String json = GSON.toJson(IncognitoMod.getOptions());
            Files.writeString(CONFIG_FILE.toPath(), json, StandardCharsets.UTF_8);
        } catch (IOException exception) {
            IncognitoMod.LOGGER.error("Error saving config", exception);
        }
    };

    public static void loadConfig() {
        if (!CONFIG_FILE.exists()) {
            IncognitoMod.LOGGER.warn("Configuration does not exist, falling back to default implementation.");
            return;
        }
        try (final InputStream inputStream = Files.newInputStream(CONFIG_FILE.toPath());
             final InputStreamReader inputStreamReader = new InputStreamReader(inputStream)) {
            IncognitoMod.updateOptions(GSON.fromJson(inputStreamReader, Options.class));
        } catch (Exception exception) {
            IncognitoMod.LOGGER.error("Error loading config", exception);
        }
    }
}
