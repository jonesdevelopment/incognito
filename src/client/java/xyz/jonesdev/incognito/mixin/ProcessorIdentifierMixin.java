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

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oshi.hardware.CentralProcessor;
import xyz.jonesdev.incognito.IncognitoMod;

@Mixin(value = CentralProcessor.ProcessorIdentifier.class, remap = false)
public final class ProcessorIdentifierMixin {

  @Inject(method = "getName", at = @At("HEAD"), cancellable = true)
  public void getName(final CallbackInfoReturnable<String> cir) {
    if (IncognitoMod.getOptions().spoofCPU) {
      cir.setReturnValue(IncognitoMod.getOptions().cpuName);
    }
  }

  @Inject(method = "getVendor", at = @At("HEAD"), cancellable = true)
  public void getVendor(final CallbackInfoReturnable<String> cir) {
    if (IncognitoMod.getOptions().spoofCPU) {
      cir.setReturnValue(IncognitoMod.getOptions().cpuVendor);
    }
  }

  @Inject(method = "getFamily", at = @At("HEAD"), cancellable = true)
  public void getFamily(final CallbackInfoReturnable<String> cir) {
    if (IncognitoMod.getOptions().spoofCPU) {
      cir.setReturnValue(IncognitoMod.getOptions().cpuFamily);
    }
  }

  @Inject(method = "getModel", at = @At("HEAD"), cancellable = true)
  public void getModel(final CallbackInfoReturnable<String> cir) {
    if (IncognitoMod.getOptions().spoofCPU) {
      cir.setReturnValue(IncognitoMod.getOptions().cpuModel);
    }
  }
}
