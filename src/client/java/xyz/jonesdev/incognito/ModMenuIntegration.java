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

import com.mojang.blaze3d.platform.GLX;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import xyz.jonesdev.incognito.config.ConfigFile;
import xyz.jonesdev.incognito.hardware.CPU;

import java.util.Arrays;

public final class ModMenuIntegration implements ModMenuApi {

    @Override
    public @NotNull ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> configBuilder(parent).build();
    }

    public static @NotNull ConfigBuilder configBuilder(final @NotNull Screen parent) {
        final ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Text.literal("Incognito - Config"));

        builder.setSavingRunnable(ConfigFile.SAVE_CONFIG);

        final ConfigEntryBuilder entryBuilder = builder.entryBuilder();
        final ConfigCategory general = builder.getOrCreateCategory(Text.literal("General"));

        general.addEntry(entryBuilder.startBooleanToggle(Text.literal("Disabled"),
                        IncognitoMod.getOptions().disable)
                .setDefaultValue(false)
                .setSaveConsumer(newValue -> IncognitoMod.getOptions().disable = newValue)
                .build());

        general.addEntry(entryBuilder.startStringDropdownMenu(Text.literal("Spoofed CPU"),
                        IncognitoMod.getOptions().spoofedCPU.getDisplayName(),
                        Text::literal)
                .setDefaultValue(IncognitoMod.getOptions().spoofedCPU.getDisplayName())
                .setSelections(Arrays.stream(CPU.values()).map(CPU::getDisplayName).toList())
                .setSaveConsumer(cpu -> {
                    IncognitoMod.getOptions().spoofedCPU = CPU.fromName(cpu);
                    // Re-initialize GLX to re-build the cpuInfo string.
                    GLX._init(MinecraftClient.getInstance().options.glDebugVerbosity, false);
                })
                .build());

        builder.transparentBackground();
        return builder;
    }
}
