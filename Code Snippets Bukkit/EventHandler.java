@EventHandler
public void onEnderPearlDrop(EntityDropItemEvent event) {
    // Überprüfen, ob das fallengelassene Item eine Enderperle ist
    if (event.getItemDrop().getItemStack().getType() == Material.ENDER_PEARL) {
        Player player = (Player) event.getEntity();
        
        // Berechtigungsprüfung
        if (!player.hasPermission("enderpearl.chunkload")) {
            // Hier die Logik einfügen, um Chunk-Laden zu deaktivieren

            // Zugriff auf die Entity und Modifizierung der Metadaten
            Entity enderPearl = event.getItemDrop();
            // Beispiel: Entfernen der Fähigkeit, den Chunk zu laden
            // (Dies ist ein hypothetisches Beispiel; der tatsächliche Code kann je nach API variieren)
            enderPearl.removeMetadata("chunk_loading", pluginInstance); // pluginInstance ist dein Plugin-Objekt

            // Optional: Entferne die Enderperle
            event.getItemDrop().remove();
            player.sendMessage("You cannot use Ender Pearls to load chunks!");
        }
    }
}
