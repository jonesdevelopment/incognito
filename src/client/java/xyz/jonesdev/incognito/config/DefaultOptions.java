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

public final class DefaultOptions {
  // Example CPU: AMD Ryzen 7 5800X
  // https://www.amd.com/en/products/processors/desktops/ryzen/5000-series/amd-ryzen-7-5800x.html
  public static final String CPU_NAME = "AMD Ryzen 7 5800X 8-Core Processor";
  public static final int CPU_PHYSICAL_CORES = 8;
  public static final int CPU_LOGICAL_CORES = 16;
  public static final String CPU_FAMILY = "23"; // Debugged
  public static final String CPU_MODEL = "113"; // Debugged
  public static final String CPU_VENDOR = "AuthenticAMD";

  // Example GPU: AMD RX 7700 XT
  // https://www.amd.com/en/products/graphics/desktops/radeon/7000-series/amd-radeon-rx-7700-xt.html
  public static final String GPU_NAME = "AMD Radeon RX 7700 XT";
  public static final String GPU_VENDOR = "ATI Technologies Inc.";
  public static final String GPU_DRIVER_VERSION = "4.6.0 Core Profile Context 25.6.3";
}
