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
import xyz.jonesdev.incognito.hardware.CPU;
import xyz.jonesdev.incognito.hardware.GPU;

public final class Options {

    @Expose
    @SerializedName("disable")
    public boolean disable = false;

    @Expose
    @SerializedName("spoofed-cpu")
    public CPU spoofedCPU = CPU.REAL;

    @Expose
    @SerializedName("spoofed-gpu")
    public GPU spoofedGPU = GPU.REAL;
}
