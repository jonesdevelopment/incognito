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

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import xyz.jonesdev.incognito.hardware.CPUVendor;
import xyz.jonesdev.incognito.hardware.GPUVendor;
import xyz.jonesdev.incognito.hardware.GPUVersion;

public final class Options {

    @Expose
    @SerializedName("spoof-cpu")
    public boolean spoofCPU = false;

    @Expose
    @SerializedName("cpu-physical-cores")
    public int physicalCoreCount = 8;

    @Expose
    @SerializedName("cpu-logical-cores")
    public int logicalCoreCount = 16;

    @Expose
    @SerializedName("cpu-name")
    public String cpuName = "AMD Ryzen 7 5800X 8-Core Processor";

    @Expose
    @SerializedName("cpu-vendor")
    public String cpuVendor = CPUVendor.AMD;

    @Expose
    @SerializedName("cpu-family")
    public String cpuFamily = "23";

    @Expose
    @SerializedName("cpu-model")
    public String cpuModel = "113";

    @Expose
    @SerializedName("spoof-gpu")
    public boolean spoofGPU = false;

    @Expose
    @SerializedName("gpu-model")
    public String gpuModel = "AMD Radeon RX 7700 XT";

    @Expose
    @SerializedName("gpu-vendor")
    public String gpuVendor = GPUVendor.AMD;

    @Expose
    @SerializedName("gpu-version")
    public String gpuVersion = GPUVersion.AMD;
}
