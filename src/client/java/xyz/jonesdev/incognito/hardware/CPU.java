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

package xyz.jonesdev.incognito.hardware;

import org.jetbrains.annotations.NotNull;

public enum CPU {
    // AMD Ryzen processors
    AMD_RYZEN_3_3100("AMD Ryzen 3 3100 4-Core Processor", 4, 8),
    AMD_RYZEN_3_3300X("AMD Ryzen 3 3300X 4-Core Processor", 4, 8),
    AMD_RYZEN_3_5300G("AMD Ryzen 3 5300G 4-Core Processor", 4, 8),
    AMD_RYZEN_3_7320U("AMD Ryzen 3 7320U 4-Core Processor", 4, 8),

    AMD_RYZEN_5_1600("AMD Ryzen 5 1600 Six-Core Processor", 6, 12),
    AMD_RYZEN_5_2600("AMD Ryzen 5 2600 Six-Core Processor", 6, 12),
    AMD_RYZEN_5_3600("AMD Ryzen 5 3600 6-Core Processor", 6, 12),
    AMD_RYZEN_5_5600("AMD Ryzen 5 5600 6-Core Processor", 6, 12),
    //AMD_RYZEN_5_5600G("AMD Ryzen 5 5600G 6-Core Processor", 6, 12), // APU
    AMD_RYZEN_5_5600X("AMD Ryzen 5 5600X 6-Core Processor", 6, 12),
    AMD_RYZEN_5_7600("AMD Ryzen 5 7600 6-Core Processor", 6, 12),
    AMD_RYZEN_5_7600X("AMD Ryzen 5 7600X 6-Core Processor", 6, 12),
    AMD_RYZEN_5_7500F("AMD Ryzen 5 7500F 6-Core Processor", 6, 12),
    AMD_RYZEN_5_9600X("AMD Ryzen 5 9600X 6-Core/12-Thread Processor", 6, 12),

    AMD_RYZEN_7_1700("AMD Ryzen 7 1700 Eight-Core Processor", 8, 16),
    AMD_RYZEN_7_2700("AMD Ryzen 7 2700 Eight-Core Processor", 8, 16),
    AMD_RYZEN_7_2700X("AMD Ryzen 7 2700X Eight-Core Processor", 8, 16),
    AMD_RYZEN_7_3700X("AMD Ryzen 7 3700X 8-Core Processor", 8, 16),
    AMD_RYZEN_7_3800X("AMD Ryzen 7 3800X 8-Core Processor", 8, 16),
    AMD_RYZEN_7_5700X("AMD Ryzen 7 5700X 8-Core Processor", 8, 16),
    //AMD_RYZEN_7_5700G("AMD Ryzen 7 5700G 8-Core Processor", 8, 16), // APU
    AMD_RYZEN_7_5800X("AMD Ryzen 7 5800X 8-Core Processor", 8, 16),
    AMD_RYZEN_7_5800X3D("AMD Ryzen 7 5800X3D 8-Core Processor", 8, 16),
    AMD_RYZEN_7_7700("AMD Ryzen 7 7700 8-Core Processor", 8, 16),
    AMD_RYZEN_7_7700X("AMD Ryzen 7 7700X 8-Core Processor", 8, 16),
    AMD_RYZEN_7_7800X3D("AMD Ryzen 7 7800X3D 8-Core Processor", 8, 16),
    AMD_RYZEN_7_9700X("AMD Ryzen 7 9700X 8-Core Processor", 8, 16),
    AMD_RYZEN_7_9800X3D("AMD Ryzen 7 9800X3D 8-Core Processor", 8, 16),

