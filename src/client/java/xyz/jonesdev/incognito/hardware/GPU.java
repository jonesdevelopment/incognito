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
import org.jetbrains.annotations.Nullable;

public enum GPU {
    REAL("No modification"),
    UNKNOWN(null),

    // NVIDIA graphics cards
    NVIDIA_GTX_970("NVIDIA GeForce GTX 970 4GB/PCIe/SSE2"),
    NVIDIA_GTX_980("NVIDIA GeForce GTX 980 4GB/PCIe/SSE2"),
    NVIDIA_GTX_1050("NVIDIA GeForce GTX 1050 2GB/PCIe/SSE2"),
    NVIDIA_GTX_1060("NVIDIA GeForce GTX 1060 6GB/PCIe/SSE2"),
    NVIDIA_GTX_1650("NVIDIA GeForce GTX 1650 4GB/PCIe/SSE2"),
    NVIDIA_GTX_1660("NVIDIA GeForce GTX 1660 6GB/PCIe/SSE2"),
    NVIDIA_GTX_1660_SUPER("NVIDIA GeForce GTX 1660 SUPER 6GB/PCIe/SSE2"),
    NVIDIA_GTX_1660_TI("NVIDIA GeForce GTX 1660 Ti 6GB/PCIe/SSE2"),
    NVIDIA_RTX_2060("NVIDIA GeForce RTX 2060 6GB/PCIe/SSE2"),
    NVIDIA_RTX_2060_SUPER("NVIDIA GeForce RTX 2060 SUPER 8GB/PCIe/SSE2"),
    NVIDIA_RTX_2070("NVIDIA GeForce RTX 2070 8GB/PCIe/SSE2"),
    NVIDIA_RTX_2070_SUPER("NVIDIA GeForce RTX 2070 SUPER 8GB/PCIe/SSE2"),
    NVIDIA_RTX_2080("NVIDIA GeForce RTX 2080 8GB/PCIe/SSE2"),
    NVIDIA_RTX_2080_SUPER("NVIDIA GeForce RTX 2080 SUPER 8GB/PCIe/SSE2"),
    NVIDIA_RTX_2080_TI("NVIDIA GeForce RTX 2080 Ti 11GB/PCIe/SSE2"),
    NVIDIA_RTX_3050("NVIDIA GeForce RTX 3050 8GB/PCIe/SSE2"),
    NVIDIA_RTX_3060("NVIDIA GeForce RTX 3060 12GB/PCIe/SSE2"),
    NVIDIA_RTX_3060_TI("NVIDIA GeForce RTX 3060 Ti 8GB/PCIe/SSE2"),
    NVIDIA_RTX_3070("NVIDIA GeForce RTX 3070 8GB/PCIe/SSE2"),
    NVIDIA_RTX_3070_TI("NVIDIA GeForce RTX 3070 Ti 8GB/PCIe/SSE2"),
    NVIDIA_RTX_3080("NVIDIA GeForce RTX 3080 10GB/PCIe/SSE2"),
    NVIDIA_RTX_3080_12GB("NVIDIA GeForce RTX 3080 12GB/PCIe/SSE2"),
    NVIDIA_RTX_3080_TI("NVIDIA GeForce RTX 3080 Ti 12GB/PCIe/SSE2"),
    NVIDIA_RTX_3090("NVIDIA GeForce RTX 3090 24GB/PCIe/SSE2"),
    NVIDIA_RTX_3090_TI("NVIDIA GeForce RTX 3090 Ti 24GB/PCIe/SSE2"),
    NVIDIA_RTX_4060("NVIDIA GeForce RTX 4060 8GB/PCIe/SSE2"),
    NVIDIA_RTX_4060_TI("NVIDIA GeForce RTX 4060 Ti 8GB/PCIe/SSE2"),
    NVIDIA_RTX_4070("NVIDIA GeForce RTX 4070 12GB/PCIe/SSE2"),
    NVIDIA_RTX_4070_SUPER("NVIDIA GeForce RTX 4070 SUPER 12GB/PCIe/SSE2"),
    NVIDIA_RTX_4070_TI("NVIDIA GeForce RTX 4070 Ti 12GB/PCIe/SSE2"),
    NVIDIA_RTX_4070_TI_SUPER("NVIDIA GeForce RTX 4070 Ti SUPER 16GB/PCIe/SSE2"),
    NVIDIA_RTX_4080("NVIDIA GeForce RTX 4080 16GB/PCIe/SSE2"),
    NVIDIA_RTX_4080_SUPER("NVIDIA GeForce RTX 4080 SUPER 16GB/PCIe/SSE2"),
    NVIDIA_RTX_4090("NVIDIA GeForce RTX 4090 24GB/PCIe/SSE2"),

    // AMD graphics cards
    AMD_RX_5500_XT("AMD Radeon RX 5500 XT"),
    AMD_RX_5600_XT("AMD Radeon RX 5600 XT"),
    AMD_RX_5700("AMD Radeon RX 5700"),
    AMD_RX_5700_XT("AMD Radeon RX 5700 XT"),
    AMD_RX_6400("AMD Radeon RX 6400"),
    AMD_RX_6500XT("AMD Radeon RX 6500 XT"),
    AMD_RX_6600("AMD Radeon RX 6600"),
    AMD_RX_6600XT("AMD Radeon RX 6600 XT"),
    AMD_RX_6650XT("AMD Radeon RX 6650 XT"),
    AMD_RX_6700XT("AMD Radeon RX 6700 XT"),
    AMD_RX_6750XT("AMD Radeon RX 6750 XT"),
    AMD_RX_6800("AMD Radeon RX 6800"),
    AMD_RX_6800XT("AMD Radeon RX 6800 XT"),
    AMD_RX_6900XT("AMD Radeon RX 6900 XT"),
    AMD_RX_6950XT("AMD Radeon RX 6950 XT"),
    AMD_RX_7600("AMD Radeon RX 7600"),
    AMD_RX_7600XT("AMD Radeon RX 7600 XT"),
    AMD_RX_7700XT("AMD Radeon RX 7700 XT"),
    AMD_RX_7800XT("AMD Radeon RX 7800 XT"),
    AMD_RX_7900GRE("AMD Radeon RX 7900 GRE"),
    AMD_RX_7900XT("AMD Radeon RX 7900 XT"),
    AMD_RX_7900XTX("AMD Radeon RX 7900 XTX"),
    AMD_RX_9060XT("AMD Radeon RX 9060 XT"),
    AMD_RX_9070("AMD Radeon RX 9070"),
    AMD_RX_9070XT("AMD Radeon RX 9070 XT"),

