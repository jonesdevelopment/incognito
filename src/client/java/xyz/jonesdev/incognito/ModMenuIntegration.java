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
import xyz.jonesdev.incognito.config.DefaultOptions;

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
      .setSaveConsumer(newValue -> {
        IncognitoMod.getOptions().spoofCPU = newValue;
        rebuildCPUInfo();
      })
      .build());

    cpu.addEntry(entryBuilder.startIntField(Text.literal("Physical Cores"),
        IncognitoMod.getOptions().physicalCoreCount)
      .setDefaultValue(DefaultOptions.CPU_PHYSICAL_CORES)
      .setSaveConsumer(newValue -> {
        IncognitoMod.getOptions().physicalCoreCount = newValue;
        rebuildCPUInfo();
      })
      .build());

    cpu.addEntry(entryBuilder.startIntField(Text.literal("Logical Cores"),
        IncognitoMod.getOptions().logicalCoreCount)
      .setDefaultValue(DefaultOptions.CPU_LOGICAL_CORES)
      .setSaveConsumer(newValue -> {
        IncognitoMod.getOptions().logicalCoreCount = newValue;
        rebuildCPUInfo();
      })
      .build());

    cpu.addEntry(entryBuilder.startStrField(Text.literal("CPU Name"),
        IncognitoMod.getOptions().cpuName)
      .setDefaultValue(DefaultOptions.CPU_NAME)
      .setSaveConsumer(newValue -> {
        IncognitoMod.getOptions().cpuName = newValue;
        rebuildCPUInfo();
      })
      .build());

    cpu.addEntry(entryBuilder.startStrField(Text.literal("CPU Vendor"),
        IncognitoMod.getOptions().cpuVendor)
      .setDefaultValue(DefaultOptions.CPU_VENDOR)
      .setSaveConsumer(newValue -> {
        IncognitoMod.getOptions().cpuVendor = newValue;
        rebuildCPUInfo();
      })
      .build());

    cpu.addEntry(entryBuilder.startStrField(Text.literal("CPU Family"),
        IncognitoMod.getOptions().cpuFamily)
      .setDefaultValue(DefaultOptions.CPU_FAMILY)
      .setSaveConsumer(newValue -> {
        IncognitoMod.getOptions().cpuFamily = newValue;
        rebuildCPUInfo();
      })
      .build());

    cpu.addEntry(entryBuilder.startStrField(Text.literal("CPU Model"),
        IncognitoMod.getOptions().cpuModel)
      .setDefaultValue(DefaultOptions.CPU_MODEL)
      .setSaveConsumer(newValue -> {
        IncognitoMod.getOptions().cpuModel = newValue;
        rebuildCPUInfo();
      })
      .build());

    final ConfigCategory gpu = builder.getOrCreateCategory(Text.literal("GPU"));

    gpu.addEntry(entryBuilder.startBooleanToggle(Text.literal("Enable Spoofing"),
        IncognitoMod.getOptions().spoofGPU)
      .setDefaultValue(false)
      .setSaveConsumer(newValue -> IncognitoMod.getOptions().spoofGPU = newValue)
      .build());

    gpu.addEntry(entryBuilder.startStrField(Text.literal("GPU Model"),
        IncognitoMod.getOptions().gpuModel)
      .setDefaultValue(DefaultOptions.GPU_NAME)
      .setSaveConsumer(newValue -> IncognitoMod.getOptions().gpuModel = newValue)
      .build());

    gpu.addEntry(entryBuilder.startStrField(Text.literal("GPU Vendor"),
        IncognitoMod.getOptions().gpuVendor)
      .setDefaultValue(DefaultOptions.GPU_VENDOR)
      .setSaveConsumer(newValue -> IncognitoMod.getOptions().gpuVendor = newValue)
      .build());

    gpu.addEntry(entryBuilder.startStrField(Text.literal("GPU Version"),
        IncognitoMod.getOptions().gpuVersion)
      .setDefaultValue(DefaultOptions.GPU_DRIVER_VERSION)
      .setSaveConsumer(newValue -> IncognitoMod.getOptions().gpuVersion = newValue)
      .build());

    builder.transparentBackground();
    return builder;
  }

  private static void rebuildCPUInfo() {
    IncognitoMod.shouldReinitCpuInfo = true;
  }
}