    AMD_RYZEN_9_3900("AMD Ryzen 9 3900 12-Core Processor", 12, 24),
    AMD_RYZEN_9_3900X("AMD Ryzen 9 3900X 12-Core Processor", 12, 24),
    AMD_RYZEN_9_3950X("AMD Ryzen 9 3950X 16-Core Processor", 16, 32),
    AMD_RYZEN_9_5900X("AMD Ryzen 9 5900X 12-Core Processor", 12, 24),
    AMD_RYZEN_9_5950X("AMD Ryzen 9 5950X 16-Core Processor", 16, 32),
    AMD_RYZEN_9_7900("AMD Ryzen 9 7900 12-Core Processor", 12, 24),
    AMD_RYZEN_9_7900X("AMD Ryzen 9 7900X 12-Core Processor", 12, 24),
    AMD_RYZEN_9_7950X("AMD Ryzen 9 7950X 16-Core Processor", 16, 32),
    AMD_RYZEN_9_7950X3D("AMD Ryzen 9 7950X3D 16-Core Processor", 16, 32),
    AMD_RYZEN_9_9900X("AMD Ryzen 9 9900X 12-Core Processor", 12, 24),
    AMD_RYZEN_9_9900X3D("AMD Ryzen 9 9900X3D 12-Core Processor", 12, 24),
    AMD_RYZEN_9_9950X("AMD Ryzen 9 9950X 16-Core Processor", 16, 32),
    AMD_RYZEN_9_9950X3D("AMD Ryzen 9 9950X3D 16-Core Processor", 16, 32),

    // Intel Core i3 Processors
    INTEL_CORE_I3_10100("Intel(R) Core(TM) i3-10100 CPU @ 3.60GHz", 4, 8),
    INTEL_CORE_I3_12100("Intel(R) Core(TM) i3-12100 CPU @ 3.30GHz", 4, 8),
    INTEL_CORE_I3_14100("Intel(R) Core(TM) i3-14100 CPU @ 3.50GHz", 4, 8),

    // Intel Core i5 Processors
    INTEL_CORE_I5_2500K("Intel(R) Core(TM) i5-2500K CPU @ 3.30GHz", 4, 4), // Sandy Bridge
    INTEL_CORE_I5_4690K("Intel(R) Core(TM) i5-4690K CPU @ 3.50GHz", 4, 4), // Haswell Refresh
    INTEL_CORE_I5_6600K("Intel(R) Core(TM) i5-6600K CPU @ 3.50GHz", 4, 4), // Skylake
    INTEL_CORE_I5_8400("Intel(R) Core(TM) i5-8400 CPU @ 2.80GHz", 6, 6), // Coffee Lake
    INTEL_CORE_I5_10400("Intel(R) Core(TM) i5-10400 CPU @ 2.90GHz", 6, 12),
    INTEL_CORE_I5_11600K("Intel(R) Core(TM) i5-11600K CPU @ 3.90GHz", 6, 12), // Rocket Lake
    INTEL_CORE_I5_12600K("Intel(R) Core(TM) i5-12600K CPU @ 3.70GHz", 10, 16), // 6 P-cores, 4 E-cores, 10 physical, 16 logical
    INTEL_CORE_I5_13600K("Intel(R) Core(TM) i5-13600K CPU @ 3.50GHz", 14, 20), // 6 P-cores, 8 E-cores, 14 physical, 20 logical
    INTEL_CORE_I5_14600K("Intel(R) Core(TM) i5-14600K CPU @ 3.50GHz", 14, 20), // 6 P-cores, 8 E-cores, 14 physical, 20 logical

