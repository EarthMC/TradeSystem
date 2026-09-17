package de.codingair.tradesystem.spigot.trade.gui;

import com.google.common.base.Preconditions;
import de.codingair.tradesystem.spigot.trade.Trade;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jspecify.annotations.NonNull;

public class TradingInventoryHolder implements InventoryHolder {
    private final Trade trade;
    private Inventory inventory;

    public TradingInventoryHolder(Trade trade) {
        this.trade = trade;
    }

    public void setInventory(final Inventory inventory) {
        Preconditions.checkState(this.inventory == null, "cannot update inventory when one has already been set");
        this.inventory = inventory;
    }

    @Override
    public @NonNull Inventory getInventory() {
        return this.inventory;
    }

    public Trade getTrade() {
        return trade;
    }
}
