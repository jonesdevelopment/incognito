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

package xyz.jonesdev.incognito.mixin;

import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import oshi.hardware.CentralProcessor;
import xyz.jonesdev.incognito.IncognitoMod;

@Mixin(value = CentralProcessor.ProcessorIdentifier.class, remap = false)
public final class ProcessorIdentifierMixin {

    /**
     * @author Jones
     * @reason Spoof the name of the processor.
     */
    @Overwrite
    public @NotNull String getName() {
        return IncognitoMod.spoofedCPU.getName();
    }

    /**
     * @author Jones
     * @reason Spoof the vendor of the processor.
     */
    @Overwrite
    public @NotNull String getVendor() {
        return IncognitoMod.spoofedCPU.getVendor();
    }
}
