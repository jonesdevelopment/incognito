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

import com.mojang.blaze3d.platform.GLX;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.jonesdev.incognito.IncognitoMod;

@Mixin(value = GLX.class, remap = false)
public final class GLXMixin {

  @Shadow
  @Nullable
  private static String cpuInfo;

  @Inject(method = "_getCpuInfo", at = @At("HEAD"))
  private static void _getCpuInfo(final CallbackInfoReturnable<String> cir) {
    if (IncognitoMod.shouldReinitCpuInfo && cpuInfo != null) {
      cpuInfo = null;
      IncognitoMod.shouldReinitCpuInfo = false;
    }
  }
}
