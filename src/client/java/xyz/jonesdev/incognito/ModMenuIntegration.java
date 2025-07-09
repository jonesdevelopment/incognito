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

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import xyz.jonesdev.incognito.config.ConfigFile;
import xyz.jonesdev.incognito.hardware.GPUVendor;
import xyz.jonesdev.incognito.hardware.GPUVersion;

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
        final ConfigCategory cpu = builder.getOrCreateCategory(Text.literal("CPU"));

        cpu.addEntry(entryBuilder.startBooleanToggle(Text.literal("Enable Spoofing"),
                        IncognitoMod.getOptions().spoofCPU)
                .setDefaultValue(false)
                .setSaveConsumer(newValue -> IncognitoMod.getOptions().spoofCPU = newValue)
                .build());

        cpu.addEntry(entryBuilder.startIntField(Text.literal("Physical Cores"),
                        IncognitoMod.getOptions().physicalCoreCount)
                .setDefaultValue(8)
                .setSaveConsumer(newValue -> IncognitoMod.getOptions().physicalCoreCount = newValue)
                .build());

        cpu.addEntry(entryBuilder.startIntField(Text.literal("Logical Cores"),
                        IncognitoMod.getOptions().logicalCoreCount)
                .setDefaultValue(16)
                .setSaveConsumer(newValue -> IncognitoMod.getOptions().logicalCoreCount = newValue)
                .build());

        cpu.addEntry(entryBuilder.startStrField(Text.literal("CPU Model"),
                        IncognitoMod.getOptions().cpuModel)
                .setDefaultValue("AMD Ryzen 7 5800X 8-Core Processor")
                .setSaveConsumer(newValue -> IncognitoMod.getOptions().cpuModel = newValue)
                .build());

        final ConfigCategory gpu = builder.getOrCreateCategory(Text.literal("GPU"));

        gpu.addEntry(entryBuilder.startBooleanToggle(Text.literal("Enable Spoofing"),
                        IncognitoMod.getOptions().spoofGPU)
                .setDefaultValue(false)
                .setSaveConsumer(newValue -> IncognitoMod.getOptions().spoofGPU = newValue)
                .build());

        gpu.addEntry(entryBuilder.startStrField(Text.literal("GPU Model"),
                        IncognitoMod.getOptions().gpuModel)
                .setDefaultValue("AMD Radeon RX 7700 XT")
                .setSaveConsumer(newValue -> IncognitoMod.getOptions().gpuModel = newValue)
                .build());

        gpu.addEntry(entryBuilder.startStrField(Text.literal("GPU Vendor"),
                        IncognitoMod.getOptions().gpuVendor)
                .setDefaultValue(GPUVendor.AMD)
                .setSaveConsumer(newValue -> IncognitoMod.getOptions().gpuVendor = newValue)
                .build());

        gpu.addEntry(entryBuilder.startStrField(Text.literal("GPU Version"),
                        IncognitoMod.getOptions().gpuVersion)
                .setDefaultValue(GPUVersion.AMD)
                .setSaveConsumer(newValue -> IncognitoMod.getOptions().gpuVersion = newValue)
                .build());

        builder.transparentBackground();
        return builder;
    }
}
