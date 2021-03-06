package net.justugh.ia.item.data;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

@Getter
@Setter
public abstract class ItemDataInterface {

    private List<Material> materials;
    private String name;

    public abstract List<ItemStack> getItems();

    public abstract boolean matches(ItemStack itemStack);

}
