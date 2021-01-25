package io.github.coolmineman.cheaterdeleter.modules.movement;

import io.github.coolmineman.cheaterdeleter.modules.ModuleManager;
import io.github.coolmineman.cheaterdeleter.modules.movement.entity.BoatFlyCheck;
import io.github.coolmineman.cheaterdeleter.modules.movement.entity.EntityPhaseCheck;
import io.github.coolmineman.cheaterdeleter.modules.movement.entity.EntityVerticalCheck;

public class MovementModuleManager {
    private MovementModuleManager() { }

    public static void init() {
        ModuleManager.registerModule(new VerifyOnGroundCheck());
        ModuleManager.registerModule(new VerticalCheck());
        ModuleManager.registerModule(new GlideCheck());
        ModuleManager.registerModule(new OnGroundVerticalCheck());
        ModuleManager.registerModule(new PhaseCheck());
        ModuleManager.registerModule(new SpeedCheck());
        ModuleManager.registerModule(new InventoryMoveCheck());
        //Entity
        ModuleManager.registerModule(new BoatFlyCheck());
        ModuleManager.registerModule(new EntityVerticalCheck());
        ModuleManager.registerModule(new EntityPhaseCheck());
    }
}