    // Intel Integrated Graphics
    INTEL_HD_GRAPHICS_2000("Intel(R) HD Graphics 2000"), // Sandy Bridge
    INTEL_HD_GRAPHICS_3000("Intel(R) HD Graphics 3000"), // Sandy Bridge
    INTEL_HD_GRAPHICS_2500("Intel(R) HD Graphics 2500"), // Ivy Bridge
    INTEL_HD_GRAPHICS_4000("Intel(R) HD Graphics 4000"), // Ivy Bridge
    INTEL_HD_GRAPHICS_4600("Intel(R) HD Graphics 4600"), // Haswell
    INTEL_HD_GRAPHICS_6000("Intel(R) HD Graphics 6000"),
    INTEL_UHD_GRAPHICS_600("Intel(R) UHD Graphics 600"),
    INTEL_UHD_GRAPHICS_610("Intel(R) UHD Graphics 610"),
    INTEL_UHD_GRAPHICS_620("Intel(R) UHD Graphics 620"),
    INTEL_UHD_GRAPHICS_630("Intel(R) UHD Graphics 630"),
    INTEL_UHD_GRAPHICS_730("Intel(R) UHD Graphics 730"),
    INTEL_UHD_GRAPHICS_750("Intel(R) UHD Graphics 750"),
    INTEL_UHD_GRAPHICS_770("Intel(R) UHD Graphics 770"),;

    private final @Nullable String name;
    private final String version;
    private final String displayName;
    private final String vendor;

    /**
     * @param name The marketing name of the graphics card.
     */
    GPU(final @Nullable String name) {
        this.name = name;
        this.version = getVersion(name);
        this.displayName = getDisplayName(name);
        this.vendor = getVendor(name);
    }

    /**
     * @param name The full name of the graphics card.
     * @return The version of OpenGL and the graphics driver.
     */
    private static @NotNull String getVersion(final @Nullable String name) {
        if (name == null) {
            return "<unknown>";
        } else if (name.startsWith("NVIDIA")) {
            // NVIDIA GeForce Game Ready Driver 576.88 (as of 2025/07/01)
            return "4.6.0 NVIDIA 576.88";
        } else if (name.startsWith("AMD")) {
            // AMD Radeon Software Adrenalin Edition 25.6.3 (as of July 2025/07/01)
            return "4.6.0 Core Profile Context 25.6.3";
        } else if (name.startsWith("Intel")) {
            // Intel Arc & Iris Xe Graphics 32.0.101.6913 (as of July 2025/07/01)
            return "4.6.0 INTEL-32.0.101.6913";
        }
        return "<unmodified>";
    }

    /**
     * @param name The full name of the graphics card.
     * @return A shortened version of the name.
     */
    private static @NotNull String getDisplayName(final @Nullable String name) {
        if (name == null) {
            return "<unknown>";
        } else if (name.startsWith("NVIDIA")) {
            final String[] split = name.split(" ");
            if (split.length > 5) {
                return String.format("%s %s %s", split[2], split[3], split[4]);
            }
            return String.format("%s %s", split[2], split[3]);
        } else if (name.startsWith("AMD")) {
            final String[] split = name.split(" ");
            if (split.length > 4) {
                return String.format("%s %s %s", split[2], split[3], split[4]);
            }
            return String.format("%s %s", split[2], split[3]);
        } else if (name.startsWith("Intel")) {
            final String[] split = name.split(" ");
            return String.format("%s %s %s", split[0], split[1], split[3])
                    .replaceFirst("\\(R\\)", "");
        }
        return "<unmodified>";
    }

    /**
     * @param name The full name of the graphics card.
     * @return The vendor of the graphics card (e.g., NVIDIA, AMD, Intel).
     */
    private static @NotNull String getVendor(final @Nullable String name) {
        if (name == null) {
            return "<unknown>";
        } else if (name.startsWith("NVIDIA")) {
            return "NVIDIA Corporation";
        } else if (name.startsWith("AMD")) {
            return "ATI Technologies Inc.";
        } else if (name.startsWith("Intel")) {
            return "Intel Inc.";
        }
        return "<unmodified>";
    }

    /**
     * @return The name of the graphics card.
     */
    public @Nullable String getRenderer() {
        return name;
    }

    /**
     * @return The version of the graphics card renderer.
     */
    public String getVersion() {
        return version;
    }

    /**
     * @return The short name of the graphics card used in the configuration.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @return The vendor of the graphics card (e.g., AMD or Intel).
     */
    public String getVendor() {
        return vendor;
    }

    public boolean shouldSpoof() {
        return this != REAL;
    }

    public static @NotNull GPU fromName(final @NotNull String name) {
        for (final GPU gpu : values()) {
            if (gpu == UNKNOWN || gpu.name == null) {
                continue;
            }
            if (gpu.name.equals(name) || gpu.displayName.equals(name)) {
                return gpu;
            }
        }
        return GPU.UNKNOWN;
    }
}
