package com.github.BeadiestStart64.Minecraft.Plugins.fabrictutorial.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.UseAction;

public class ModFoodComponents {

    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder()
            // 空腹度回復量(1で半分)
            .nutrition(3)
            // 食品の彩度調整値を指定する。
            // この値は通常、プレイヤーが現在の空腹値を維持してから空腹を使い切るまでの時間を決定するために使用される。
            .saturationModifier(0.25f)
            // ステータス効果を確率で得る
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200), 0.15f)
            .build();

}
