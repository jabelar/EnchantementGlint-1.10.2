package com.blogspot.jabelarminecraft.enchantmentglint.client.renderers;

import net.minecraft.client.model.ModelZombieVillager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModRenderZombie extends RenderZombie
{
    public ModRenderZombie(RenderManager renderManagerIn)
    {
        super(renderManagerIn);
        
        layerRenderers.remove(2);
        ModLayerBipedArmor layerbipedarmor = new ModLayerBipedArmor(this)
        {
            @Override
            protected void initArmor()
            {
                modelLeggings = new ModelZombieVillager(0.5F, 0.0F, true);
                modelArmor = new ModelZombieVillager(1.0F, 0.0F, true);
            }
        };
        addLayer(layerbipedarmor);
    }
}
