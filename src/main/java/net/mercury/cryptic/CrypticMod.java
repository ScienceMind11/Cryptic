package net.mercury.cryptic;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrypticMod implements ModInitializer {

	public static final String NAME = "Cryptic";
	public static final String ID = NAME.toLowerCase();
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize(ModContainer mod) {

		LOGGER.info("Loaded {}", NAME);

	}

}