    // Intel Core i7 Processors
    INTEL_CORE_I7_2600K("Intel(R) Core(TM) i7-2600K CPU @ 3.40GHz", 4, 8), // Sandy Bridge
    INTEL_CORE_I7_4790K("Intel(R) Core(TM) i7-4790K CPU @ 4.00GHz", 4, 8), // Devil's Canyon
    INTEL_CORE_I7_6700K("Intel(R) Core(TM) i7-6700K CPU @ 4.00GHz", 4, 8), // Skylake
    INTEL_CORE_I7_7700K("Intel(R) Core(TM) i7-7700K CPU @ 4.20GHz", 4, 8), // Kaby Lake
    INTEL_CORE_I7_7700("Intel(R) Core(TM) i7-7700 CPU @ 3.60GHz", 4, 8), // Kaby Lake
    INTEL_CORE_I7_7Y75("Intel(R) Core(TM) i7-7Y75 CPU @ 1.30GHz", 2, 4), // Kaby Lake (low power mobile)
    INTEL_CORE_I7_8700K("Intel(R) Core(TM) i7-8700K CPU @ 3.70GHz", 6, 12), // Coffee Lake
    INTEL_CORE_I7_9700K("Intel(R) Core(TM) i7-9700K CPU @ 3.60GHz", 8, 8), // Coffee Lake Refresh
    INTEL_CORE_I7_10700K("Intel(R) Core(TM) i7-10700K CPU @ 3.80GHz", 8, 16),
    INTEL_CORE_I7_11700K("Intel(R) Core(TM) i7-11700K CPU @ 3.60GHz", 8, 16), // Rocket Lake
    INTEL_CORE_I7_12700K("Intel(R) Core(TM) i7-12700K CPU @ 3.60GHz", 12, 20), // 8 P-cores, 4 E-cores, 12 physical, 20 logical
    INTEL_CORE_I7_13700K("Intel(R) Core(TM) i7-13700K CPU @ 3.40GHz", 16, 24), // 8 P-cores, 8 E-cores, 16 physical, 24 logical
    INTEL_CORE_I7_14700K("Intel(R) Core(TM) i7-14700K CPU @ 3.40GHz", 20, 28), // 8 P-cores, 12 E-cores, 20 physical, 28 logical

    // Intel Core i9 Processors
    INTEL_CORE_I9_7900X("Intel(R) Core(TM) i9-7900X CPU @ 3.30GHz", 10, 20), // Skylake-X (HEDT)
    INTEL_CORE_I9_9900K("Intel(R) Core(TM) i9-9900K CPU @ 3.60GHz", 8, 16), // Coffee Lake Refresh
    INTEL_CORE_I9_10900K("Intel(R) Core(TM) i9-10900K CPU @ 3.70GHz", 10, 20),
    INTEL_CORE_I9_11900K("Intel(R) Core(TM) i9-11900K CPU @ 3.50GHz", 8, 16), // Rocket Lake
    INTEL_CORE_I9_12900K("Intel(R) Core(TM) i9-12900K CPU @ 3.20GHz", 16, 24), // 8 P-cores, 8 E-cores, 16 physical, 24 logical
    INTEL_CORE_I9_13900K("Intel(R) Core(TM) i9-13900K CPU @ 3.00GHz", 24, 32), // 8 P-cores, 16 E-cores, 24 physical, 32 logical
    INTEL_CORE_I9_14900K("Intel(R) Core(TM) i9-14900K CPU @ 3.00GHz", 24, 32); // 8 P-cores, 16 E-cores, 24 physical, 32 logical

    private final String name;
    private final String vendor;
    private final int physicalCoreCount;
    private final int logicalCoreCount;

    /**
     * @param name The marketing name of the processor.
     * @param physicalCoreCount The number of physical cores.
     * @param logicalCoreCount The number of logical cores (threads).
     */
    CPU(final @NotNull String name, final int physicalCoreCount, final int logicalCoreCount) {
        this.name = name;
        this.vendor = name.startsWith("AMD") ? "AuthenticAMD" : "GenuineIntel";
        this.physicalCoreCount = physicalCoreCount;
        this.logicalCoreCount = logicalCoreCount;
    }

    /**
     * @return The name of the processor.
     */
    public String getName() {
        return name;
    }

    /**
     * @return The vendor of the processor (e.g., AMD or Intel).
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * @return The number of physical cores of the processor.
     */
    public int getPhysicalCoreCount() {
        return physicalCoreCount;
    }

    /**
     * @return The number of logical cores (threads) of the processor.
     */
    public int getLogicalCoreCount() {
        return logicalCoreCount;
    }
}
