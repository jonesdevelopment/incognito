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

public final class Options {

  @Expose
  @SerializedName("spoof-cpu")
  public boolean spoofCPU = false;

  @Expose
  @SerializedName("cpu-physical-cores")
  public int physicalCoreCount = DefaultOptions.CPU_PHYSICAL_CORES;

  @Expose
  @SerializedName("cpu-logical-cores")
  public int logicalCoreCount = DefaultOptions.CPU_LOGICAL_CORES;

  @Expose
  @SerializedName("cpu-name")
  public String cpuName = DefaultOptions.CPU_NAME;

  @Expose
  @SerializedName("cpu-vendor")
  public String cpuVendor = DefaultOptions.CPU_VENDOR;

  @Expose
  @SerializedName("cpu-family")
  public String cpuFamily = DefaultOptions.CPU_FAMILY;

  @Expose
  @SerializedName("cpu-model")
  public String cpuModel = DefaultOptions.CPU_MODEL;

  @Expose
  @SerializedName("spoof-gpu")
  public boolean spoofGPU = false;

  @Expose
  @SerializedName("gpu-model")
  public String gpuModel = DefaultOptions.GPU_NAME;

  @Expose
  @SerializedName("gpu-vendor")
  public String gpuVendor = DefaultOptions.GPU_VENDOR;

  @Expose
  @SerializedName("gpu-version")
  public String gpuVersion = DefaultOptions.GPU_DRIVER_VERSION;
}
