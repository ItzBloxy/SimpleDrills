package net.mcreator.simpledrills.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.simpledrills.init.SimpledrillsModGameRules;

public class DrillProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double i = 0;
		double j = 0;
		String tag = "";
		tag = "mineable/pickaxe";
		i = -1;
		for (int index0 = 0; index0 < (world instanceof ServerLevel _serverLevelGR0 ? _serverLevelGR0.getGameRules().getInt(SimpledrillsModGameRules.DRILL_RADIUS) : 0); index0++) {
			j = -1;
			for (int index1 = 0; index1 < (world instanceof ServerLevel _serverLevelGR1 ? _serverLevelGR1.getGameRules().getInt(SimpledrillsModGameRules.DRILL_RADIUS) : 0); index1++) {
				if (i != 0 || j != 0) {
					if (entity.getXRot() > 40 || entity.getXRot() < -40) {
						if ((world.getBlockState(BlockPos.containing(x + i, y, z + j))).is(BlockTags.create(ResourceLocation.parse((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
							if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)) != 0) {
								FortuneDrillProcedureProcedure.execute(world, x + i, y, z + j, entity);
								{
									BlockPos _pos = BlockPos.containing(x + i, y, z + j);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
							} else if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH)) != 0) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), (new ItemStack((world.getBlockState(BlockPos.containing(x + i, y, z + j))).getBlock())));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								world.destroyBlock(BlockPos.containing(x + i, y, z + j), false);
							} else {
								{
									BlockPos _pos = BlockPos.containing(x + i, y, z + j);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
							}
						}
					} else if ((entity.getDirection()).getAxis() == Direction.Axis.Z) {
						if ((world.getBlockState(BlockPos.containing(x + i, y + j, z))).is(BlockTags.create(ResourceLocation.parse((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
							if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)) != 0) {
								FortuneDrillProcedureProcedure.execute(world, x + i, y + j, z, entity);
								{
									BlockPos _pos = BlockPos.containing(x + i, y + j, z);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
							} else if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH)) != 0) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), (new ItemStack((world.getBlockState(BlockPos.containing(x + i, y + j, z))).getBlock())));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								world.destroyBlock(BlockPos.containing(x + i, y + j, z), false);
							} else {
								{
									BlockPos _pos = BlockPos.containing(x + i, y + j, z);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
							}
						}
					} else if ((entity.getDirection()).getAxis() == Direction.Axis.X) {
						if ((world.getBlockState(BlockPos.containing(x, y + j, z + i))).is(BlockTags.create(ResourceLocation.parse((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
							if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)) != 0) {
								FortuneDrillProcedureProcedure.execute(world, x, y + j, z + i, entity);
								{
									BlockPos _pos = BlockPos.containing(x, y + j, z + i);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
							} else if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SILK_TOUCH)) != 0) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), (new ItemStack((world.getBlockState(BlockPos.containing(x, y + j, z + i))).getBlock())));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								world.destroyBlock(BlockPos.containing(x, y + j, z + i), false);
							} else {
								{
									BlockPos _pos = BlockPos.containing(x, y + j, z + i);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
							}
						}
					}
				}
				j = j + 1;
			}
			i = i + 1;
		}
	}
}
