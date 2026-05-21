package com.capkzy.meuplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.Location;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.EntityType;
import org.bukkit.scheduler.BukkitRunnable;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
@SuppressWarnings("all")
public class cap extends JavaPlugin implements Listener{
    static Pl play = new Pl();
    public void onEnable(){
        getLogger().info("active plugin 12 ");
        getCommand("ol").setExecutor(this);
        getCommand("duvido").setExecutor(this);
        getCommand("game").setExecutor(this);
        getServer().getPluginManager().registerEvents(this, this);
    }
    @Override
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("ol")){
            // organizar essa bosta
            sender.sendMessage("eae");
            if (sender instanceof org.bukkit.entity.Player){
                org.bukkit.entity.Player player = (org.bukkit.entity.Player) sender;
                org.bukkit.potion.PotionEffect vel = new org.bukkit.potion.PotionEffect(
                    org.bukkit.potion.PotionEffectType.SPEED,20000, 255
                );
                // add vel
                player.addPotionEffect(vel);
                player.sendMessage(ChatColor.MAGIC + "o " + player.getName() + " ta com speed");
                // add dima
                ItemStack diamond = new ItemStack(org.bukkit.Material.DIAMOND, 64);
                // Adiciona os diamantes ao inventário do jogador
                player.getInventory().addItem(diamond);
                player.sendMessage(ChatColor.ITALIC + "o " + player.getName() + " ganhou "+ diamond.getAmount() + " diamantes");
            }
            return true;
        }
            if (cmd.getName().equalsIgnoreCase("duvido")){
                if (sender instanceof Player){
                Player player = (Player) sender;
                sender.sendMessage("espera so um tempinho");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Location loc = player.getLocation();
                player.getWorld().strikeLightning(loc);
            }
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("game")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                sender.sendMessage(ChatColor.STRIKETHROUGH + "buscando fila do game");
                for(int i = 0; i < 5; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sender.sendMessage(ChatColor.GREEN + "buscando fila do game" + ChatColor.GRAY + ".".repeat(i));
                }
                sender.sendMessage(ChatColor.GREEN + "encontramos um jogo pra você!!");
                play.jogo(sender, cmd, label, args, player, this);
                
            }
            return true;
        }
        return false; 
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + " entrou no servidor");
    }
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " saiu do servidor");
    }
    public static class  Pl{
        public void jogo(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args, Player player, cap plugin){
            if (sender instanceof org.bukkit.entity.Player){
                sender.sendMessage("Bem vindo ao jogo");
                sender.sendMessage("tente zerar o jogo com os desastres que irão acontecer");
                // antigo while
                new BukkitRunnable() {
                @Override
                public void run() {
                    if(!player.isOnline()){
                        cancel();
                        return;
                    }

            
                    int desastre = (int) (Math.random() * 3);
                    if(desastre == 0){
                        sender.sendMessage(ChatColor.RED + "uma horda começou");
                        Location loc = player.getLocation();
                        new BukkitRunnable(){
                            @Override
                            public void run(){
                            if(!player.isOnline())return;
                        for (int i = 0; i < 20; i++){
                            Location loczumbi = loc.clone().add(5,0,0);
                            Zombie zumbi = (Zombie) player.getWorld().spawnEntity(loczumbi, EntityType.ZOMBIE);
                            PotionEffect forca = new PotionEffect(PotionEffectType.STRENGTH, 9999999, 2);
                            zumbi.addPotionEffect(forca);
                            zumbi.setCustomName("op");
                            zumbi.setCustomNameVisible(true);
                        }
                    }
                    }.runTaskLater(plugin, 60);
                    }
                         else if (desastre == 1){
                        sender.sendMessage(ChatColor.BLUE + "cuidado com a cabeça");
                        Location loc = player.getLocation();
                        new BukkitRunnable(){
                            @Override
                        public void run(){
                            if(!player.isOnline())return;
                        for (int raio = (int) (Math.random() *  5); raio < 5; raio++){
                            loc.getWorld().strikeLightning(loc);
                        }
                    }
                }.runTaskLater(plugin, 60);
                    }else {
                        sender.sendMessage(ChatColor.GOLD + ChatColor.GOLD.toString() + "Za Warudo!");
                        player.getWorld().playSound(player.getLocation(), org.bukkit.Sound.ENTITY_WITHER_SPAWN, 1.0f, 0.5f);
                        new BukkitRunnable(){
                            @Override
                        public void run(){
                            if(!player.isOnline())return;
                         for (int i = 0; i < 30; i++){
                            player.getWorld().setTime(6000);
                            runTaskLater(plugin, 10);
                            player.getWorld().setTime(18000);
                                }
                            }
                            }.runTaskLater(plugin, 60);
                        }
                    }
                }.runTaskTimer(plugin, 800, 800);
            }
        }
    }
}
